//
// 산술 연산자 +,-,*,/,%
// 대입 연산자 =,+=,-=,*=,/=,%=
// 증가,감소 연산자 ++,--
// 비교 연산자 >,<,>=,<=,==,!=,===,!==
// 논리 연산자 &&,||,!
// 비트 연산자 shl,shr,ushr,<- 비트 이동 // and , or <-논리 연산 // xor <-베타적 연산 // inv <- 비트 뒤집기
//
///


fun main() {
    arithmetic()
    increase()
}

fun arithmetic() {
    var result: Int = 12 + 5
    println(result)
    result = 32 - 5
    println(result)
    result = 32 * 5
    println(result)
    result = 32 / 5
    println(result)
    result = 32 % 5
    println(result)
}

fun increase() {
    var number1 = 1
    var number2 = 1
    var result1 = ++number1 //전위 연산 number1 + 1 후 result1에 대입
    var result2 = number2++ //후위 연산 number2의 현재 상태를 result2에 대입 후 number2에 +1

    println(result1) //2
    println(result2) //1
    println(number1) //2
    println(number2) //2
}
