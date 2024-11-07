package dataStructures.linkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    LinkedList linkedList=new LinkedList(3);
        linkedList.pretend(1);
        linkedList.append(5);
        linkedList.append(9);
        linkedList.print();
        linkedList.reverse();
        linkedList.print();

    }
}