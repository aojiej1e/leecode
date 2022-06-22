package problem;

import com.google.common.collect.Comparators;
import com.google.common.collect.Lists;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author aojie
 * @Function
 * @create 2022-05-14 23:56
 */
public class Test {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setName("12");
        user1.setAge(1);
        User user2 = new User();
        user2.setName("22");
        user2.setAge(2);
        User user3 = new User();
        user3.setName("12");
        user3.setAge(11);
        User user4 = new User();
        user4.setName("22");
        user4.setAge(22);
        ArrayList<User> userList = Lists.newArrayList(user1, user2, user3, user4);

        System.out.println(userList.stream().collect(Collectors.groupingBy(User::getName)));

        NavigableMap<String, List<User>> navigableMap = userList.stream().collect(Collectors.groupingBy(User::getName, TreeMap::new, Collectors.toList()));
        System.out.println(navigableMap);

        System.out.println("Hello World!");

        TreeMap<String, User> treeMap = new TreeMap<>(((o1, o2) -> {
            return o1.compareTo(o2.substring(5));
        }));
    }
}
