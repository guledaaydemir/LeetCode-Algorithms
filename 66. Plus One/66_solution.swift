import Foundation

func plusOne(_ digits: [Int]) -> [Int] {

    // RunTime Error -- Big Integer
    //    var s = ""
    //    let totals1 = digits.reduce(String(), { _, item in
    //        s.append(String(item))
    //        return s
    //    })
    //
    //    return String(Int(totals1)! + 1).compactMap{ $0.wholeNumberValue }

    var buf = 1
    var result = [Int]()
    for i in digits.reversed() {
        let res = i + buf
        buf = res / 10
        result.append(res % 10)
    }
    if buf > 0 {
        result.append(buf)
    }
    return Array(result.reversed())

}

print(plusOne([7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6]))
print(plusOne([1,2,9]))
print(plusOne([1,9,9]))
print(plusOne([9,9]))
