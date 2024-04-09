package org.example


//****************************************
// Read array using recursion and print it.
//****************************************
fun readArray(array: Array<Int>,size:Int,index:Int){

    if(index==size){
        return
    }

    print(array[index])

    readArray(array,size,index+1)


}



//*****************************************************
//Read array using recursion and print in reverse order.
//*****************************************************
fun readArrayReverse(array: Array<Int>,size:Int,index:Int){
    if(index==-1){
        return
    }
    print(array[index])
    readArrayReverse(array,size,index-1)

}




//************************************************
// Find minimum value among the array and print it.
//************************************************
fun readMinArray(array:Array<Int>,temp:Int,index: Int,size: Int):Int{
    var min = temp
    if(index>=size){
        return min
    }
    if(min>array[index]){
        min = array[index]

    }
    var minValue = readMinArray(array,min,index+1,size)
    return  minValue


}



//************
// Main method.
//*************
fun main(){

    var index = 0
    var array = arrayOf(2,-5,1,-1,0)
    var temp = array[0]
    var size = array.size
    var indexR = size-1

    readArray(array,size,index)
    println()
    readArrayReverse(array,size,indexR)
    println()
    var min = readMinArray(array,temp,index,size)
    println(min)

}