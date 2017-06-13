package br.univel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public final class Arquivotxt {

	private static Arquivotxt self;
	
	private Connection con;
	
	private Arquivotxt() {
		try {
			Class.forName("org.postgresql.Driver");
			this.con = DriverManager
					.getConnection(
					"jdbc:postgresql://localhost:5432/Aluno",
					"postgres", "1234");
			
			Runtime.getRuntime()
				.addShutdownHook(new Thread(new Runnable() {
					public void run() {
						try {
							Arquivotxt.this.con.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}));
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
	}
	
	public final static synchronized Arquivotxt getInstance() {
		if (self == null) {
			self = new Arquivotxt();
		}
		return self;
	}
	
	public Connection getConnection() {
		return this.con;
	}

//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		throw new CloneNotSupportedException("Só haver um!");
//	}
	
}

