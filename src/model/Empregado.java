package model;

public class Empregado {
    
    private Integer empregado_id;
    private String empregado_nome;
    private String empregado_email;
    private Integer setor_id;
    private Integer filial_id;

    public Empregado(Integer empregado_id, String empregado_nome, String empregado_email, Integer setor_id, Integer filial_id) {
        this.empregado_id = empregado_id;
        this.empregado_nome = empregado_nome;
        this.empregado_email = empregado_email;
        this.setor_id = setor_id;
        this.filial_id = filial_id;
    }

    public Empregado(String empregado_nome, String empregado_email, Integer setor_id, Integer filial_id) {
        this.empregado_nome = empregado_nome;
        this.empregado_email = empregado_email;
        this.setor_id = setor_id;
        this.filial_id = filial_id;
    }

    public Integer getEmpregado_id() {
        return empregado_id;
    }
    public void setEmpregado_id(Integer empregado_id) {
        this.empregado_id = empregado_id;
    }
    public String getEmpregado_nome() {
        return empregado_nome;
    }
    public void setEmpregado_nome(String empregado_nome) {
        this.empregado_nome = empregado_nome;
    }
    public String getEmpregado_email() {
        return empregado_email;
    }
    public void setEmpregado_email(String empregado_email) {
        this.empregado_email = empregado_email;
    }
    public Integer getSetor_id() {
        return setor_id;
    }
    public void setSetor_id(Integer setor_id) {
        this.setor_id = setor_id;
    }
    public Integer getFilial_id() {
        return filial_id;
    }
    public void setFilial_id(Integer filial_id) {
        this.filial_id = filial_id;
    } 

}