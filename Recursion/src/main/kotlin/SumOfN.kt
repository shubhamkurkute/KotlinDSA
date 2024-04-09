package org.example

import kotlin.enums.enumEntries

//Sum upto N without using return type
fun sumOfN(number:Int,sum:Int){
    var add = sum
    if(number==0){
        println(add)
        return
    }
    add =  number + add
    sumOfN(number-1,add)



}

//Sum upto N with using return type

fun sumOfNReturn(number: Int):Int{
    if(number==0){
        return number
    }
    return number+ sumOfNReturn(number-1)
}

fun main(){
    var sum = 0
    var number = 3
    sumOfN(number,sum)
     println(sumOfNReturn(number))

}