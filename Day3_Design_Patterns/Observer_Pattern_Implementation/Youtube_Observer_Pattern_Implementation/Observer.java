package Youtube_Observer_Pattern;

public interface Observer {

	void addChannel(Channel ch);

	void dellChannel(Subject ch);

	void update(String vid, Subject ch);

}