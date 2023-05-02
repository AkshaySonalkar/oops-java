package CoreConcept;

import java.util.HashMap;
import java.util.Map;

public final class CustomImmutableClass {

    private final String name;

    private final int value;

    private final Map<Integer,String> metaData;

    public CustomImmutableClass(String name, int value, Map<Integer,String> metaData) {
        this.name = name;
        this.value = value;
        Map<Integer,String> temp = new HashMap<>();
        metaData.entrySet().forEach(entry->temp.put(entry.getKey(),entry.getValue()));
        this.metaData = temp;
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }

    public Map<Integer, String> getMetaData() {
        Map<Integer,String> temp = new HashMap<>();
        this.metaData.entrySet().forEach(entry->temp.put(entry.getKey(),entry.getValue()));
        return temp;
    }

    @Override
    public String toString() {
        return "CustomImmutableClass{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", metaData=" + metaData +
                '}';
    }
}

class main{

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(11,"Akshay");
        map.put(28,"Akshita");
        map.put(3,"Abhimanyu");
        CustomImmutableClass immutableClass = new CustomImmutableClass("Akshay",11,map);

        System.out.println(immutableClass.toString());

        immutableClass.getMetaData().put(29,"Ankita");

        System.out.println(immutableClass.toString());

    }
}
