package StructuralPatterns.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ankh on 2017/7/18.
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> single = new ArrayList<>();
        for (Person person : persons){
            if (person.getMaritalStatus().equalsIgnoreCase("single")){
                single.add(person);
            }
        }
        return single;
    }
}
