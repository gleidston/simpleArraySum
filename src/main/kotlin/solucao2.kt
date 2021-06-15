class solucao2 {

    // soluçao hackerrank  soma de  array simples

    fun simpleArraySum3(ar: Array<Int>) =ar.sum()
        /* pois bem essa soluçao como se diz nossa tutora e tipo kotlin ^^ parece trapaça mais nao e
        apenas atribuiu a funçao junto aos argumentos pois em KT temos uma funçao pronta que se chama sum
         e boom da certo com pouquissimas linahs de codigos
         */

    fun main(args: Array<String>) {
        val arCount = readLine()!!.trim().toInt()

        val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

        val result = simpleArraySum3(ar)

        println(result)
    }

}
