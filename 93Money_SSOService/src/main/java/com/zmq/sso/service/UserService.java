package com.zmq.sso.service;

import com.zmq.core.vo.ResultVo;
import com.zmq.domain.user.UserDo;

/**
 * Created by Administrator on 2018/7/24
 */
public interface UserService {
    //新增
    ResultVo save(UserDo userDo);
}
