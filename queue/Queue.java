package queue;

public class Queue {

	int queue[] = new int[5];
	int size;
	int front;
	int rear;
	
	public void enQueue(int data) {
		
		queue[rear] = data;
		rear++;
		size++;
	}
	
	public int deQueue() {
		
		int data = queue[front];
		front++;
		size--;
		
		return data;
	}
	
	public void show() {
		
		System.out.print("Elements : ");
		for(int i=0; i<size; i++) {
			System.out.print(queue[front + i] + " ");
		}
		
		/*
		 * This method is here to show that when you enqueue, you don't delete the elements,
		 * you simply move the front pointer
		 */
		System.out.println();
		for (int n: queue) {
			System.out.print(n + " ");
		}
	}
	
	  public int size() {
	        return size;
	    }
}