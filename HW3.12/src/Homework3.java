import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework3 {
    public static void main(String[] args) {
        task1();
        task2();
    }

    private static void task1() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Скейтпарк", "Скейт", "Самокат",
                "Сыр", "Ветчина", "Помидоры",
                "Собака", "Кошка", "Скейтпарк",
                "Огурцы", "Кетчуп", "Скейтпарк",
                "Собака", "Оливки", "Помидоры",
                "Кошка", "Самокат", "Кетчуп", "Собака"
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println(hm);
    }

    private static void task2() {
        Directory directory = new Directory();

        directory.add("Васнецов", "89114968875");
        directory.add("Васнецов", "89126988541");
        directory.add("Пупкин", "89114506987");
        directory.add("Пупкин", "892586698");
        directory.add("Васнецов", "80120000999");
        directory.add("Харламов", "8992115411");
        directory.add("Пупкин", "89723641999");
        directory.add("Сковородкин", "8988453213");
        directory.add("Харламов", "89214897758");

        System.out.println(directory.get("Пупкин"));
        System.out.println(directory.get("Васнецов"));
        System.out.println(directory.get("Харламов"));
        System.out.println(directory.get("Сковородкин"));
    }
}

class Directory {
    private Map<String, List<String>> directory_hm = new HashMap<>();
    private List<String> phone_number_list;

    public void add(String surname, String phone_number) {
        if (directory_hm.containsKey(surname)) {
            phone_number_list = directory_hm.get(surname);
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        } else {
            phone_number_list = new ArrayList<>();
            phone_number_list.add(phone_number);
            directory_hm.put(surname, phone_number_list);
        }
    }

    public List<String> get(String surname) {
        return directory_hm.get(surname);
    }

}
