package dio.spring.desafio.facade.subsistema2.cep;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }

    public static CepApi getInstancia(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Corinthians - Itaquera";
    }

    public String recuperarEstado(String cep){
        return "SP";
    }
}
