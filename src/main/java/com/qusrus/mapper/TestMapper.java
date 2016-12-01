package com.qusrus.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by intern on 2016-11-30.
 */
public interface TestMapper {
    int insertTest(@Param("test_id_pk") int test_id_pk, @Param("test_name") String test_name);
}
