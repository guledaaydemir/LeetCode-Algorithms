import Darwin
func minimumSum(_ num: Int) -> Int {

    let count = Array(num.description).filter({$0 == "0"}).count
    let sorted = Array(num.description).sorted(by: <)

    let d = (Int(String(sorted[sorted.index(sorted.startIndex, offsetBy: 3)])) ?? -1)
    let c = (Int(String(sorted[sorted.index(sorted.startIndex, offsetBy: 2)])) ?? -1)
    let b = (Int(String(sorted[sorted.index(sorted.startIndex, offsetBy: 1)])) ?? -1)
    let a = (Int(String(sorted[sorted.index(sorted.startIndex, offsetBy: 0)])) ?? -1) // smalllest

    guard count != 3 else { return d }
    guard count != 2 else { return (c) + (d) }
    guard count != 1 else { return (b*10) + (c) + (d) }
    guard count != 0 else { return (a)*10 + (b)*10 + (c) + (d)}


    return -1;
}

print(minimumSum(4009))
print(minimumSum(2239))
