package StructuralPatterns.FilterPattern;

import java.util.List;

/**
 * Created by Ankh on 2017/7/18.
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
