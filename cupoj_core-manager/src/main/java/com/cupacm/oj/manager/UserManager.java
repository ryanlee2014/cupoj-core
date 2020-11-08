package com.cupacm.oj.manager;

import com.cupacm.oj.dao.Users;
import com.cupacm.oj.manager.repo.UserRepoManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserManager {
    @Autowired
    private UserRepoManager userRepoManager;

    public Users getUsersByUserId(String userId) {
        return userRepoManager.getUser(userId).stream().findFirst().orElse(null);
    }
}
