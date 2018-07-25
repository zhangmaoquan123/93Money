package com.zmq.sso.controller;

import com.zmq.core.vo.ResultVo;
import com.zmq.domain.user.UserDo;
import com.zmq.sso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/7/24
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/user")
    public ResultVo save(@RequestBody UserDo userDo) {
        return userService.save(userDo);
    }
}
