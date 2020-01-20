package secao21AcessoBancoDadosJDBC.aplication;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jdbcCursoUdemy.DB;

public class ProgramaAula2RecuperarDados {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;

		try {

			conn = DB.getConnection();

			st = conn.createStatement();

			rs = st.executeQuery("select * from department");

			while (rs.next()) {
				System.out.println(rs.getInt("id") + ", " + rs.getString("name"));
			}

		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
			finally {
				DB.closeResultSet(rs);
				DB.closeStatement(st);
				DB.closeConnection();
			}
		
	}

}
