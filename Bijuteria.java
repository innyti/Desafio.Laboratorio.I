public class Bijuteria extends Loja
{
    private double metaVendas;
    
    public Bijuteria(String nome,
        int quantidadeFuncionarios,
        double salarioBase,
        Endereco endereco,
        Data dataFundacao,
        double metaVendas,
        int tamanhoEstoque){
        super(nome,quantidadeFuncionarios,salarioBase,endereco, dataFundacao, tamanhoEstoque);
        this.metaVendas = metaVendas;
    }
    
    public void setMetaVendas(double metaVendas){
        this.metaVendas = metaVendas;
    }
    
    public double getMetaVendas(){
        return metaVendas;
    }
    
    @Override public String toString(){
        return String.format ("%s - Meta: %s",
        super.toString(),
        this.metaVendas);
    }
}
