package Proyecto;

import java.util.Arrays;

public class ArregloList<E> implements List<E> {
	/**
	 * 
	 * @Will
	 */
	public static final int CAPACITY = 16;
	private E[ ] data;
	private int size = 0;
	public ArregloList() {
		this(CAPACITY);
	} 
	public ArregloList(int capacity) {
		data = (E[]) new Object[capacity];
	}
	/**
	 * devuelve el tamaño de la lista
	 */
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size == 0;
	}
	public E get(int i) {
		checkIndex(i, size);
		return data[i];
	}
	public E set(int i, E e) {
		checkIndex(i, size);
		E temp = data[i];
		data[i] = e;
		return temp;
	}
	public void add(int i, E e) {
		size++;
		checkIndex(i, size);
		if(size == data.length) {
			throw new IllegalStateException("Array is full");
		}
		for(int k = size - 1; k >= i; k--) {
			data[k+1]=data[k];
		}
		data[i] = e;
	}
	public E remove(int i) throws IndexOutOfBoundsException {
		checkIndex(i, size);
		E temp = data[i];
		for(int k = i; k < size - 1;k++) {
			data[k]=data[k+1];
		}
		data[size-1]=null;
		size--;
		return temp;
	}
	protected void checkIndex(int i, int n) throws IndexOutOfBoundsException{
		if(i < 0 || i >= n) {
			throw new IndexOutOfBoundsException("Illegal index: " + i);
		}
	}

	public String toString() {
		String elementos="";
		for(int i = 0; i<size;i++) {
			if(data[i]!=null) {
				elementos += ", "+data[i];
			}
		}
		return elementos;
	}
}
