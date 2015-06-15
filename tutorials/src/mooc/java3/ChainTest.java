package mooc.java3;

/**
 * Created by juno on 15-6-15.
 */
public class ChainTest {

    public static void main(String[] args) {
        ChainTest ct = new ChainTest();
        try{
            ct.test2();
        }catch (Exception e){
            e.printStackTrace();
        }

//        String s = "asfasfda";
//        System.out.println(s.charAt(0) == 'a');
    }

    public void test1() throws CustomizeException{
        throw new CustomizeException("喝车别开酒");

    }

    public void test2(){
        try {
            test1();
        } catch (CustomizeException e) {
            RuntimeException newExc = new RuntimeException(e);
//            newExc.initCause(e);
            throw newExc;
        }
    }
}
