package Nhan;

public class GiaoDichNha extends GiaoDich{
	private String loaiNha;
	private String diachi;
	private int choose;
	
	public GiaoDichNha() {
		super();
	}

	public GiaoDichNha(String loaiNha, String diachi) {
		super();
		this.loaiNha = loaiNha;
		this.diachi = diachi;
	}

	public String getLoaiNha() {
		return loaiNha;
	}

	public void setLoaiNha(String loaiNha) {
		this.loaiNha = loaiNha;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public void nhap() {
		super.nhap();
		System.out.print("Nhap Dia chi:");
		diachi= scanner.nextLine();
		System.out.print("Nhap loai nha(1: cao cap, 2:thuong):");
		choose = scanner.nextInt();
		switch (choose) {
		case 1:
			loaiNha = "cao cap";
			break;
		case 2:
			loaiNha= "thuong";
			break;
		default :
			System.out.println("chon so khong hop le:");
		
		}
	}

	@Override
	public String toString() {
		return "GiaoDichNha [loaiNha=" + loaiNha + ", diachi=" + diachi + "]";
	}
	
}
