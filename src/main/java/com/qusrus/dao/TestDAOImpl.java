package com.qusrus.dao;

import com.qusrus.mapper.TestMapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by intern on 2016-11-30.
 */
@Component
public class TestDAOImpl implements TestDAO {
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public int insertTest(int test_id_pk, String test_name) {
        int result;
        result = sqlSessionTemplate.getMapper(TestMapper.class).insertTest(test_id_pk, test_name);
        return result;
    }

}
