fun main() {
    func1()
    func2()
    func3()
    func4()
    func7()
    func8()
    func9()
    func10()
    func11()
    func12()
}

//nullable
fun func1() {
    var str1: String? = "Hello Charlie"
    str1 = null
    println(str1)
}

// 세이프콜 = str1?.length
fun func2() {
    var str1: String? = "Hello Charlie"
    str1 = null
    println("str1 : $str1 length : ${str1?.length}")
}

//조건문을 이용한 null 체크
fun func3() {
    var str1: String? = "Hello Charlie"
    str1 = null
    val len = if (str1 != null) str1.length else -1
    println("str1 : $str1 length : $len")
}

//세이프콜 + 엘비스연산자
fun func4() {
    var str1: String? = "Hello Charlie"
    str1 = null
    println("str1 : $str1 length : ${str1?.length ?: -1}")
}

//자료형 변환
/**
 * JAVA에서는 작은자료형에서 큰자료형으로 자동 변환되어지지만
 * Kotlin에서는 자동 변환을 하지않는다 (의도하지 않은 형변환문제를 방지하기위하여)
 */
fun func5() {
    val intA: Int = 1
//    val doubleA: Double = intA //자료형 불일치
//    val intB: Int = 1.1 //자료형 불일치
}

//              ↓ ↓ ↓ ↓
fun func6() {
    val intA: Int = 1
    val doubleA: Double = intA.toDouble()
    val intB: Int = 1.1.toInt() //자료형 불일치
}

//서로다른 자료형을 연산할 경우 표현을 더 많이 할 수 있는 더큰 자료형을 기준으로 자료형이 결정된다.
fun func7() {
    val value = 1L + 3
    println(value::class.simpleName) // Long
}

//이중등호 삼중등호
/**
 * 이중등호 == 는 값이 같을 때 true
 * 삼중등호 === 는 참조하는 주소가 같을 때 true
 */
fun func8() {
    val intA: Int = 128
    val intB: Int = 128
    println(intA == intB)
    println(intA === intB)

    val intC: Int = 128
    val intD: Int? = 128
    println(intC == intD)
    println(intD === intC)
}

//코틀린 스마트캐스트 어떠한 값이 정수 or 실수 일 수 있는 상황에 사용
fun func9() {
    var value: Number = 12.2
    println(value::class.simpleName)
    value = 12
    println(value::class.simpleName)
    value = 12L
    println(value::class.simpleName)
    value = 12.9f
    println(value::class.simpleName)

}

//자료형 검사
fun func10(){
    val num = 256

    if (num is Int){
        println("num is Int : $num")
    }else{
        println("num is Not Int")
    }
}

//Any 사용
fun func11(){
    val value: Any
    value = "Charlie"
    if (value is String)// 자료형 검사를 통해서 String 으로 캐스팅한다.
        println(value::class.simpleName)
}

//as 를 통한 형변환
fun func12(){
    val str : Any = "Charlie"
    val value :String = str as String
    val str2 : Any = "Moon"
    val value2 : String? = str2 as? String
    println(value)
    println(value2)
}