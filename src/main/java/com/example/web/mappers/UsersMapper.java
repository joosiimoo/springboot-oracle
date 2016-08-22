package com.example.web.mappers;

import com.example.web.model.Users;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Jorge on 8/21/16.
 */
@Repository
public interface UsersMapper {

    @Select("SELECT id_user, name FROM ato_user")
    List<Users> getAllUsers();

}
