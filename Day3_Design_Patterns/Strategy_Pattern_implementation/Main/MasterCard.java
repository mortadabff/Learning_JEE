package StrategyPatternImplementation;

public class MasterCard implements PayementMethod{
	private String name;
	private String url;
	
	public MasterCard(String name, String url) {
		this.name=name;
		this.url=url;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "MasterCard";
	}
}
