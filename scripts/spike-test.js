// spike-test.js
// import http from 'k6/http';
// import { check } from 'k6';

// export const options = {
//     scenarios: {
//         spike: {
//             executor: 'constant-vus',
//             vus: 10,
//             duration: '1s',
//         },
//     },
// };
//
// let data = { email: 'bert@mail.com' , name: 'Bert', password: 'p123'};
//
// export default function () {
//     const res = http.post('http://localhost:8080/registration', JSON.stringify(data), {
//         headers: { 'Content-Type': 'application/json' },
//     });
//     check(res, { 'is status 200': (r) => r.status == 200 });
// };


import http from 'k6/http';
import { check } from 'k6';

export const options = {
    scenarios: {
        spike: {
            executor: 'constant-vus',
            vus: 1000,
            duration: '1s',
        },
    },
};

export default function () {
    const res = http.get('http://localhost:8080/hello');
    check(res, { 'is status 200': (r) => r.status == 200 });
};