class interview {
    public static void main(String args[]) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.add(10);
        System.out.println(list.get());
        list.add(15);
        System.out.println(list.get());
        /*list.add(20);
        System.out.println(list.get());
        list.add(25);*/
        System.out.println(list.delete());
        System.out.println(list.get());
    }
}