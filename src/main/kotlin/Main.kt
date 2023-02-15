fun main() {
    school()
    var x = sentence("Glenah",30)
   println(x)
   var  t = text("The paper has the character")
   println(t)
   messege("faith")
}
fun school() {
   var school = "akirachix"
    println(school[0])
    println(school[3])
   println(school[4])
}
fun sentence(name:String,age:Int):String{
   var sentence = "my name is $name and i am $age years old"
   return sentence
}
fun text(text:String): Int{
    return text.length
}
fun messege(name:String){
   var me = "Faith"
   if(name.equals (me)){
      println("That is me!")
   }else{
      println("I don't know who that is")
}
   }
