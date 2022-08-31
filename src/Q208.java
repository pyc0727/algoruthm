/**
 * @Auther: buyunchuan
 * @Date: 2022/7/11 16:22
 * @Description:
 *
 * 发音类似 "try"）或者说 前缀树 是一种树形数据结构，用于高效地存储和检索字符串数据集中的键。这一数据结构有相当多的应用情景，例如自动补完和拼写检查。
 *
 * 请你实现 Trie 类：
 *
 * Trie() 初始化前缀树对象。
 * void insert(String word) 向前缀树中插入字符串 word 。
 * boolean search(String word) 如果字符串 word 在前缀树中，返回 true（即，在检索之前已经插入）；否则，返回 false 。
 * boolean startsWith(String prefix) 如果之前已经插入的字符串 word 的前缀之一为 prefix ，返回 true ；否则，返回 false 。
 *  
 *
 * 示例：
 *
 * 输入
 * ["Trie", "insert", "search", "search", "startsWith", "insert", "search"]
 * [[], ["apple"], ["apple"], ["app"], ["app"], ["app"], ["app"]]
 * 输出
 * [null, null, true, false, true, null, true]
 *
 * 解释
 * Trie trie = new Trie();
 * trie.insert("apple");
 * trie.search("apple");   // 返回 True
 * trie.search("app");     // 返回 False
 * trie.startsWith("app"); // 返回 True
 * trie.insert("app");
 * trie.search("app");     // 返回 True
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/implement-trie-prefix-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class Q208 {
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

        public boolean search(String word) {
            Node temp = f;
            for (int i = 0; i < word.length(); i++) {
                if(temp.childs[word.charAt(i) - 'a'] == null){
                    return false;
                }
                temp = temp.childs[word.charAt(i) - 'a'];
            }
            return temp.end;
        }

        public boolean startsWith(String prefix) {
            Node temp = f;
            for (int i = 0; i < prefix.length(); i++) {
                if(temp.childs[prefix.charAt(i) - 'a'] == null){
                    return false;
                }
                temp = temp.childs[prefix.charAt(i) - 'a'];
            }
            return true;
        }



    }
}
