package dio.spring.desafio.singleton;

/**
 * Singleton instanciado na criação da classe.
 * @author xnatnat
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}
