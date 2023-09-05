package ru.netology.web.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.web.data.DataHelper;


import static com.codeborne.selenide.Selenide.$;

public class VerificationPage {

    private static SelenideElement codeVerify = $("[data-test-id=code] input");
    private static SelenideElement buttonVerify = $("[data-test-id=action-verify]");

    public DashboardPage validCode(DataHelper.VerificationCode code) {
        codeVerify.setValue(code.getCode());
        buttonVerify.click();
        return new DashboardPage();
    }
}


