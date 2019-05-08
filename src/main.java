public class main {

    public static void main(String[] args) {

        Estoque produto1 = new Estoque(0,2);
        produto1.mudarNome("Processadores");
        produto1.repor(10);
        produto1.darBaixa(0);

        Estoque produto2 = new Estoque(0,3);
        produto2.mudarNome("Memórias");
        produto2.repor(10);
        produto2.darBaixa(0);

        Estoque produto3 = new Estoque(0,5);
        produto3.mudarNome("SSD");
        produto3.repor(10);
        produto3.darBaixa(0);



        produto1.mostrar();
        produto1.reposicao();

        System.out.println("_____________________________________");

        produto2.mostrar();
        produto2.reposicao();

        System.out.println("_____________________________________");

        produto3.mostrar();
        produto3.reposicao();




    }
}
