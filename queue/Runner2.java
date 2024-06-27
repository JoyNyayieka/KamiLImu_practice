package queue;

public class Runner2 {
	public static void main(String[] args) {
		
		Queue q= new Queue();
		q.enQueue(5);
		q.enQueue(2);
		q.enQueue(7);
		q.enQueue(3);
		
		q.deQueue();
		
		System.out.println("Queue size: " + q.size());
		
		q.show();
		
	}

}