import com.nr.mybatis.mapper.UserMapper;
import com.nr.mybatis.pojo.User;
import com.nr.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Date: 2022/9/27
 * @Author: NiRui
 * @Description: MyBatis测试类
 */
public class MyBatisTest {


    @Test
    public void testGetUserByUsername() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserByUsername("admin");
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void testCheckLogin() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLogin("admin", "123456");
        System.out.println(user);
        sqlSession.close();
    }


    @Test
    public void testCheckLoginByMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap();
        map.put("username", "admin");
        map.put("password", "123456");
        User user = mapper.checkLoginByMap(map);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void testInsert() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setAge(6);
        user.setUsername("qqq");
        user.setPassword("asdf");
        user.setGender("女");
        user.setEmail("123456@qq.com");
        mapper.insertUser(user);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void checkLoginByParam() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.checkLoginByParam("admin", "123456");
        System.out.println(user);
        sqlSession.close();
    }
}
