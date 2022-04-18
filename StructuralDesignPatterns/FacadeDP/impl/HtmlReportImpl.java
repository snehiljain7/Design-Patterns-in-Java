package DesignPatterns.StructuralDesignPatterns.FacadeDP.impl;

import java.sql.Connection;

import DesignPatterns.StructuralDesignPatterns.FacadeDP.facade.HtmlReport;

public class HtmlReportImpl implements HtmlReport {

	public void generateHtmlReport(Connection connection, String tableName) {
		System.out.println("This is Html generated Report");
	}
}
