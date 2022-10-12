import com.nr.mybatis.mapper.SpecialMapper;
import com.nr.mybatis.pojo.User;
import com.nr.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Date: 2022/10/12
 * @Author: NiRui
 * @Description:
 */
public class SpecialTest {

    @Test
    public void testGetUserByNameLike() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialMapper mapper = sqlSession.getMapper(SpecialMapper.class);

        List<User> list =  mapper.getUserByNameLike("q");
        System.out.println(list);
        sqlSession.close();
    }

    @Test
    public void testInsert() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialMapper mapper = sqlSession.getMapper(SpecialMapper.class);
        User user = new User();
        user.setAge(6);
        user.setUsername("qqq1");
        user.setPassword("asdf");
        user.setGender("女");
        user.setEmail("123456@qq.com");
        mapper.insertUser(user);
        System.out.println(user);
        sqlSession.close();
    }
}
