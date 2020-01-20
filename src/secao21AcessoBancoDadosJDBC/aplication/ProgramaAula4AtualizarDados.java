package secao21AcessoBancoDadosJDBC.aplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbcCursoUdemy.DB;

public class ProgramaAula4AtualizarDados {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement st = null;
		
		
		
		
		try {
			
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"UPDATE seller "
					+ "SET BaseSalary = BaseSalary + ? "
					+ "WHERE "
					+ "(DepartmentId = ?)");
					
			st.setDouble(1, 200.0);
			st.setInt(2, 2);
			
			int linhasModificadas = st.executeUpdate();
			
			System.out.println("Pronto ! Linhas Modificadas " + linhasModificadas);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
			finally {
				DB.closeStatement(st);
				DB.closeConnection();
			}

	}

}
