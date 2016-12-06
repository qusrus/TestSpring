package com.qusrus.dao;

import com.qusrus.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by intern on 2016-12-05.
 */
@Service
public class UserDAOImpl implements UserDAO{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int InsertUser(UserDTO userDTO) {
        String sql = "insert into public.user_tb (user_id_pk, user_pw, user_name, user_email) values(?,?,?,?)";
        return jdbcTemplate.update(sql, new Object[]{userDTO.getUser_id_pk(), userDTO.getUser_pw(), userDTO.getUser_name(), userDTO.getUser_email()});
    }

    @Override
    public List<UserDTO> SelectUser(String user_id_pk) {
        String sql = "select * from public.user_tb where user_id_pk = ?";

        RowMapper<UserDTO> rowMapper = new RowMapper<UserDTO>() {
            @Override
            public UserDTO mapRow(ResultSet resultSet, int i) throws SQLException {
                UserDTO userDTO = new UserDTO();
                userDTO.setUser_id_pk(resultSet.getString("user_id_pk"));
                userDTO.setUser_pw(resultSet.getString("user_pw"));
                userDTO.setUser_name(resultSet.getString("user_name"));
                userDTO.setUser_email(resultSet.getString("user_email"));
                return userDTO;
            }
        };

        return jdbcTemplate.query(sql, new Object[]{user_id_pk}, rowMapper);
    }
}
