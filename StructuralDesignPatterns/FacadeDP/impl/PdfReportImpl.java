package DesignPatterns.StructuralDesignPatterns.FacadeDP.impl;

import java.sql.Connection;

import DesignPatterns.StructuralDesignPatterns.FacadeDP.facade.PdfReport;

public class PdfReportImpl implements PdfReport {

	@Override
	public void generatePdfReport(Connection connection, String tableName) {
		// TODO Auto-generated method stub
		System.out.println("This is Pdf generated Report");

	}

}
