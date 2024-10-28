import java.util.List;

public class Trees {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // You are given the root of a binary tree root. Invert the binary tree and return its root.

    public TreeNode invertTree(TreeNode root) {

        // If the current node is null, it will return null (no tree to invert)
        if (root == null) {

            return null;
        }

        // Creating a new TreeNode to store the inverted structure,
        // initialized with the same value as the root node
        TreeNode node = new TreeNode(root.val);

        // Using recursion we are inverting the left subtree of the current root,
        // and assigning it to the right subtree of the new node (flipping it).
        node.right = invertTree(root.left);

        // Using recursion we are inverting the right subtree of the current root,
        // and assigning it to the left subtree of the new node (flipping it)
        node.left = invertTree(root.right);

        // Returning the new node that now represents the root of the inverted subtree.
        return node;
    }


    // Given the root of a binary tree, return its depth.
    // The depth of a binary tree is defined as the
    // number of nodes along the longest path from the root node down to the farthest leaf node.


    public int maxDepth(TreeNode root) {

        return 0;
    }

    // Given the roots of two binary trees p and q,
    // return true if the trees are equivalent, otherwise return false.

    // Two binary trees are considered equivalent if
    // they share the exact same structure and the nodes have the same values.

    public boolean isSameTree(TreeNode p, TreeNode q) {

        return false;
    }

    // Given the roots of two binary trees root and subRoot, return true if there is a subtree of root
    // with the same structure and node values of subRoot and false otherwise.

    //A subtree of a binary tree [tree] is a tree that
    // consists of a node in tree and all of this node's descendants.
    // The tree [tree] could also be considered as a subtree of itself.

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        return false;
    }

    // Given a binary search tree (BST) where all node values are unique,
    // and two nodes from the tree p and q, return the lowest common ancestor (LCA) of the two nodes.

    // The lowest common ancestor between two nodes p and q is the
    // lowest node in a tree T such that both p and q as descendants.
    // The ancestor is allowed to be a descendant of itself.

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        return root;
    }


    // Given a binary tree root, return the level order traversal of it as a nested list,
    // where each sublist contains the values of nodes at a particular level in the tree, from left to right.

    public List<List<Integer>> levelOrder(TreeNode root) {


        return List.of();
    }

    // Given the root of a binary tree, return true if it is a valid binary search tree,
    // otherwise return false.

    // A valid binary search tree satisfies the following constraints:

    // The left subtree of every node contains only nodes with keys less than the node's key.
    // The right subtree of every node contains only nodes with keys greater than the node's key.
    // Both the left and right subtrees are also binary search trees.

    public boolean isValidBST(TreeNode root) {

        return false;
    }


    // Given the root of a binary search tree, and an integer k,
    // return the kth smallest value (1-indexed) in the tree.

    // A binary search tree satisfies the following constraints:

    // The left subtree of every node contains only nodes with keys less than the node's key.
    // The right subtree of every node contains only nodes with keys greater than the node's key.
    // Both the left and right subtrees are also binary search trees.


    public int kthSmallest(TreeNode root, int k) {

        return k;
    }

    // You are given two integer arrays preorder and inorder.

    // preorder is the preorder traversal of a binary tree
    // inorder is the inorder traversal of the same tree
    // Both arrays are of the same size and consist of unique values.

    //Rebuild the binary tree from the preorder and inorder traversals and return its root.


    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return null;
    }

    // Given the root of a non-empty binary tree, return the maximum path sum of any non-empty path.

    // A path in a binary tree is a sequence of nodes where each pair of adjacent nodes has an edge connecting them.
    // A node can not appear in the sequence more than once. The path does not necessarily need to include the root.

    // The path sum of a path is the sum of the node's values in the path.

    public int maxPathSum(TreeNode root) {

        return 0;
    }


    // Implement an algorithm to serialize and deserialize a binary tree.

    // Serialization is the process of converting an in-memory structure into a sequence of bits so
    // that it can be stored or sent across a network to be reconstructed later in another computer environment.

    // You just need to ensure that a binary tree can be serialized to a string and this string can be deserialized
    // to the original tree structure. There is no additional restriction on how your serialization/deserialization algorithm should work.

    // Note: The input/output format in the examples is the same as how NeetCode serializes a binary tree.
    // You do not necessarily need to follow this format.

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {

        return "";
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {

        return null;
    }


}
