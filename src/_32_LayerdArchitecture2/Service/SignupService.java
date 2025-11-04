package _32_LayerdArchitecture2.Service;

import _32_LayerdArchitecture2.Entity.User;
import _32_LayerdArchitecture2.Repository.UserRepository;
import _32_LayerdArchitecture2.Repository.UserRepositoryImpl2;
import _32_LayerdArchitecture2.dto.SignUpReqDto;

public class SignupService {
    private static SignupService instance;
    private UserRepository userRepository;

    private SignupService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static SignupService getInstance() {
        if (instance == null) {
            instance = new SignupService(UserRepositoryImpl2.getInstance());
        }
        return instance;
    }

    public boolean isValidDuplicatedUsername(String username) {
        User foundUser = userRepository.findByUsername(username);
        if (foundUser == null) {
            return true;
        }
        return false;
    }

    public boolean isValidPassword(String password, String confirmPassword) {
        return password != null && !password.isBlank();
    }

    public boolean isValidConfirmPassword(String password, String confirmPassword) {
        if (password == null || confirmPassword == null) {
            return false;
        }
        return password.equals(confirmPassword);
    }

    public void signup(SignUpReqDto signupReqDto) {
        userRepository.insert(signupReqDto.toEntity());
    }

}
