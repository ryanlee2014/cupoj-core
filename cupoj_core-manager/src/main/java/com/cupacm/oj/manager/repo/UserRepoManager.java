package com.cupacm.oj.manager.repo;

import com.cupacm.oj.common.annotation.RequestLogging;
import com.cupacm.oj.dao.*;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class UserRepoManager {
    @Resource
    private UsersMapper usersMapper;

    @RequestLogging
    public List<Users> getUser(String userId) {
        UsersExample usersExample = new UsersExample();
        usersExample.createCriteria()
                .andUserIdEqualTo(userId);
        return usersMapper.selectByExample(usersExample);
    }

    @RequestLogging
    public List<Users> getAllUsers() {
        UsersExample usersExample = new UsersExample();
        usersExample.createCriteria();
        return usersMapper.selectByExample(usersExample);
    }

    @RequestLogging
    public List<Users> getSolvedUsers() {
        UsersExample usersExample = new UsersExample();
        usersExample.createCriteria().andSolvedGreaterThan(0);
        return usersMapper.selectByExample(usersExample);
    }
}
