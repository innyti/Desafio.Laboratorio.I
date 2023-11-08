public class Shopping
{
    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int qntLojas){
        this.nome = nome;
        this.endereco = endereco;
        this.lojas = new Loja[qntLojas];
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public void setLojas(Loja[] lojas){
        this.lojas = lojas;    
    }

    public String getNome(){
        return this.nome;    
    }

    public Endereco getEndereco(){
        return this.endereco;
    }

    public Loja[] getLojas(){
        return this.lojas;    
    }

    public boolean insereLoja(Loja lojaNova){
        for(int i = 0; i < lojas.length; i++){
            if(lojas[i] == null){
                lojas[i] = lojaNova;
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String remove){
        for(int i = 0; i < lojas.length; i++){
            if(lojas[i] != null && lojas[i].getNome() == remove){
                lojas[i] = null;
                return true;
            }
        }   
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja){
        int cosmetico = 0;
        int vestuario = 0;
        int bijuteria = 0;
        int alimentacao = 0;
        int informatica = 0;
        for(int i = 0; i < lojas.length; i++){
            if(lojas[i] instanceof Cosmetico){
                cosmetico++;
                continue;
            }
            if(lojas[i] instanceof Vestuario){
                vestuario++;
                continue;
            }
            if(lojas[i] instanceof Bijuteria){
                bijuteria++;
                continue;
            }
            if(lojas[i] instanceof Alimentacao){
                alimentacao++;
                continue;
            }
            if(lojas[i] instanceof Informatica){
                informatica++;
                continue;
            }
        } 
        switch(tipoLoja){
            case "Cosmético":
                return cosmetico;
            case "Vestuário":
                return vestuario;
            case "Bijuteria":
                return bijuteria;
            case "Alimentação":
                return alimentacao;
            case "Informática":
                return informatica;
            default: 
                return -1;
        }
    }

    public Informatica lojaSeguroMaisCaro(){
        Informatica maisCara = null;
        for(int i = 0; i < lojas.length; i++){
            if(lojas[i] != null && lojas[i] instanceof Informatica){
                if(maisCara == null || maisCara.getSeguroEletronicos() < ((Informatica)lojas[i]).getSeguroEletronicos())
                    maisCara = (Informatica)lojas[i];
            } 
        } 
        return maisCara; 
    }

    private int contaLojas(){
        int lojasOcupadas = 0;
        for(int i = 0; i < lojas.length; i++){
            if(lojas[i] != null){
                lojasOcupadas++;
            } 
        } 
        return lojasOcupadas;
    }

    @Override public String toString(){
        return String.format("Nome %s - Endereco %s - Lojas Ocupadas: %s",
            this.nome,
            this.endereco,
            this.contaLojas());
    }
}

