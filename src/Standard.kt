

class Standard {
data class Users(var user_name:String,var user_password:String,var user_Phone:String="")
   var samer=Users("Samar","1010@ee","77891258147")
    fun funApply(){
       println("The Apply function")
         samer.apply {
             println(this)
             user_name = "Samar Ali"
println("After apply user name"+this)
             if (user_Phone.contains("7")) println("Thats in apply function Your phone contin number 7")
             println("-------------------------------------------------------------------------------------")
         } }
 fun funLet(){
     println("The Let function")
var pass=samer.user_password.length
       var chek= if (pass >= 8) {

               println(" Your password is $pass very Strong")

       } else {
           pass.let {
               println("Yuo have Edit your password $it")
            var newpass=it+5
               println("After we  Edit your password $newpass")
 }
           println("-------------------------------------------------------------------------------------")
  } }

    fun funWith(){
        val reem = mutableListOf<Users>(Users("reem","1234"))
        with(reem){

            println( "With Function is $this")
        }
    }

    fun funRun(){
        samer.run {
            println("-------------------------------------------------------------------------------------")
            println("Befor Run Function ${this.user_password} ")
            user_password="lali1234@we"
            println(" After Run Function ${this.user_password} ")

        }
    }
    fun funAlso(){
        println("-------------------------------------------------------------------------------------")
       var Lara= mutableListOf<Users>(Users("Lara","123456@1234"))
        Lara.also {
          println("Also Function on Array are existing ${it.count()} element ")
       }

    }
    }
    
    
