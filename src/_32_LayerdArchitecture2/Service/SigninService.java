package _32_LayerdArchitecture2.Service;

import _25_LayeredArchitecture.dto.SigninReqDto;

public interface SigninService {
    static SigninService getInstance() {
        return null;
    }

    void signin(SigninReqDto signinReqDto);
    boolean isEmpty(String str);
}
