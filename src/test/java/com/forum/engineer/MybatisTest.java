package com.forum.engineer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.apache.ibatis.session.SqlSession;
import com.forum.engineer.utils.MybatisUtils;


@SpringBootTest
public class MybatisTest {
    @Test
    void mybatisLoaded(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        System.out.println("Mybatis Loaded");
    }
}
