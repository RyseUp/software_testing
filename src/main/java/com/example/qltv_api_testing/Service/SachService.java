package com.example.qltv_api_testing.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import Process.*;
import Object.*;
import java.util.ArrayList;

@Service
public class SachService extends MyService{

    private final Process_Sach process_sach;

    @Autowired
    public SachService(Process_Sach process_Sach){this.process_sach = process_Sach;}

    public ArrayList<Sach> getAllSach()
    {
        return process_sach.getListSach();
    }

    public Sach getSachByID(int id)
    {
        return process_sach.getListSach().get(id);
    }

    public ArrayList<Sach> getSachByConditions(String maSach, String tenSach, String trangThai, String maDauSach){
        String condition = buildCondition("MaSach",maSach,"TenSach",tenSach, "TrangThai",trangThai,"MaDauSach",maDauSach);
        return process_sach.getByCondition(condition);
    }

    public boolean createSach(String maSach, String tenSach, String trangThai, String maDauSach){
        return process_sach.insertSach(maSach,tenSach,trangThai,maDauSach);
    }

    public boolean updateSach(String maSach, String tenSach, String trangThai, String maDauSach){
        return process_sach.updateSach(maSach,tenSach,trangThai,maDauSach);
    }

    public boolean deleteSach(String maSach){
        return process_sach.delSach(maSach);
    }
}
