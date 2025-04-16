package com.reports;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
    public static void main(String[] args) {
        ExtentSparkReporter spark = new ExtentSparkReporter("index.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(spark);

        ExtentTest test = extent.createTest("Sample Test");
        test.pass("Test Passed");

        extent.flush();
    }
}
