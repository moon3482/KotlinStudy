//자료형에 별명 붙이기
typealias Username = String
fun main() {

    var number = 10
    var food = "Pizza"
    val secondNumber :Int = 20
    food = "Pasta"

    println("number: $number")
    println("food: $food")
    println("secondNumber: $secondNumber")


    //자료형 추론
    val num01 = 123 //Int
    val num02 =-123 //Int
    val num03 = 2147483647 //Int
    val num04 = 9087707907097890 //Long

    val exp01 = 123
    val exp02 = 123L
    val exp03 = 0x0F
    val exp04 = 0b00001011

    println("num01: $num01")
    println("num02: $num02")
    println("num03: $num03")
    println("num04: $num04")
    println("exp01: $exp01")
    println("exp02: $exp02")
    println("exp03: $exp03")
    println("exp04: $exp04")

    //보통 숫자값은 Int형으로 추론되기 때문에 작은 숫자 범위중 Byte 나 Short형을 사용하려면 직접 자료형을 명시해주어야한다.
    val exp05: Byte = 127
    val exp06: Short = 32767


    //음수가 없는 양수만 표현할때 사용하면 더 많은 숫자를 표현 할 수 있다.
    val uInt :UInt = 153u
    val uLong:ULong = 65512323312321uL
    val uShort:UShort = 65535u
    val uByte:UByte = 255u

    //값이 너무 길어서 읽기 어려울 경우 언더스코어를 이용해서 자릿수를 구별 할 수 있다.
    val num05 = 123_123_423_551
    println("num05: $num05")

    //실수형 자료 - 아무표시가 없다면 기본은 Double로 추론하기때문에 뒤에 F를 써주어야한다.
    //코틀린은 IEEE 754 표준 부동소수점 방식 따르고있다.
    val dNum01 = 12.3
    val fNum01 = 12.3F
    println("dNum01 : $dNum01")
    println("fNum01 : $fNum01")

    //부동소수점
    val dNum02 = 3.14E-2 //소수점 왼쪽으로 2칸 이동
    val dNum03 = 3.14e2  //소수점 오른쪽으로 2칸 이동
    println("dNum02 : $dNum02")
    println("dNum03 : $dNum03")

    //정수 자료형 과 실수 자료형 최대값 최솟값
    println("Byte - min: ${Byte.MIN_VALUE} / max: ${Byte.MAX_VALUE}")
    println("Short - min: ${Short.MIN_VALUE} / max: ${Short.MAX_VALUE}")
    println("Int - min: ${Int.MIN_VALUE} / max: ${Int.MAX_VALUE}")
    println("Long - min: ${Long.MIN_VALUE} / max: ${Long.MAX_VALUE}")
    println("Float - min: ${Float.MIN_VALUE} / max: ${Float.MAX_VALUE}")
    println("Double - min: ${Double.MIN_VALUE} / max: ${Double.MAX_VALUE}")

    //논리자료형 Boolean
    val isCharlie : Boolean
    val isBaJi = true

    //문자 자료형
    //문자자료형은 '로 감싸준다.
    val cChar = 'C'
    val chaCha:Char
    //컴퓨터는 char를 숫자로 인식하여 아스키코드기준으로 출력
    println(cChar+1) //D 출력
    //Int to Char
    val code:Int = 65
    val charCode = code.toChar();
    println(charCode) //A 출력
    //Char는 문자 1개만 할당가능

    //이스케이프 문자사용
    val str = "My name is \"Charlie_Moon\"!!!"
    println(str)
    val str2 = "My name is ${'"'}Charlie_Moon${'"'}!!!"
    println(str2)

    //형식화된 문자열 표현하기
    val script = """
        ???: 안녕?        하하하
        ???2: 안녕~
        ???: 내 이름은 찰리 라고해
        ???2: 내 이름은 ???2 라고해
        ???: ??? 이름이 뭐라고???
    """.trimIndent()
    println(script)

    //자료형 별명 붙이기
    val user: Username = "Charlie"
    val user2: String = "Charlie"
    println(user)
    println(user2)


}

