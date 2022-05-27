import java.util.*;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args){
        System.out.println("Use ten different kinds of collection class to handle data.");
        // LinkedHashSet
        System.out.println("1. LinkedHashSet<K,E> in java");
        LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<Integer, Integer>();
        for(int i=0;i<10;i++)
            lhm.put(i, i * i);
        System.out.println("Keys in LinkedHashMap " + lhm.keySet());
        System.out.println("Values in LinkedHashMap " + lhm.values());
        System.out.println("Key-Value in LinkedHashMap "+ lhm.entrySet());
        // HashSet
        System.out.println("\n2. HashSet<E> in java");
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0;i<10;i++)
            hashSet.add(i * i);
        Iterator<Integer> iterator = hashSet.iterator();
        System.out.println("Using Iterator<E> to get values in HashSet:");
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");

        // ArrayList
        System.out.println("\n\n3. ArrayList<E> in java");
        ArrayList<Integer> array = new ArrayList<>();
        for(int i=0;i<10;i++)
            array.add(i * i);
        System.out.println("Get value from ArrayList by index:");
        for(int i=0;i<array.size();i++)
            System.out.print(array.get(i) + " ");

        // Stack
        System.out.println("\n\n4. Stack<E> in java");
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<10;i++)
            stack.add(i * i);
        System.out.println("Using pop() in Stack<E> to get value:");
        for(int i=0;i<10;i++)
            System.out.print(stack.pop() + " ");

        // Vector
        System.out.println("\n\n5. Vector<E> in java");
        Vector<Integer> vector = new Vector<>();
        for(int i=0;i<10;i++)
            vector.add(i * i);
        System.out.println("Using index to get value from vector:");
        for(int i=0;i<vector.size();i++)
            System.out.print(vector.get(i) + " ");

        // LinkedList
        System.out.println("\n\n6. LinkedList<E>");
        LinkedList<Integer> linkedList = new LinkedList<>();
        for(int i=0;i<10;i++)
            linkedList.add(i * i);
        System.out.println("Using poll() in LinkedList to get value from LinkedList:");
        for(int i=0;i<10; i++)
            System.out.print(linkedList.poll() + " ");

        // PriorityQueue
        System.out.print("\n\n7. PriorityQueue<E>");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<10;i++)
            pq.add(10 - i);
        System.out.println("Get ordered values in PriorityQueue<E>");
        for(int i=0;i<10;i++)
            System.out.print(pq.poll() + " ");

        // ArrayDeque
        System.out.println("\n\n8. ArrayDeque<E>");
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        for(int i=0;i<10;i++)
            ad.add(i * i);
        System.out.println("Get value from ArrayDeque by First-Last mode:");
        for(int i=0;i<10;i++)
            if(i % 2 == 0)
                System.out.print(ad.pollFirst() + " ");
            else
                System.out.print(ad.pollLast() + " ");

        // TreeSet
        System.out.println("\n\n9. TreeSet<E>");
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i=0;i<10;i++){
            System.out.println("Add " + (10 - i) * (10 - i) + " in TreeSet.") ;
            ts.add( (10 - i) * (10 - i));
        }

        System.out.println("Print ordered values in TreeSet<Integer>:");
        for(int i=0;i<10;i++)
            System.out.print(ts.pollFirst() + " ");

        // TreeMap
        System.out.println("\n\n9. TreeMap<K,E>");
        TreeMap<Integer,Integer> tm = new TreeMap<>();
        for(int i=0;i<10;i++){
            System.out.println("Add (" + i +"," +(10 - i) * (10 - i) + ") in TreeMap.") ;
            tm.put(i, (10 - i) * (10 - i));
        }
        System.out.println("Keys in TreeMap: "+ tm.keySet());
        System.out.println("Values in TreeMap: " + tm.values());
        System.out.println("Key-Value in TreeMap: " + tm.entrySet());
    }
}
