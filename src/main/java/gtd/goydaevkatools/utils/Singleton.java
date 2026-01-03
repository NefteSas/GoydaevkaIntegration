package gtd.goydaevkatools.utils;

public class Singleton {
    public static Singleton INSTANCE;

    public Singleton getINSTANCE(){
        if (INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
    protected Singleton(){}
}
