package net.YCFengZi.mapper;

import net.YCFengZi.pojo.Category;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author：YCFengZi
 * @Date：2023/12/7 21:00
 */
public class categoryMapperTest {
    SqlSession sqlSession;
    CategoryMapper mapper;
    @Before
    public void productBefore() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("myBatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = factory.openSession();
        mapper = sqlSession.getMapper(CategoryMapper.class);
    }

    @Test
    public void findProductByTypeName() {
        Category productByTypeName = mapper.findProductByTypeName("白色家电");
        System.out.println(productByTypeName);
    }

    @Test
    public void findByTypename() {
        Category byTypename = mapper.findByTypename(2);
        System.out.println(byTypename);
    }
}