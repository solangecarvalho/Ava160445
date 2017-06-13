package br.univel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Dao {		
	

	public class Aluno {
		
		private static final String SQL_BUSCA_TODOS = "SELECT * FROM ALUNO";

		public List<Aluno> getTodos() {
			
			Connection con = Arquivotxt
					.getInstance()
					.getConnection();
			
			List<Aluno> lista = new ArrayList<Aluno>();
			try (PreparedStatement ps = con
						.prepareStatement(SQL_BUSCA_TODOS);
					ResultSet rs = ps.executeQuery()) {
				
				while (rs.next()) {
					Aluno a = new Aluno();
					a.setId(rs.getLong(1));
					a.setNome(rs.getString(2));
					a.setTelefone(rs.getString(3));
					lista.add(a);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return lista;
		}

		private void setId(long long1) {
			// TODO Auto-generated method stub
			
		}

		private void setNome(String string) {
			// TODO Auto-generated method stub
			
		}

		private void setTelefone(String string) {
			// TODO Auto-generated method stub
			
		}		
		
	}
}

