import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Produto p1 = new Produto("Pão Francês", 3.99, 7);
        Produto p2 = new Produto("Café", 17, 1);
        Produto p3 = new Produto("Bolo", 11.98, 1);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(p1);
        listaDeProdutos.add(p2);
        listaDeProdutos.add(p3);

        System.out.println("Tamanho da lista: " + listaDeProdutos.size());
        System.out.println("Último produto da lista: " + listaDeProdutos.toString());

        ProdutoPerecivel perecivel1 = new ProdutoPerecivel("Arroz", 7.99, 2, "19/05/2025");
    }
}
