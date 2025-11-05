package _32_LayerdArchitecture2.Service;

import _25_LayeredArchitecture.dto.SigninReqDto;
import _32_LayerdArchitecture2.Entity.User;
import _32_LayerdArchitecture2.Repository.UserRepository;
import _32_LayerdArchitecture2.Repository.UserRepositoryImpl2;
import _32_LayerdArchitecture2.Utill.PasswordEncoder;


public class SigninServiceImpl implements SigninService {
    private static SigninServiceImpl instance;
    private UserRepository UserRepository;
    private UserRepository userRepository = UserRepository;
    private SigninServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public SigninServiceImpl() {}

    public static SigninServiceImpl getInstance() {
        if (instance == null) {
            instance = new SigninServiceImpl(UserRepositoryImpl2.getInstance());
        }
        return instance;
    }

    @Override
    public void signin(SigninReqDto signinReqDto) {
        User foundUser = userRepository.findByUsername(signinReqDto.getUsername());

        String username = signinReqDto.getUsername();
        String password = signinReqDto.getPassword();

        if (isEmpty(username) || isEmpty(password)) {
            System.out.println("아이디 또는 비밀번호를 입력하세요.");
            return;
        }

        User user = userRepository.find(username);
        if (foundUser == null) {
            System.out.println("사용자 정보를 다시 확인하세요.");
            return;
        }

        if (!PasswordEncoder.match(signinReqDto.getPassword(), foundUser.getPassword())) {
            System.out.println("사용자 정보를 다시 확인하세요. ");
            return;
        }

        System.out.println("로그인 성공");
        System.out.println(foundUser);
    }

    @Override
    public boolean isEmpty(String str) {
        //isEmpty boolean
        //username, password 각각 null이거나 공백이 아닌지 확인 용도
        if (str == null || str.isBlank()) {
            return true;
        }
        return false;
    }}

//싱글톤으로 만들것
    //signin
    //로그인을 시도한 사용자 이름 확인 userRepository에서 해당 사용자 이름을 가진 User 객체가 있는지 확인
    //객체가 null이면 함수 탈출(사용자 정보를 다시 확인하세요.)
    //비밀번호 일치 확인
    //비밀번호가 일치하지 않으면 함수 탈출(사용자 정보를 다시 확인하세요.)
    //로그인 성공 -> 로그인 성공한 User 객체 toString으로 출력

    //isEmpty
    //username, password 각각 null 이거나 공백이 아닌지 확인 용도

