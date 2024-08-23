package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    @SuppressWarnings("unchecked")
    public HashMap<Integer, String> useHashMap() {
        Map<Integer, String> hM = new HashMap<>();   // TODO: create an empty hash map (key value pairs)
        hM.put(1, "TypeScript");//  - add {1, TypeScript} entry to the map
        hM.put(2, "Kotlin"); //  - add {2, Kotlin} entry to the map
        hM.put(3, "Python");//  - add {3, Python} entry to the map
        hM.put(4, "Java");//  - add {4, Java} entry to the map
        hM.put(5, "JavaScript");//  - add {5, JavaScript} entry to the map
        hM.put(6, "Rust");//  - add {6, Rust} entry to the map
        System.out.println(hM.keySet()); //  - determine the set of keys from the map and print it on the screen
        System.out.println(hM.values());//  - determine the set of values from the map and print it on the screen
        System.out.print(hM.containsValue("English"));//  - determine whether the map contains "English" as a language and print the result on the screen
        return (HashMap<Integer, String>) hM.entrySet(); //  - return the map; initially I just put return myMap.entrySet()
    }


    public ArrayDeque<Integer> useArrayDeque() {
        ArrayDeque<Integer> de = new ArrayDeque<>(); // TODO: create an empty arrayDeque
        de.addAll(Arrays.asList(5, 6, 8, 9)); //  - add 5, 6, 8, 9 to the queue. Deque (1) = double ended queue and Dequeue (2) = to remove an element from the queue. You can re-write this so the first and second line are combined.
        System.out.print(de.getFirst()); //  - print the first element of the queue on the screen
        System.out.print(de.getLast()); //  - print the last element of the queue on the screen
        System.out.print(de.poll()); //  - invoke the method poll() on the queue and print the result on the screen
        System.out.print(de.element());  //  - invoke the element() method on the queue and print the result on the screen
        return de;//  - return the queue
    }

    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        //  - add 5, 6, 8, 9 to the stack
        //  - print the first element of the stack on the screen
        //  - print the last element of the stack on the screen
        //  - invoke the method pop() on the stack and print the result on the screen
        //  - invoke the push(4) method on the stack
        //  - return the stack
        //throw new RuntimeException("Not implemented");
        Stack<Integer> stackElement = new Stack<>();
        stackElement.add(5);
        stackElement.add(6);
        stackElement.add(8);
        stackElement.add(9);
        System.out.println(stackElement.get(0));
        System.out.println(stackElement.get(3));
        System.out.print(stackElement.pop());
        System.out.println(stackElement.elements());
        stackElement.push(4);
        return stackElement;

    }
    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        //  - add 4 as the first element of the list
        //  - then add 5, 6, 8, 2, 9 to the list
        //  - add another 2 as the last element of the list
        //  - add 4 as the 3rd element of the list
        //  - invoke the method element() on the list and print the result on the screen
        //  - return the list
        //throw new RuntimeException("Not implemented");
        LinkedList<Integer> integers = new LinkedList<>();
        integers.addFirst(4);
        integers.add(5);
        integers.add(6);
        integers.add(8);
        integers.add(2);
        integers.add(9);
        integers.addLast(2);
        integers.set(2,4);
        System.out.println(integers.element());
        return integers;

    }
    public String getName() {
        return "Collections Exercises";
    }
}
