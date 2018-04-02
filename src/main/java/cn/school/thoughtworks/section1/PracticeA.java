package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeA {
    List<String> collectSameElements(List<String> collection1, List<String> collection2) {

        if(collection1.size() > collection2.size()){
            return (SameArry(collection1, collection2));
        }
        else{
            return (SameArry(collection2, collection1));
        }

    }

    List<String> SameArry(List<String> longarry, List<String> shortarry){
        int i,j;
        List<String> resultarry = new ArrayList();
        for(i = 0; i < longarry.size(); i++){
            for(j = 0; j < shortarry.size(); j++){
                if(longarry.get(i) == shortarry.get(j)){
                    resultarry.add(shortarry.get(j));
                }
            }
        }
        return resultarry;
    }
}
