package _4FourthWeek;

import java.util.*;

public class CSBS_Teacher {
    public static HashMap<String, String> teacher(HashMap<String, Integer> roster, HashMap<Integer, String> gradeMap) {
        HashMap<String, String> result = new HashMap<>();
        if (!roster.isEmpty() && !gradeMap.isEmpty()) { //CHECK IF THE LISTS ARE EMPTY OR NOT
            for (String studentName : roster.keySet()) {  //FOR EACH STUDENT DO THE FOLLOWING
                int studentPercentGrade = roster.get(studentName);  //STORE THE STUDENT'S PERCENT GRADE
                for (Integer percentGrade : gradeMap.keySet()) {  //FOR EACH PERCENT GRADE IN GRADE MAP

                    if (studentPercentGrade >= percentGrade) {    //IF studentPercentGrade IS BIGGER OR EQUAL TO percentGrade ADD studentName and percentGrade value to result
                        result.put(studentName, gradeMap.get(percentGrade));
                    }
                }
            }

            for (String studentName : roster.keySet()) {  //FOR EACH STUDENT DO THE FOLLOWING
                if (!result.containsKey(studentName)) {  //IF THE STUDENT'S NAME DOES NOT EXIST
                    result.put(studentName, "F");
                }

            }

        }
        return result;
    }

}
