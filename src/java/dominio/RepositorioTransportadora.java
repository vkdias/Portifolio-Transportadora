package dominio;

public interface RepositorioTransportadora {

    void inserir(Transportadora transportadora);

    Transportadora buscar(Long id); 

}
