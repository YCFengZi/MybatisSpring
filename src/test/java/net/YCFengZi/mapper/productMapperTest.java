package net.YCFengZi.mapper;

import net.YCFengZi.pojo.Product;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author：YCFengZi
 * @Date：2023/12/7 20:56
 */
public class productMapperTest {
    SqlSession sqlSession;
    ProductMapper mapper;
    @Before
    public void productBefore() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("myBatis-config.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
        sqlSession = factory.openSession();
        mapper = sqlSession.getMapper(ProductMapper.class);
    }

    @Test
    public void findByAllProduct() {
        List<Product> findAllByProduct = mapper.findAllByProduct();
        System.out.println(findAllByProduct);
    }

    @Test
    public void findByIdProduct() {
        Product byIdProduct = mapper.findByIdProduct(1);
        System.out.println(byIdProduct);
    }

//    @Test
//    public void findByTypeIdProduct() {
//        List<product> byTypeIdProduct = mapper.findByTypeIdProduct(2);
//        System.out.println(byTypeIdProduct);
//    }

    @Test
    public void findByGoodsNameProduct() {
        Product byGoodsNameProduct = mapper.findByGoodsNameProduct("电视");
        System.out.println(byGoodsNameProduct);
    }

    @Test
    public void updateProduct() {
        Product product = new Product();
        product.setId(4);
        product.setGoodsName("干洗机");
        product.setPrice(20000);
        int result = mapper.updateProduct(product);
        sqlSession.commit();
        sqlSession.close();
        System.out.println(result);
    }

    @Test
    public void deleteProduct() {
        int result = mapper.deleteProduct(4);
        sqlSession.commit();
        sqlSession.close();
        System.out.println(result);
    }

    @Test
    public void addProduct() {
        Product product = new Product();
        product.setId(4);
        product.setGoodsName("洗衣机");
        product.setPrice(2000);
        product.setTypeId(2);
        int result = mapper.addProduct(product);
        sqlSession.commit();
        sqlSession.close();
        System.out.println(result);
    }

    @Test
    public void findByTypeName() {
        Product findBTypeName = mapper.findByTypeName("洗衣机");
        System.out.println(findBTypeName);
    }

    @Test
    public void findIdByTypeId() {
        List<Product> byTypeId = mapper.findIdByTypeId(2);
        System.out.println(byTypeId);
    }
}