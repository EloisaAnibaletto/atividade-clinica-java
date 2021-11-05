import java.util.ArrayList;
public class Paciente extends Pessoa{

    private int registro;
    ArrayList<Medico> medico = new ArrayList<>();

    protected Paciente(
        String nome,
        String cpf,
        String dtNasc,
        int registro
    ){  
        super(nome, cpf, dtNasc);
        this.registro = registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public int getRegistro() {
        return this.registro;
    }

    public void adicionarMedico(Medico medico) {
        this.medico.add(medico);
    }


    public String carteira() {
        return super.carteira() + "\nRegistro: " + this.getRegistro();
    }
}
