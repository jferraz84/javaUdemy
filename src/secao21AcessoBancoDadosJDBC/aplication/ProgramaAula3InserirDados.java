package secao21AcessoBancoDadosJDBC.aplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import jdbcCursoUdemy.DB;

public class ProgramaAula3InserirDados {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		Connection conn = null;
		PreparedStatement st = null;

		try {
			conn = DB.getConnection();

			/*
			st = conn.prepareStatement(
					"INSERT INTO seller " 
			        + "(Name, Email, BirthDate, BaseSalary, DepartmentId)"
					+ "VALUES" + "(?,?,?,?,?)",
					Statement.RETURN_GENERATED_KEYS);

			st.setString(1, "Jorge Ferraz");
			st.setString(2, "jorge@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("29/12/1984").getTime()));
			st.setDouble(4, 3000.0);
			st.setInt(5, 4);
			*/

			st = conn.prepareStatement(
					"insert into department (Name) values ('D1'), ('D2')",
					Statement.RETURN_GENERATED_KEYS);
			
			int linhasAlteradas = st.executeUpdate();
			

			if (linhasAlteradas > 0 ) {
				ResultSet rs = st.getGeneratedKeys();
				while(rs.next()) {
					int id = rs.getInt(1);
					System.out.println("Pronto Id = " + id);
				}
			}
			else {
				System.out.println("Sem alteração de linhas!");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}/* catch (ParseException e) {
			e.printStackTrace();
		} */finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}

	}

}
