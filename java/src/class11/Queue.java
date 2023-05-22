package class11;

public class Queue<T> {
    private Node<T> first;
    private Node<T> last;

    public Queue() {
        this.first = null;
        this.last = null;
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    public void insert(T x) {
        Node<T> temp = new Node<>(x);
        if(this.last == null) {
            this.first = temp;
        } else {
            this.last.setNext(temp);
        }
        this.last = temp;
    }

    public T remove() {
        T x = this.first.getValue();
        this.first = this.first.getNext();
        if(this.first == null) {
            this.last = null;
        }
        return x;
    }

    public T head() {
        return this.first.getValue();
    }

    public String toString() {
        String str = "[";
        Node<T> pos = this.first;
        while(pos != null) {
            if(pos.hasNext()) {
                str = str + pos.getValue() + ", ";
            } else {
                str = str + pos.getValue();
            }
            pos = pos.getNext();
        }
        str = str + "]";
        return str;
    }
}
