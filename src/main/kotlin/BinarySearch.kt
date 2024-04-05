class Search{



    fun binarySearch(sortedArray:Array<Int>, K:Int ):Int{

        var end = sortedArray.size - 1
        var start = 0
        while(start<=end){
            var mid = (start+end)/2
            if(sortedArray[mid]<K){
                start = mid+1;
            }
            else if(sortedArray[mid]>K){
                end = mid-1


            }
            else{
                return mid
            }

        }
        return -1

    }

}

fun main(){
    var sortedArray = arrayOf(2,4,6,12,17,20,25)
    val search = Search()
    val value = search.binarySearch(sortedArray, 25)
    println(value)
}