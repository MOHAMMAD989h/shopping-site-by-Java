package com.example.site;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

public class sabad {
    @FXML
    public Label labelNameCart1;
    @FXML
    public ComboBox<String> com1;
    ObservableList<String> list = FXCollections.observableArrayList("لپ تاپ ها","تبلت ها و لوازم جانبی", "لوازم جانبی");

    public void initialize(URL location, ResourceBundle resources) {
        com1.setItems(list);
        com1.setOnAction(this::handleComboBoxAction);
    }

    public void handleComboBoxAction(ActionEvent event) {
        String selectedOption = com1.getValue();
        if("لپ تاپ ها".equals(selectedOption)){
            openNewWindow("lap.fxml","لپتاپ ها",event);
        }
        if ("لوازم جانبی".equals(selectedOption)) {
            openNewWindow("janebi.fxml", "لوازم جانبی", event);
        }
        if ("تبلت ها و لوازم جانبی".equals(selectedOption)) {
            openNewWindow("tablet.fxml", "تبلت ها و لوازم جانبی", event);
        }
    }
    public void openNewWindow(String fxmlFile, String title, ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Scene scene = new Scene(loader.load(), 1535, 790);

            // ایجاد و نمایش صفحه جدید
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle(title);
            stage.show();

            // بستن صفحه فعلی
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void mainpage(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
            Scene scene = new Scene(loader.load(), 1535, 790);

            // ایجاد و نمایش صفحه جدید
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("لنوو مارکت");
            stage.show();

            // بستن صفحه فعلی
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void why(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("why.fxml"));
            Scene scene = new Scene(loader.load(), 1535, 790);

            // ایجاد و نمایش صفحه جدید
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("چرا لنوو");
            stage.show();

            // بستن صفحه فعلی
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void backpage(ActionEvent event) {openNewWindow("hello-view.fxml","lenoShop",event);}

    @FXML
    private Label firstSabad;
    @FXML
    private Label sabad2;
    @FXML
    private Label sabad3;
    @FXML
    private Label sabad4;
    @FXML
    private Label sabad5;
    @FXML
    private Label sabad6;

    @FXML
    private Label firstPrice;
    @FXML
    private Label price2;
    @FXML
    private Label price3;
    @FXML
    private Label price4;
    @FXML
    private Label price5;
    @FXML
    private Label price6;
    @FXML
    public void setLableNameCart(String text) {
        labelNameCart1.setText(text);
    }


    public void kharid(String num,String num1,ActionEvent event) {
        String filePath = "buyer.txt";
        String filePath1 = "price.txt";
        try {
            // خواندن فایل
            File file = new File(filePath);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder content = new StringBuilder();
            String line;

            // پردازش هر خط از فایل
            while ((line = reader.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line, "/\n"); // جداسازی کلمات با فاصله
                while (tokenizer.hasMoreTokens()) {
                    String word = tokenizer.nextToken();
                    System.out.println(word);
                    System.out.println(num);
                    if (!word.equals(num)) { // حذف کلمه "buyer"
                        content.append(word).append(" ");
                    }
                }
                content.append("\n"); // اضافه کردن خط جدید
            }
            reader.close();
            // بازنویسی فایل
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(content.toString().trim()); // نوشتن محتوای جدید
            writer.close();

            System.out.println("فایل با موفقیت بازنویسی شد.");
        } catch (FileNotFoundException e) {
            System.out.println("خطا در پردازش فایل: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            // خواندن فایل
            File file1 = new File(filePath1);
            BufferedReader reader = new BufferedReader(new FileReader(file1));
            StringBuilder content = new StringBuilder();
            String line1;

            // پردازش هر خط از فایل
            while ((line1 = reader.readLine()) != null) {
                StringTokenizer tokenizer1 = new StringTokenizer(line1, "/\n"); // جداسازی کلمات با فاصله
                while (tokenizer1.hasMoreTokens()) {
                    String word = tokenizer1.nextToken();
                    if (!word.equals(num1)) { // حذف کلمه "buyer"
                        content.append(word).append(" ");
                    }
                }
                content.append("\n"); // اضافه کردن خط جدید
            }
            reader.close();
            // بازنویسی فایل
            BufferedWriter writer = new BufferedWriter(new FileWriter(file1));
            writer.write(content.toString().trim()); // نوشتن محتوای جدید
            writer.close();

            System.out.println("فایل با موفقیت بازنویسی شد.");
        } catch (FileNotFoundException e) {
            System.out.println("خطا در پردازش فایل: " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



    public void sabadpage(ActionEvent event) {
        String[] array = new String[20];
        String[] array1 = new String[20];
        int i = 0;
        int j = 0;
        String kala = "";
        String kala1 = "";// تعریف رشته برای ذخیره محتوای فایل
        String filePath = "buyer.txt"; // مسیر فایل
        String filePath1 = "price.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            StringBuilder content = new StringBuilder();
            String line;

            // خواندن هر خط و اضافه کردن آن به content
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
                kala =content.toString();
            }


            System.out.println("محتوای فایل:");
            System.out.println(kala);

        } catch (IOException e) {
            System.err.println("خطا در خواندن فایل: " + e.getMessage());
        }

        // جداسازی کلمات با فاصله
        StringTokenizer token=new StringTokenizer(kala,"\n");
        while(i<20) {
            if(token.hasMoreTokens()){
                array[i] = token.nextToken();
            } else {
                array[i] = "";
            }
            i++;
        }
        firstSabad.setText(array[0]);
        sabad2.setText(array[1]);
        sabad3.setText(array[2]);
        sabad4.setText(array[3]);
        sabad5.setText(array[4]);
        sabad6.setText(array[5]);
        try (BufferedReader reader1 = new BufferedReader(new FileReader(filePath1))) {
            StringBuilder content1 = new StringBuilder();
            String line1;

            // خواندن هر خط و اضافه کردن آن به content
            while ((line1 = reader1.readLine()) != null) {
                content1.append(line1).append("\n");
                kala1 =content1.toString();
            }


            System.out.println("محتوای فایل:");
            System.out.println(kala1);

        } catch (IOException e) {
            System.err.println("خطا در خواندن فایل: " + e.getMessage());
        }

        // جداسازی کلمات با فاصله
        StringTokenizer token1=new StringTokenizer(kala1,"\n");
        while(j<20) {
            if(token1.hasMoreTokens()){
                array1[j] = token1.nextToken();
            } else {
                array1[j] = "";
            }
            j++;
        }
        firstPrice.setText(array1[0]);
        price2.setText(array1[1]);
        price3.setText(array1[2]);
        price4.setText(array1[3]);
        price5.setText(array1[4]);
        price6.setText(array1[5]);

    }
    @FXML
    public Label alart;

    public void kharid1(ActionEvent event) {
        String word = firstSabad.getText();
        String word1 = firstPrice.getText();
        kharid(word,word1,event);
        alart.setText("محصول شما خریداری شد جهت تکمیل خرید رفرش کنید");
    }
    public void kharid2(ActionEvent event) {
        String word = sabad2.getText();
        String word1 = price2.getText();
        kharid(word,word1,event);
        alart.setText("محصول شما خریداری شد جهت تکمیل خرید رفرش کنید");
    }
    public void kharid3(ActionEvent event) {
        String word = sabad3.getText();
        String word1 = price3.getText();
        kharid(word,word1,event);
        alart.setText("محصول شما خریداری شد جهت تکمیل خرید رفرش کنید");
    }
    public void kharid4(ActionEvent event) {
        String word = sabad4.getText();
        String word1 = price4.getText();
        kharid(word,word1,event);
        alart.setText("محصول شما خریداری شد جهت تکمیل خرید رفرش کنید");
    }
    public void kharid5(ActionEvent event) {
        String word = sabad5.getText();
        String word1 = price5.getText();
        kharid(word,word1,event);
        alart.setText("محصول شما خریداری شد جهت تکمیل خرید رفرش کنید");
    }
    public void kharid6(ActionEvent event) {
        String word = sabad6.getText();
        String word1 = price6.getText();
        kharid(word,word1,event);
        alart.setText("محصول شما خریداری شد جهت تکمیل خرید رفرش کنید");
    }
}
