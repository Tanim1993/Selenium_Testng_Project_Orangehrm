package utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.time.Duration;

public class Utils {
    public static void doScroll(WebDriver driver, int heightPixel){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,"+heightPixel+")");
    }
    public static JsonObject loadJSONFile(String fileLocation) throws IOException, ParseException {
        JsonParser jsonParser = new JsonParser();
        Object obj = jsonParser.parse(new FileReader(fileLocation));
        JsonObject jsonObject = (JsonObject) obj;
        return jsonObject;

    }
    public static void waitForElement(WebDriver driver, WebElement webElement, int timeunit_sec){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(timeunit_sec));
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }
    public static int generateRandomNumber(int min, int max){
        return  (int) Math.round(Math.random()*(max-min)+min);
    }


    public static void addJsonArray(String firstName, String lastName, String username, String password) throws IOException, ParseException {
        String fileName="./src/test/resources/NewUsers.json";
        JsonParser jsonParser = new JsonParser();
        Object obj = jsonParser.parse(new FileReader(fileName));
        JsonObject userObj = new JsonObject();
        JsonArray jsonArray = (JsonArray) obj;

        userObj.put("firstname",firstName);
        userObj.put("lastname",lastName);
        userObj.put("username",username);
        userObj.put("password",password);
        jsonArray.add(userObj);

        FileWriter file = new FileWriter(fileName);
        file.write(jsonArray.toJSONString());
        file.flush();
        file.close();

    }

    public static void main(String[] args) throws IOException, ParseException {
        //System.out.println(generateRandomNumber(10,50));
    }
}