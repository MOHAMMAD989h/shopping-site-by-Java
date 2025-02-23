package com.example.site;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.text.TextAlignment;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class pageNew {
    @FXML
    private GridPane gridPaneProduct;


    private List<productPageModel> productPagelist = new ArrayList<>();

    public void initialize() {
        productPagelist.add(new productPageModel("Laptop", "1200", "file:laptop.png",""));
        productPagelist.add(new productPageModel("Smartphone", "800" , "file:phone.png",""));
        productPagelist.add(new productPageModel("Headphone", "150", "file:headphone.png",""));
        productPagelist.add(new productPageModel("Laptop", "1200", "file:laptop.png",""));
        productPagelist.add(new productPageModel("Smartphone", "800" , "file:phone.png",""));
        productPagelist.add(new productPageModel("Headphone", "150", "file:headphone.png",""));
        productPagelist.add(new productPageModel("Laptop", "1200", "file:laptop.png",""));
        productPagelist.add(new productPageModel("Smartphone", "800" , "file:phone.png",""));
        productPagelist.add(new productPageModel("Headphone", "150", "file:headphone.png",""));
        productPagelist.add(new productPageModel("Laptop", "1200", "file:laptop.png",""));
        productPagelist.add(new productPageModel("Smartphone", "800" , "file:phone.png",""));

        System.out.println(getClass().getResource("productNew.fxml"));
        System.out.println(gridPaneProduct);
        if (gridPaneProduct == null) {
            System.out.println("ERROR: gridPaneProduct is still NULL!");
        } else {
            System.out.println("gridPaneProduct is initialized.");
            updateGrid(); // حالا که مقداردهی شده، فراخوانی کن
        }
    }

    public void ProductGrid() {
        gridPaneProduct = new GridPane();
        gridPaneProduct.setHgap(20);
        gridPaneProduct.setVgap(20);
        gridPaneProduct.setPadding(new Insets(20));
    }


    public GridPane getGridPane() {
        return gridPaneProduct;
    }

    public void addProduct(productPageModel product) {
        productPagelist.add(product);
        updateGrid();
    }


    public void removeProduct(productPageModel product) {
        productPagelist.remove(product);
        updateGrid();
    }
    HelloController controller = new HelloController();

    private void updateGrid() {
        gridPaneProduct.setPrefWidth(Region.USE_COMPUTED_SIZE);
        gridPaneProduct.setPrefHeight(Region.USE_COMPUTED_SIZE);
        gridPaneProduct.getChildren().clear();

        int columns = 3;

        for (int i = 0; i < productPagelist.size(); i++) {
            productPageModel product = productPagelist.get(i);
            VBox productBox = createProductBox(product);
            gridPaneProduct.add(productBox, i % columns, i / columns);
        }
    }

    private VBox createProductBox(productPageModel product) {
        // دکمه با تصویر محصول
        ImageView imageView = new ImageView(product.getImage());
        imageView.setFitWidth(350);
        imageView.setFitHeight(200);

        Button imageButton = new Button();
        imageButton.setGraphic(imageView);
        imageButton.setOnAction(e -> {
            controller.openNewWindow("productNew.fxml","Product",e);
        });

        // لیبل‌ها
        Label nameLabel = new Label(product.getName());
        Label priceLabel = new Label("تومان" + product.getPrice());
        nameLabel.getStyleClass().add("label");
        priceLabel.getStyleClass().add("label");


        VBox vbox = new VBox(10, imageButton, nameLabel, priceLabel);
        vbox.setPadding(new Insets(10));
        vbox.getStyleClass().add("text-field1");
        vbox.getStyleClass().add("password");

        return vbox;
    }

    search1 cont1 = new search1();


    public void homeToProfile(ActionEvent actionEvent) {
        controller.openNewWindow("loginpage.fxml","loginpage",actionEvent);
    }

    public void sabadpage(ActionEvent actionEvent) {
        controller.openNewWindow("sabad.fxml","Cart",actionEvent);
    }


    public void why(ActionEvent actionEvent) {
        controller.openNewWindow("why.fxml","Why",actionEvent);
    }

    public void backpage(ActionEvent actionEvent) {
        controller.openNewWindow("hello-view.fxml","Home",actionEvent);
    }


}


