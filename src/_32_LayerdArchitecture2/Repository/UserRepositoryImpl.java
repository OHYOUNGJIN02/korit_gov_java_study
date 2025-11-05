package _32_LayerdArchitecture2.Repository;

import _32_LayerdArchitecture2.Entity.User;

import java.util.Arrays;

public class UserRepositoryImpl implements UserRepository{
    private static UserRepositoryImpl instance;
    private User[] users;
    private int autoImcrementId;

    private UserRepositoryImpl(){
        users = new User[0];
        autoImcrementId = 1;
    }

    public static UserRepositoryImpl getInstance(){
        if (instance == null){
            instance = new UserRepositoryImpl();
        }
        return instance;
    }

    @Override
    public void insert(User user) {
        User[] temp = Arrays.copyOf(users, users.length + 1);
        user.setUserID(autoImcrementId++);
        temp[temp.length - 1] = user;
        users = temp;
    }

    @Override
    public User findByUsername(String username) {
        for (User user : users){
            if (user.getUsername().equals(username)){
                return user;
            }
        }
        return null;
    }

    @Override
    public User find(String username) {
        return null;
    }
}
