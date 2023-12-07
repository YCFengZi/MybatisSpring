package net.YCFengZi.controller;

import net.YCFengZi.pojo.Product;
import net.YCFengZi.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * @Author：YCFengZi
 * @Date：2023/12/7 21:30
 */
@Controller
public class ProductController {
    @Autowired
    private productService productService;

    public List<Product> findAllByProduct() {
        return productService.findAllByProduct();
    }

    public Product findByIdProduct(int id) {
        return productService.findByIdProduct(id);
    }

    public Product findByGoodsNameProduct(String name) {
        return productService.findByGoodsNameProduct(name);
    }

    public int updateProduct(Product product) {
        return productService.updateProduct(product);
    }

    public int deleteProduct(int id) {
        return productService.deleteProduct(id);
    }

    public int addProduct(Product product) {
        return productService.addProduct(product);
    }

    public Product findByTypeName(String name) {
        return productService.findByTypeName(name);
    }

    public List<Product> findIdByTypeId(int id) {
        return productService.findIdByTypeId(id);
    }
}
