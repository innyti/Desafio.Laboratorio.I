public class Cosmetico extends Loja
{
    private double taxaComercializacao;
    
    public Cosmetico(String nome,
        int quantidadeFuncionarios,
        double salarioBase,
        Endereco endereco,
        Data dataFundacao,
        double taxaComercializacao,
        int tamanhoEstoque){
        super(nome,quantidadeFuncionarios,salarioBase,endereco, dataFundacao, tamanhoEstoque);
        this.taxaComercializacao = taxaComercializacao;
    }
    
    public void setTaxaComercializacao(double taxaComercializacao){
        this.taxaComercializacao = taxaComercializacao;
    }
    
    public double getTaxaComercializacao(){
        return taxaComercializacao;
    }
    
    @Override public String toString(){
        return String.format ("%s - Taxa: %s",
        super.toString(),
        this.taxaComercializacao);
    }
}
