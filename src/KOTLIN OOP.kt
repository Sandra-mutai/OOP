fun main(){
    var sandra=person("sandra",25, 90.34565)
    println(sandra.name)
    println(sandra.age)
    println(sandra.weight)
    println(sandra.eat(30))
    println(sandra.speak( "i am simple"))
    sandra.birthday()
    var saddy=Teacher("sandy","maskio","maskio@gmail.com",78546,"sdfghj")
println(saddy.lastName)
    println(saddy.email)

}
class person(var name:String, var age:Int,var weight:Double){
    fun eat(foodWeight:Int){
        println("i am eating $foodWeight kgs of food")
        weight=foodWeight+weight
        println(weight)

        }
    fun speak(speech:String):String{
        return speech
    }
    fun birthday(){
        age+=29
        println(age)
    }
}
data class Teacher(var firstName:String,var lastName:String,var email:String, var phoneNumber:Int, var password
    :String)

