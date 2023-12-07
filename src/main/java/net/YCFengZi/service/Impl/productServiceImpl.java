package net.YCFengZi.service.Impl;

import net.YCFengZi.mapper.ProductMapper;
import net.YCFengZi.pojo.Product;
import net.YCFengZi.service.productService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author：YCFengZi
 * @Date：2023/12/7 21:14
 */
@Service
@Transactional
public class productServiceImpl implements productService {
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> findAllByProduct() {
        return productMapper.findAllByProduct();
    }

    @Override
    public Product findByIdProduct(int id) {
        return productMapper.findByIdProduct(id);
    }

    @Override
    public Product findByGoodsNameProduct(String name) {
        return productMapper.findByGoodsNameProduct(name);
    }

    @Override
    public int updateProduct(Product product) {
        return productMapper.updateProduct(product);
    }

    @Override
    public int deleteProduct(int id) {
        return productMapper.deleteProduct(id);
    }

    @Override
    public int addProduct(Product product) {
        return productMapper.addProduct(product);
    }

    @Override
    public Product findByTypeName(String name) {
        return productMapper.findByTypeName(name);
    }

    @Override
    public List<Product> findIdByTypeId(int id) {
        return productMapper.findIdByTypeId(id);
    }
}
