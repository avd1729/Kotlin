package fundamentals

class Song(var title: String, var artist: String, var yearPublished: Int, var playCount: Int) {


    val isPopular: Boolean
        get() = playCount > 1000

    fun printSong() {
        val popularity = if (isPopular) "popular" else "not popular"
        println("$title, performed by $artist, was released in $yearPublished, " +
                "has been played $playCount times, and is considered $popularity.")
    }

    fun updatePlayCount(newPlayCount: Int) {
        if (newPlayCount > 0) {
            playCount = newPlayCount
        }
    }
}

fun main() {
    val song = Song("Melody", "Aravind", 2024, 100000)
    song.printSong()

    song.updatePlayCount(500)
    song.printSong()
}
