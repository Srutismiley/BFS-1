TC: O(n)
 SC: O(n)
class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null ) return new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> li = new ArrayList<>();
            for(int i= 0; i< size; i++) {
                TreeNode curr = q.poll();
                li.add(curr.val);
                if(curr.left != null ){
                    q.add(curr.left);
                }
                if(curr.right != null) {
                    q.add(curr.right);
                }
            }
            result.add(li);
        }
        return result;
    }
}