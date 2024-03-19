class Outer {
    static int outer;
    public static void printOuter() {
        System.out.println("outer()");
    }
    static class Inner {
        int inner;  // Non-static
        public void printInner() {  // Non-static
            System.out.println("inner()");
        }
    }
}