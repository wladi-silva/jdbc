import java.util.Scanner;

import dao.EmpregadoDAO;
import model.Empregado;

public class App {

    public static Scanner scan;
    public static EmpregadoDAO empregadoDAO;

    public App() {
        scan = new Scanner(System.in);
        empregadoDAO = new EmpregadoDAO();
    }

    public static void main(String[] args) throws Exception {

        new App();
        menu();
        


    }

    public static void menu() {
        System.out.println();
        System.out.println("--------- BANCO DE DADOS ---------");
        System.out.println();
        System.out.println("1) CADASTRAR EMPREGADO");
        System.out.println("2) EDITAR EMPREGADO");
        System.out.println("3) LISTAR EMPREGADOS");
        System.out.println("4) BUSCAR EMPREGADO");
        System.out.println("5) EXCLUIR EMPREGADO");
        System.out.println("6) SAIR");
        System.out.println();
        System.out.print("-->");
        Integer opcao = scan.nextInt();
        menu(opcao);
    }

    public static void menu(Integer opcao) {
        
        switch (opcao) {
            case 1:
                cadastrar();
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:

                break;
            case 5:
                
                break;
            case 6:
                sair();
                break;
        
            default:
                break;
        }
    }

    public static void cadastrar() {
        System.out.println();
        System.out.println("--------- BANCO DE DADOS ---------");
        System.out.println();
        System.out.print("NOME DO EMPREGADO: ");
        String nome = scan.next();
        System.out.print("EMAIL DO EMPREGADO: ");
        String email = scan.next();
        System.out.print("SETOR ID: ");
        Integer setor = scan.nextInt();
        System.out.print("FILIAL ID: ");
        Integer filial = scan.nextInt();

        empregadoDAO.insert(new Empregado(nome, email, setor, filial));
        menu();
    }

    public static void editar() {
        
    }

    public static void listar() {
        
    }

    public static void buscar() {
        
    }

    public static void excluir() {
        
    }

    public static void sair() {
        System.exit(0);
    }

}
