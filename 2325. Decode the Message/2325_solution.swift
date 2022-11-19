func decodeMessage(_ key: String, _ message: String) -> String {

    var resultMessage: String = ""
    var currentLetter = 0
    var myKeyDict: Dictionary<Character, String> = [" " : " "]
    // only one for with filling my dict.

    for char in key {
        if myKeyDict[char] == nil {
            myKeyDict[char] = String(UnicodeScalar(97+currentLetter)!)
            currentLetter += 1
        }
    }

    // tranforming my message with using dictionary
    message.forEach {
        resultMessage += myKeyDict[$0]!
    }

    return resultMessage
}

print(decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb"))
