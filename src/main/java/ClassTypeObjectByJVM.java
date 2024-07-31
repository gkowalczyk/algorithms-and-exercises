import InterfaceAndAbstractClass.Student;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTypeObjectByJVM {




    public static void main(String[] args) {
     Student student = new Student();
     Class studentClass = student.getClass(); // sprawdzenie klasy obiektu poprzez metodę getClass(), po załadowaniu pliku .class do JVM twoerzy się obiekt klasy Class
        System.out.println(studentClass.getClass());
        System.out.println(studentClass.getName());// sprawdzenie nazwy klasy

        Method[] methods = studentClass.getDeclaredMethods(); // pobranie metod klasy
        for(Method method : methods){
            System.out.println(method.getName());
        }


        Field f[] = studentClass.getDeclaredFields(); // sprawdzenie
        for(Field field : f){
            System.out.println(field.getName());
        }

        System.out.println(String.class.getClassLoader()); // sprawdzenie klasy ładowania klasy String
        System.out.println(Student.class.getClassLoader());// sprawdzenie klasy ładowania klasy Student





    }

}
