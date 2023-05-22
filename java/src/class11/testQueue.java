package class11;

import java.util.Objects;
import java.util.Scanner;

public class testQueue {
    public static Scanner reader=new Scanner(System.in);
    public static Queue<Integer> buildQueue() {
        int x;
        Queue<Integer> q = new Queue<>();
        System.out.print("Enter a num: " );
        x = reader.nextInt();
        while(x != -999) {
            q.insert(x);
            System.out.print("Enter a num: " );
            x = reader.nextInt();
        }

        return q;
    }

    public static Queue<Integer> torByCommon(Queue<Integer> Q) {
        Queue<Integer> newQueue = new Queue<>();
        Queue<Integer> q2 = copyQueue(Q);
        int count, num;
        while (!q2.isEmpty()) {
            count = 1;
            num = q2.remove();
            q2.insert(null);
            while (q2.head() != null) {
                if(q2.head() == num) {
                    count++;
                    q2.remove();
                } else {
                    q2.insert(q2.remove());
                }
            }
            newQueue.insert(num);
            newQueue.insert(count);
            q2.remove();
        }

        return newQueue;
    }

    public static Queue<Integer> copyQueue(Queue<Integer> Q) {
        return Q;
    }

    public static int toNumber(Queue<Integer> q) {
        int num = 0, count = 1;
        while (!q.isEmpty()) {
            num += q.remove() * count;
            count *= 10;
        }

        return num;
    }

    public static int bigNumber(Node<Queue<Integer>> lst) {
        Node<Queue<Integer>> temp;
        int biggest = toNumber(lst.getValue());
        while (lst != null) {
            if(toNumber(lst.getValue()) > biggest) {
                biggest = toNumber(lst.getValue());
            }

            temp = lst;
            lst = lst.getNext();
            temp.setNext(null);
        }

        return biggest;
    }

    public static Queue<Integer> Ex6(Queue<Integer> que) {
        Queue<Integer> newQueue = new Queue<>(), negative = new Queue<>();
        int current, count = 0;

        while (!que.isEmpty()) {
            current = que.remove();
            if (current > 0) {
                newQueue.insert(current);
            } else if (current < 0) {
                negative.insert(current);
            } else  {
                count++;
            }
        }

        for (int i = 0; i < count; i++) {
            newQueue.insert(0);
        }

        while (!negative.isEmpty()) {
            newQueue.insert(negative.remove());
        }

        return newQueue;
    }

    public static Queue<Integer> Ex7(Queue<Integer> q, int m) {
        Queue<Integer> newQueue = new Queue<>();
        Queue<Integer> first = q;
        int count = 0;

        while (!first.isEmpty()) {
            first.remove();
            count++;
        }

        first = q;
        for (int i = 0; i < count-m/2; i++) {
            first.remove();
        }

        for (int i = 0; i < m; i++) {
            newQueue.insert(first.remove());
        }

        return newQueue;
    }

    public static int size(Queue<Integer> q) {
        int sum =0;

        Queue<Integer> newQ = new Queue<>();
        Queue<Integer> temp = new Queue<>();

        while (!q.isEmpty()) {
            newQ.insert(q.head());
            temp.insert(q.remove());
            sum++;
        }
        while (!temp.isEmpty()) {
            q.insert(temp.remove());
        }

        return sum;
    }

    public static boolean isIdentical(Queue<Integer> q1, Queue<Integer> q2) {
        int size = size(q1);
        if (size != size(q2)) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (q1.head() != q2.head()) {
                return false;
            }

            q1.insert(q1.remove());
            q2.insert(q2.remove());
        }

        return true;
    }

    public static boolean isSimilar(Queue<Integer> q1, Queue<Integer> q2) {
        int size = size(q1);
        for (int i = 0; i < size; i++) {
            if (isIdentical(q1, q2)) {
                return true;
            }
            q1.insert(q1.remove());
        }

        return false;
    }

    public static void leaves(BinNode<Integer> t, Queue<Integer> q) {
        if (t != null) {
            if (isLeaf(t)) {
                q.insert(t.getValue());
            } else {
                leaves(t.getRight(), q);
                leaves(t.getLeft(), q);
            }
        }
    }

    public static Node<Integer> buildNode(){
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

    public static Node<Integer> dell(Node<Integer> ls, int num) {
        Node<Integer> p = ls, prev;
        while(ls != null && ls.getValue() == num) {
            ls = ls.getNext();
        }
        if (ls == null) {
            return null;
        }
        prev = p;
        p = p.getNext();
        while (p != null) {
            if(p.getValue() == num) {
                prev.setNext(p.getNext());
                p.setNext(null);
                p = prev.getNext();
            } else {
                p = p.getNext();
                prev = prev.getNext();
            }
        }
        return prev;
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

    public static Node<Integer> Page96Ex33(Node<Integer> ls1, Node<Integer> ls2) {
        Node<Integer> pos1 = ls1;
        Node<Integer> pos2 = ls2;
        Node<Integer> prev = ls1;
        Node<Integer> pos;
        while (pos1 != null && pos2 != null) {
            if (Objects.equals(pos1.getValue(), pos2.getValue())) {
                pos1 = pos1.getNext();
                pos2 = pos2.getNext();
            } else {
                prev = pos1;
                pos1 = pos1.getNext();
                pos2 = ls2;
            }

            if (pos2 == null) {
                if(pos1 != null) {
                    if (prev == ls1) { // beginning
                        ls1 = pos1;
                    } else { // middle
                        prev.setNext(pos1);
                    }
                } else { //end
                    prev.setNext(null);
                }
            }
        }

        return ls1;
    }

    public static boolean upPath(BinNode<Integer> tr) {
        if (isLeaf(tr)) {
            return true;
        }
        return (tr.hasLeft() && tr.getValue() < tr.getLeft().getValue() && upPath(tr.getLeft())) ||
                (tr.hasRight() && tr.getValue() < tr.getRight().getValue() && upPath(tr.getRight()));
    }

    public static void preOrder(BinNode<Integer> bt) {
        if(bt != null) {
            System.out.println(bt.getValue());
            preOrder(bt.getLeft());
            preOrder(bt.getRight());
        }
    }

    public static void inOrder(BinNode<Integer> bt) {
        if(bt != null) {
            inOrder(bt.getLeft());
            System.out.println(bt.getValue());
            inOrder(bt.getRight());
        }
    }

    public static void postOrder(BinNode<Integer> bt) {
        if(bt != null) {
            postOrder(bt.getLeft());
            postOrder(bt.getRight());
            System.out.println(bt.getValue());
        }
    }
    public static void breadthSearch(BinNode<Integer> bt) {
        Queue<BinNode<Integer>> qu = new Queue<>();
        BinNode<Integer> temp;
        qu.insert(bt);
        while (!qu.isEmpty()) {
            temp = qu.remove();
            System.out.println(temp.getValue());
            if (temp.hasLeft()) {
                qu.insert(temp.getLeft());
            }
            if (temp.hasRight()) {
                qu.insert(temp.getRight());
            }
        }
    }

    public static Queue<BinNode<Integer>> breadthBinTree(BinNode<Integer> bt) {
        Queue<BinNode<Integer>> qu = new Queue<>(), qu1 = new Queue<>();
        BinNode<Integer> temp;
        qu.insert(bt);
        qu1.insert(bt);
        while (!qu.isEmpty()) {
            temp = qu.remove();
            qu1.insert(temp);
            if (temp.hasLeft()) {
                qu.insert(temp.getLeft());
                qu1.insert(temp.getLeft());
            }
            if (temp.hasRight()) {
                qu.insert(temp.getRight());
                qu1.insert(temp.getRight());
            }
        }
        return qu1;
    }

    public static int countNodes(BinNode<Integer> bt) {
        if(bt == null) {
            return 0;
        }

        return countNodes(bt.getLeft()) + countNodes(bt.getRight()) + 1;
    }

    public static boolean exists(BinNode<Integer> bt, int num) {
        if (bt == null) {
            return false;
        } else if(bt.getValue() == num) {
            return true;
        }

        return exists(bt.getLeft(), num) || exists(bt.getRight(), num);
    }

    public static boolean isAllEven(BinNode<Integer> bt) {
        if (bt == null) {
            return true;
        }

        return (bt.getValue() % 2 == 0) && isAllEven(bt.getLeft()) && isAllEven(bt.getRight());
    }

    public static boolean isLeaf(BinNode<Integer> bt) {
        return !(bt.hasLeft() && bt.hasRight());
    }

    public static int countLeaf(BinNode<Integer> bt) {
        if (bt == null) {
            return 0;
        } else if (isLeaf(bt)) {
            return 1;
        }

        return countLeaf(bt.getLeft()) + countLeaf(bt.getRight());
    }

    public static boolean isSimilar(BinNode<Integer> bt1, BinNode<Integer> bt2) {
        if (bt1 == null && bt2 == null) {
            return true;
        } else if (bt1 == null || bt2 == null) {
            return false;
        }

        return isSimilar(bt1.getLeft(), bt2.getLeft()) && isSimilar(bt1.getRight(), bt2.getRight());
    }

    public static boolean descendant(BinNode<Integer> bt, int x, int y) {
        if(bt == null) {
            return false;
        } else if (bt.getValue() == x) {
            return exists(bt.getLeft(), y) || exists(bt.getRight(), y);
        }

        return descendant(bt.getLeft(), x, y) || descendant(bt.getRight(), x, y);
    }

    public static int max(BinNode<Integer> bt) {
        if (bt.hasLeft() && bt.hasRight()) {
            return Math.max(Math.max(bt.getValue(), max(bt.getLeft())), max(bt.getRight()));
        } else if (bt.hasLeft() && !bt.hasRight()) {
            return Math.max(bt.getValue(), max(bt.getLeft()));
        } else if (!bt.hasLeft() && bt.hasRight()) {
            return Math.max(bt.getValue(), max(bt.getRight()));
        }

        return bt.getValue();
    }

    public static void addChild(BinNode<Integer> bt) {
        if (!isLeaf(bt)) {
            if (!bt.hasRight()) {
                bt.setRight(new BinNode<>(bt.getLeft().getValue()));
            } else {
                bt.setLeft(new BinNode<>(bt.getRight().getValue()));
            }

            addChild(bt.getLeft());
            addChild(bt.getRight());
        }
    }

    public static int sumDigits(int num) {
        if (num < 10) {
            return num;
        }
        return num%10 + sumDigits(num/10);
    }

    public static void printEvenSumDigits(BinNode<Integer> bt) {
        if (bt != null) {
            if (sumDigits(bt.getValue()) % 2 == 0) {
                System.out.println(bt.getValue());
            }

            printEvenSumDigits(bt.getLeft());
            printEvenSumDigits(bt.getRight());
        }
    }

    public static boolean queueOfSeries(Queue<Series> queue) {
        if(queue == null || queue.isEmpty()) {
            return false;
        }

        Series serial1 = queue.head();
        queue.remove();
        Series serial2;

        while (!queue.isEmpty()) {
            serial2 = queue.head();
            queue.remove();

            if(serial1.last() != serial2.getFirst()) {
                return  false;
            }

            serial1 = serial2;
        }

        return true;
    }

    public static boolean page184Ex37(BinNode<Integer> bt) {
        Queue<BinNode<Integer>> qu = breadthBinTree(bt);
        BinNode<Integer> last = qu.remove();
        while (!qu.isEmpty()) {
            if (qu.head().getValue() < last.getValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean omegaTree(BinNode<Integer> bt) {
        if (bt == null) {
            return true;
        }

        if (bt.hasRight() && bt.hasLeft()) {
            return omegaTree(bt.getRight()) && omegaTree(bt.getLeft()) && bt.getValue() > sumTree(bt.getLeft()) && bt.getValue() < sumTree(bt.getRight());
        } else if (bt.hasRight()) {
            return omegaTree(bt.getRight()) && bt.getValue() < sumTree(bt.getRight());
        } else if (bt.hasLeft()) {
            return omegaTree(bt.getLeft()) && bt.getValue() > sumTree(bt.getLeft());
        }

        return true;
    }

    public static int sumTree(BinNode<Integer> bt) {
        int sum = 0;
        if (bt.hasRight()) {
            sum += sumTree(bt.getRight());
        }
        if (bt.hasLeft()) {
            sum += sumTree(bt.getLeft());
        }
        return bt.getValue() + sum;
    }

    public static void main(String[] args) {
        BinNode<Integer> tr9 = new BinNode<>(9);
        BinNode<Integer> tr7 = new BinNode<>(null, 6, tr9);
        BinNode<Integer> tr5 = new BinNode<>(7);
        BinNode<Integer> tr6 = new BinNode<>(tr7,4, tr5);
        BinNode<Integer> tr3 = new BinNode<>(7);
        BinNode<Integer> tr4 = new BinNode<>(8);
        BinNode<Integer> tr2 = new BinNode<>(tr3, 6, tr4);
        BinNode<Integer> tr1 = new BinNode<>(null, 3, tr2);
        BinNode<Integer> tr = new BinNode<>(tr1, 1, tr6);

        System.out.println(sumTree(tr7));
    }
}
