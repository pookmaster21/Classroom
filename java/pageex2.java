public class pageex2 {
    public static void main(String[] args) {
        int first = (int) (Math.random() * (40 - 20 - 1));
        int second = (int) (Math.random() * (40 - 20 - 1));
        int third = (int) (Math.random() * (40 - 20 - 1));
        System.out.println(Math.max(Math.max(first, second), third));
        System.out.println((int) Math.sqrt(first));
        System.out.println((int) Math.sqrt(second));
        System.out.println((int) Math.sqrt(third));
        if (Math.sqrt(first) == Math.sqrt(second) || Math.sqrt(first) == Math.sqrt(third) || Math.sqrt(second) == Math.sqrt(third)) {
            System.out.println("There are two numbers that have the same sqrt");
        }
    }
}
