package ArrayList;

import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> myArray = new ArrayList<String>();
        System.out.println(myArray);
        myArray.add("Fridge");
        myArray.add("Lamp");
        System.out.println(myArray);
        System.out.println(myArray.size());
        myArray.set(1, "Telephone");
        if (myArray.contains("Fridge")) {
            System.out.println("Contains fridge");
        }
        myArray.remove("Fridge");
        myArray.remove("X");
        System.out.println(myArray.get(0));
        System.out.println(myArray);
    }
}
