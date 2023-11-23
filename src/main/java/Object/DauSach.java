package Object;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DauSach {

	private String MaDauSach, TenSach, TheLoai, TacGia, NXB;
	private int SoLuong, NamXB;

	public DauSach() {
		super();
	}

	public DauSach(String maDauSach, String tenSach, String theLoai, String tacGia, String nXB, int soLuong,int namXB) {
		super();
		MaDauSach = maDauSach;
		TenSach = tenSach;
		TheLoai = theLoai;
		TacGia = tacGia;
		NXB = nXB;
		SoLuong = soLuong;
		NamXB = namXB;
	}
	@Id
	public String getMaDauSach() {
		return MaDauSach;
	}

	public void setMaDauSach(String maDauSach) {
		MaDauSach = maDauSach;
	}
	@Column
	public String getTenSach() {
		return TenSach;
	}

	public void setTenSach(String tenSach) {
		TenSach = tenSach;
	}
	@Column
	public String getTheLoai() {
		return TheLoai;
	}

	public void setTheLoai(String theLoai) {
		TheLoai = theLoai;
	}
	@Column
	public String getTacGia() {
		return TacGia;
	}

	public void setTacGia(String tacGia) {
		TacGia = tacGia;
	}
	@Column
	public String getNXB() {
		return NXB;
	}

	public void setNXB(String nXB) {
		NXB = nXB;
	}
	@Column
	public int getSoLuong() {
		return SoLuong;
	}

	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}
	@Column
	public int getNamXB() {
		return NamXB;
	}

	public void setNamXB(int namXB) {
		NamXB = namXB;
	}


}
