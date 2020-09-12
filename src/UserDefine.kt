class UserDefine {
      var  userdefine = ""
 fun userDefineFun() {
     userdefine = "user define function with no return value it is unit"
            println(userdefine)
        }

fun  DefineFunReturn(): String {
            userdefine = "user define function with return value"
            return userdefine
        }
fun anonymousFun() {
 var anymo: () -> String = {userdefine= "anonymous function"
                userdefine
            }
 println("Function is an  explicit type with -> anonymous function")
        }
 fun anonymousInfFun() {

            var anymo= {
 "anonymous function" }

            println("Function is an inference type  anonymous function ")
        }

}