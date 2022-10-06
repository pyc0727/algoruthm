package hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/28 10:58
 * @Description:
 **/
public class Q609 {

    public static List<List<String>> findDuplicate(String[] paths) {
            Map<String,List<String>> map = new HashMap<>();
            List<List<String>> res = new ArrayList<>();
            for (String path : paths) {
                String[] files = path.split(" ");
                for (int i = 1; i < files.length; i++) {
                    // 获取文件内容
                    int nameIndex = files[i].indexOf('(');
                    String connent = files[i].substring(nameIndex+1,files[i].length()-1);
                    List<String> list = map.getOrDefault(connent,new ArrayList<>());
                    list.add(files[0]+"/"+files[i].substring(0,nameIndex));
                    if(list.size()>1)res.add(list);
                    map.put(files[i],list);
                }
            }
            return res;
    }

    public static void main(String[] args) {
        String[] s = new String[]{"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"};
        findDuplicate(s);
    }
}
