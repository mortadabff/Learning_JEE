package Youtube_Observer_Pattern;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Channel chB = new Channel ("channel B");
		Channel chA = new Channel ("channel A");
		
		Subscriber sub1= new Subscriber ("subscriber 1");
		Subscriber sub2= new Subscriber ("subscriber 2");
		Subscriber sub3= new Subscriber ("subscriber 3");
		Subscriber sub4= new Subscriber ("subscriber 4");
		Subscriber sub5= new Subscriber ("subscriber 5");
		Subscriber sub6= new Subscriber ("subscriber 6");
		
		chA.Subscribe(sub1);
		chA.Subscribe(sub2);
		chA.Subscribe(sub3);
		chB.Subscribe(sub2);
		chB.Subscribe(sub3);
		chB.Subscribe(sub4);
		chB.Subscribe(sub5);
		
		chA.addVideo("Adding video about JEE ");
		// expected to informe subsecribers in A : subscriber1, 2 , 3
		chB.addVideo("Adding video About devops ");
		// expected to informe subsecribers in B : subscriber2, 3 , 4, 5

		// subscriber 5 will  not be notified
	}

}
