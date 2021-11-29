package com.company;

import java.time.LocalDate;
import java.util.Date;

public class Paciente {
    String nome;
    String sobrenome;
    String historiaClinica;
    Date dataInternacao;
    Date dataAlta;


    Paciente(String nome, String sobrenome, String historiaClinica, Date dataInternacao)
    throws PacienteException{
        Date hoje= new Date(2021,11,29);
        this.nome=nome;
        this.sobrenome=sobrenome;
        dataAlta=null;
        if (dataInternacao.before(hoje))
            this.dataInternacao=dataInternacao;
        else {
            throw new PacienteException("Data de internação inválida");
        }
    }

    public Date getDataInternacao() {
        return dataInternacao;
    }

    public Date getDataAlta() {
        return dataAlta;
    }


    public void darAlta(Date dataAlta) throws PacienteException {
        if (dataAlta.after(dataInternacao))
            System.out.println("Paciente liberado com sucesso.");
        else
            throw new PacienteException("Data da alta inválida. " +
                    "Não é possível liberar paciente.");
    }

}
