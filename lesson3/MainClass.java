package lesson3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class MainClass {
    static class PhoneBook{
        HashMap<String, HashSet<String>> hm;

        public PhoneBook() {
            this.hm = hm;
        }
        public void add(String name, String phone){
            if(!hm.containsKey(name)) hm.put(name, new HashSet<>());
            hm.get(name).add(phone);
        }

        public HashSet<String> get(String name) {
            return hm.get(name);
        }
    }

    public static void main(String[] args) {
        String[] arr = {"Orange", "Apple", "Door", "Group",
                "Groups", "Orange", "Orange", "Apple", "Groups", "Group", "Group"};
        HashSet<String> hs = new HashSet<>(Arrays.asList(arr));
        HashMap<String, Integer> hm = new HashMap<>();
        for (String o : arr) {
            System.out.println(hm.getOrDefault(o, 0));
            hm.put(o, hm.getOrDefault(o, 0) + 1);
        }
        System.out.println(hm);
        System.out.println(hm.keySet());
    }
}
