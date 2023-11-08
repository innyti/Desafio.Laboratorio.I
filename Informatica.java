public class Informatica extends Loja
{
    private double seguroEletronicos;

    public Informatica(String nome,
    int quantidadeFuncionarios,
    double salarioBase,
    Endereco endereco,
    Data dataFundacao,
    double seguroEletronicos,
    int tamanhoEstoque){
        super(nome,quantidadeFuncionarios,salarioBase,endereco, dataFundacao, tamanhoEstoque);
        this.seguroEletronicos = seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos){
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos(){
        return seguroEletronicos;
    }

    @Override public String toString(){
        return String.format ("%s - Seguro: %s",
            super.toString(),
            this.seguroEletronicos);
    }
}
