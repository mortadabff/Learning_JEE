package StrategyPatternImplementation;

public class VisaCard implements PayementMethod{
	private String name;
	private String url;
	
	public VisaCard(String name, String url) {
		this.name=name;
		this.url= url;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "VisaCard";
	}

}
