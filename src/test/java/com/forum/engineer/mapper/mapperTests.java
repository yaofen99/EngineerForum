package com.forum.engineer.mapper;

import com.forum.engineer.pojo.User;
import com.forum.engineer.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class mapperTests {
    @Test
    public void UserAddTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User employee = new User("张三", "123456", "123456789", "1232");
        mapper.addUser(employee);
        sqlSession.commit();
        sqlSession.close();
    }



}
