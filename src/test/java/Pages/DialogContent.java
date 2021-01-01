package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DialogContent extends _Parent{

    WebElement myElement;

    public DialogContent() {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='mat-input-0']")
    public WebElement username;


    @FindBy(xpath = "//input[@id='mat-input-1']")
    public WebElement password;


    @FindBy(xpath = "//span[text()=' LOGIN ']")
    public WebElement loginBtn;


    @FindBy(linkText = "Got it!")
    private WebElement gotItBtn;

    @FindBy(xpath = "//span[text()='Human Resources']")
    public WebElement humanResBtn;


    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    public WebElement setupBtn;


    @FindBy(xpath = "//span[text()='Notation Keys']")
    public WebElement notationKeysBtn;


    @FindBy(xpath = "//ms-add-button[@class='ng-star-inserted']")
    public WebElement addBtn;


    @FindBy(xpath = "(//input[contains(@data-placeholder,'Name')])[3]")
    public WebElement nameInput;


    @FindBy(xpath = "//input[contains(@formcontrolname,'shortName')]")
    public WebElement shortNameInput;


    @FindBy(xpath = "//input[contains(@formcontrolname,'multiplier')]")
    public WebElement multiplierInput;


    @FindBy(xpath = "//span[text()='Apply']")
    public WebElement applyFirstBtn;

    @FindBy(xpath = "(//input[contains(@data-placeholder,'Name')])[1]")
    public WebElement editNameLineClick;


    @FindBy(xpath = "(//input[contains(@data-placeholder,'Name')])[1]")
    public WebElement repeatTheName;


    @FindBy(xpath = "//span[text()=' Search ']")
    public WebElement searchBtn;


    @FindBy(xpath = "//ms-edit-button[@class='ng-star-inserted']")
    public WebElement editBtn;


    @FindBy(xpath = "//input[contains(@name,'name')]")
    public WebElement newName;


    @FindBy(xpath = "//span[text()='Apply']")
    public WebElement applyEditBtn;


    @FindBy(xpath = "//ms-delete-button/button")
    public WebElement deleteBtn;


    @FindBy(xpath = "//span[text()=' Yes ']")
    public WebElement yesBtn;

    @FindAll({
            @FindBy(linkText = "Got it!")
    })
    private List<WebElement> gotItBtns;


    public void findElementAndClickFunction(String ElementName) {
        switch (ElementName) {
            case "loginBtn" : myElement = loginBtn; break;
            case "gotItBtn":
                if (gotItBtns.size() == 0)
                    return;
                myElement = gotItBtn;
                break;
            case "humanResBtn" : myElement = humanResBtn; break;
            case "setupBtn" : myElement = setupBtn; break;
            case "notationKeysBtn" : myElement = notationKeysBtn; break;
            case "addBtn" : myElement = addBtn; break;
            case "shortNameInput" : myElement= shortNameInput; break;
            case "multiplierInput" : myElement = multiplierInput; break;
            case "applyFirstBtn" :myElement = applyFirstBtn; break;
            case "editNameLineClick": myElement=editNameLineClick; break;
            case "searchBtn" : myElement= searchBtn; break;
            case "editBtn": myElement=editBtn; break;
            case "applyEditBtn": myElement=applyEditBtn; break;
            case "deleteBtn": myElement=deleteBtn; break;
            case "yesBtn": myElement=yesBtn; break;

        }
        clickFunction(myElement);
    }

    public void findElementAndSendKeysFunction(String ElementName, String value) {
        switch (ElementName) {

            case "username" : myElement = username; break;
            case "password" : myElement = password; break;
            case "nameInput" : myElement = nameInput; break;
            case "shortNameInput" : myElement = shortNameInput; break;
            case "multiplierInput" : myElement = multiplierInput; break;
            case "repeatTheName" : myElement = repeatTheName; break;
            case "newName" : myElement=newName; break;


        }
        sendKeysFunction(myElement,value);
    }


}
