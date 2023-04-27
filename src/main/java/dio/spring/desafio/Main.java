package dio.spring.desafio;

import dio.spring.desafio.facade.Facade;
import dio.spring.desafio.singleton.SingletonEager;
import dio.spring.desafio.singleton.SingletonLazy;
import dio.spring.desafio.singleton.SingletonLazyHolder;
import dio.spring.desafio.strategy.*;

public class Main {
    public static void main(String[] args) {

        // Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        System.out.println(SingletonLazy.getInstancia());
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        System.out.println(SingletonEager.getInstancia());
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        System.out.println(SingletonLazyHolder.getInstancia());

        // Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();

        // Facade
        Facade facade = new Facade();
        facade.migrarCliente("Weslley", "1472583");

    }
}