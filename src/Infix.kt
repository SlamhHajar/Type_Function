class Infix {
    fun multyStand( m:Int,n:Int):Int{
        infix fun Int.multy(b : Int) : Int = this * b
        val x = n.multy(m)
        return x

    }
    fun userStandardInfix(n1:Int,n2:Int,n3:Int) {
        var t =n1
        var i= n2
        var s = n3
        var result = (i === s) xor (s <= t)
        println("the result os infix standard function :\n$result ")
        println(++t)
        println(--i)
        println(s++)
    }
}