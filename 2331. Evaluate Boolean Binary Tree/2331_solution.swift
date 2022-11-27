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
    func evaluateTree(_ root: TreeNode?) -> Bool {
        switch root?.val {
        case 1: // TRUE
            return true
        case 2: // OR
            return evaluateTree(root?.left) || evaluateTree(root?.right)
        case 3: // AND
            return evaluateTree(root?.left) && evaluateTree(root?.right)
        default:
            return false
        }
    }
}
