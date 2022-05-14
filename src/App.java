public class App {
    public static void main(String[] args) throws Exception {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        for(int i=0 ; i<list.size() ; i++)
        {
            System.out.println(list.get(i));
        }

        list.remove(2);
        System.out.println("\n----------------\n");

        for(int i=0 ; i<list.size() ; i++)
        {
            System.out.println(list.get(i));
        }
    }
}
