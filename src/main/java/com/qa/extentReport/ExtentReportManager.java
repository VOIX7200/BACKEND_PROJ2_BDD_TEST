package com.qa.extentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {
	
	static ExtentReports report;
	
	public static ExtentReports getReport() {
		if(report == null) {
			report = new ExtentReports();
			System.out.println("Inside ExtentReports Manager");
			ExtentSparkReporter sparkReporter = new ExtentSparkReporter(".//ExtentFolder//");
			sparkReporter.config().setReportName("Demo Func Testing");
			sparkReporter.config().setDocumentTitle("Automation Reports");
			sparkReporter.config().setTheme(Theme.DARK);
			sparkReporter.config().setEncoding("utf-8");
			report.attachReporter(sparkReporter);
			System.out.println("Exiting ExtentReports Manager");
			
		}
		
		return report;
	}
	

}
