package PracticePrograms;

abstract class Demo1{
    void method(int i)
    {
        //method(int)
    }

    abstract void method(Integer i);
}
class Demo2 extends Demo1{

    @Override
    void method(Integer i)
    {
        //method(Integer)
    }

        int methodOfA()
        {
            return (true ? null : 0);
        }

}


public class Demo {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("test");
        str.insert(4, 123);
        System.out.println(str);
    }
}

