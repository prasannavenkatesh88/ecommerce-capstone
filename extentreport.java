package pages;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentreport {
	

		ExtentReports extent;
		ExtentTest test;
		public extentreport() {
		extent = new ExtentReports();
		ExtentSparkReporter spark = new ExtentSparkReporter("test-output/extentreports/report.html");
		extent.attachReporter(spark);
		}
		public void logPass(String message) {
		test.log(Status.PASS, message);
		}
		public void logFail(String message) {
		test.log(Status.FAIL, message);
		}
		public void generateReport() {
		extent.flush();
		}
		}
