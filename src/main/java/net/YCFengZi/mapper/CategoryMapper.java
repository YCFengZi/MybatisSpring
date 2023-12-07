package net.YCFengZi.mapper;

import net.YCFengZi.pojo.Category;

import org.apache.ibatis.annotations.Param;

/**
 * @Author：YCFengZi
 * @Date：2023/12/7 20:44
 */
public interface CategoryMapper {
    Category findByTypename(@Param("id") int id);
    Category findProductByTypeName(@Param("typename") String typename);
}
