package com.br.projetoweb2.Model;

public class Aluno {

    private int id;
    private String nome;
    private String usuario;
    private String curso;
    private String instituto;
    private String cargahoraria;

    public Aluno(int id, String nome, String usuario, String curso, String instituto, String cargahoraria) {
        this.id = id;
        this.nome = nome;
        this.usuario = usuario;
        this.curso = curso;
        this.instituto = instituto;
        this.cargahoraria = cargahoraria;
    }

    public Aluno() {
        id = 0;
        nome = "";
        usuario = "";
        curso = "";
        instituto = "";
        cargahoraria = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public String getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(String cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", usuario=" + usuario + ", curso=" + curso + ", instituto=" + instituto
                + ", cargahoraria=" + cargahoraria + "]";
    }

}
