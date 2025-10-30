package _25_LayeredArchitecture.service;

import _25_LayeredArchitecture.dto.SigninReqDto;
import _25_LayeredArchitecture.dto.SignupReqDto;
import _25_LayeredArchitecture.entity.User;
import _25_LayeredArchitecture.repository.UserList;

public class UserService {
    private UserList userList;

    public UserService(UserList userList){
        this.userList = userList;
    }

    public User signin(SigninReqDto signinReqDto){
        User foundUser = userList.findByUsername(signinReqDto.getUsername());
        if (foundUser == null) {
            return null; //유저네임이 일치하지 않을때 null 반환
        }
        if (!foundUser.getPassword().equals(signinReqDto.getPassword())){
            return null; //비밀번호가 일치하지 않을때 null 반환
        }
        return foundUser;
    }


    //username 중복 확인
    public boolean isDuplicatedUsername(String username){
        //UserList에 대해서 중복확인
        return userList.findByUsername(username) != null;

    }
    //회원가입
    public void signup(SignupReqDto signupReqDto){
        //1. signupReqDto -> user(entity)
        User user = signupReqDto.toEntity();
        //2. userId 생성
        user.setUserid(userList.generateUserId());
        //3. user 배열에 추가
        userList.add(user);
    }

    //회원정보 전체 출력
    public void printAllUserList(){
        System.out.println("[[ 회원 정보 전체 조회 ]]");
        for (User user : userList.getAllUser()){
            System.out.println(user);
        }
    }

}
