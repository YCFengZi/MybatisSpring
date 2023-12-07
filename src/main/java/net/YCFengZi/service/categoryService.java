package net.YCFengZi.service;

import net.YCFengZi.pojo.Category;
import org.apache.ibatis.annotations.Param;

/**
 * @Author：YCFengZi
 * @Date：2023/12/7 21:14
 */
public interface categoryService {
    Category findByTypename(int id);
    Category findProductByTypeName(String typename);
}
