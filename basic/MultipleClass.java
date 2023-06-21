public class MultipleClass {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        classA.printHello();

        ClassB classB = new ClassB();
        classB.printBye();
    }
}

class ClassA {
    public void printHello() {
        System.out.println("Hello");
    }
}

class ClassB {
    public void printBye() {
        System.out.println("Bye");
    }
}
