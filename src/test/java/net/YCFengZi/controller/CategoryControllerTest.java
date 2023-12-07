package net.YCFengZi.controller;

import net.YCFengZi.config.SpringConfig;
import net.YCFengZi.pojo.Category;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

/**
 * @Author：YCFengZi
 * @Date：2023/12/7 22:01
 */
public class CategoryControllerTest {
    AnnotationConfigApplicationContext context;
    CategoryController controller;

    @Before
    public void testBefore() {
        context = new AnnotationConfigApplicationContext(SpringConfig.class);
        controller = (CategoryController) context.getBean("categoryController");
    }

    @Test
    public void findByTypename() {
        Category byTypename = controller.findByTypename(2);
        System.out.println(byTypename);
    }

    @Test
    public void findProductByTypeName() {
        Category productByTypeName = controller.findProductByTypeName("白色家电");
        System.out.println(productByTypeName);
    }
}