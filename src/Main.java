import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Fruit fruit1 = new Fruit("Kiwi");
        Fruit fruit2 = new Fruit("Ananas");
        Fruit fruit3 = new Fruit("Banana");
        Fruit fruit4 = new Fruit("Mela");
        Fruit fruit5 = new Fruit("Cocco");

        LinkedList<Fruit> fruitsLinkedList = new LinkedList<>(List.of(fruit1,fruit2,fruit3));

        //print linkedlist
        System.out.println(fruitsLinkedList);

        //add first
        fruitsLinkedList.addFirst(fruit4);

        //add last
        fruitsLinkedList.addLast(fruit5);

        //print updated list
        System.out.println(fruitsLinkedList);
    }

}