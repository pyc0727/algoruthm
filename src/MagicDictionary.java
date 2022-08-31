/**
 * @Auther: buyunchuan
 * @Date: 2022/7/11 16:46
 * @Description:
 **/
public class MagicDictionary {
    class Tire{

        private Node f;

        private class Node{
            public boolean end;
            public Node[] childs = new Node[26];
        }

        public Tire() {
            f = new Node();
        }

        public void insert(String word) {
            Node temp = f;
            for (int i = 0; i < word.length(); i++) {
                if(temp.childs[word.charAt(i)-'a'] == null){
                    temp.childs[word.charAt(i) - 'a'] = new Node();
                }
                temp = temp.childs[word.charAt(i) - 'a'];
            }
            temp.end = true;
        }

        public boolean isChange(String word,int index,Node node,int errorCount){
            if(errorCount > 1){
                return false;
            }
            if(index == word.length()){
                return node.end && errorCount == 1;
            }
            for (int i = 0; i < 26; i++) {
                // 如果为空，则肯定无法匹配
                if(node.childs[i] == null) continue;
                // 如果不为空且相同，说明不匹配总数不继续增加，继续搜索子集
                // 如果不为空且不相同，说明不匹配总数需要+1，继续搜索子集
                // 如果后续匹配成功，则返回true
                if(isChange(word,index+1,node.childs[i],i - (word.charAt(index)- 'a') == 0 ? errorCount: errorCount +1)){
                    return true;
                }
            }
            return false;
        }
    }

    private Tire tire;
    public MagicDictionary() {
        tire = new Tire();
    }

    public void buildDict(String[] dictionary) {
        for (String word :
                dictionary) {
            tire.insert(word);
        }
    }

    public boolean search(String searchWord) {
        return tire.isChange(searchWord,0, tire.f, 0);

    }
}
