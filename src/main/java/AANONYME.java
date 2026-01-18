

class A {
    public void print() {
        System.out.println("A");
    }
}

class B {
    public static void AANONYME(String[] args) {

        A object = new A() {
            @Override
            public void print() {
                System.out.println("Bonjour");
            }
        };

        object.print();
    }
}
