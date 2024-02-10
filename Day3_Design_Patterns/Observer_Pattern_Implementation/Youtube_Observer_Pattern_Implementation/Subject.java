package Youtube_Observer_Pattern;

public interface Subject {

	void Subscribe(Subscriber s);

	void unSubscribe(Observer s);

	void addVideo(String vid);

	String getName();

	void setName(String name);

}