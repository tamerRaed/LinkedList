package linkedlist;
//By:Tamer Raid Al Naizi, ID:1201707707.

public class test {

    public static void main(String[] args) {

        CustomLinkedList<String> listString = new CustomLinkedList<String>();
        System.out.println("****************************LinkedList for String***********************************");
        String string1 = "tamer";
        String string2 = "ahmed";
        String string3 = "tamer";
        String string4 = "ali";

        listString.addAtHead(string1);
        listString.addAtTail(string2);

        System.out.println("LinledList Size = " + listString.getSize());
        System.out.println(listString.contains(string3));
        System.out.println(listString.contains(string4));

        listString.remove(string1);
        System.out.println("LinledList Size = " + listString.getSize());

        System.out.println("****************************LinkedList for Student***********************************");
        CustomLinkedList<student> listStudent = new CustomLinkedList<student>();

        student student1 = new student(8);
        listStudent.addAtHead(student1);

        student student2 = new student(5);
        listStudent.addAtTail(student2);

        student student3 = new student(8);
        student student4 = new student(2);

        System.out.println("LinkedList Size = " + listStudent.getSize());
        System.out.println(listStudent.contains(student3));
        System.out.println(listStudent.contains(student4));

        listStudent.remove(student1);
        System.out.println("LinkedList Size = " + listStudent.getSize());
        listStudent.remove(student1);
        System.out.println("LinkedList Size = " + listStudent.getSize());

    }
}
