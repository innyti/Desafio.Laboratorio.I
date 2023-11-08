public class Data
{
    private int dia;
    private int mes;
    private int ano;

    public int getDia(){
        return this.dia;
    }

    public int getMes(){
        return this.mes;
    }

    public int getAno(){
        return this.ano;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public void setMes(int mes){
        this.mes = mes;
    } 

    public void setAno(int ano){
        this.ano = ano;
    } 

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

        boolean dataInvalida = false;

        if(dia < 1 || mes < 1 || mes > 12)
            dataInvalida = true;

        switch(mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dataInvalida = dia > 31;
                break;
            case 2:
                if(verificaAnoBissexto() && dia > 29)
                    dataInvalida = true;
                else if(dia > 28)
                    dataInvalida = true;
                break;
            default: 
                dataInvalida = dia > 30;
                break;
        }

        if(dataInvalida){
            System.out.println("Data Inválida!");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    public boolean verificaAnoBissexto(){
        return this.ano % 4 == 0;
    }

    @Override public String toString(){
        return String.format("%s/%s/%s",
            this.dia,
            this.mes,
            this.ano);
    }
}
