class Member {
    fun reLambda(r:String):String {
        var funType = r
        println(funType)
        return funType.capitalize().reversed()
 }
    fun inline(a: String, b: String): Boolean = a.length === b.length
fun localFun(){
    var local="You are in local function"
    fun insidefun(){
        println(local+" and this is length \t"+local.length)
    }
    insidefun()
}
}