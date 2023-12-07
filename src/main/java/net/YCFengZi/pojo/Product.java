package net.YCFengZi.pojo;

import lombok.Data;

/**
 * @Author：YCFengZi
 * @Date：2023/12/7 20:43
 */
@Data
public class Product {
    private int id;
    private String goodsName;
    private double price;
    private int typeId;
    net.YCFengZi.pojo.Category Category;
}
