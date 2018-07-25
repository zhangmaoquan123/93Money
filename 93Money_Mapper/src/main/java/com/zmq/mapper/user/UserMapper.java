package com.zmq.mapper.user;

import com.zmq.domain.user.UserDo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2018/7/24
 */
public interface UserMapper {
    @Insert("insert into tb_user(username, password, phone, uid) values(#{username},#{password},#{phone},#{uid})")
    int insert(UserDo userDo);
    @Select("select id, username, password, phone, uid from tb_user")
    @ResultType(UserDo.class)
    List<UserDo> queryAll(@Param("index") int index,@Param("count") int count);
}
