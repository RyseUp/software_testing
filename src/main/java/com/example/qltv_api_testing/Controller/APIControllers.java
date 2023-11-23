package com.example.qltv_api_testing.Controller;

import com.example.qltv_api_testing.Service.SachService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import Object.Sach;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/sach")
public class APIControllers {

    private final SachService sachService;

    public APIControllers(SachService sachService) {
        this.sachService = sachService;
    }

    @GetMapping(value = "/api")
    public String getPage(){
        return "xxx";
    }

    @GetMapping({"", "/", "/{}"})
    public ArrayList<Sach> getSachBy(
            @RequestParam(name = "MaSach", required = false) String maSach,
            @RequestParam(name = "TenSach", required = false) String tenSach,
            @RequestParam(name = "TrangThai", required = false) String trangThai,
            @RequestParam(name = "MaDauSach", required = false) String maDauSach)
    {
        return sachService.getSachByConditions(maSach, tenSach, trangThai, maDauSach);
    }

    @PostMapping({"", "/", "/{}"})
    public ResponseEntity<String> createSach(@RequestBody Sach sach){
        boolean success = sachService.createSach(sach.getMaSach(), sach.getTenSach(), sach.getTrangThai(), sach.getMaDauSach());
        if (success)
            return ResponseEntity.ok().body("Success");
        else
            return ResponseEntity.badRequest().body("Failed");
    }

    @PutMapping({"", "/", "/{}"})
    public boolean updateSach(@RequestBody Sach sach) {
        return sachService.updateSach(sach.getMaSach(),sach.getTenSach(), sach.getTrangThai(), sach.getMaDauSach());
    }

    @DeleteMapping({"/{maSach}", "/delete/{maSach}"})
    public boolean deleteSach(@PathVariable String maSach){
        return sachService.deleteSach(maSach);
    }
}
