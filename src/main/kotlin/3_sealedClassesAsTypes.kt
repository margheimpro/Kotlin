/*
Write sealed class for a type User that uses data classes for different types:
Email, Facebook, Google. They need to each have an id, and optionally
password or email. Use them in a when inside a method to return a printable value as String.*/

fun main(){
    var emailUser = Email(null, "qwerty", "megghy-91@hotmail.it")
    var facebookUser = Facebook("giogio00", null, "giogio-00@outlook.it")
    var googleUser = Google(null, "supercalifragilistichespiralidoso","alberto.boh@gmail.com")
    printInfo(emailUser)
    printInfo(facebookUser)
    printInfo(googleUser)
}

fun printInfo(userType: UserType) = when(userType) {
    is Email -> println("Email account -> email: ${userType.email}, password: ${userType.password}")
    is Facebook -> println("Facebook account -> id: ${userType.idUser}, email: ${userType.email}")
    is Google -> println("Google account -> email: ${userType.email}, password: ${userType.password}")
}

sealed class UserType(open var idUser: String?, open var password: String?, open var email: String?){
}

data class Email(override var idUser: String?, override var password: String?, override var email: String?): UserType(idUser,password,email){
}

data class Facebook(override var idUser: String?, override var password: String?, override var email: String?): UserType(idUser,password,email){
}

data class Google(override var idUser: String?, override var password: String?, override var email: String?): UserType(idUser,password,email){
}

