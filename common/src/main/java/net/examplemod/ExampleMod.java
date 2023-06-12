package net.examplemod;

import me.shedaniel.rei.api.client.REIRuntime;
import me.shedaniel.rei.api.client.gui.widgets.TextField;

import java.lang.reflect.Method;

public class ExampleMod {
    public static final String MOD_ID = "examplemod";

    public static void init() {
    }

    public static void doit() {
        TextField sb = REIRuntime.getInstance().getSearchTextField();
        System.out.println(sb);
        System.out.println("---");
        if (sb != null) {
            for (Method declaredMethod : sb.getClass().getDeclaredMethods()) {
                System.out.println(declaredMethod.getName());
            }
            System.out.println("---");
            System.out.println("=== TextField " + TextField.class.getSuperclass());
            for (Method declaredMethod : TextField.class.getDeclaredMethods()) {
                System.out.println(declaredMethod.getName());
            }
            System.out.println("---");
            System.out.println("Calling isFocused...");
            System.out.println("isFocused = " + sb.isFocused());
        }
    }
}
