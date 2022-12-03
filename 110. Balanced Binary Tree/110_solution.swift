/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     public var val: Int
 *     public var left: TreeNode?
 *     public var right: TreeNode?
 *     public init() { self.val = 0; self.left = nil; self.right = nil; }
 *     public init(_ val: Int) { self.val = val; self.left = nil; self.right = nil; }
 *     public init(_ val: Int, _ left: TreeNode?, _ right: TreeNode?) {
 *         self.val = val
 *         self.left = left
 *         self.right = right
 *     }
 * }
 */
class Solution {
    func height (_ node: TreeNode?) -> Int {
        guard (node != nil) else { return 0 }

        return 1 + max(height(node!.left), height(node!.right))
    }

    func isBalanced(_ root: TreeNode?) -> Bool {
        guard let node = root else { return true }

        var leftHeight: Int = 0
        var rightHeight: Int = 0

        leftHeight = height(node.left)
        rightHeight = height(node.right)

        if abs(leftHeight-rightHeight) <= 1 && isBalanced(node.left) && isBalanced(node.right){
            return true
        }

        return false
    }
}
