import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchCalculator {
	public static void main(String[] args){
		   //We need to point the chromedriver exe to the path of the executable
		   System.setProperty("webdriver.chrome.driver","/home/khadkasnareshgm/Jmeter/Softwares/chromedriver");   
		   //Create an instance of ChromeDriver to launch chrome browser
		   ChromeDriver driver = new ChromeDriver();
		   //To navigate to the application url
		   driver.get("https://www.calculator.net/calorie-calculator.html");
}
}