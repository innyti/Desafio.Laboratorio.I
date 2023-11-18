
public class Principal
{
    public static void main (String args[]){
        boolean terminar = false;

        while(! terminar){
            mostraMenu();

            int option = Teclado.leInt();

            switch (option){
                case 1:
                    criarLoja();
                    break;
                case 2:
                    criarProduto();
                    break;
                case 3:
                    terminar = true;
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
        }
    }

    public static void mostraMenu(){
        System.out.println("(1) Criar uma loja");
        
        System.out.println("(2) Criar um produto");
        
        System.out.println("(3) Sair");
    }

    public static void criarLoja(){
        System.out.println("Digite o nome: ");
        String nome = Teclado.leString();
        System.out.println("Digite a quantidade de funcionarios: ");
        int quantidadeFuncionarios = Teclado.leInt();
        System.out.println("Digite o endereço: ");
        Endereco endereco = criarEndereco();
        System.out.println("Digite a data de fundação: ");
        Data dataFundacao = criarData();
        System.out.println("Digite o tamanho do estoque: ");
        int tamanhoEstoque = Teclado.leInt();

        Loja loja = new Loja(nome, quantidadeFuncionarios, endereco, dataFundacao, tamanhoEstoque);
        System.out.println(loja.toString());    
    }

    public static void criarProduto(){
        System.out.println("Digite o nome ");
        String nome = Teclado.leString();
        System.out.println("Digite o preço ");
        double preco = Teclado.leDouble();
        System.out.println("Digite a data de validade ");
        Data dataValidade = criarData();

        Produto produto = new Produto (nome, preco, dataValidade);

        Data dataReferencia = new Data(20,10,2023);
        
        if(produto.estaVencido(dataReferencia)){
            System.out.println("Produto Vencido!");
        }
        else {
            System.out.println("Produto não vencido.");
        }
    }

    public static Data criarData(){
        System.out.println("Digite o dia: ");
        int dia = Teclado.leInt();
        System.out.println("Digite o mês: ");
        int mes = Teclado.leInt();    
        System.out.println("Digite o ano: ");
        int ano = Teclado.leInt();

        Data data = new Data(dia, mes, ano);

        return data;
    }

    public static Endereco criarEndereco(){
        System.out.println("Digite o nome da rua: ");
        String nomeDaRua = Teclado.leString();
        System.out.println("Digite a Cidade: ");
        String cidade = Teclado.leString();
        System.out.println("Digite o Estado");
        String estado = Teclado.leString();
        System.out.println("Digite o País: ");
        String pais = Teclado.leString();
        System.out.println("Digite o CEP: ");
        String cep = Teclado.leString();
        System.out.println("Digite O número: ");
        String numero = Teclado.leString();
        System.out.println("Digite o complemento: ");
        String complemento = Teclado.leString();

        Endereco endereco = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);

        return endereco;
    }

}
