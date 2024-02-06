package com.FirstAppCreatedCommand.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import StrategyPatternImplementation.AmazonBoughtItems;
import StrategyPatternImplementation.MasterCard;
import StrategyPatternImplementation.PayementMethod;
import StrategyPatternImplementation.VisaCard;

public class AmazonBoughtItemsTest {

	
	@Test
    void SelectItemIphoneTest() {
        assertEquals("Item <Iphone 14> selected to bought", AmazonBoughtItems.SelectItem("Iphone 14"));
    }
	
	@Test
    void PayementItemMethodForIphoneVisa() {
		PayementMethod visa =(PayementMethod) new VisaCard("visa","Https/visa/payement ...");
        assertEquals("Payement<Iphone 14>:VisaCard", AmazonBoughtItems.SelectPayementMethodItem("Iphone 14",visa));
    }
	
	@Test
    void PayementItemMethodForSamsungMaster() {
		PayementMethod master =(PayementMethod) new MasterCard("master","Https/master/payement ...");
        assertEquals("Payement<samsung>:MasterCard", AmazonBoughtItems.SelectPayementMethodItem("samsung",master));
    }
	


}
