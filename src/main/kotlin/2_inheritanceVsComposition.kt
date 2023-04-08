//Write two different implementations of 1 parent and 2 children classes that override one method -
// one using inheritance and another using interfaces.

fun main(){
    println("1.Interface method:")
    var person1 : Person = Parent("John","Smith")
    var person2 : Person = Student("Allison","Smith")
    var person3 : Person = Student("JJ","Smith")

    println(person1.presentation())
    println(person2.presentation())
    println(person3.presentation())

    println("\n1.Interface method:")
    val person4 : Person2 = Role("Sarah","Gilbert","Parent")
    val person5 : Person2 = Role("Jeremy","Gilbert","Student")
    val person6 : Person2 = Role("Astrid","Gilbert","Student")
    
    println(person4.newPresentation())
    println(person5.newPresentation())
    println(person6.newPresentation())
}

//interface
interface Person{
    val name: String
    val surname: String
    fun presentation(): String
}

class Parent(override val name: String, override val surname: String): Person{
    override fun presentation(): String {
        return "Hi I'm $name $surname and I'm a parent"
    }
}

class Student(override val name: String, override val surname: String): Person{
    override fun presentation(): String {
        return "Hi I'm $name $surname and I'm a student"
    }
}

//inheritance

open class Person2(open val name: String, open val surname: String, open val role: String) {
    fun newPresentation(): String {
        return "Hi I'm $name $surname, I'm a $role"
    }
}

    class Role(override val name: String, override val surname: String, override val role:String):Person2(name,surname,role){
    }

