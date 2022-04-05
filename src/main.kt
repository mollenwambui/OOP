fun main(){
  var audi=Car("As","Audi","KDD 569H",0)
    println(audi.model)
    println(audi.make)
    println(audi.registration)
     audi.start("wooooshhh")
  audi.stop("shk shk shk")
  audi.accelerate(50)
  audi.accelerate(30)
  audi.decelerate(10)
  audi.hoot("pipipii")
  audi.stopmoving(0)
  println(audi.speed)
  var benz=Car("j63","mercedes benz","KDA 200H",0)
  benz.hoot("pipipipipipii")
  benz.stop("ooops oopss")
  var mollen=student("mollen wambui",21)
  var rahma=student("rahma derow",45)
  println(mollen.name.toString()+mollen.age)
  println(rahma.age)


}
class Car (var model:String,var make:String ,var registration:String ,var speed:Int){
  fun start(sound:String){
   println(sound)
 }
  fun accelerate(acceleration:Int):Int{
    speed+=acceleration
    return speed
  }
 fun hoot(peep:String){
   println(peep)
 }
  fun decelerate(deceleration:Int):Int{
    speed-=deceleration
    return speed
  }
  fun stop(sound:String){
    println(sound)
  }
  fun stopmoving(stop:Int):Int{
    speed=0
    return  speed
  }
}
data class student(var name:String,var age:Int)

