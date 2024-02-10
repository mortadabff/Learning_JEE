package Youtube_Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Subscriber implements Observer {
	private String name;
	private List<Channel> channels= new ArrayList<>();
	
	@Override
	public void addChannel(Channel ch) {
		channels.add(ch);	
	}
	@Override
	public void dellChannel(Subject ch) {
		channels.remove(ch);
		
	}
	@Override
	public void update(String vid, Subject ch){
		System.out.println(this.name+ " New video" + vid+ " From"+ ch.getName());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Subscriber(String name) {
		super();
		this.name = name;
	}
	

}
