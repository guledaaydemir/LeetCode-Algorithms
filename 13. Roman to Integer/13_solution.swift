import UIKit

func romanToInt(_ s: String) -> Int {

    //check input
    let dict = ["I":1,"V":5,"X":10,"L":50,"C":100,"D":500,"M":1000]
    let myKeys: [Character] = dict.map{ Character($0.key) }
    let match = s.filter { myKeys.contains($0) }.count != 0
    if !match { return -1 }


    var result = 0
    let chars = Array(s)

    for i in 0..<chars.count {
        let current = dict[String(chars[i])]!
        // left to right (largest to lowest) --> summation
        if i+1 != chars.count && current < dict[String(chars[i+1])]! {
            result = result - current
        }
        // right to left (lowest to largest) --> substraction
        else {
            result = result + current
        }
    }

    return result
}

print(romanToInt("III"))
print(romanToInt("LVIII"))
print(romanToInt("MCMXCIV"))
