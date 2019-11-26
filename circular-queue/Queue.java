import java.util.Arrays;

public class Queue {
	private int capacity;
	private int size;
	private int start;
	private int end;
	private int[] data;
	
	public Queue(int capacity) {
		this.capacity = capacity;
		start = 0; 
		end = 0;
		size = 0;
    	data = new int[capacity];
	}

	public int deQueue() throws IllegalStateException {
		if (size == 0) {
			throw new IllegalStateException("Queue is empty.");
		}
		
		int value = data[start];
		data[start] = -1;

		if (++start == capacity) start = 0;
		size--;
		return value;
	}
	
	public void enQueue(int value) {
		
		if (size == capacity) { 
			throw new IllegalStateException("Queue is full.");
		}
		data[end] = value;
		if (++end == capacity) end = 0;
		size++;
	}

	public String toString() {
		return String.valueOf(start) + " to " + String.valueOf(end) + ": " + Arrays.toString(data);
	}
}