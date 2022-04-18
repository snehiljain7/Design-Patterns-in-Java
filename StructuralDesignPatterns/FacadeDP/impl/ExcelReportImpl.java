package DesignPatterns.StructuralDesignPatterns.FacadeDP.impl;

import java.sql.Connection;

import DesignPatterns.StructuralDesignPatterns.FacadeDP.facade.ExcelReport;

public class ExcelReportImpl implements ExcelReport {

	@Override
	public void generateExcelReport(Connection connection, String tableName) {
		// TODO Auto-generated method stub
		System.out.println("This is Excel generated Report");

	}

}
