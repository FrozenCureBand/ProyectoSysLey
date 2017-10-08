package Proyecto_v2;

public class ArregloQueue<E> implements Queue<E> {
	public static final int CAPACITY = 1000;
	private E[] data;
	private int f = 0;
	private int sz = 0;
	public ArregloQueue() {
		this(CAPACITY);
	}
	public ArregloQueue(int capacity) {
		data = (E[]) new Object[capacity];
	}
	public int size() {
		return sz;
	}
	public boolean isEmpty() {
		return (sz == 0);
	}
	public void enqueue(E e) {
		int avail = (f + sz) % data.length;
		data[avail] = e;
		sz++;
	}
	public E first() {
		if(isEmpty()) {
			return null;
		}
		return data[f];
	}
	public E dequeue() {
		if(isEmpty()) {
			return null;
		}
		E answer =data[f];
		data[f]=null;
		f = (f + 1) % data.length;
		sz--;
		return answer;
	}
}
