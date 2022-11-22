import com.nr.mybatis.mapper.EmpMapper;
import com.nr.mybatis.pojo.Emp;
import com.nr.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Date: 2022/9/27
 * @Author: NiRui
 * @Description: MyBatis测试类
 */
public class MyBatisTest {


    @Test
    public void testCacheOne() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.getByEmpId(1);
        System.out.println(emp);
        SqlSession sqlSession1 = SqlSessionUtil.getSqlSession();
        EmpMapper mapper1 = sqlSession1.getMapper(EmpMapper.class);
        Emp emp1 = mapper1.getByEmpId(1);
        System.out.println(emp1);
        sqlSession.close();
    }

    @Test
    public void testCacheTwo() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory SqlSessionFactory = sqlSessionFactoryBuilder.build(is);
        SqlSession sqlSession1 = SqlSessionFactory.openSession(true);
        EmpMapper mapper1 = sqlSession1.getMapper(EmpMapper.class);
        Emp emp1 = mapper1.getByEmpId(1);
        sqlSession1.close();
        SqlSession sqlSession2 = SqlSessionFactory.openSession(true);
        EmpMapper mapper2 = sqlSession2.getMapper(EmpMapper.class);
        Emp emp2 = mapper2.getByEmpId(1);
        sqlSession2.close();
    }

}
