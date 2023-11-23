package Object;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_sach")
public class Sach {
	@Id
	@Column(name = "MaSach")
	private String MaSach;
	@Column(name = "TenSach")
	private String TenSach;
	@Column(name = "TrangThai")
	private String TrangThai;
	@Column(name = "MaDauSach")
	private String MaDauSach;

	public Sach() {
		super();
	}

	public Sach(String maSach, String tenSach, String trangThai, String maDauSach) {
		super();
		MaSach = maSach;
		TenSach = tenSach;
		TrangThai = trangThai;
		MaDauSach = maDauSach;
	}

	public String getMaSach() {
		return MaSach;
	}

	public void setMaSach(String maSach) {
		MaSach = maSach;
	}

	public String getTenSach() {
		return TenSach;
	}

	public void setTenSach(String tenSach) {
		TenSach = tenSach;
	}

	public String getTrangThai() {
		return TrangThai;
	}

	public void setTrangThai(String trangThai) {
		TrangThai = trangThai;
	}

	public String getMaDauSach() {
		return MaDauSach;
	}

	public void setMaDauSach(String maDauSach) {
		MaDauSach = maDauSach;
	}



}
