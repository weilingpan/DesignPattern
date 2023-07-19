package package01;
import package01.singleton;

public class class01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World! 回顧如何使用 Eclipse 寫 Java");
		
		singleton mysingleton = singleton.getInstance(11, 21);
		System.out.println(System.identityHashCode(mysingleton));
		System.out.println(mysingleton.getA());

        
        singleton mysingleton2 = singleton.getInstance(6, 5);
        System.out.println(System.identityHashCode(mysingleton2));
        System.out.println(mysingleton2.getA());
	}

}


