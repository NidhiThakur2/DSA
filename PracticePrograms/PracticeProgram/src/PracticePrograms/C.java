package PracticePrograms;

public interface C extends A,B{

    @Override
    default void greet() {
        A.super.greet();
    }
}
