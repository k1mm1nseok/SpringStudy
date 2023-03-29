package hello.core.singleton;

public class SingleTonService {
    private static final SingleTonService ss = new SingleTonService();

    public static SingleTonService getSs(){
        return ss;
    }
    private SingleTonService(){};
}
