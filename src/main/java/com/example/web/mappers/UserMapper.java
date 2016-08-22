package com.example.web.mappers;

import com.example.web.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by josebovet on 8/22/16.
 */
@Mapper
public interface UserMapper {

    @Select("select ID_USER, LOGIN, EMAIL, NAME, TYPE, PASSWD, PASSWD_OLD, ACTIVE from ATO_USER")
    List<User> selectAll();
}
