import com.nr.mybatis.mapper.EmpMapper;
import com.nr.mybatis.pojo.Emp;
import com.nr.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Date: 2022/9/27
 * @Author: NiRui
 * @Description: MyBatis测试类
 */
public class MyBatisTest {


    @Test
    public void testGetEmpByCondition() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = new Emp();
        emp.setEmpName("张一");
        List<Emp> empList = mapper.getEmpByCondition(emp);
        System.out.println(empList);
        sqlSession.close();
    }

}
