package secao21AcessoBancoDadosJDBC.aplication;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import jdbcCursoUdemy.DB;
import jdbcCursoUdemy.DbException;

public class ProgramaAula6TransacoesDeDados {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;

		try {

			conn = DB.getConnection();
			
			conn.setAutoCommit(false);
			
			st = conn.createStatement();
			
			int linha1 = st.executeUpdate(
					"UPDATE seller SET "
					+ "BaseSalary = 2090 "
					+ "WHERE "
					+ "DepartmentId = 1");
			
			/*int x = 1;
			
			if (x < 2) {
				throw new SQLException("ERRO falso !!!");
			}*/
			
			int linha2 = st.executeUpdate(
					"UPDATE seller SET "
					+ "BaseSalary = 3090 "
					+ "WHERE "
					+ "DepartmentId = 2");
			
			conn.commit();
			
			System.out.println("Linha1: " + linha1);
			System.out.println("Linha2: " + linha2);
			

		} 
		catch (SQLException e) {
			
			try {
				conn.rollback();
				throw new DbException("Transação não efetuada! Causada por " + e.getMessage());
			} catch (SQLException e1) {
				throw new DbException("Erro ao desfazer a transação ! Causada por " + e.getMessage());
				
			}
			
		} 
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}

	}

}
