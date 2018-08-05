package org.formation.spring.report;

public class ReportFactory {

	public static ReportGenerator createReport(String reportType) {
		if (reportType.equals("html")) {
			return new HTMLReportGenerator();
		} else if (reportType.equals("pdf")) {
			return new PDFReportGenerator();
		} else {
			throw new IllegalArgumentException();
		}
	}
	
}
