package net.YCFengZi.service.Impl;

import net.YCFengZi.mapper.CategoryMapper;
import net.YCFengZi.pojo.Category;
import net.YCFengZi.service.categoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author：YCFengZi
 * @Date：2023/12/7 21:14
 */
@Service
@Transactional
public class categoryServiceImpl implements categoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public Category findByTypename(int id) {
        return categoryMapper.findByTypename(id);
    }

    @Override
    public Category findProductByTypeName(String typename) {
        return categoryMapper.findProductByTypeName(typename);
    }
}
