/**
 * Created by e165742 on 2016/12/05.
 */
public class Report5 {
    public static void main(String args[]) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerExceptionが発生した");
            e.printStackTrace();
        }
    }
}
