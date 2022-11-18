import com.nr.mybatis.mapper.EmpMapper;
import com.nr.mybatis.pojo.Emp;
import com.nr.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

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

}
