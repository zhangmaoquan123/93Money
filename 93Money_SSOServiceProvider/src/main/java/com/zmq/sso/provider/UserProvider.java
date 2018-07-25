package com.zmq.sso.provider;

import com.zmq.core.util.ExecuteUtils;
import com.zmq.core.vo.ResultVo;
import com.zmq.domain.user.UserDo;
import com.zmq.mapper.user.UserMapper;
import com.zmq.sso.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/7/24
 */
@Service
public class UserProvider implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public ResultVo save(UserDo userDo) {
        return ExecuteUtils.getResultVo(userMapper.insert(userDo),"新增用户");
    }
}
