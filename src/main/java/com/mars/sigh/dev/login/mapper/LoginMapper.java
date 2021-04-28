package com.mars.sigh.dev.login.mapper;

import com.mars.sigh.dev.login.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LoginMapper {
    UserInfo login(Integer userId,String pwd);
}
