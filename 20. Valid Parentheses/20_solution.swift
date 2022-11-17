import Foundation
func isValid(_ s: String) -> Bool {
    //check input
    guard s.count % 2 == 0 else {return false}
    var isValidFlag : Bool = true

    let dict: [Character: Character] = ["(":")","[":"]","{":"}"]
    var str = s

    for _ in 0..<str.count {
        if let i = str.firstIndex(of: dict[str.first!]!) {
            str.remove(at: i)
            str.removeFirst()
            if str.count == 0 { break }
        } else {
            isValidFlag = false
            break
        }
    }

    return isValidFlag
}

print(isValid("[()]{}"))
//print(isValid("()"))
//print(isValid("()[]{}"))
//print(isValid("(]"))
//print(isValid("([])"))
//print(isValid("([})"))
//print(isValid("({[})]"))
//print(isValid("({[{})]"))
//print(isValid("({[{(})(])"))
