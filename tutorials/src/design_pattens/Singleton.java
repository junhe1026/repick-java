package design_pattens;

/**
 * Created by juno on 15-6-9.
 *
 * 单例模式
 */
public class Singleton {
    private static final Singleton instance = new Singleton();

    // 私有化构造器
    private Singleton(){

    }

    // todo 关键是static关键词
    public static Singleton getInstance(){
        return instance;
    }

    public static void exec(){
        System.out.println("singleton execute ");
    }

    public static void main(String[] args){
        for (int i=0; i<3; i++){
            Singleton s = Singleton.getInstance();
            s.exec();
        }
    }

}
