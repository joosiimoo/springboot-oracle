package com.example.web.dao.impl;

import com.example.web.dao.UserDao;
import com.example.web.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class UserDaoImpl extends JdbcDaoSupport implements UserDao {

    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }

    @Override
    public List<User> selectAll() {
        String sql = "select ID_USER, LOGIN, EMAIL, NAME, TYPE, PASSWD, PASSWD_OLD, ACTIVE from ATO_USER";
        List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);

        List<User> users = new ArrayList<>();
        User user = null;
        for (Map<String, Object> row : rows) {
            user = new User();
            user.setId_user(((BigDecimal) row.get("ID_USER")).longValue());
            user.setLogin((String) row.get("LOGIN"));
            user.setEmail((String) row.get("EMAIL"));
            user.setName((String) row.get("NAME"));
            user.setType((String) row.get("TYPE"));
            user.setPasswd((String) row.get("PASSWD"));
            user.setPasswd_old((String) row.get("PASSWD_OLD"));
            user.setActive((String) row.get("ACTIVE"));
            users.add(user);
        }

        return users;
    }
}
