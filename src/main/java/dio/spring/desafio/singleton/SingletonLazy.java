package dio.spring.desafio.singleton;

/**
 * Singleton instanciado ao chamar método de acesso.
 * @author xnatnat
 */
public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy(){
        super();
    }

    public static SingletonLazy getInstancia(){
        if(instancia == null)
            instancia = new SingletonLazy();
        return instancia;
    }
}
