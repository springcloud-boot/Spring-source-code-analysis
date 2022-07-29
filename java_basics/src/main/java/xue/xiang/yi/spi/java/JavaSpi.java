package xue.xiang.yi.spi.java;

import java.util.ServiceLoader;

/**
 * @author : 薛向毅
 * @date : 11:04 2022/7/29
 */
public class JavaSpi {
    public static void main(String[] args) {
        ServiceLoader<Person> load = ServiceLoader.load(Person.class);
        for (Person person : load) {
            person.say();
        }

    }
}
