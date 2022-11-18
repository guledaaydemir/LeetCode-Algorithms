class Solution {
    func removeElement(_ nums: inout [Int], _ val: Int) -> Int {

        // Solution 1
        //nums = nums.filter{$0 != val}
        //return nums.count

        // Solution 2
        nums.removeAll(where : { $0 == val })
        return nums.count
    }
}
