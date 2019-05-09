package ${package};

import avm.Blockchain;
import org.aion.avm.tooling.abi.Callable;

public class ${module1-contractName}
{
    private static String myStr = "Hello AVM From ${module1}";

    @Callable
    public static void sayHello() {
        Blockchain.println("Hello AVM From ${module1}");
    }

    @Callable
    public static String greet(String name) {
        return "Hello " + name;
    }

    @Callable
    public static String getString() {
        Blockchain.println("Current string is " + myStr);
        return myStr;
    }

    @Callable
    public static void setString(String newStr) {
        myStr = newStr;
        Blockchain.println("New string is " + myStr);
    }

}
