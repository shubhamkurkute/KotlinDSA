fun findingLastOccurenceIndex(array:Array<Int>,value:Int):Int{
    var start = 0;
    var end = array.size-1;
    var res = 0;
    while(start<=end){
        var mid = (start+end)/2;

        if(array[mid]==value){
            res = mid
            start = mid+1

        }else if(array[mid]<=value){
            start= mid+1
        }else{
            end = mid-1
        }
    }
    return res

}

fun main(){
    var array = arrayOf(2,3,3,4,4,6,6,6,8)
    var value = 8;
    var index = findingLastOccurenceIndex(array,value)
    println(index)
}