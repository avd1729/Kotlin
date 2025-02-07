package practice

fun longestUniqueSubstring(s: String): String {
    var i = 0
    var j = 0
    val set = mutableSetOf<Char>()

    var longest = ""
    val sb = StringBuilder()

    while (j < s.length) {
        if (!set.contains(s[j])) {
            set.add(s[j])
            sb.append(s[j])
            j++
            if (sb.length > longest.length) {
                longest = sb.toString() // Update longest substring
            }
        } else {
            set.remove(s[i])
            sb.deleteAt(0) // Removing the first character
            i++
        }
    }
    return longest
}

// Testing the function
fun main() {
    println(longestUniqueSubstring("abcabcbb")) // Output: "abc"
    println(longestUniqueSubstring("bbbbb"))    // Output: "b"
    println(longestUniqueSubstring("pwwkew"))   // Output: "wke"
    println(longestUniqueSubstring("dvdf"))     // Output: "vdf"
}

