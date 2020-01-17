package secao21AcessoBancoDadosJDBC.aplication;

import java.sql.Connection;

import jdbcCursoUdemy.DB;

public class ProgramaAula1TesteConnection {

	public static void main(String[] args) {
		
		Connection conn = DB.getConnection();
		DB.closeConnection();
	}

}
