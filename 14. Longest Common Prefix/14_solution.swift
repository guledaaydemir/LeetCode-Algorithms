func longestCommonPrefix(_ strs: [String]) -> String {
    guard strs.count > 0 else { return "" }

    let length = strs.reduce(strs[0].count) { (result, str) -> Int in
        return min(result, str.count)
    }

    var prefix = ""
    for i in 0..<length {
        let charIndex = String.Index(encodedOffset: i)
        let firstStrChar = strs[0][charIndex]
        for j in 1..<strs.count {
            guard strs[j][charIndex] == firstStrChar else { return prefix }
        }
        prefix += String(firstStrChar)
    }

    return prefix
}

print(longestCommonPrefix(["flower","flower","flower"]))
print(longestCommonPrefix(["flower","flow","flight"]))
print(longestCommonPrefix(["dog","racecar","car"]))
