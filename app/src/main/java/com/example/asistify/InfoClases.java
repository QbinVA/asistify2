package com.example.asistify;

public class InfoClases {
    private String docente, clase, materia, codigo, userId;


    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public InfoClases(String docente, String clase, String materia, String codigo, String userId) {
        this.docente = docente;
        this.userId = userId;
        this.clase = clase;
        this.materia = materia;
        this.codigo = codigo;
    }

    public InfoClases(){

    }
}