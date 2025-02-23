package com.example.site;

public class productPageModel {
    String price,image;
    String name,pagePath;
    public productPageModel(String name,String price, String image,String pagePath) {
        this.price = price;
        this.name = name;

        this.image = image;
        this.pagePath = pagePath;
    }

    public String getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public String getImage() {
        return image;
    }
    public String getPagePath() {
        return pagePath;
    }

}
