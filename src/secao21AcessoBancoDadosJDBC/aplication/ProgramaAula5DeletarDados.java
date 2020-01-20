package secao21AcessoBancoDadosJDBC.aplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbcCursoUdemy.DB;
import jdbcCursoUdemy.DbIntegrityException;

public class ProgramaAula5DeletarDados {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement st = null;	
		
		try {
			
			conn = DB.getConnection();
			
			st = conn.prepareStatement(
					"DELETE FROM department "
					+ "WHERE "
					+ "Id = ?");
			
			st.setInt(1, 5);
					
			int linhasModificadas = st.executeUpdate();
			
			System.out.println("Pronto ! Linhas Modificadas " + linhasModificadas);
			
			
		} catch (SQLException e) {
			throw new DbIntegrityException(e.getMessage());
		}
			finally {
				DB.closeStatement(st);
				DB.closeConnection();
			}

	}

}


