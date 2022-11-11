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
			PreparedStatement preparedStatement = conexao.prepareStatement("INSERT INTO EMPREGADO (EMPREGADO_NOME, EMPREGADO_EMAIL, SETOR_ID, FILIAL_ID) VALUES (?, ?, ?, ?)");
            
			preparedStatement.setString(1, empregado.getEmpregado_nome());
			preparedStatement.setString(2, empregado.getEmpregado_email());
            preparedStatement.setInt(3, empregado.getSetor_id());
            preparedStatement.setInt(4, empregado.getFilial_id());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}