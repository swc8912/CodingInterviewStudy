import java.util.*;

public class HC_Queue {
	static int MAX = 10;
	static int[] qu;
	static int front, rear;
	public static void main(String[] args) {
		qu = new int[MAX];
		front = rear = 0;
		for(int i=0; i<10; i++) {
			insertQueue(i+10);
		}
		printQueue();
		deleteQueue();
		deleteQueue();
		printQueue();
	}
	public static void insertQueue(int value) {
		if(front > MAX || rear > MAX) return;
		qu[rear++] = value;
	}
	public static void printQueue() {
		if(front == rear) return;
		for(int i=front; i<rear; i++) System.out.print(qu[i] + " ");
		System.out.println("");
	}
	public static void deleteQueue() {
		if(front > MAX || rear > MAX || front == rear) return;
		front++;
	}
}