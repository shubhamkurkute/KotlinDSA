fun binarySearchUsingRecursion(sortedArray:Array<Int>,start:Int,end:Int,K:Int):Int{
    if (start<=end){
        var mid = (start+end)/2
        if(sortedArray[mid]==K){
           return  mid
        }
        else if(sortedArray[mid]<K){
            binarySearchUsingRecursion(sortedArray,mid+1,end,K)
        }
        else{
            binarySearchUsingRecursion(sortedArray,start,mid-1,K)
        }
    }

    return -1


}

fun main(){
    var sortedArray = arrayOf(2,4,6,12,17,20,25)
    var start = 0;
    var end = sortedArray.size-1
    var K = 20
    val value = binarySearchUsingRecursion(sortedArray,start,end,K)
    println(value)

}