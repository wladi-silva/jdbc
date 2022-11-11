import dao.EmpregadoDAO;
import model.Empregado;

public class App {
    public static void main(String[] args) throws Exception {
        new EmpregadoDAO().insert(new Empregado(2, "ANGELA PEIXOTO", "ANGELA.PEIXOTO@UCSAL.EDU.BR", 2, 1));
    }
}
