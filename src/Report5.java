/**
 * Created by e165742 on 2016/12/05.
 */
public class Report5 {
    public static void main(String args[]) {
        double value;
        try {
            String str = "3．14";
            value=Double.parseDouble(str);
        } catch (NullPointerException e) {
            System.out.println("NullPointerExceptionが発生した");
            e.printStackTrace();
        } catch (NumberFormatException e){
            System.out.println("NumberFormatExceptionが発生した");
            e.printStackTrace();
        }
    }
}
