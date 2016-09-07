/**
 * Created by lichangjun1 on 2016/9/1.
 */
public class myTest {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        add(a);
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("我是好人");
        System.out.println("nishi");

    }

    public  static int add(int i) {
        int a =1;
        int b = 2;
        return i++;
    }
}
