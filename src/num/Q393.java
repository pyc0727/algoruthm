package num;

/**
 * @Auther: buyunchuan
 * @Date: 2022/9/6 10:52
 * @Description:
 **/
public class Q393 {
    public static boolean validUtf8(int[] data) {
        String[] ss = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            String temp = Integer.toBinaryString(data[i]);
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < 8 - temp.length(); j++) {
                sb.append("0");
            }
            ss[i] = sb.append(temp).toString();
        }
        for (int i = 0; i < data.length; i++) {
            if(ss[i].startsWith("0"))continue;
            if(ss[i].startsWith("110")){
                i++;
                if(i>= data.length || !ss[i].startsWith("10")){
                    return false;
                }
                i++;
            }
            if(ss[i].startsWith("1110")){
                for (int j = 0; j < 2; j++) {
                    i++;
                    if(i>= data.length || !ss[i].startsWith("10")){
                        return false;
                    }
                }
                i++;
            }
            if(ss[i].startsWith("11110")){
                for (int j = 0; j < 3; j++) {
                    i++;
                    if(i>= data.length || !ss[i].startsWith("10")){
                        return false;
                    }
                }
                i++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] exp = new int[]{255};
        validUtf8(exp);
    }
}
