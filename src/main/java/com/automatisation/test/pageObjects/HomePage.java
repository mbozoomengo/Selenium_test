package com.automatisation.test.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page {
    @FindBy(css = "nav>div:nth-child(4)")
    private WebElement avatar;

    @FindBy(id = "email_login")
    private WebElement usernameInput;
    @FindBy(id = "password_login")
    private WebElement passwordInput;
    @FindBy(id = "btn_login")
    private WebElement loginButton;


    private String URL = "https://ztrain-web.vercel.app/home";

    public void navigateToHomePage(){
        this.get(URL);
    }
//    public void fillEmailLogin(String email){
//        this.email_login.sendkeys(email);
//    }
//    public void fillPasswordLogin(String password){
//        this.password_login.sendkeys(password);
//    }
public void setUsername(String username) {
        usernameInput.sendKeys(username);
}

    public void setPassword(String password){
        passwordInput.sendKeys(password);
    }
    public void clickLogin() {
        loginButton.click();
    }

    public void openModal() { avatar.click();}

    public void loginAs(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
        this.clickLogin();
    }
}
