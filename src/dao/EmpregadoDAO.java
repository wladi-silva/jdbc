package dao;

import java.sql.*;

import configuration.ConexaoDAO;
import model.Empregado;

public class EmpregadoDAO {

	private Connection conexao;

	public EmpregadoDAO() {
		conexao = new ConexaoDAO().conexaoBD();
	}

	public void insert(Empregado empregado) {
		try {
			PreparedStatement preparedStatement = conexao.prepareStatement("INSERT INTO EMPREGADO VALUES (?, ?, ?, ?, ?)");
            
            preparedStatement.setInt(1, empregado.getEmpregado_id());
			preparedStatement.setString(2, empregado.getEmpregado_nome());
			preparedStatement.setString(3, empregado.getEmpregado_email());
            preparedStatement.setInt(4, empregado.getSetor_id());
            preparedStatement.setInt(5, empregado.getFilial_id());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}