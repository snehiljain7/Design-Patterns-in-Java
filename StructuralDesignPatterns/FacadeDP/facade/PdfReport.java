package DesignPatterns.StructuralDesignPatterns.FacadeDP.facade;

import java.sql.Connection;

public interface PdfReport {
	
	public void generatePdfReport(Connection connection, String tableName);

}
