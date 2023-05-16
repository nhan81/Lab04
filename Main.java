package Nhan;

import java.util.Scanner;

public class Main {
	public static void main(String[]arg) {
		List l = new List();
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("nhan 1:Nhap thong tin dat");
			System.out.println("nhan 2:Nhap thong tin nha");
			System.out.println("nhan 3:Xuat thong tin dat");
			System.out.println("nhan 4:Xuat thong tin nha");
			System.out.println("nhan 5:ATong so tien");
		n = sc.nextInt();
			switch (n)
			{
			case 1:l.nhapdat();
			case 2:l.nhapnha();
			case 3:l.xuatdat();
			case 4:l.xuatnha();
			case 5:l.tongtien();
			}
			}
		while(true);
	}
	}
	
	
	

