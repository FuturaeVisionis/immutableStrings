/**
 * Created by ronald on 01/01/17.
 */
public class Marvel {
    public static void main(String[] args) {


        String suicideSquad = "Harley Quinn";

        suicideSquad = suicideSquad + "is hot!";
        //suicideSquad = new StringBuffer("Harley Quinn").append(" is hot.").toString();


        System.out.println(suicideSquad);


        String name = "Becky";
        String name1 = "Becky";

        System.out.println(name.equals(name1));

        name = name + " Henderson";
        System.out.println(name);

        System.out.println(name1);

        String hello = new String("Babe");
        String goodbuy = new String("Babe");
        System.out.println(hello.equals(goodbuy));

    }
}
/**
 * Now, we can't change the string literal "Harley Quinn". A common thinking mistake is that if I assign a different
 * string literal to the reference variable "suicideSquad" I have changed the string object, right? Well this thought
 * is wrong. Java executed the change, but that is not due to the fact that you where able to change the object! Its is
 * because the JVM runs the StringBuffer behind the scenes. You see, StringBuffer is mutable. Okay, but what happens
 * to the object "Harley Quinn" now? Well, she gets garbage collected. StringBuffer has created a new object on the
 * heap memory"Harley Quinn is hot! The object "Harley Quinn" that was created and placed on the heap is cleaned up.
 *
 */
