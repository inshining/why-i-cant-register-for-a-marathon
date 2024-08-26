package inshining.applydemo.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String password;

    public User() {
    }

    @Builder
    public User(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }

}
