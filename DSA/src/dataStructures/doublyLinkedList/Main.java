package dataStructures.doublyLinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList=new DoublyLinkedList(1);
        doublyLinkedList.append(3);
        doublyLinkedList.append(5);
        doublyLinkedList.append(9);
        doublyLinkedList.print();
        doublyLinkedList.remove(0);
        doublyLinkedList.print();


    }
}
