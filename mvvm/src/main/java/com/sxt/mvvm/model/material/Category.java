package com.sxt.mvvm.model.material;

import java.util.List;

/**
 * Created by xt.sun
 * 2020/5/22
 */
public class Category {
    private String category;
    private String image;
    private List<String> tag;

    public String getImage() {
        return image;
    }

    public String getCategory() {
        return category;
    }

    public List<String> getTag() {
        return tag;
    }
}
