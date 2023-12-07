package net.YCFengZi.pojo;

import lombok.Data;

import java.util.List;

/**
 * @Author：YCFengZi
 * @Date：2023/12/7 20:43
 */
@Data
public class Category {
    private int id;
    private String typename;
    private List<Product> productList;
}
