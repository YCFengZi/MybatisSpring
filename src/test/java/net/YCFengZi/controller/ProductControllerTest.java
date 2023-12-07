package net.YCFengZi.controller;

import net.YCFengZi.config.SpringConfig;
import net.YCFengZi.pojo.Product;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * @Author：YCFengZi
 * @Date：2023/12/7 21:33
 */
public class ProductControllerTest {
    AnnotationConfigApplicationContext context;
    ProductController controller;

    @Before
    public void testBefore() {
        context = new AnnotationConfigApplicationContext(SpringConfig.class);
        controller = (ProductController) context.getBean("productController");
    }

    @Test
    public void findAllByProduct() {
        List<Product> list = controller.findAllByProduct();
        System.out.println(list);
    }

    @Test
    public void findByIdProduct() {
        Product byIdProduct = controller.findByIdProduct(1);
        System.out.println(byIdProduct);
    }

    @Test
    public void findByGoodsNameProduct() {
        Product byGoodsNameProduct = controller.findByGoodsNameProduct("电视");
        System.out.println(byGoodsNameProduct);
    }

    @Test
    public void updateProduct() {
        Product product = new Product();
        product.setId(4);
        product.setGoodsName("干洗机");
        product.setPrice(20000);
        int result = controller.updateProduct(product);
        System.out.println(result);
    }

    @Test
    public void deleteProduct() {
        int result = controller.deleteProduct(4);
        System.out.println(result);
    }

    @Test
    public void addProduct() {
        Product product = new Product();
        product.setId(4);
        product.setGoodsName("洗衣机");
        product.setPrice(2000);
        product.setTypeId(2);
        int result = controller.addProduct(product);
        System.out.println(result);
    }

    @Test
    public void findByTypeName() {
        Product findBTypeName = controller.findByTypeName("洗衣机");
        System.out.println(findBTypeName);
    }

    @Test
    public void findIdByTypeId() {
        List<Product> byTypeId = controller.findIdByTypeId(2);
        System.out.println(byTypeId);
    }
}