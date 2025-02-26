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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

import static com.example.site.loginpage.username;

public class sabad {
    @FXML
    private VBox dinamicSellView;
    @FXML
    private VBox dinamicPaneCart;
    private List<cartdinPro> cartdinProList = new ArrayList<>();
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
    public void openNewWindow2(String gimat,String fxmlFile, String title, ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Scene scene = new Scene(loader.load(), 1535, 790);
            // دریافت کنترلر مشترک (چون کنترلر هر دو صفحه یکی است)
            sabad controller = loader.getController();

            // تنظیم مقدار لیبل TOTAL در صفحه‌ی درگاه
            controller.setTotalText(gimat);
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
    private Label sabad7;
    @FXML
    private Label sabad8;
    @FXML
    private Label sabad9;

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
    private Label price7;
    @FXML
    private Label price8;
    @FXML
    private Label price9;
    @FXML
    private Label nahayi1;
    @FXML
    private Label nahayi1P;
    @FXML
    private Label nahayi2;
    @FXML
    private Label nahayi2P;
    @FXML
    private Label nahayi3;
    @FXML
    private Label nahayi3P;
    @FXML
    private Label nahayi4;
    @FXML
    private Label nahayi4P;
    @FXML
    private Label nahayi5;
    @FXML
    private Label nahayi5P;
    @FXML
    private Label nahayi6;
    @FXML
    private Label nahayi6P;
    @FXML
    private Label nahayi7;
    @FXML
    private Label nahayi7P;
    @FXML
    private Label nahayi8;
    @FXML
    private Label nahayi8P;
    @FXML
    private Label nahayi9;
    @FXML
    private Label nahayi9P;
    @FXML
    private Label TOTAL;
    @FXML
    private Label TotalLabel;
    @FXML
    private Label tedad1;
    @FXML
    private Label tedad2;
    @FXML
    private Label tedad3;
    @FXML
    private Label tedad4;
    @FXML
    private Label tedad5;
    @FXML
    private Label tedad6;
    @FXML
    private Label tedad7;
    @FXML
    private Label tedad8;
    @FXML
    private Label tedad9;
    @FXML
    public void setLableNameCart(String text) {
        labelNameCart1.setText(text);
    }


    public void kharid(String num,String num1,ActionEvent event) {
        String filePath = "buyer.txt";
        String filePath1 = "price.txt";
        String filePathnahayi="nahayi.txt";
        try {
            // خواندن فایل
            File file = new File(filePath);
            File fileNah = new File(filePathnahayi);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder content = new StringBuilder();
            String line;

            // پردازش هر خط از فایل
            while ((line = reader.readLine()) != null) {int bnAl=0;
                StringTokenizer tokenizer = new StringTokenizer(line, "/\n"); // جداسازی کلمات با فاصله
                while (tokenizer.hasMoreTokens()) {
                    String word = tokenizer.nextToken();
                    System.out.println(word);
                    System.out.println(num);
                    if (!word.equals(num)) { // حذف کلمه "buyer"
                        content.append(word).append(" ");
                        bnAl+=1;
                    }else{String username1=username;
                        BufferedWriter writer = new BufferedWriter(new FileWriter(fileNah,true));
                        writer.append("/").append(username1).append("/").append(word).append("beTedad:"+numberProducts[bnAl]).append("\n"); // نوشتن محتوای جدید
                        writer.close();
                        for(int hazfTedad=bnAl;hazfTedad<19;hazfTedad++){numberProducts[hazfTedad]=numberProducts[hazfTedad+1];}
                        bnAl+=1;
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
            File fileNah = new File(filePathnahayi);
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
                    }else{
                        BufferedWriter writer = new BufferedWriter(new FileWriter(fileNah,true));
                        String username2="."+username;
                        writer.append("/").append(username2).append("/").append(word).append("\n"); // نوشتن محتوای جدید
                        writer.close();
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
        int refreshNumber=-4;
        boolean refresh=false;
        sabadpage(refreshNumber,refresh,event);
    }
    int [] numberProducts=new int [20];


    public void sabadpage(int refNum,boolean ref,ActionEvent event) {
        String[] array = new String[20];
        String[] array1 = new String[20];
        String[] arrayNah = new String[20];
        String[] array1Nah = new String[20];
        int i = 0;
        int j = 0;
        int z=0;
        int z1=0;
        String kala = "";
        String kala1 = "";// تعریف رشته برای ذخیره محتوای فایل
        String kalaNah = "";
        String kalaPNah = "";
        String filePath = "buyer.txt"; // مسیر فایل
        String filePath1 = "price.txt";
        File nahayi=new File("nahayi.txt");
        String username1 = username; // مقدار مورد مقایسه
        String username2 = "."+username;
        try {
            // اگر فایل buyer وجود ندارد، ایجاد شود

            BufferedReader reader = new BufferedReader(new FileReader(nahayi));
             // افزودن به فایل

            String currentLine;
            boolean nextLineShouldBeWritten = false;

            while ((currentLine = reader.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(currentLine, "/\n"); // تجزیه بر اساس فاصله، اسلش و کاما

                boolean containsUsername = false;

                // بررسی هر کلمه در خط
                while (tokenizer.hasMoreTokens()) {
                    if (tokenizer.nextToken().equals(username1)) {
                        containsUsername = true;
                        break;
                    }
                }// تنظیم وضعیت برای خط بعدی
                nextLineShouldBeWritten = containsUsername;

                // اگر خط قبل شامل username بود، این خط را به فایل انتقال بده
                if (nextLineShouldBeWritten) {
                    String t=tokenizer.nextToken();
                    kalaNah=kalaNah+"/"+t;

                    System.out.println("خط اضافه شد: " + currentLine);
                }
            }

            reader.close();

            System.out.println("انتقال اطلاعات انجام شد.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            // اگر فایل buyer وجود ندارد، ایجاد ش

            BufferedReader reader = new BufferedReader(new FileReader(nahayi));
             // افزودن به فایل

            String currentLine1;
            boolean nextLineShouldBeWritten1 = false;

            while ((currentLine1 = reader.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(currentLine1, "/\n"); // تجزیه بر اساس فاصله، اسلش و کاما

                boolean containsUsername1 = false;

                // بررسی هر کلمه در خط
                while (tokenizer.hasMoreTokens()) {
                    if (tokenizer.nextToken().equals(username2)) {
                        containsUsername1 = true;
                        break;
                    }
                }// تنظیم وضعیت برای خط بعدی
                nextLineShouldBeWritten1 = containsUsername1;

                // اگر خط قبل شامل username بود، این خط را به فایل انتقال بده
                if (nextLineShouldBeWritten1) {
                    String t=tokenizer.nextToken();
                    kalaPNah=kalaPNah+"/"+t;
                    System.out.println("خط اضافه شد: " + currentLine1);
                }
            }

            reader.close();

            System.out.println("انتقال اطلاعات انجام شد.");

        } catch (IOException e) {
            e.printStackTrace();
        }



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
        StringTokenizer tokenNah=new StringTokenizer(kalaNah,"/");
        while(z<20) {
            if(tokenNah.hasMoreTokens()){
                arrayNah[z] = tokenNah.nextToken();
            } else {
                arrayNah[z] = "";
            }
            z++;
        }
        StringTokenizer tokenPNah=new StringTokenizer(kalaPNah,"/");
        while(z1<20) {
            if(tokenPNah.hasMoreTokens()){
                array1Nah[z1] = tokenPNah.nextToken();
            } else {
                array1Nah[z1] = "";
            }
            z1++;
        }
        /*firstSabad.setText(array[0]);
        sabad2.setText(array[1]);
        sabad3.setText(array[2]);
        sabad4.setText(array[3]);
        sabad5.setText(array[4]);
        sabad6.setText(array[5]);
        sabad7.setText(array[6]);
        sabad8.setText(array[7]);
        sabad9.setText(array[8]);*/
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

        /*firstPrice.setText(array1[0]);
        price2.setText(array1[1]);
        price3.setText(array1[2]);
        price4.setText(array1[3]);
        price5.setText(array1[4]);
        price6.setText(array1[5]);
        price7.setText(array1[6]);
        price8.setText(array1[7]);
        price9.setText(array1[8]);

        nahayi1.setText(arrayNah[0]);
        nahayi2.setText(arrayNah[1]);
        nahayi3.setText(arrayNah[2]);
        nahayi4.setText(arrayNah[3]);
        nahayi5.setText(arrayNah[4]);
        nahayi6.setText(arrayNah[5]);
        nahayi7.setText(arrayNah[6]);
        nahayi8.setText(arrayNah[7]);
        nahayi9.setText(arrayNah[8]);
        nahayi1P.setText(array1Nah[0]+"تومان");
        nahayi2P.setText(array1Nah[1]+"تومان");
        nahayi3P.setText(array1Nah[2]+"تومان");
        nahayi4P.setText(array1Nah[3]+"تومان");
        nahayi5P.setText(array1Nah[4]+"تومان");
        nahayi6P.setText(array1Nah[5]+"تومان");
        nahayi7P.setText(array1Nah[6]+"تومان");
        nahayi8P.setText(array1Nah[7]+"تومان");
        nahayi9P.setText(array1Nah[8]+"تومان");*/
        for(int y=0;y<20;y++){if(!array[y].equals("")&&numberProducts[y]==0){numberProducts[y]=1;}}
        if (ref==false&&refNum>=0){
            if(numberProducts[refNum]==1){numberProducts[refNum]=1;}
            else{
                numberProducts[refNum]-=1;}
        }else if(ref==true&&refNum>=0){
            numberProducts[refNum]+=1;
        }
        try {
            cartdinProList.add(new cartdinPro(array[0], array1[0], "", 1,"1"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {cartdinPro product=new cartdinPro(array[0], array1[0], "", 1,"1");
            dinamicPaneCart.getChildren().add(this.createProductPane(product));
        } catch (Exception e) {
        e.printStackTrace();
    }
        /*int total=0;
        for(int lab=9;lab>0;lab--){

            if(lab==9){String price=price9.getText();
             if(price!=null){
                 total=TOTAL1(numberProducts[8],price,event);
             }
            }
            if(lab==8){String price=price8.getText();
                if(price!=null){
                    total+=TOTAL1(numberProducts[7],price,event);
                }
            }
            if(lab==7){String price=price7.getText();
                if(price!=null){
                    total+=TOTAL1(numberProducts[6],price,event);
                }
            }if(lab==6){String price=price6.getText();
                if(price!=null){
                    total+=TOTAL1(numberProducts[5],price,event);
                }
            }
            if(lab==5){String price=price5.getText();
                if(price!=null){
                    total+=TOTAL1(numberProducts[4],price,event);
                }
            }
            if(lab==4){String price=price4.getText();
                if(price!=null){
                    total+=TOTAL1(numberProducts[3],price,event);
                }
            }
            if(lab==3){String price=price3.getText();
                if(price!=null){
                    total+=TOTAL1(numberProducts[2],price,event);
                }
            }
            if(lab==2){String price=price2.getText();
                if(price!=null){
                    total+=TOTAL1(numberProducts[1],price,event);
                }
            }
            if(lab==1){String price=firstPrice.getText();
                if(price!=null){
                    total+=TOTAL1(numberProducts[0],price,event);
                }
            }
        }
        TotalLabel.setText("مجموع:"+total+"ریال");
        tedad1.setText(numberProducts[0]+"");
        tedad2.setText(numberProducts[1]+"");
        tedad3.setText(numberProducts[2]+"");
        tedad4.setText(numberProducts[3]+"");
        tedad5.setText(numberProducts[4]+"");
        tedad6.setText(numberProducts[5]+"");
        tedad7.setText(numberProducts[6]+"");
        tedad8.setText(numberProducts[7]+"");
        tedad9.setText(numberProducts[8]+"");*/
    }
    @FXML
    public Label alart;
    /*public void kharidHame(ActionEvent event) {
        String [] hameh=new String[18];
        hameh[0]=firstSabad.getText();
        hameh[1]=firstPrice.getText();
        hameh[2]=sabad2.getText();
        hameh[3]=price2.getText();
        hameh[4]=sabad3.getText();
        hameh[5]=price3.getText();
        hameh[6]=sabad4.getText();
        hameh[7]=price4.getText();
        hameh[8]=sabad5.getText();
        hameh[9]=price5.getText();
        hameh[10]=sabad6.getText();
        hameh[11]=price6.getText();
        hameh[12]=sabad7.getText();
        hameh[13]=price7.getText();
        hameh[14]=sabad8.getText();
        hameh[15]=price8.getText();
        hameh[16]=sabad9.getText();
        hameh[17]=price9.getText();
        for(int i=0;i<18;i+=2){
            kharid(hameh[i],hameh[i+1], event);
        }
        String word1=TotalLabel.getText();
        openNewWindow2(word1,"dargah.fxml","درگاه بانکی",event);
        sabadpage(-4,false,event);
    }*/

    /*public void kharid1(ActionEvent event) {
        String word = firstSabad.getText();
        String word1 = firstPrice.getText();
        kharid(word,word1,event);
        alart.setText("محصول شما خریداری شد جهت تکمیل خرید رفرش کنید");
        openNewWindow2(word1,"dargah.fxml","درگاه بانکی",event);
        sabadpage(-4,false,event);
    }
    public void kharid2(ActionEvent event) {
        String word = sabad2.getText();
        String word1 = price2.getText();
        kharid(word,word1,event);
        alart.setText("محصول شما خریداری شد جهت تکمیل خرید رفرش کنید");
        openNewWindow2(word1,"dargah.fxml","درگاه بانکی",event);
        sabadpage(-4,false,event);
    }
    public void kharid3(ActionEvent event) {
        String word = sabad3.getText();
        String word1 = price3.getText();
        kharid(word,word1,event);
        alart.setText("محصول شما خریداری شد جهت تکمیل خرید رفرش کنید");
        openNewWindow2(word1,"dargah.fxml","درگاه بانکی",event);
        sabadpage(-4,false,event);
    }
    public void kharid4(ActionEvent event) {
        String word = sabad4.getText();
        String word1 = price4.getText();
        kharid(word,word1,event);
        alart.setText("محصول شما خریداری شد جهت تکمیل خرید رفرش کنید");
        openNewWindow2(word1,"dargah.fxml","درگاه بانکی",event);
        sabadpage(-4,false,event);
    }
    public void kharid5(ActionEvent event) {
        String word = sabad5.getText();
        String word1 = price5.getText();
        kharid(word,word1,event);
        alart.setText("محصول شما خریداری شد جهت تکمیل خرید رفرش کنید");
        openNewWindow2(word1,"dargah.fxml","درگاه بانکی",event);
        sabadpage(-4,false,event);
    }
    public void kharid6(ActionEvent event) {
        String word = sabad6.getText();
        String word1 = price6.getText();
        kharid(word,word1,event);
        alart.setText("محصول شما خریداری شد جهت تکمیل خرید رفرش کنید");
        openNewWindow2(word1,"dargah.fxml","درگاه بانکی",event);
        sabadpage(-4,false,event);
    }
    public void kharid7(ActionEvent event) {
        String word = sabad7.getText();
        String word1 = price7.getText();
        kharid(word,word1,event);
        alart.setText("محصول شما خریداری شد جهت تکمیل خرید رفرش کنید");
        openNewWindow2(word1,"dargah.fxml","درگاه بانکی",event);
        sabadpage(-4,false,event);
    }
    public void kharid8(ActionEvent event) {
        String word = sabad8.getText();
        String word1 = price8.getText();
        kharid(word,word1,event);
        alart.setText("محصول شما خریداری شد جهت تکمیل خرید رفرش کنید");
        openNewWindow2(word1,"dargah.fxml","درگاه بانکی",event);
        sabadpage(-4,false,event);
    }
    public void kharid9(ActionEvent event) {
        String word = sabad9.getText();
        String word1 = price9.getText();
        kharid(word,word1,event);
        alart.setText("محصول شما خریداری شد جهت تکمیل خرید رفرش کنید");
        openNewWindow2(word1,"dargah.fxml","درگاه بانکی",event);
        sabadpage(-4,false,event);
    }
    public void delete1(ActionEvent event){
        String word=firstSabad.getText();
        String word1=firstPrice.getText();
        int bnsil=0;
        delete(bnsil,word,word1,event);
        sabadpage(-4,false,event);
    }
    public void delete2(ActionEvent event){
        String word=sabad2.getText();
        String word1=price2.getText();
        int bnsil=1;
        delete(bnsil,word,word1,event);
        sabadpage(-4,false,event);
    }
    public void delete3(ActionEvent event){
        String word=sabad3.getText();
        String word1=price3.getText();
        int bnsil=2;
        delete(bnsil,word,word1,event);
        sabadpage(-4,false,event);
    }
    public void delete4(ActionEvent event){
        String word=sabad4.getText();
        String word1=price4.getText();
        int bnsil=3;
        delete(bnsil,word,word1,event);
        sabadpage(-4,false,event);
    }
    public void delete5(ActionEvent event){
        String word=sabad5.getText();
        String word1=price5.getText();
        int bnsil=4;
        delete(bnsil,word,word1,event);
        sabadpage(-4,false,event);
    }
    public void delete6(ActionEvent event){
        String word=sabad6.getText();
        String word1=price6.getText();
        int bnsil=5;
        delete(bnsil,word,word1,event);
        sabadpage(-4,false,event);
    }
    public void delete7(ActionEvent event){
        String word=sabad7.getText();
        String word1=price7.getText();
        int bnsil=6;
        delete(bnsil,word,word1,event);
        sabadpage(-4,false,event);
    }
    public void delete8(ActionEvent event){
        String word=sabad8.getText();
        String word1=price8.getText();
        int bnsil=7;
        delete(bnsil,word,word1,event);
        sabadpage(-4,false,event);
    }
    public void delete9(ActionEvent event){
        String word=sabad9.getText();
        String word1=price9.getText();
        int bnsil=8;
        delete(bnsil,word,word1,event);
        sabadpage(-4,false,event);
    }*/
    public void delete(int bnsil,String num,String num1,ActionEvent event) {
        for(int hazfTedad=bnsil;hazfTedad<19;hazfTedad++){numberProducts[hazfTedad]=numberProducts[hazfTedad+1];}
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

    public int TOTAL1(int zarb,String price,ActionEvent event) {
        int Price=0;
        for (int i = 0; i < price.length(); i++) {
            if(price.charAt(i)=='1'){
                Price+=1;
                Price*=10;
            }
            if(price.charAt(i)=='2'){
                Price+=2;
                Price*=10;
            }
            if(price.charAt(i)=='3'){
                Price+=3;
                Price*=10;
            }
            if(price.charAt(i)=='4'){
                Price+=4;
                Price*=10;
            }if(price.charAt(i)=='5'){
                Price+=5;
                Price*=10;
            }if(price.charAt(i)=='6'){
                Price+=6;
                Price*=10;
            }if(price.charAt(i)=='7'){
                Price+=7;
                Price*=10;
            }if(price.charAt(i)=='8'){
                Price+=8;
                Price*=10;
            }if(price.charAt(i)=='9'){
                Price+=9;
                Price*=10;
            }if(price.charAt(i)=='0'){
                Price*=10;
            }
        }
        return Price*zarb;
    }
    public void TOTAL(ActionEvent event) {
        openNewWindow("sabad.fxml","LenoShop",event);
    }
    public void setTotalText(String text) {
        if (TOTAL != null) {
            TOTAL.setText(text);
        }
    }

    /*public void add1(ActionEvent event) {
        sabadpage(0,true,event);
    }
    public void add2(ActionEvent event) {
        sabadpage(1,true,event);
    }
    public void add3(ActionEvent event) {
        sabadpage(2,true,event);
    }
    public void add4(ActionEvent event) {
        sabadpage(3,true,event);
    }
    public void add5(ActionEvent event) {
        sabadpage(4,true,event);
    }
    public void add6(ActionEvent event) {
        sabadpage(5,true,event);
    }
    public void add7(ActionEvent event) {
        sabadpage(6,true,event);
    }
    public void add8(ActionEvent event) {
        sabadpage(7,true,event);
    }
    public void add9(ActionEvent event) {
        sabadpage(8,true,event);
    }
    public void dec1(ActionEvent event) {
        sabadpage(0,false,event);
    }
    public void dec2(ActionEvent event) {
        sabadpage(1,false,event);
    }
    public void dec3(ActionEvent event) {
        sabadpage(2,false,event);
    }
    public void dec4(ActionEvent event) {
        sabadpage(3,false,event);
    }
    public void dec5(ActionEvent event) {
        sabadpage(4,false,event);
    }
    public void dec6(ActionEvent event) {
        sabadpage(5,false,event);
    }
    public void dec7(ActionEvent event) {
        sabadpage(6,false,event);
    }
    public void dec8(ActionEvent event) {
        sabadpage(7, false, event);
    }
    public void dec9(ActionEvent event) {
        sabadpage(8,false,event);
    }*/
    public void refresh(ActionEvent event) {
        sabadpage(-4,false,event);
    }
    private AnchorPane createProductPane(cartdinPro product) {
        AnchorPane pane = new AnchorPane();
        pane.setPrefHeight(69);
        pane.setPrefWidth(837);
        pane.setStyle("-fx-background-color: #f0f0f0; -fx-border-color: #ccc; -fx-padding: 10px;");

        // ایجاد و تنظیم یک Label برای نام محصول
        Label nameLabel = new Label(product.getName());
        nameLabel.setLayoutX(253);
        nameLabel.setLayoutY(-1);
        nameLabel.setPrefWidth(584);
        nameLabel.setPrefHeight(31);

        // ایجاد و تنظیم یک Label برای قیمت محصول
        Label priceLabel = new Label("تومان" + product.getPrice());
        priceLabel.setLayoutX(276);
        priceLabel.setLayoutY(29);
        priceLabel.setPrefWidth(561);
        priceLabel.setPrefHeight(32);

        // دکمه خرید نهایی
        Button buyButton = new Button("خرید نهایی");
        buyButton.setLayoutX(44);
        buyButton.setLayoutY(16);
        buyButton.setPrefWidth(90);
        buyButton.setPrefHeight(41);
        buyButton.getStyleClass().addAll("login-btn1", "text", "password");
        buyButton.setOnAction(event -> kharid(product.getName(),product.getPrice(),event));

        // دکمه حذف
        Button deleteButton = new Button("حذف");
        deleteButton.setLayoutX(151);
        deleteButton.setLayoutY(16);
        deleteButton.setPrefWidth(90);
        deleteButton.setPrefHeight(41);
        deleteButton.getStyleClass().addAll("login-btn1", "text", "password");
        deleteButton.setOnAction(event -> delete(product.getID(),product.getName(),product.getPrice(),event));

        // دکمه افزایش تعداد
        Button addButton = new Button("+");
        addButton.setLayoutX(314);
        addButton.setLayoutY(24);
        addButton.setPrefWidth(32);
        addButton.setPrefHeight(25);
        addButton.setOnAction(event -> sabadpage(product.getID(), true, event));

        // دکمه کاهش تعداد
        Button decButton = new Button("-");
        decButton.setLayoutX(395);
        decButton.setLayoutY(24);
        decButton.setPrefWidth(32);
        decButton.setPrefHeight(25);
        decButton.setOnAction(event -> sabadpage(product.getID(), false,event));

        // نمایش تعداد محصول
        Label quantityLabel = new Label(String.valueOf(product.getQuantity()));
        quantityLabel.setLayoutX(356);
        quantityLabel.setLayoutY(23);
        quantityLabel.setPrefWidth(33);
        quantityLabel.setPrefHeight(27);

        // جداکننده‌ها
        Separator separator1 = new Separator();
        separator1.setPrefWidth(791);
        separator1.setLayoutY(68);

        Separator separator2 = new Separator();
        separator2.setPrefWidth(841);
        separator2.setLayoutY(69);

        // افزودن عناصر به AnchorPane
        pane.getChildren().addAll(nameLabel, priceLabel, buyButton, deleteButton, addButton, decButton, quantityLabel, separator1, separator2);

        return pane;
    }

    /*private AnchorPane createProductPane(cartdinPro product) {
        AnchorPane pane = null;

        pane = new AnchorPane();
        pane.setPrefHeight(200);
        pane.setStyle("-fx-background-color: #f0f0f0; -fx-border-color: #ccc; -fx-padding: 10px;");
        dinamicPaneCart.setStyle("-fx-max-height: Infinity;-fx-pref-height: USE_COMPUTED_SIZE;");


        // ایجاد و تنظیم یک Label برای نام محصول
        Label nameLabel = new Label(product.getName());
        nameLabel.setLayoutX(70);
        nameLabel.setLayoutY(20);

        // ایجاد و تنظیم یک Label برای قیمت محصول
        Label priceLabel = new Label("تومان" + product.getPrice());
        priceLabel.setLayoutX(500);
        priceLabel.setLayoutY(20);


        // افزودن عناصر به AnchorPane
        pane.getChildren().addAll(nameLabel, priceLabel);

        pane.setOnMouseClicked(event -> {

        });
        return pane;

    }*try {
            cartdinProList.add(new cartdinPro(array[0], array1[0], "", "1"));
} catch (Exception e) {
        e.printStackTrace();
        }
                try {dinamicPaneCart.getChildren().add(createProductPane(product));
        }
        }catch (Exception e) {
        e.printStackTrace();
        }*/
}

