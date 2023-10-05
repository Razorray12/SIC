fun main(args: Array<String>) {
    val string = readln().map { it.toString()}
    var a:Int = 0
    var g:Int = 0
    var t:Int = 0
    var c:Int = 0
    for (i in string){
        when {
            i.equals("A") -> a++
            i.equals("T") -> t++
            i.equals("G") -> g++
            i.equals("C") -> c++
        }
    }
    println("$a $t $g $c")
}