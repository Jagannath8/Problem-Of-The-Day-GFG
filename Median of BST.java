class Tree {
    public static float findMedian(Node root) {
        List<Integer> values = new ArrayList<>();
        inorderTraversal(root, values);
        int n = values.size();
        if (n % 2 == 0) {
            int middleIndex = n / 2;
            int middleValue1 = values.get(middleIndex - 1);
            int middleValue2 = values.get(middleIndex);
            return (float) (middleValue1 + middleValue2) / 2;
        } else {
            int middleIndex = n / 2;
            return (float) values.get(middleIndex);
        }
    }
    
    private static void inorderTraversal(Node node, List<Integer> values) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left, values);
        values.add(node.data);
        inorderTraversal(node.right, values);
    }
}
