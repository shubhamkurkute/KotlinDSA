package org.example

fun printReverse(num:Int){

    if(num==0){
        return
    }
    println(num)
    printReverse(num-1)

}

fun main(){

    val number = 10
    printReverse(number)
}