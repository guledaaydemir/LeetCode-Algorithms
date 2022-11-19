class Solution {
    func strongPasswordChecker(_ password: String) -> Int {
    //NOT SUBMISSION!! -- TODO!

    // length

    // Insert one character to password,
    guard password.count >= 6  else { return 6 - password.count }

    // Delete one character from password, or
    guard password.count <= 20 else { return password.count - 20 }


    var digitFlag: Bool = false
    var lowerFlag: Bool = false
    var upperFlag: Bool = false

    for c in Array(password) {
        // contains at least one upper
        if c.isUppercase { upperFlag = true}
        // contains at least one lower
        else if c.isLowercase { lowerFlag = true}
        // contains at least one one digit
        else if c.isNumber { digitFlag = true }
    }

    var stepCount: Int = 0

    if !upperFlag {stepCount += 1}
    if !lowerFlag {stepCount += 1}
    if !digitFlag {stepCount += 1}


    // not contain three repeating characters in a row
    // 1. more than three occurence
    // 2. more then one three regions

    // --> pointer --> O(n2) ( two for loops) + memory
    // --> create new Array change one letter when i see 1 trio  to _ (bb_bb) count = 1 --> O(n) + memory


    var passArray = Array(password)
    for i in 0..<password.count {
        if i + 2 < password.count {
            if (passArray[i] == passArray[i+1]) && (passArray[i] == passArray[i+2]) {
                // Replace one character of password with another character.
                passArray[i+2] = "_"
                stepCount += 1
                if !lowerFlag || !upperFlag || !digitFlag {
                    stepCount -= 1
                    if !upperFlag {upperFlag = true}
                    else if !lowerFlag {lowerFlag = true}
                    else if !digitFlag {digitFlag = true}
                }
            }
        }
    }

    return stepCount;


    }
}
