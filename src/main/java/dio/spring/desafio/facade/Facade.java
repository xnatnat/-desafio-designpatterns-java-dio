package dio.spring.desafio.facade;

import dio.spring.desafio.facade.subsistema1.crm.CrmService;
import dio.spring.desafio.facade.subsistema2.cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep){
        var cidade = CepApi.getInstancia().recuperarCidade(cep);
        var estado = CepApi.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cep, cidade, estado);
    }
}
