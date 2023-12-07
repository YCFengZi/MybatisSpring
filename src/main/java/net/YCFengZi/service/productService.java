package net.YCFengZi.service;

import net.YCFengZi.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Author：YCFengZi
 * @Date：2023/12/7 21:14
 */
public interface productService {
    List<Product> findAllByProduct();
    Product findByIdProduct(int id);
    //    List<product> findByTypeIdProduct(@Param("typeId") int typeId);
    Product findByGoodsNameProduct(String name);
    int updateProduct(Product product);
    int deleteProduct(int id);
    int addProduct(Product product);
    Product findByTypeName(String name);
    List<Product> findIdByTypeId(int id);
}
