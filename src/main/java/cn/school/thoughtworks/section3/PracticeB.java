package cn.school.thoughtworks.section3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        List<String> changeobject = new ArrayList();
        int temp;
        int deleate;

        for(int i = 0; i < object.get("value").size(); i++){
            changeobject.add(object.get("value").get(i));
        }

        for(int j = 0; j < changeobject.size(); j++){
            if(collectionA.containsKey(changeobject.get(j))){
                temp = collectionA.get(changeobject.get(j));
                deleate = temp / 3;
                if(deleate > 0){
                    temp -= deleate;
                }
                collectionA.put(changeobject.get(j), temp);
            }
        }
        return collectionA;
    }
}
