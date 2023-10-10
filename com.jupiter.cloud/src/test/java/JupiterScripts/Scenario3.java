package JupiterScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.genericUtility.BaseClass;

import objectRepo.CartPage;
import objectRepo.ContactPage;
import objectRepo.HomePage;
import objectRepo.ShopPage;

public class Scenario3 extends BaseClass{
	@Test
	public void senario() throws IOException {
		wlib.maximizeWindow(cd);
		wlib.implicitlyWait(cd);
		String url = plib.getdataFromPropFile("url");
		cd.get(url);
		HomePage hp = new HomePage(cd);
		ContactPage cp = new ContactPage(cd);
		ShopPage sp = new ShopPage(cd);
		CartPage ccp = new CartPage(cd);
		
		//Click on shop Menu
		hp.shopClick();
		sp.stuffedDogBuyBtn();
		sp.fluffyBunnyBuyBtn();
		sp.valentineBearBuyBtn();
		
		//Click On Cart Button
		sp.cartBtn();
		ccp.getAllthePrice();
		
		
	}
}
