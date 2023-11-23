package GUI;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GUI_Dau_sachTest {
    private GUI_Dau_sach guiDauSach;


    @BeforeEach
    public void setUp() {
        guiDauSach = new GUI_Dau_sach();
    }

    @Test
    public void testInsertDauSach() {
        int initialRowCount = guiDauSach.Model.getRowCount();
        guiDauSach.insertDauSach("DS778", "Book 1", 10, "Fiction", "Author 1", "Publisher 1", 2023);
        assertEquals(initialRowCount + 1, guiDauSach.Model.getRowCount());
    }

    @Test
    public void testInsertDauSachWithInvalidMaDauSach() {
        int initialRowCount = guiDauSach.Model.getRowCount();
        guiDauSach.insertDauSach("", "Book 2", 5, "Fiction", "Author 2", "Publisher 2", 2022);
        assertEquals(initialRowCount, guiDauSach.Model.getRowCount());
    }

    @Test
    public void testInsertDauSachWithInvalidTenSach() {
        int initialRowCount = guiDauSach.Model.getRowCount();
        guiDauSach.insertDauSach("DS138", "", 5, "Fiction", "Author 2", "Publisher 2", 2022);
        assertEquals(initialRowCount, guiDauSach.Model.getRowCount());
    }

    @Test
    public void testInsertDauSachWithInvalidSoLuong() {
        int initialRowCount = guiDauSach.Model.getRowCount();
        guiDauSach.insertDauSach("DS139", "Book 2", 0, "Fiction", "Author 2", "Publisher 2", 2022);
        assertEquals(initialRowCount, guiDauSach.Model.getRowCount());
    }

    @Test
    public void testInsertDauSachWithInvalidTheLoai() {
        int initialRowCount = guiDauSach.Model.getRowCount();
        guiDauSach.insertDauSach("DS138", "Book 2", 5, "", "Author 2", "Publisher 2", 2022);
        assertEquals(initialRowCount, guiDauSach.Model.getRowCount());
    }

    @Test
    public void testInsertDauSachWithInvalidTacGia() {
        int initialRowCount = guiDauSach.Model.getRowCount();
        guiDauSach.insertDauSach("DS138", "Book 2", 5, "Fiction", "", "Publisher 2", 2022);
        assertEquals(initialRowCount, guiDauSach.Model.getRowCount());
    }

    @Test
    public void testInsertDauSachWithInvalidNXB() {
        int initialRowCount = guiDauSach.Model.getRowCount();
        guiDauSach.insertDauSach("DS138", "Book 2", 5, "Fiction", "Author 2", "", 2022);
        assertEquals(initialRowCount, guiDauSach.Model.getRowCount());
    }

    @Test
    public void testInsertDauSachWithMaDauSachUsed() {
        int initialRowCount = guiDauSach.Model.getRowCount();
        guiDauSach.insertDauSach("DS138", "Book 2", 5, "Fiction", "Author 2", "Publisher 2", 0);
        assertEquals(initialRowCount, guiDauSach.Model.getRowCount());
    }


}
