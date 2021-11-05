public class Clinica {
    public static void main(String[] args){
        
        Medico medicoUm = new Medico("Timótio da Silva", "111.222.333-44", "01/01/1980", "123456", "Santa Catarina");
        Medico medicoDois = new Medico("Vicente dos Santos", "444.555.666-77", "05/05/1975", "789123", "Santa Catarina");
        Medico medicoTres = new Medico("Teófilo Batista", "777.888.999-11", "10/10/1979", "3456789", "Santa Catarina");

        Paciente pacienteUm = new Paciente("Maria Flor", "123.456.789-00", "12/06/1970", 15894);
        Paciente pacienteDois = new Paciente("Cacilda da Silva", "147.258.369-11", "05/09/1985", 2896);
        Paciente pacienteTres = new Paciente("Arlindo Souza", "369.258.741-22", "30/02/1969", 3289);

        medicoUm.adicionarPaciente(pacienteUm);
        medicoUm.adicionarPaciente(pacienteDois);
        medicoUm.adicionarPaciente(pacienteTres);
        medicoDois.adicionarPaciente(pacienteUm);
        medicoDois.adicionarPaciente(pacienteDois);
        medicoDois.adicionarPaciente(pacienteTres);
        medicoTres.adicionarPaciente(pacienteUm);
        medicoTres.adicionarPaciente(pacienteDois);
        medicoTres.adicionarPaciente(pacienteTres);

        Consulta consultaUm = new Consulta("10/10/2021", "Foi realizado anamnese e " 
            + "consta tudo certo com a paciente", medicoUm, pacienteUm);
        Consulta consultaDois = new Consulta("01/09/2021", "Foi realizado anamnese no paciente e prescrito "
            + "uma gria para exames de rotina ", medicoUm, pacienteDois);
        Consulta consultaTres = new Consulta("23/05/2021", "Foi realizado anamnese e" 
            + " consta tudo certo com a paciente", medicoUm, pacienteTres);
        Consulta consultaQuatro = new Consulta("26/10/2021", "Foi realizado retorno para verificação dos exames"
            +" e consta alterações na glicose e colesterol", medicoUm, pacienteUm);
        Consulta consultaCinco = new Consulta("25/08/2021", "Foi realizado anamnese e" 
        + " consta tudo certo com a paciente", medicoDois, pacienteUm);
        Consulta consultaSeis = new Consulta("19/09/2021", "Foi realizado anamnese e" 
        + " consta tudo certo com a paciente porem foi encaminhado guia para exames de rotina", medicoDois, pacienteDois);
        Consulta consultaSete = new Consulta("11/10/2021", "Foi realizado anamnese e" 
        + " consta tudo certo com a paciente", medicoDois, pacienteTres);
        Consulta consultaOito = new Consulta("16/10/2021", "Foi realizado anamnese, " 
        + " verificação da consulta com o outro médico e verificação dos exames que esta tudo ok", medicoTres, pacienteDois);
        Consulta consultaNove = new Consulta("17/07/2021", "Foi realizado anamnese e" 
        + " consta tudo certo com a paciente", medicoTres, pacienteTres);
        Consulta consultaDez = new Consulta("09/08/2021", "Foi realizado anamnese e" 
        + " consta tudo certo com a paciente", medicoTres, pacienteUm);

        
        System.out.println("+----Nova consulta----+"+consultaUm.registro()+"\n+---------------------+\n");
        System.out.println("+----Nova consulta----+"+consultaDois.registro()+"\n+---------------------+\n");
        System.out.println("+----Nova consulta----+"+consultaTres.registro()+"\n+---------------------+\n");
        System.out.println("+----Nova consulta----+"+consultaQuatro.registro()+"\n+---------------------+\n");
        System.out.println("+----Nova consulta----+"+consultaCinco.registro()+"\n+---------------------+\n");
        System.out.println("+----Nova consulta----+"+consultaSeis.registro()+"\n+---------------------+\n");
        System.out.println("+----Nova consulta----+"+consultaSete.registro()+"\n+---------------------+\n");
        System.out.println("+----Nova consulta----+"+consultaOito.registro()+"\n+---------------------+\n");
        System.out.println("+----Nova consulta----+"+consultaNove.registro()+"\n+---------------------+\n");
        System.out.println("+----Nova consulta----+"+consultaDez.registro()+"\n+---------------------+\n");
    }
}
