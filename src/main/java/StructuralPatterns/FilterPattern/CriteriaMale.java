package StructuralPatterns.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ankh on 2017/7/18.
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> male = new ArrayList<>();
        for (Person person:persons){
            if (person.getGender().equalsIgnoreCase("male")){
                male.add(person);
            }
        }
        return male;
    }
}
