//Знайти число в бінарному дереві пошуку і повернути true якщо воно присутнє, інакше повернути false.

public class BSTSearch {

    public boolean exist(TreeNode root, int target) {

        if (root == null) return false;

        TreeNode currentNode = root;

        while (true) {
            if (target < currentNode.value) {
                if (currentNode.left != null) {
                    currentNode = currentNode.left;
                } else {
                    return false;
                }
            } else if (target > currentNode.value) {
                if (currentNode.right != null) {
                    currentNode = currentNode.right;
                } else {
                    return false;
                }
            } else if (target == currentNode.value) {
                return true;
            }
        }
    }
}

class TreeNode {
    int value;

    TreeNode left, right;
}