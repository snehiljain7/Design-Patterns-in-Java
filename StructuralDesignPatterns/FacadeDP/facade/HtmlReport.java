package DesignPatterns.StructuralDesignPatterns.FacadeDP.facade;

import java.sql.Connection;

public interface HtmlReport {

	public void generateHtmlReport(Connection connection, String tableName);
}
