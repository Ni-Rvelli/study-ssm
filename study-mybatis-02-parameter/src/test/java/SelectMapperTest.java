import com.nr.mybatis.mapper.SelectMapper;
import com.nr.mybatis.pojo.User;
import com.nr.mybatis.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;
import java.util.Map;

/**
 * @Date: 2022/10/11
 * @Author: NiRui
 * @Description:
 */
public class SelectMapperTest {

    @Test
    public void SelectMapperTest() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SelectMapper mapper = sqlSession.getMapper(SelectMapper.class);
        // 查询一个对象
        User user = mapper.getUserById(4);
        System.out.println(user);
        // 查询一个集合
        List<User> list = mapper.getAllUser();
        list.forEach(o -> System.out.println(o));
        //查询单个数据
        int num = mapper.getCount();
        System.out.println(num);
        //查询一条数据，返回map
        Map<String, Object> map = mapper.getUserByIdToMap(4);
        System.out.println(map);
        //查询多条数据返回map集合
        List<Map<String, Object>> mapList = mapper.getAllUserToMap();
        System.out.println(mapList);
        //查询多条数据返回map
        Map<String, Object> mapKey = mapper.getAllUserToMapKey();
        System.out.println(mapKey);
        sqlSession.close();
    }
}
