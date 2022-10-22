import com.nr.mybatis.mapper.DeptMapper;
import com.nr.mybatis.pojo.Dept;
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
    public void testGetUserByUsername() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
//        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
//        Emp emp = mapper.getEmpAndDeptByStep(1);
        DeptMapper mapper = sqlSession.getMapper(DeptMapper.class);
        Dept dept = mapper.getDeptAndEmpByStep(1);
        System.out.println(dept);
        sqlSession.close();
    }

}
