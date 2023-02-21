package page;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
 

	public int generatRandomNum(int boundaryNum) {
		 Random rnd = new Random();
		int generateNum = rnd.nextInt( boundaryNum);
		 return generateNum;
	}
}
