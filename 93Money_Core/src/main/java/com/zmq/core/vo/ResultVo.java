package com.zmq.core.vo;

/**
 * Created by Administrator on 2018/7/24
 */
public class ResultVo {
    private int code;
    private String msg;
    private Object data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ResultVo(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultVo() {
    }
    public static ResultVo setOk(String msg) {

        return new ResultVo(0,msg,null);

    }
    public static ResultVo setError(String msg) {
        return new ResultVo(10,msg,null);
    }

}
