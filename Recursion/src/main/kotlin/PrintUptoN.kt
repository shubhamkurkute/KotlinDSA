package org.example

fun printUptoN(num : Int, start:Int){

    if(start>num){
        return
    }

    println(start);
    printUptoN(num,start+1)


}

fun main(){
    var number = 10
    var start = 1
    printUptoN(number,start)
}