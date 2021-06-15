// soluçao hackerrank  soma de  array simples
class solucao{
fun simpleArraySum(ar: Array<Int>): Int {

    var sum = 0
    for (element in ar) {

        sum += element
    }
    return sum

}
fun main(args: Array<String>) {
    val arCount = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = simpleArraySum(ar)

    println(result)
}
}