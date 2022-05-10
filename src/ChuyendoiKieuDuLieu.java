
public class ChuyendoiKieuDuLieu {
	public static void main(String[] args) {
		//+phep gan va phep tinh chi xay ra khi du lieu cung kieu voi nhau (1)
		//+cac kieu hep se tu dong chuyen thanh cac kieu rong hon de phu hop voi dieu kien (1)
		
		//ep kieu co the gay sai lech gia tri
		//vuot range cua kieu thap 
		  
		int n = (int)3.14;
		System.out.println(n);
		
		
		//int 1000 gio = bao nhieu thang, ngay , gio
		
		float thang = 1000/(24*30f);
		int nThang = (int)thang;
		float le = thang - nThang;			
		float ngay = le*30;
		int nNgay = (int)ngay;
		float leNgay = ngay - nNgay;
		float gio = leNgay*24;
		int nGio = (int)gio;
		System.out.println("Thang = "+(int)thang);
		System.out.println("Ngay = "+nNgay);
		System.out.println("Gio = "+nGio);
	}
}
