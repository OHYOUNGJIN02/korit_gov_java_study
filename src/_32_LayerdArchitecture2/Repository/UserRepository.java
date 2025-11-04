package _32_LayerdArchitecture2.Repository;

import _32_LayerdArchitecture2.Entity.User;

public interface UserRepository {
    void insert(User user);
    User findByUsername(String username);
}
