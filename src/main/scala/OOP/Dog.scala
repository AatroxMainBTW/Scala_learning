package OOP

class Dog(name:String) extends Speaker, TailWagger, Runner:
  def printfullname:Unit = println(name+"\n")
  def speak():String = "woof!"
