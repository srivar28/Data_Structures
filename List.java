package srivar;

public interface List<E> {
	public abstract int size();
	public abstract void addFirst(E element);
	public abstract void addLast(E element);
	public abstract E removeFirst();
	public abstract E removeLast();
	public abstract E getAtIndex(int Index);
}
