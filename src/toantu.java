import java.util.Random;

public class toantu {
			public static void main(String[] args) {
				
//				int a = 13%3;	//a = 1
//				
//				int  b = a++;		//b=1  --> a = 2
//				b = ++a;      // b = 3  --> a = 3
//				
//				
//				//2.toan tu so sanh (quan he)
//				//<  >  <=   >= == !=
//				//tra ve hai gia tri true va false
//				boolean kq = a<b;
//				System.out.println(kq);     //false
//				//dung toan tu so sanh de viet cac bieu thuc dien kien
//				//tra ve true false
//				
//				
//				//3. Toan tu logic 
//				boolean A = true, B = false,C = false;
//				kq = A || B || C;
//				System.out.println(kq);			//true, it nhat co 1 so hang bang true thi ket qua bang true\
//				
//				kq = a + 5 > b + 1 && a!=b && a!=0;
//				//do uu tien tu cao den thap:
//				//toan tu so hoc
//				//toan tu so sanh
//				//toan tu logic : && uu tien hon ||
//				
//				System.out.println(kq);			//false
//				
//				
//				//4. Toan tu 3 ngoi
//				// exp1 ? exp2 : exp3
//				System.out.println(a==b ? "a=b":"a!=b");			//a = b
//				
//				//vi du: tim so lon nhat trong 3 so nguyen a b c bat ky
//				//dung bieu thuc 3 ngoi:
				int a = 15;
				int b = 5;
				int c = 30;
				System.out.println("max=" + (a > b ? (a > c ? a : c) :(b > c ? b : c)));
				
				
				//gia tri bien thien trong khoang tu 0 --> 100
				//gia tri cua m chi duoc phep bien thien trong khoang 20 --> 30
				//sao cho tri tuyet doi cua m - i la nho nhat 
				int i = new Random().nextInt(101);
				int m = i<20 ? 20 : (i > 30 ? 30 : i);
				System.out.println("i="+i);
				System.out.println("m="+m);
				
				
				
				
			}
}
