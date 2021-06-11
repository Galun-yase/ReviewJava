import bean.Category;
import com.sun.org.apache.bcel.internal.generic.NEW;
import dao.CategoryMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
/**
 * @author i-renchen@shuwen.com
 * @date 2021/6/9 15:10
 */
public class TestMybatis {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis.xml";
        InputStream is = Resources.getResourceAsStream(resource);
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = factory.openSession();
        try {
            CategoryMapper mapper = sqlSession.getMapper(CategoryMapper.class);
            List<Category> categories = mapper.getCategories();
            System.out.println(categories);
        }finally {
            sqlSession.close();
        }

    }
}
