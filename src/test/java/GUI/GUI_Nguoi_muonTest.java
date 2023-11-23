package GUI;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GUI_Nguoi_muonTest {
    private GUI_Nguoi_muon guiNguoiMuon;

    @BeforeEach
    public void setUp(){guiNguoiMuon = new GUI_Nguoi_muon();}

    @Test
    public void testInsertNguoiMuon()
    {
        int initialRowCount = guiNguoiMuon.Model.getRowCount();
        guiNguoiMuon.insertNguoiMuon("MN100","Nguyen Hoang Minh","Dong Nai","nhminh040601@gmail.com","0961234478");
        assertEquals(initialRowCount+1,guiNguoiMuon.Model.getRowCount());
    }

    @Test
    public void testInsertNguoiMuonWithInvalidMaNguoiMuon()
    {
        int initialRowCount = guiNguoiMuon.Model.getRowCount();
        guiNguoiMuon.insertNguoiMuon("","Nguyen Hoang Minh","Dong Nai","nhminh040601@gmail.com","0961234478");
        assertEquals(initialRowCount,guiNguoiMuon.Model.getRowCount());
    }

    @Test
    public void testInsertNguoiMuonWithInvalidTenNguoiMuon()
    {
        int initialRowCount = guiNguoiMuon.Model.getRowCount();
        guiNguoiMuon.insertNguoiMuon("MN024","","Dong Nai","nhminh040601@gmail.com","0961234478");
        assertEquals(initialRowCount,guiNguoiMuon.Model.getRowCount());
    }

    @Test
    public void testInsertNguoiMuonWithInvalidDiaChi()
    {
        int initialRowCount = guiNguoiMuon.Model.getRowCount();
        guiNguoiMuon.insertNguoiMuon("MN024","Nguyen Hoang Minh","","nhminh040601@gmail.com","0961234478");
        assertEquals(initialRowCount,guiNguoiMuon.Model.getRowCount());
    }

    @Test
    public void testInsertNgoiMuonWithInvalidGmail()
    {
        int initialRowCount = guiNguoiMuon.Model.getRowCount();
        guiNguoiMuon.insertNguoiMuon("MN024","Nguyen Hoang Minh","Dong Nai","","0961234478");
        assertEquals(initialRowCount,guiNguoiMuon.Model.getRowCount());
    }

    @Test
    public void testInsertNguoiMuonWithInvalidSDT()
    {
        int initialRowCount = guiNguoiMuon.Model.getRowCount();
        guiNguoiMuon.insertNguoiMuon("MN024","Nguyen Hoang Minh","Dong Nai","nhminh040601@gmail.com","");
        assertEquals(initialRowCount,guiNguoiMuon.Model.getRowCount());
    }

    @Test
    public void testInsertNguoiMuonWithMaNguoiMuonUsed()
    {
        int initialRowCount = guiNguoiMuon.Model.getRowCount();
        guiNguoiMuon.insertNguoiMuon("MN023","Nguyen Hoang Minh","Dong Nai","nhminh040601@gmail.com","0961234478");
        assertEquals(initialRowCount,guiNguoiMuon.Model.getRowCount());
    }
}