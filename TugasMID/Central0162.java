/* NAMA : Santi
Nim : 13020210162 */
interface A {
    public void aaa();
}

interface B extends A {
    
}

class Central0162 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0162 obj = new Central0162();
        System.out.println("main");
        obj.aaa();
    }
}

