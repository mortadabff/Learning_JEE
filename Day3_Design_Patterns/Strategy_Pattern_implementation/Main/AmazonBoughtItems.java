package StrategyPatternImplementation;

public class AmazonBoughtItems {

	public static String SelectItem(String item) {
		return "Item <"+item+"> selected to bought";
	}
	public static String SelectPayementMethodItem(String item, PayementMethod pay) {
		return "Payement<"+item+">:"+pay.toString();
	}
}
