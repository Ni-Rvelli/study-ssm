import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public void testGenerate() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.selectByPrimaryKey(1);
        System.out.println(emp);
    }

    @Test
    public void testPage() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        Page<Object> page = PageHelper.startPage(2, 2);
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        List<Emp> emps = mapper.selectByExample(null);
        for (Emp emp : emps) {
            System.out.println(emp);
        }
        PageInfo<Emp> pageInfo = new PageInfo<>(emps, 2);
        System.out.println(pageInfo);
    }

}
