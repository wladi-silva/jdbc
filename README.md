
# REALIZAR ESSAS ALTERAÇÕES

    /*
	public void delete(int userId) {
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("delete from users where userid=?");
			// Parameters start with 1
			preparedStatement.setInt(1, userId);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void update(User user) {
		try {
			PreparedStatement preparedStatement = connection
					.prepareStatement("update users set firstname=?, lastname=?, dob=?, email=?" +
							"where userid=?");
			// Parameters start with 1
			preparedStatement.setString(1, user.getFirstName());
			preparedStatement.setString(2, user.getLastName());
			preparedStatement.setDate(3, new java.sql.Date(user.getDob().getTime()));
			preparedStatement.setString(4, user.getEmail());
			preparedStatement.setInt(5, user.getUserid());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<User> consulta() {
		List<User> users = new ArrayList<User>();
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from users");
			while (rs.next()) {
				User user = new User();
				user.setUserid(rs.getInt("userid"));
				user.setFirstName(rs.getString("firstname"));
				user.setLastName(rs.getString("lastname"));
				user.setDob(rs.getDate("dob"));
				user.setEmail(rs.getString("email"));
				users.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return users;
	}
	
	public User consultaPorId(int userId) {
		User user = new User();
		try {
			PreparedStatement preparedStatement = connection.
					prepareStatement("select * from users where userid=?");
			preparedStatement.setInt(1, userId);
			ResultSet rs = preparedStatement.executeQuery();
			
			if (rs.next()) {
				user.setUserid(rs.getInt("userid"));
				user.setFirstName(rs.getString("firstname"));
				user.setLastName(rs.getString("lastname"));
				user.setDob(rs.getDate("dob"));
				user.setEmail(rs.getString("email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return user;
	}


CREATE DATABASE PRATICA_UCSAL;

CREATE TABLE SETOR(
	SETOR_ID INT PRIMARY KEY,
    SETOR_NOME VARCHAR(30)
);

CREATE TABLE GERENTE(
	GERENTE_ID INT PRIMARY KEY,
    GERENTE_NOME VARCHAR(50),
    GERENTE_TELEFONE VARCHAR(15),
    GERENTE_EMAIL VARCHAR(30)
);

CREATE TABLE FILIAL(
	FILIAL_ID INT PRIMARY KEY,
    FILIAL_NOME VARCHAR(30),
    FILIAL_EMAIL VARCHAR(30),
    GERENTE_ID INT REFERENCES GERENTE (GERENTE_ID)
);

CREATE TABLE EMPREGADO(
	EMPREGADO_ID INT AUTO_INCREMENT PRIMARY KEY,
    EMPREGADO_NOME VARCHAR(50),
    EMPREGADO_EMAIL VARCHAR(30),
    SETOR_ID INT REFERENCES SETOR (SETOR_ID),
    FILIAL_ID INT REFERENCES FILIAL (FILIAL_ID)
);

CREATE TABLE ESCOLARIDADE(
	ESCOLARIDADE_ID INT PRIMARY KEY,
    ESCOLARIDADE_NOME VARCHAR(20)
);

CREATE TABLE DEPENDENTE(
	DEPENDENTE_ID INT PRIMARY KEY,
    DEPENDENTE_NOME VARCHAR(50),
    ESCOLARIDADE_ID INT REFERENCES ESCOLARIDADE (ESCOLARIDADE_ID),
    EMPREGADO_ID INT REFERENCES EMPREGADO (EMPREGADO_ID)
);


INSERT INTO SETOR VALUES (1, 'COORDENAÇÃO');
INSERT INTO SETOR VALUES (2, 'TECNOLOGIA DA INFORMAÇÃO');
INSERT INTO GERENTE VALUES (1, 'OSVALDO REQUIÃO', '71987654321', 'OSVALDO@UCSAL.EDU.BR');
INSERT INTO FILIAL VALUES (1, 'DIGITAL-BRAX', 'DIGITAL-BRAX@GMAIL.COM', 1);
INSERT INTO EMPREGADO VALUES (1, 'WLADIMIR OLIVEIRA', 'WLADIMIR.SILVA@UCSAL.EDU.BR', 2, 1);
INSERT INTO ESCOLARIDADE VALUES (1, 'ENSINO FUNDAMENTAL');
INSERT INTO DEPENDENTE VALUES (1, 'UM INDIVIDUO', 1, 1);
 
SELECT 
EMPREGADO.EMPREGADO_NOME AS EMPREGADO, 
DEPENDENTE.DEPENDENTE_NOME AS DEPENDENTE,
ESCOLARIDADE.ESCOLARIDADE_NOME AS ESCOLARIDADE
FROM 
DEPENDENTE 
INNER JOIN EMPREGADO ON EMPREGADO.EMPREGADO_ID = DEPENDENTE.EMPREGADO_ID
INNER JOIN ESCOLARIDADE ON ESCOLARIDADE.ESCOLARIDADE_ID = DEPENDENTE.ESCOLARIDADE_ID;
 
SELECT 
EMPREGADO.EMPREGADO_NOME AS EMPREGADO,
EMPREGADO.EMPREGADO_ID AS MATRICULA,
SETOR.SETOR_NOME AS SETOR,
FILIAL.FILIAL_NOME AS FILIAL
FROM 
EMPREGADO
INNER JOIN SETOR ON SETOR.SETOR_ID = EMPREGADO.SETOR_ID 
INNER JOIN FILIAL ON FILIAL.FILIAL_ID = EMPREGADO.FILIAL_ID
WHERE 
EMPREGADO.SETOR_ID = 2;

SELECT 
EMPREGADO.EMPREGADO_NOME AS EMPREGADO,
SETOR.SETOR_NOME AS SETOR,
EMPREGADO.EMPREGADO_EMAIL AS EMAIL
FROM
SETOR
INNER JOIN EMPREGADO ON EMPREGADO.SETOR_ID = SETOR.SETOR_ID 
WHERE 
SETOR.SETOR_ID = 2;

SELECT 
EMPREGADO.EMPREGADO_NOME AS EMPREGADO,
SETOR.SETOR_NOME AS SETOR,
FILIAL.FILIAL_NOME AS FILIAL,
GERENTE.GERENTE_NOME AS GERENTE
FROM
FILIAL
INNER JOIN EMPREGADO ON EMPREGADO.FILIAL_ID = FILIAL.FILIAL_ID
INNER JOIN SETOR ON SETOR.SETOR_ID = EMPREGADO.SETOR_ID
INNER JOIN GERENTE ON GERENTE.GERENTE_ID = FILIAL.GERENTE_ID;


SELECT * FROM EMPREGADO;
INSERT INTO EMPREGADO (EMPREGADO_NOME, EMPREGADO_EMAIL, SETOR_ID, FILIAL_ID) VALUES ('WLADIMIR OLIVEIRA', 'WLADIMIR.SILVA@UCSAL.EDU.BR', 2, 1);

 
    */
