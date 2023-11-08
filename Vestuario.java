public class Vestuario extends Loja
{
   private boolean produtosImportados;
       
    public Vestuario(String nome,
        int quantidadeFuncionarios,
        double salarioBase,
        Endereco endereco,
        Data dataFundacao,
        boolean produtosImportados,
        int tamanhoEstoque){
        super(nome,quantidadeFuncionarios,salarioBase,endereco, dataFundacao, tamanhoEstoque);
        this.produtosImportados = produtosImportados;
    }
    
    public void setProdutosImportados(boolean produtosImportados){
        this.produtosImportados = produtosImportados;
    }
    
    public boolean getProdutosImportados(){
        return produtosImportados;
    }
    
    @Override public String toString(){
        return String.format ("%s - Importados: %s",
        super.toString(),
        this.produtosImportados ? "Sim" : "Não");
    }
}
