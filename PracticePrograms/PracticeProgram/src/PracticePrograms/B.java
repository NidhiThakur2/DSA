package PracticePrograms;

public interface B {
    default void greet(){
        System.out.println("Hi from B");
    }
}
