import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

/**
 * Created by tenigeer on 2017/9/4.
 */



public class TestClassName {
    public static void main(String [] args){
//        System.out.println("tt");
        try {
            Class UserClass = Class.forName("ttest");
            System.out.println(UserClass);
            ttest tt = (ttest) UserClass.newInstance();
            tt.tt();

            //这个是我测试的
            System.out.println("test测试测试测试");

//            ttest t = new ttest();
//            t.tt();


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
