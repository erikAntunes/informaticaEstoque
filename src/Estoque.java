public class Estoque {

    private String nome;
    private int qtdAtual;
    private int qtdMinima;


    public String getNome() {
        return nome;
    }

    public void mudarNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public void repor (int valorReposto){
        this.qtdAtual = qtdAtual + valorReposto;
    }

    public void darBaixa (int valorBaixado){
        this.qtdAtual = qtdAtual - valorBaixado;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void mudarQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }

    public void reposicao(){
        if (qtdAtual < qtdMinima){
            System.out.println("----PRECISA REPOR----");
            }
    else {
            System.out.println("----ESTOQUE OK----");
        }}

    public void mostrar(){
        System.out.println("Nome: "+nome);
        System.out.println("Quantidade Atual: "+qtdAtual);
        System.out.println("Quantidade Minima: "+qtdMinima);

    }



    public Estoque(){

    }

    public Estoque(int qtdAtual,int qtdMinima){
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }


}
