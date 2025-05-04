import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Info: BOJ#18258 큐 2
 * Ref: https://www.acmicpc.net/problem/18258
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		MyQueue q = new MyQueue(N);
		StringBuilder sb = new StringBuilder();
		
		while (N-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			switch (st.nextToken()) {
			case "push":
				q.push(Integer.parseInt(st.nextToken())); break;
			case "pop":
				sb.append(q.pop()).append('\n'); break;
			case "size":
				sb.append(q.getSize()).append('\n'); break;
			case "empty":
				sb.append(q.empty()).append('\n'); break;
			case "front":
				sb.append(q.getFront()).append('\n'); break;
			case "back":
				sb.append(q.getBack()).append('\n'); break;
			}
		}
		System.out.println(sb);
	}
}

class MyQueue {
	private int[] data;
	private int front;
    private int back;
    private int size;
    private int capacity;
    
    public MyQueue (int capacity) {
    	this.capacity = capacity;
        data = new int[capacity];
        front = 0;
        back = 0;
        size = 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }
    
    public void push(int X) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        data[back] = X;
        back = (back + 1) % capacity;
        size++;
    }
    
    public int pop() {
        if (empty() == 1) {
            return -1;
        }
        int item = data[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }
    
    public int empty() {
    	if (size == 0) {
    		return 1;
    	}
        return 0;
    }
    
    public int getSize() {
    	return size;
    }
    
    public int getFront() {
    	if (empty() == 1) {
            return -1;
        }
    	return data[front];
    }
    
    public int getBack() {
    	if (empty() == 1) {
            return -1;
        }
    	return data[(back - 1 + capacity) % capacity];
    }
}