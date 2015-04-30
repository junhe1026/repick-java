package intro;

public class HelloWorld
{
    public static void main(String[] args)
    {
//        System.out.println("Hello World!");
        Human aPerson = new Human(160);
        Human bPerson = new Human(160, "Alice");
        aPerson.repeatBreath(5);

    }
}
