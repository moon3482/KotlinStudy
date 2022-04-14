import study.Person as User
import kotlin.math.PI
import kotlin.math.abs

fun main() {
    val intro :String = "안녕하세요~ 적당히 바람이 시원해~"
    val num : Int = 20

    println(PI)
    println(abs(-12.6))
    println("intro: $intro, num: $num")

    val user1 = User("Charlie",30)
    val user2 = Person("Kane",30)
    println(user1.name)
    println(user1.age)

    println(user2.name)
    println(user2.age)
}