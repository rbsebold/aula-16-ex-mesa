package com.company;

import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Date internacao= new Date(2021,11,11);
        Date alta = new Date(2021,11,29);


        try {
            Paciente paciente = new Paciente("Carlos", "Silva",
                    "diabetes",internacao);
            paciente.darAlta(alta);

    } catch (PacienteException e) {
            System.err.println(e);
        }
}
}
