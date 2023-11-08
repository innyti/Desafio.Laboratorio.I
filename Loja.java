
public class Loja
{
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Data dataFundacao;
    private Endereco endereco;
    private Produto[] estoqueProdutos;

    public Loja(String nome,
    int quantidadeFuncionarios,
    double salarioBaseFuncionario,
    Endereco endereco,
    Data dataFundacao,
    int tamanhoEstoque){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.dataFundacao = dataFundacao;
        this.endereco = endereco;
        this.estoqueProdutos = new Produto[tamanhoEstoque];
    }

    public Loja(String nome,
    int quantidadeFuncionarios,
    Endereco endereco,
    Data dataFundacao,
    int tamanhoEstoque){
        this(nome, quantidadeFuncionarios, -1, endereco, dataFundacao, tamanhoEstoque);
    }

    public double gastosComSalario(){
        if(this.salarioBaseFuncionario == -1)
            return -1;

        return this.salarioBaseFuncionario * this.quantidadeFuncionarios;
    }

    public char tamanhoDaLoja(){
        if(this.quantidadeFuncionarios < 10){
            return 'P';
        } else if (this.quantidadeFuncionarios >= 10 && this.quantidadeFuncionarios <= 30){
            return 'M';
        } else {
            return 'G';
        }
    }

    public String getNome(){
        return nome;
    }

    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario(){
        return salarioBaseFuncionario;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public Endereco getEndereco(){
        return this.endereco;
    }

    public Data getDataFundacao(){
        return this.dataFundacao;
    }

    public Produto[] getEstoqueProdutos(){
        return this.estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos){
        this.estoqueProdutos = estoqueProdutos;
    }

    public void setDataFundacao(Data data){
        this.dataFundacao = data;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public void imprimeProdutos(){
        for(int i = 0; i < estoqueProdutos.length; i++){
            if(estoqueProdutos[i] == null)
                continue;
            System.out.println(estoqueProdutos[i].toString());   
        }
    }

    public boolean insereProduto(Produto novo){
        for(int i = 0; i < estoqueProdutos.length; i++){
            if(estoqueProdutos[i] == null){
                estoqueProdutos[i] = novo;
                return true;
            }
        }
        return false;
    }

    public boolean removeProduto(String removido){
        for(int i = 0; i < estoqueProdutos.length; i++){
            if(estoqueProdutos[i] != null && estoqueProdutos[i].getNome() == removido){
                estoqueProdutos[i] = null;
                return true;
            }
        }   
        return false;
    }

    private int contaProdutos(){
        int qntProdutos = 0;
        for(int i = 0; i < estoqueProdutos.length; i++){
            if(estoqueProdutos[i] != null){
                qntProdutos++;
            } 
        } 
        return qntProdutos;
    }

    @Override public String toString(){
        return String.format("Loja: %s - Numero de Funcionários: %s - Salário Base: %s - Data de Fundação: %s - Endereço: %s - Produtos no Estoque:  %s",
            this.nome,
            this.quantidadeFuncionarios,
            this.salarioBaseFuncionario,
            this.dataFundacao.toString(),
            this.endereco.toString(),
            this.contaProdutos());
    }
}
