//https://then.tw/java-singleton/

package package01;

public class singleton {
    private static singleton instance;
    private int a;
    private int b;
    
    private singleton(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
//    注意兩者的差異
//    public static singleton getInstance(int a, int b) {
//        if (instance == null) {
//            instance = new singleton(a, b);
//        }
//        return instance;
//    }
    
    public static singleton getInstance(int a, int b) {
        if (instance == null || instance.a != a || instance.b != b) {
        	instance = new singleton(a, b);
        }
        return instance;
    }
    
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}