package Nhan;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
	private static final GiaoDichNha GiaoDichDat = null;
	ArrayList<GiaoDichNha> arrGiaoDichNha = new ArrayList<>();
    ArrayList<GiaoDichNha> arrGiaoDichDat = new ArrayList<>();
    int soGiaoDichDat = 0, soGiaoDichNha = 0;
    long tongTienGiaoDichDat = 0, trungBinhThanhTien = 0;
    Scanner scanner = new Scanner(System.in);
    public void nhapdat()
     {
    System.out.print("Nhập số giao dịch đất: ");
    soGiaoDichDat = scanner.nextInt();
    System.out.println("Nhập thông tin giao dịch đất:");
    for (int i = 0; i < soGiaoDichDat; i++) {
        System.out.println("Nhập thông tin giao dịch đất thứ " + (i + 1) + ":");
        GiaoDichDat giaoDichDat = new  GiaoDichDat();
        giaoDichDat.nhap();
        arrGiaoDichDat.add(GiaoDichDat);}
    }
    public void nhapnha()
    {
    System.out.print("Nhập số giao dịch nhà: ");
    soGiaoDichNha = scanner.nextInt();
    System.out.println("Nhập thông tin giao dịch nhà:");
    for (int i = 0; i < soGiaoDichNha; i++) 
    {
        System.out.println("Nhập thông tin giao dịch nhà thứ " + (i + 1) + ":");
        GiaoDichNha giaoDichNha = new GiaoDichNha();
        giaoDichNha.nhap();
        arrGiaoDichNha.add(giaoDichNha);
    }
    }
   public void xuat() 
   {
    System.out.println("---Thông tin các giao dịch đất---");
    for (int i = 0; i < arrGiaoDichNha.size(); i++) {
        System.out.println(arrGiaoDichDat.get(i).toString());
    }
   }
   public void xuatnha() 
   {
    System.out.println("---Thông tin các giao dịch nhà---");
    for (int i = 0; i < arrGiaoDichNha.size(); i++) {
        System.out.println(arrGiaoDichNha.get(i).toString());
    }
   }
   void tongtien() 
   {
    for (int i = 0; i < arrGiaoDichDat.size(); i++) 
    {
        if (arrGiaoDichDat.get(i).getLoaiNha().equalsIgnoreCase("A"))
        {
            tongTienGiaoDichDat += arrGiaoDichDat.get(i).getDientich() * 
                arrGiaoDichDat.get(i).getDongia() * 1.5;
        } 
        else if (arrGiaoDichDat.get(i).getLoaiNha().equalsIgnoreCase("B") || 
                arrGiaoDichDat.get(i).getLoaiNha().equalsIgnoreCase("C"))
        {
            tongTienGiaoDichDat += arrGiaoDichDat.get(i).getDientich() * 
                arrGiaoDichDat.get(i).getDongia();
        }
    }
    }
    void tbinhdat() {
    trungBinhThanhTien = tongTienGiaoDichDat / (arrGiaoDichDat.size());
    System.out.println("Trung bình thành tiền của giao dịch đất = " + trungBinhThanhTien);

    // xuất ra các giao dịch của tháng 9 năm 2013
    System.out.println("Các giao dịch đất của tháng 9 năm 2013: ");
    for (int i = 0; i < arrGiaoDichDat.size(); i++) {
        String[] dateGiaoDichDat = arrGiaoDichDat.get(i).getNgayGiaoDich().split("/");
        if (dateGiaoDichDat[1].equals("9") && dateGiaoDichDat[2].equals("2013")) {
            System.out.println(arrGiaoDichDat.get(i).toString());
        }
    }

    System.out.println("Các giao dịch nhà của tháng 9 năm 2013: ");
    for (int i = 0; i < arrGiaoDichNha.size(); i++) {
        String[] dateGiaoDichNha = arrGiaoDichNha.get(i).getNgayGiaoDich().split("/");
        if (dateGiaoDichNha[1].equals("9") && dateGiaoDichNha[2].equals("2013")) {
            System.out.println(arrGiaoDichNha.get(i).toString());
        }
    }
}
	public void xuatdat() {
		// TODO Auto-generated method stub
		
	}

}

