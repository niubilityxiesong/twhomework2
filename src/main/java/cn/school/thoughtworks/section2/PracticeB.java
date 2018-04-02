package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> resultmap = new HashMap();
        int num = 1;

        for(int i = 0; i < collection1.size(); i++){
            if(collection1.get(i).length() == 1){
                if(i == collection1.size() - 1){
                    if(num ==1 || collection1.get(i) != collection1.get(i - 1)){
                        resultmap.put(collection1.get(i), num);
                    }
                    else
                        break;
                }
                else if(collection1.get(i) == collection1.get(i + 1)){
                    num++;
                }
                else{
                    resultmap.put(collection1.get(i), num);
                    num = 1;
                }
            }
            else{
                String out;
                int count;
                char buff,buff2;

                buff = collection1.get(i).charAt(0);
                buff2 = collection1.get(i).charAt(2);
                out = Character.toString(buff);
                count = Integer.parseInt(String.valueOf(buff2));
                resultmap.put(out, count);
            }
        }
        return resultmap;
    }
}
