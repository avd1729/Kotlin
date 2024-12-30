package fundamentals

open class Phone(var isScreenLightOn: Boolean = false) {
    open fun switchOn() {
        isScreenLightOn = true
    }

    fun switchOff() {
        isScreenLightOn = false
    }

    fun checkPhoneScreenLight() {
        val phoneScreenLight = if (isScreenLightOn) "on" else "off"
        println("The phone screen's light is $phoneScreenLight.")
    }
}

class FoldablePhone(isScreenLightOn: Boolean = false) : Phone(isScreenLightOn) {

    var isFolded: Boolean = false

    override fun switchOn() {
        isScreenLightOn = if (isFolded) false else true
    }

    fun foldPhone() {
        isFolded = !isFolded
    }

    fun checkPhoneFoldState() {
        val state = if (isFolded) "folded" else "unfolded"
        println("The phone is currently $state.")
    }
}

fun main() {
    val phone = Phone()
    phone.switchOn()
    phone.checkPhoneScreenLight()

    val foldablePhone = FoldablePhone()
    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()

    foldablePhone.foldPhone()
    foldablePhone.switchOn()
    foldablePhone.checkPhoneScreenLight()

    foldablePhone.checkPhoneFoldState()
}
