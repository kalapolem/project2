package SCSM19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenFromExcel {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
    FileInputStream fis = new FileInputStream("./Book1.xlsx");
    Workbook wb = WorkbookFactory.create(fis);
    String url = wb.getSheet("sheet1").getRow(1).getCell(0).getStringCellValue();
    String us = wb.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();
    String pw = wb.getSheet("sheet1").getRow(1).getCell(2).getStringCellValue();
    WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.findElement(By.name("email")).sendKeys(us);
	driver.findElement(By.name("password")).sendKeys(pw);
	driver.findElement(By.name("login")).click();
	}

}
