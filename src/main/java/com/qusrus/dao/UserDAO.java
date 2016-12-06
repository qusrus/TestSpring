package com.qusrus.dao;

import com.qusrus.dto.UserDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by intern on 2016-12-05.
 */
public interface UserDAO {
    public int InsertUser(UserDTO userDTO);
    public List<UserDTO> SelectUser(String user_id_pk);

}
