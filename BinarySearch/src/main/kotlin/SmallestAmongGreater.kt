fun smallestAmongGreatest(array:Array<Char>,value:Char):Int{
    var start =0;
    var end = array.size-1
    var res = -1
    while(start<=end){
        var mid = start+(end-start)/2
        if(array[mid]==value){

            start = mid+1


        }
        else if(array[mid]>value){

            res = mid
            end = mid-1

        }
        else{
            start = mid +1
        }
    }

    return res

}





fun main(){
    val array = arrayOf('a','c','e','g','k')
    val value = 'd';
    val answer = smallestAmongGreatest(array,value)
    if(answer==-1){
        println("No such number for following problem statement")
    }else{
        println("The number greater than given number is : ${array[answer]}")
    }



}