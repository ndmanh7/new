import java.util.Arrays;

public class Ham {
	//thu them vao xem
	//them vao lan 2 nay
	//them lan 3
	 static void inThongTin(String name) {					//them static vao de goi duoc trong ham main
															//vi ham main la static va ham main chi goi duoc ham static
		System.out.println("Ten : "+name);
	}
	static float tinhTrungBinh(int a, int b, int c) {
		return (a+b+c)/3f;
	}
	static int giaiThua(int n) {
		if(n==0)	return 1;
		return n*giaiThua(n-1);
	}
	static void sapxep(int[] m) {
		for(int i = 0 ; i < m.length - 1; i++) {
			for(int j = i+1; j < m.length; j++)
				if(m[i]<m[j])
				{
					int tg = m[i];
					m[i] = m[j];
					m[j] = tg;
				}
		}
	}
	static int[] xoa(int[] m) {
		int newArray[] = new int[m.length - 1];
		for (int i = 0; i < newArray.length; i++)
			newArray[i] = m[i];
		return newArray;
	}
		public static void main(String[] args) {
			//+viet ham trong than class
			inThongTin("Nguyen Duc Manh");
			//ham co the tra ve gia tri hoac khong
			//neu khong co, tu khoa xac dinh kieu dat la void
			System.out.format("Trung binh cong cua 3 so la: %.3f\n", tinhTrungBinh(9,6,8));
			System.out.println("Giai thua: " + giaiThua(5));
			
			//tham tri: gia tri dc copy va truyen qua dau gan
			
			//tham chieu: dia chi cua bien se duoc copy va truyen qua dau gan
			int[] array1 = {1,2,3,4,5,6};
			
			sapxep(array1);
			System.out.println(Arrays.toString(array1));
			
			//cac kieu du lieu co cau truc deu la kieu tham chieu:
			//mang, doi tuong
			//tham chieu khong co tinh chat bac cau
			
			System.out.println(Arrays.toString(xoa(array1)));
			
			//adsasda
		}
}
