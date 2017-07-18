package StructuralPatterns.FilterPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ankh on 2017/7/18.
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> female = new ArrayList<>();
        for (Person person:persons){
            if (person.getGender().equalsIgnoreCase("female")){
                female.add(person);
            }
        }
        return female;
    }
}
