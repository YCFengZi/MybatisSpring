package net.YCFengZi.controller;

import net.YCFengZi.pojo.Category;
import net.YCFengZi.service.categoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author：YCFengZi
 * @Date：2023/12/7 21:52
 */
@Controller
public class CategoryController {
    @Autowired
    private categoryService categoryService;

    public Category findByTypename(int id) {
        return categoryService.findByTypename(id);
    }

    public Category findProductByTypeName(String typename) {
        return categoryService.findProductByTypeName(typename);
    }
}
