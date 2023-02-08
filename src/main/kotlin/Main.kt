import java.util.Base64

fun main() {
   greetings("Ada")
    greetings("brigit")
    greetings("anita")
    modulus(50,15)
    modulus(13,10)
    addition(20,30,40,10)
    personality()
}
fun greetings(name: String){
    println("hello"+name)
}
fun modulus(num1:Int,num2:Int){
    var modulus=num1 % num2
    println(modulus)
}
fun addition(num1: Int,num2: Int,num3: Int,num4: Int){
    var addition=num1 +num2 +num3 +num4
    println(addition)
}
fun personality(){
    println("I am focused")
}