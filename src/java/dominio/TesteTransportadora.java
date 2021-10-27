package dominio;

public class TesteTransportadora {

    public static void main(String[] args) {

        Transportadora transportadora = new Transportadora(1, "Alice", "15785428648515", "81958741251");

        System.out.println(transportadora.getNome());

        transportadora.setNome("Victoria");

        System.out.println(transportadora.getNome());

    }

}
