import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'formingMagicSquare' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY s as parameter.
 */

fun formingMagicSquare(s: Array<Array<Int>>): Int {
    val possiblesquares=arrayOf(
    intArrayOf(8,1,6,3,5,7,4,9,2),
    intArrayOf(6,1,8,7,5,3,2,9,4),
    intArrayOf(4,9,2,3,5,7,8,1,6),
    intArrayOf(2,9,4,7,5,3,6,1,8),
    intArrayOf(8,3,4,1,5,9,6,7,2),
    intArrayOf(4,3,8,9,5,1,2,7,6),
    intArrayOf(6,7,2,1,5,9,8,3,4),
    intArrayOf(2,7,6,9,5,1,4,3,8))
    var min=Integer.MAX_VALUE
   for (i in 0..possiblesquares.size-1) {
    var sum=0
    for (j in 0..possiblesquares.get(i).size-1) {
       sum+=Math.abs(s[j/3][j%3]-possiblesquares[i][j])
    }
    if(sum<min)
    min=sum
   }
    return min
}

fun main(args: Array<String>) {

    val s = Array<Array<Int>>(3, { Array<Int>(3, { 0 }) })

    for (i in 0 until 3) {
        s[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = formingMagicSquare(s)

    println(result)
}
