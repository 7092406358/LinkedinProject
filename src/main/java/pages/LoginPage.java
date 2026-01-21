 package pages;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	public class LoginPage {
	    WebDriver driver;
	    @FindBy(id = "username")
	    private WebElement usernameInput;

	    @FindBy(id = "password")
	    private WebElement passwordInput;
	    
	    @FindBy(xpath ="//*[@id='organic-div']/form/div[4]/button")
	    private WebElement signin;

	    @FindBy(id ="login_Layer")
	    private WebElement loginButton;
	    
	    @FindBy(xpath="//a[contains(@href,'signin')]")
	    private WebElement signInButton;
	    
	    @FindBy(xpath ="//button[text()='Login']")
	    WebElement  clickLoginButton;

	    public LoginPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    public void clickOnSignIn() 
	    { 
			  signInButton.click(); 
		 }
	    public void enterUsername(String username) {
	        usernameInput.sendKeys(username);
	    }
	    public void enterPassword(String password) {
	        passwordInput.sendKeys(password);
	    }
		  public void clickSigninButton() { 
			  signin.click();
			  }
		 
	} 