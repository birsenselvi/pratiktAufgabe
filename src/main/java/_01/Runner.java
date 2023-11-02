package _01;

import org.testng.annotations.Test;

public class Runner extends BaseTest{
    /**
     * 1. https://demoblaze.com/  sayfasina gidin
     * 2. "Log in" butonuna tiklayin
     * 3. Dialog icindeki "Log in" butonunun visible oldugunu assert edin.
     * 5. "x" butonu ile dialog'u kapatin
     * 6. Dialogun kapandigini "Close" butonunun visibility'sine bakarak assert edin
     */
    @Test
    public void test(){
        // https://demoblaze.com/  sayfasina gidin

        goToHome();

        // "Log in" butonuna tiklayin

        click(llogin);

        // Dialog icindeki "Log in" butonunun visible oldugunu assert edin.

        isVisible(lloginButton);

        // "x" butonu ile dialog'u kapatin

        click(lclose);

        // Dialogun kapandigini "Close" butonunun visibility'sine bakarak assert edin

        isInVisible(lcoloseButton);

    }
}
