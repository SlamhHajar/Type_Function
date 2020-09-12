
fun main(){
println("***********************Standrad Funcation**********************")
    var s = Standard().apply {
        funApply()
        funLet()
        funWith()
        funRun()
        funAlso()
    }
println("*************************Infix Funcation**********************")
    var infixStander=Infix()
    println(infixStander.multyStand(4,6))
    infixStander.userStandardInfix(10,5,8)
println("*************************Member Funcation**********************")
    var mem=Member()
          mem.run {
        println("reversr of sentence: \t"+ reLambda("lambda"))
        println("the var one are = var tow  : "+ inline("reem","Hajar"))
              localFun()
}
println("*************************User-define Funcation**********************")
var user=UserDefine()
    user.run {
        userDefineFun()
       println(DefineFunReturn())
        anonymousFun()
        anonymousInfFun()
    }

}