package chapters.collection.imutableClass;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CompanyMap {
    public static void main(String[] args) {
        Map<Company, Integer> companySizeMap = new HashMap<>();
        Person person = new Person("poxos", "poxosyan");
        Person petros = new Person("petros", "petrosyan");
        Company company = new Company("a001", "Company1", person);
        Company company1 = new Company("a002", "Company2", petros);
        companySizeMap.put(company, 20);
        companySizeMap.put(company1, 4);
        System.out.println(companySizeMap.get(company));
        person.setName("lll");
        System.out.println(companySizeMap.get(company));
        System.out.println(person.getName());
        // get all keys of map
        Set<Company> companies = companySizeMap.keySet();
        System.out.println(companies);
        // get all value of map
        Collection<Integer> values = companySizeMap.values();
        System.out.println(values);
        // get all info key and value
        Set<Map.Entry<Company, Integer>> entries = companySizeMap.entrySet();
        for (Map.Entry<Company, Integer> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue() + " " + entry.setValue(444));
        }
        System.out.println(values);
    }
}
