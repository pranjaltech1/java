package practice;
import java.util.*;

public class HelloJava {
    public static void main(String[] args) {

//ordered,allows duplicates
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(40);
        list.add(6,70);
        System.out.println(list);
        System.out.println(list.contains(20));
        System.out.println(list.size());
        list.remove(5);
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.indexOf(70));
        System.out.println(list.isEmpty());
        


        //LinkedList
        List<Integer> l1=new LinkedList<>();
        l1.add(20);
        
        //Stack
        //LIFO-last in first out  
        Stack  <Integer> list1=new Stack<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.push(60);
        list1.push(70);
        System.out.println(list1);
        System.out.println(list1.peek());
        System.out.println(list1.pop());
        System.out.println(list1);

        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"apple");
        map.put(2,"orange");
        map.put(3,"banana");
        map.put(4,"chickoo");
        map.put(5,"pineapple");
        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println("=== 1. ArrayList (ordered, duplicates allowed) ===");
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Apple"); arrayList.add("Banana"); arrayList.add("Apple");
        arrayList.add(1, "Mango");                    // insert at index
        System.out.println("ArrayList: " + arrayList);
        System.out.println("Get index 2: " + arrayList.get(2) + "\n");

        System.out.println("=== 2. LinkedList (as List + as Deque) ===");
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Cat"); linkedList.add("Dog");
        linkedList.addFirst("Tiger");                 // add at beginning
        linkedList.addLast("Lion");                   // add at end
        linkedList.removeFirst();                     // remove from beginning
        System.out.println("LinkedList: " + linkedList + "\n");

        System.out.println("=== 3. ArrayDeque (best for queue/stack - double ended) ===");
        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(10); deque.push(20);               // stack: push
        deque.offer(30); deque.offerLast(40);         // queue: offer
        System.out.println("ArrayDeque: " + deque);
        System.out.println("Pop (stack): " + deque.pop());
        System.out.println("Poll (queue): " + deque.poll() + "\n");

        System.out.println("=== 4. HashSet (unordered, no duplicates) ===");
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Red"); hashSet.add("Blue"); hashSet.add("Red");
        hashSet.add("Green");
        System.out.println("HashSet: " + hashSet + "\n");

        System.out.println("=== 5. LinkedHashSet (insertion order + no duplicates) ===");
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Z"); linkedHashSet.add("A"); linkedHashSet.add("C");
        System.out.println("LinkedHashSet (maintains insertion order): " + linkedHashSet + "\n");

        System.out.println("=== 6. TreeSet (sorted, no duplicates) ===");
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(50); treeSet.add(10); treeSet.add(30); treeSet.add(20);
        System.out.println("TreeSet (sorted): " + treeSet + "\n");

        System.out.println("=== 7. PriorityQueue (natural ordering / priority based) ===");
        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer("Task C"); priorityQueue.offer("Task A");
        priorityQueue.offer("Task B");
        System.out.println("PriorityQueue (poll gives min): " + priorityQueue.poll());
        System.out.println("Remaining: " + priorityQueue + "\n");

        System.out.println("=== 8. HashMap (unordered key-value) ===");
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("One", 1); hashMap.put("Two", 2);
        hashMap.put("One", 11);                       // overwrites
        hashMap.putIfAbsent("Three", 3);
        System.out.println("HashMap: " + hashMap);
        System.out.println("Value for 'Two': " + hashMap.get("Two") + "\n");

        System.out.println("=== 9. LinkedHashMap (insertion order) ===");
        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("X", "x-value"); linkedHashMap.put("A", "a-value");
        linkedHashMap.put("B", "b-value");
        System.out.println("LinkedHashMap (insertion order): " + linkedHashMap + "\n");

        System.out.println("=== 10. TreeMap (sorted by keys) ===");
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(300, "Three Hundred"); treeMap.put(100, "Hundred");
        treeMap.put(200, "Two Hundred");
        System.out.println("TreeMap (sorted keys): " + treeMap + "\n");

        // Bonus: Utility class Collections
        System.out.println("=== Collections utility example ===");
        List<Integer> nums = Arrays.asList(5, 2, 8, 1, 9);
        Collections.sort(nums);
        System.out.println("Sorted list: " + nums);
        System.out.println("Binary search for 8: index = " + Collections.binarySearch(nums, 8));
    }
}




