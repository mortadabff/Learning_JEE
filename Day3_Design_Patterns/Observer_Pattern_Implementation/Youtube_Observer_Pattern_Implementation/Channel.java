package Youtube_Observer_Pattern;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
	private List<String> videos= new ArrayList<>();
	private List<Subscriber> subs= new ArrayList<>();
	private String name;
	
	@Override
	public void Subscribe(Subscriber s) {
		subs.add(s);
		s.addChannel(this);
	}
	
	@Override
	public void unSubscribe(Observer s) {
		subs.remove(s);
		s.dellChannel(this);

	}
	
	public Channel(String name) {
		super();
		this.name = name;
	}

	@Override
	public void addVideo(String vid) {
		videos.add(vid);
		for(Observer sub: subs) {
			sub.update(vid,this);
		}
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
}
