import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Marcelo", 19);
        Pessoa pessoa2 = new Pessoa("Patrícia", 35);
        Pessoa pessoa3 = new Pessoa("Filipe", 34);

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("O tamanho do array de lista de pessoas é: " + listaDePessoas.size());
        System.out.println("A primeira pessoa da lista de pessoas é: " + listaDePessoas.get(0).getNome());
        System.out.println("Lista de pessoas: ");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }
    }
}
