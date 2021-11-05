public class Pessoa{
    private String nome;
    private String cpf;
    private String dtNasc;

    protected Pessoa(
        String nome,
        String cpf,
        String dtNasc
    ){
        this.nome = nome;
        this.cpf = cpf;
        this.dtNasc = dtNasc;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public String getDtNasc() {
        return this.dtNasc;
    }

    protected String carteira(){
        return "\nNome: " + this.nome + "\nC.P.F.: " + this.cpf + "\nDt. Nasc.: " + this.dtNasc;
    }

}