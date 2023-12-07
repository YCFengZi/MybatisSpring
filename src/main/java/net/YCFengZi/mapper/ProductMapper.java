package net.YCFengZi.mapper;

import net.YCFengZi.pojo.Product;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author：YCFengZi
 * @Date：2023/12/7 20:44
 */
public interface ProductMapper {
    @Select("select * from product")
    List<Product> findAllByProduct();
    Product findByIdProduct(@Param("id") int id);
    //    List<product> findByTypeIdProduct(@Param("typeId") int typeId);
    Product findByGoodsNameProduct(@Param("name") String name);
    int updateProduct(Product product);
    int deleteProduct(@Param("id") int id);
    int addProduct(Product product);
    Product findByTypeName(@Param("name") String name);
    List<Product> findIdByTypeId(@Param("id") int id);
}
