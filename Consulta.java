public class Consulta {
    
    private String data;
    private String atendimento;
    Medico medico;
    Paciente paciente;

    protected Consulta(
        String data,
        String atendimento,
        Medico medico,
        Paciente paciente

    ) {
        this.data = data;
        this.atendimento = atendimento;
        this.medico = medico;
        this.paciente = paciente;

        medico.carteira();
        paciente.carteira();

    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData() {
        return this.data;
    }

    public void setAtendimento(String atendimento) {
        this.atendimento = atendimento;
    }

    public String getAtendimento() {
        return this.atendimento;
    }

    public String registro() {
        return medico.carteira() + paciente.carteira() + "\nData atendimento: " 
        + this.getData() + "\nDescrição atendimento: " + this.getAtendimento();
    }
}
