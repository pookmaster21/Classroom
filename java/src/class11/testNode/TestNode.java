package class11.testNode;

import java.util.Objects;
import java.util.Scanner;

public class TestNode {
    public static Scanner reader = new Scanner(System.in);
    public static Node<Integer> build(){
        Node <Integer> first = null;
        Node <Integer> last = null;
        System.out.println("Enter a num:");
        int num = reader.nextInt();
        if(num!=999){
            first = new Node<>(num);
            last = first;
        }
        System.out.println("Enter a num:");
        num = reader.nextInt();
        while(num != 999){
            assert last != null;
            last.setNext(new Node<>(num));
            last = last.getNext();
            System.out.println("Enter a num");
            num = reader.nextInt();
        }
        return first;
    }

    public static Node<Integer> firstPos(Node<Integer> ls, int num) {
        while (ls != null) {
            if(ls.getValue() == num) {
                return ls;
            }
            ls = ls.getNext();
        }

        return null;
    }

    public static Node<Integer> addNum(Node<Integer> ls, int num) {
        Node<Integer> temp = new Node<>(num);
        if(num < ls.getValue()) {
            temp.setNext(ls);
            ls = temp;
            return ls;
        }
        Node<Integer> pos = ls;
        while(pos.hasNext()) {
            if (pos.getNext().getValue() > num) {
                temp.setNext(pos.getNext());
                pos.setNext(temp);
                return ls;
            }
            pos = pos.getNext();
        }
        pos.setNext(temp);
        return ls;
    }

    public static boolean hasSequins(Node<Integer> ls, int num) {
        int count = 1;
        while(ls.hasNext()) {
            if(Objects.equals(ls.getNext().getValue(), ls.getValue()+1)) {
                count++;
            } else {
                count = 1;
            }
            if(count == num) {
                return true;
            }
            ls = ls.getNext();
        }
        return false;
    }

    public static Node<Integer> evenOdd(Node<Integer> ls) {
        Node<Integer> first = new Node<>(ls.getValue());
        Node<Integer> last = first;
        ls = ls.getNext();
        while (ls != null) {
            if(ls.getValue()%2 == 0) {
                first = new Node<>(ls.getValue(), first);
            } else {
                last.setNext(new Node<>(ls.getValue()));
                last = last.getNext();
            }
            ls = ls.getNext();
        }
        return first;
    }

    public static Node<Character> Page99Ex49(Node<MyTav> ls) {
        Node<Character> first = new Node<>(ls.getValue().getTav());
        Node<Character> last = first;

        while (ls != null) {
            for (int i = 0; i < ls.getValue().getNum(); i++) {
                last.setNext(new Node<>(ls.getValue().getTav()));
                last = last.getNext();
            }
            ls = ls.getNext();
        }

        return first.getNext();
    }

    public static void main(String[] args) {

        MyTav t1 = new MyTav('R', 1);
        MyTav t2 = new MyTav('L', 3);
        MyTav t3 = new MyTav('S', 4);
        Node<MyTav> n1 = new Node<>(t1);
        n1.setNext(new Node<>(t2));
        n1.getNext().setNext(new Node<>(t3));

        System.out.println(Page99Ex49(n1));
    }
}
