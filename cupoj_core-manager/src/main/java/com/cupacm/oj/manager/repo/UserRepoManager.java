package com.cupacm.oj.manager.repo;

import com.cupacm.oj.annotation.RequestLogging;
import com.cupacm.oj.dao.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserRepoManager {
    @Autowired
    private UsersMapper usersMapper;

    @RequestLogging
    public List<Users> getUser(String userId) {
        UsersExample usersExample = new UsersExample();
        usersExample.createCriteria()
                .andUserIdEqualTo(userId);
        return usersMapper.selectByExample(usersExample);
    }
}
