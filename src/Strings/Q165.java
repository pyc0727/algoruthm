package Strings;

/**
 * @Auther: buyunchuan
 * @Date: 2022/8/31 16:39
 * @Description:
 **/
public class Q165 {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        for (int i = 0; i < (Math.max(v1.length, v2.length)); i++) {
            int temp1 = (i >= v1.length?0:Integer.parseInt(v1[i]));
            int temp2 = (i >= v2.length?0:Integer.parseInt(v2[i]));
            if(temp1 > temp2){
                return 1;
            }else if(temp1 < temp2)return -1;
        }
        return 0;
    }
}
