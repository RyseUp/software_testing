package GUI;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GUITest {

    private GUI_Dang_nhap gui;

    @BeforeEach
    public void setUp() {
        gui = new GUI_Dang_nhap();
    }

    @Test
    public void testLoginWithEmptyUser() {
        String user = "";
        String pass = "12345";
        assertDoesNotThrow(() -> gui.login(user, pass));
    }

    @Test
    public void testLoginWithEmptyPassword() {
        String user = "username";
        String pass = "";
        assertDoesNotThrow(() -> gui.login(user, pass));
    }

    @Test
    public void testLoginWithEmptyUserPassword(){
        String user = "";
        String pass = "";
        assertDoesNotThrow(() -> gui.login(user, pass));
    }

    @Test
    public void testLoginSuccess() {
        String user = "admin";
        String pass = "12345";
        assertDoesNotThrow(() -> gui.login(user, pass));
    }

    @Test
    public void testLoginFailure() {
        String user = "invalidUser";
        String pass = "invalidPassword";
        assertDoesNotThrow(() -> gui.login(user, pass));
    }
}
