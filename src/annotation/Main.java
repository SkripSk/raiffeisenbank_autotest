package annotation;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

public class Main {

    public static void main (String[] args) throws InvocationTargetException, IllegalAccessException {

        Cookies cookies = new Cookies();

        System.out.println( cookies.getClass().getAnnotation(ControlledObject.class).name());
        System.out.println(cookies.getClass().getAnnotations());
        System.out.println(cookies.getClass().getAnnotationsByType(ControlledObject.class));

        Method[] methods = cookies.getClass().getDeclaredMethods();
        for (Method method:
             methods) {
            System.out.println(method.getName() + ": " + method.isAnnotationPresent(StartObject.class)
                                       + "\n" + method.getName() + ": " + method.isAnnotationPresent(StopObject.class));
        }

        Cookies cookiesNew = new Cookies();
        Field[] fs = cookiesNew.getClass().getFields();

        for(Field f : fs){
            if (f.getDeclaredAnnotation(ControlledObject.class).def() == 1){

                String name = f.getDeclaredAnnotation(ControlledObject.class).name();
                Method[] ms = cookiesNew.getClass().getDeclaredMethods();
                for (Method m : ms) {
                    if (m.getName().equals("set" + name)){
                        m.invoke(cookiesNew, "123");
                    }
                }
            }
        }
    }
}
