package com.xrpt.demo.service;

import com.xrpt.demo.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    public List<User> queryAllUser();
}
