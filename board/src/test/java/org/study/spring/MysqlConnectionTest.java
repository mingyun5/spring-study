package org.study.spring;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MysqlConnectionTest {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://192.168.0.203:3306/book_ex?useSSL=no&characterEncoding=utf8";
	private static final String USER = "mingyun";
	private static final String PW = "alsrbs3193!";
	
	
	@Test
	public void testConnection() throws Exception{
		Class.forName(DRIVER);
		try (Connection conn = DriverManager.getConnection(URL, USER, PW)){	
			System.out.println(conn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
