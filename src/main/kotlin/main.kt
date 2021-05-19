fun main(args: Array<String>) {
    val testHashMap = CustomHashMap<String, String>()

    testHashMap.put("A", "Alpha")
    testHashMap.put("B", "Bravo")
    testHashMap.put("C", "Charlie")
    testHashMap.put("D", "Delta")
    testHashMap.put("E", "Echo")
    testHashMap.put("F", "Foxtrot")
    testHashMap.put("G", "Golf")
    testHashMap.put("H", "Hotel")
    testHashMap.put("I", "India")
    testHashMap.put("J", "July")
    testHashMap.put("K", "Kilo")
    testHashMap.put("L", "Lima")
    testHashMap.put("M", "Mike")
    testHashMap.put("N", "November")
    testHashMap.put("O", "Oscar")
    testHashMap.put("P", "Papa")
    testHashMap.put("Q", "Quebec")
    testHashMap.put("R", "Romeo")
    testHashMap.put("S", "Sierra")
    testHashMap.put("T", "Tango")
    testHashMap.put("U", "Uniform")
    testHashMap.put("V", "Victor")
    testHashMap.put("W", "Whiskey")
    testHashMap.put("X", "X-Ray")
    testHashMap.put("Y", "Yankee")
    testHashMap.put("Z", "Zulu")


    for (key in 'A'..'Z') {
        println("Key = [$key] value = [${testHashMap.get(key.toString())}]")
    }
}