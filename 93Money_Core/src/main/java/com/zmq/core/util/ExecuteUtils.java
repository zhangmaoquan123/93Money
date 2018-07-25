package com.zmq.core.util;

import com.zmq.core.vo.ResultVo;

/**
 * Created by Administrator on 2018/7/24
 */
public class ExecuteUtils {
    public static ResultVo getResultVo(int num,String msg) {
        if(num >0) {
            return ResultVo.setOk(msg+"成功");
        } else {
            return ResultVo.setError(msg+"失败");
        }
    }
}
