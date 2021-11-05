import java.util.ArrayList;
public class Medico extends Pessoa {

    private String crm;
    private String estado;
    ArrayList<Paciente> paciente = new ArrayList<>();

    protected Medico(
        String nome,
        String cpf,
        String dtNasc,
        String crm,
        String estado
    ){  
        super(nome, cpf, dtNasc);
        this.crm = crm;
        this.estado = estado;
        
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getCrm() {
        return this.crm;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return this.estado;
    }

    public void adicionarPaciente(Paciente paciente) {
        this.paciente.add(paciente);
    }

    public String carteira() {
        return super.carteira() + "\nCRM: " + this.getCrm() + "\nEstado:" + this.getEstado();
    }
}
