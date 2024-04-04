package DFS;

import java.util.Collection;

public class SerializationDeserialization {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        List<String> list = new ArrayList<>();
        helper(root, list);
        return String.join(",", list);
    }

    void helper(TreeNode node, List<String> list){
        if(node == null){
            list.add("null");
            return;
        }list.add(String.valueOf(node.val));
        helper(node.left, list);
        helper(node.right, list);
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] nodes = data.split(",");
        Deque<String> queue = new LinkedList<>(Arrays.asList(nodes));
        return helper2(queue);
    }

    TreeNode helper2(List<Stirng> list){
     String val = list.remove(list.size() - 1);

     if (val.charAt(0) == 'n'){ //n means it is null
         return null;
     }

        TreeNode node = new TreeNode(Integer.parseInt(val));

        TreeNode.left = helper2(list);
        TreeNode.rigth = helper2(list);

     return node;
    }
}
