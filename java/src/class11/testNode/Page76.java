package class11.testNode;

import java.util.Objects;

public class Page76 {
     public static void Ex5(Node<Integer> ls, int num) {
        Node<Integer> temp = ls;
        if(temp.getValue() == num){
            ls = temp.getNext();
        } else {
            while (temp.hasNext()) {
                if (temp.getValue() == num) {

                }
                temp = temp.getNext();
            }
        }

    }

    public static Node<Integer> Ex6(Node<Integer> ls) {
        Node<Integer> temp = ls;
        while(temp.hasNext()) {
            if(Objects.equals(temp.getNext().getValue(), temp.getValue())) {
                temp.setNext(temp.getNext().getNext());
            }
            temp = temp.getNext();
        }
        return ls;
    }

    public static boolean Ex8(Node<Integer> ls) {
         Node<Integer> temp = ls;
         while(temp.hasNext()) {
            if(temp.getValue() > temp.getNext().getValue()) {
                return false;
            }
            temp = temp.getNext();
         }
         return true;
    }

    public static void Ex9(Node<Integer> ls) {
         while(ls.hasNext()) {
             if (ls.getNext().getValue() > ls.getValue()) {
                 System.out.println(ls.getNext().toString());
             }
             ls = ls.getNext();
         }
    }

    public static Node<Integer> Ex10(int beginner, int num) {
         Node<Integer> ls = new Node<>(beginner);
         Node<Integer> temp = ls;

         for (int i=1;i<num;i++) {
             Node<Integer> new_node = new Node<>(beginner + num*i);
             temp.setNext(new_node);
             temp = new_node;
         }

         return ls;
    }

    public static void main(String[] args) {

    }
}
