package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        List<String> changecollection2 = new ArrayList();
        for(int i = 0; i < collection2.get(0).size(); i++){
            changecollection2.add(collection2.get(0).get(i));
        }

        if(collection1.size() > changecollection2.size()){
            return SameElements(collection1, changecollection2);
        }
        else{
            return SameElements(changecollection2, collection1);
        }
    }

    List<String> SameElements(List<String> longarry, List<String> shortarry){
        int i,j;
        List<String> resultarry = new ArrayList();

        for(i = 0; i < longarry.size(); i++){
            for(j = 0; j < shortarry.size(); j++){
                if(longarry.get(i) == shortarry.get(j)){
                    resultarry.add(longarry.get(i));
                }
            }
        }
        return resultarry;
    }
}
