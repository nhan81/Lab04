package Nhan;

import java.util.Scanner;

public class GiaoDich {
	private String maGiaoDich;
	private String ngayGiaoDich;
	private long dongia;
	private float dientich;
	Scanner scanner = new Scanner(System.in);
	
	public GiaoDich() {
		super();
	}

	public GiaoDich(String maGiaoDich, String ngayGiaoDich, long dongia, float dientich) {
		super();
		this.maGiaoDich = maGiaoDich;
		this.ngayGiaoDich = ngayGiaoDich;
		this.dongia = dongia;
		this.dientich = dientich;
	}

	public String getMaGiaoDich() {
		return maGiaoDich;
	}

	public void setMaGiaoDich(String maGiaoDich) {
		this.maGiaoDich = maGiaoDich;
	}

	public String getNgayGiaoDich() {
		return ngayGiaoDich;
	}

	public void setNgayGiaoDich(String ngayGiaoDich) {
		this.ngayGiaoDich = ngayGiaoDich;
	}

	public long getDongia() {
		return dongia;
	}

	public void setDongia(long dongia) {
		this.dongia = dongia;
	}

	public float getDientich() {
		return dientich;
	}

	public void setDientich(float dientich) {
		this.dientich = dientich;
	}
	
	public void nhap() {
		System.out.print("nhap ma giao dich:");
		maGiaoDich = scanner.nextLine();
		System.out.print("nhap ngay giao dich:");
		ngayGiaoDich = scanner.nextLine();
		System.out.print("nhap don gia:");
		dongia = Long.parseLong(scanner.nextLine());
		System.out.print("nhap dien tich:");
		dientich = Float.parseFloat(scanner.nextLine());
	}

	@Override
	public String toString() {
		return "GiaoDich [maGiaoDich=" + maGiaoDich + ", ngayGiaoDich=" + ngayGiaoDich + ", dongia=" + dongia
				+ ", dientich=" + dientich + "]";
	}
	
}
