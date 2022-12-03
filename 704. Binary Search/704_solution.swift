class Solution {
    func search(_ nums: [Int], _ target: Int) -> Int {
        var startIndex = 0
        var endIndex = nums.count - 1

    while (startIndex < endIndex) {
        let middleIndex = Int(endIndex-startIndex/2)
        if target < nums[middleIndex] {
            endIndex = middleIndex - 1
        } else {
            startIndex = middleIndex
        }
    }

    return nums[startIndex] == target ? startIndex : -1
    }
}
