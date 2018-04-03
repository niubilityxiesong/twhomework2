package cn.school.thoughtworks.section3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        Map<String,Integer> resultmap = new HashMap();
        List<String> changeobject = new ArrayList();
        int num = 1;
        int temp,delete;

        for(int i = 0; i < collectionA.size(); i++){
            if(collectionA.get(i).length() == 1){
                if(i == collectionA.size() - 1){
                    if(num ==1 || collectionA.get(i) != collectionA.get(i - 1)){
                        resultmap.put(collectionA.get(i), num);
                    }
                    else
                        break;
                }
                else if(collectionA.get(i) == collectionA.get(i + 1)){
                    num++;
                }
                else{
                    resultmap.put(collectionA.get(i), num);
                    num = 1;
                }
            }
            else{
                String out;
                int count;
                char buff,buff2;

                buff = collectionA.get(i).charAt(0);
                buff2 = collectionA.get(i).charAt(2);
                out = Character.toString(buff);
                count = Integer.parseInt(String.valueOf(buff2));
                resultmap.put(out, count);
            }
        }

        for(int i = 0; i < object.get("value").size(); i++){
            changeobject.add(object.get("value").get(i));
        }

        for(int j = 0; j < changeobject.size(); j++){
            if(resultmap.containsKey(changeobject.get(j))){
                temp = resultmap.get(changeobject.get(j));
                delete = temp / 3;
                if(delete > 0){
                    temp -= delete;
                    resultmap.put(changeobject.get(j), temp);
                }
            }
        }

        return resultmap;
    }
}
