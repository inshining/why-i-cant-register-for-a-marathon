package inshining.applydemo.service;

import inshining.applydemo.dto.UserDto;
import inshining.applydemo.model.User;
import inshining.applydemo.repository.UserJPARepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class RegistrationService {

        private UserJPARepository userRepository;

        public String registration(UserDto userDto){
            User user = User.builder()
                    .email(userDto.email())
                    .name(userDto.name())
                    .password(userDto.password())
                    .build();
            User saveUser = userRepository.save(user);
            if (saveUser == null) {
                throw new RuntimeException("User registration failed");
            } else{
                return "User registration success";
            }
        }
}
