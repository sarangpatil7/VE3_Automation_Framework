package utils;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import base.BaseTest;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

public class TestListener extends BaseTest implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result) {
        try {
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);
            Files.copy(src.toPath(), Paths.get("screenshots/" + result.getName() + ".png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
