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
 * Complete the 'getTotalX' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER_ARRAY a
 *  2. INTEGER_ARRAY b
 */


    fun getTotalX(a: Array<Int>, b: Array<Int>): Int {
    var amax = a.maxOrNull()?:0
    var bmin=b.minOrNull()?:0
    var flag=false;
    var counter=0;
    for (i in amax..bmin) {
        for(j in a){
            if(i%j!=0){
                flag=false
                break}
            else{
                flag=true
            }
        
        }
        if(flag){
        for (k in b) {
            if(k%i!=0){
            flag=false
            break}
        }
    }
    if(flag) 
        counter++
    }
return counter
}
fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val m = first_multiple_input[1].toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val brr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val total = getTotalX(arr, brr)

    println(total)
}
