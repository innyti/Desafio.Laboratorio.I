public class Produto
{
    private String nome;
    private double preco;
    private Data dataValidade;
        
    public Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }
    
    public String getNome(){
        return nome;
    }
   
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setDataValidade(Data dataValidade){
        this.dataValidade = dataValidade;
    }
    
    public Data getDataValidade(){
        return dataValidade;
    }

    public double getPreco(){
        return preco;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public boolean estaVencido(Data data){
        long validade = (this.dataValidade.getAno() * 10000)
            + (this.dataValidade.getMes() * 100) 
            + (this.dataValidade.getDia());
            
        long dataReferencia = (data.getAno() * 10000) 
            + (data.getMes() * 100) 
            + (data.getDia());
        
        return dataReferencia > validade;
    }
    
    @Override public String toString(){
        return String.format ("Nome: %s - Preço: %s - Data de Validade: %s",
            this.nome,
            this.preco,
            this.dataValidade.toString());
    }
}
