public class Alimentacao extends Loja
{
    private Data dataAlvara;

    public Alimentacao(String nome,
    int quantidadeFuncionarios,
    double salarioBase,
    Endereco endereco,
    Data dataFundacao,
    Data dataAlvara,
    int tamanhoEstoque){
        super(nome,quantidadeFuncionarios,salarioBase,endereco, dataFundacao, tamanhoEstoque);
        this.dataAlvara = dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara){
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara(){
        return dataAlvara;
    }

    @Override public String toString(){
        return String.format ("%s - Data Alvará: %s",
            super.toString(),
            this.dataAlvara.toString());

    }
}
