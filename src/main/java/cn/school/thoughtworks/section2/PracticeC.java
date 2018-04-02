package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeC {
    Map<String, Integer> countSameElements(List<String> collection1) {
        Map<String, Integer> resultmap = new HashMap();
        int num = 1;

        for(int i = 0; i < collection1.size(); i++){
            //下一个字符串大于3
            if(i < collection1.size() - 2 && collection1.get(i + 1).length() > 1){
                String first;
                char buff;
                int addnum;

                i = i + 1;
                buff = collection1.get(i).charAt(0);
                first = Character.toString(buff);
                //判断是否为该字符的最后一个
                if(!first.equals(collection1.get(i - 1))){
                    resultmap.put(collection1.get(i - 1), num);
                    num = 1;
                    i = i - 1;
                    continue;
                }
                //判断数字是否为个位数
                if(collection1.get(i).length() > 3 && collection1.get(i).charAt(3) <= '9' && collection1.get(i).charAt(3) >= '0'){
                    char buff3[] = {collection1.get(i).charAt(2), collection1.get(i).charAt(3)};
                    String secend = new String(buff3);
                    addnum = Integer.parseInt(secend);
                }
                else{
                    char buff2 = collection1.get(i).charAt(2);
                    addnum = Integer.parseInt(String.valueOf(buff2));
                }
                //判断该字符的数字是否需要加1
                if(num == 1){
                    num += addnum;
                }
                else{
                    num += addnum;
                    ++num;
                }
                //判断该字符是否为最后一个
                if(!first.equals(collection1.get(i + 1))){
                    resultmap.put(first, num);
                    num = 1;
                }
            }
            //当前字符串个数为1
            else if(collection1.get(i).length() == 1){
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
            //当前字符串大于3
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
