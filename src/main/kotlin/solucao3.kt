class solucao3 {

    // soluçao hackerrank  soma de  array simples

    fun simpleArraySum3(ar: Array<Int>): Int {
 /* nesse caso ultilizei a funçao foreach para pecorrer o arrey depois usei o it para dizer que
 deve atribui a soima dos valores do proprio vetor acho que é isso ^^
  */
        var sum = 0
       ar.forEach {
           sum += it
       }

        return sum

    }
    fun main(args: Array<String>) {
        val arCount = readLine()!!.trim().toInt()

        val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

        val result = simpleArraySum3(ar)

        println(result)
    }

}