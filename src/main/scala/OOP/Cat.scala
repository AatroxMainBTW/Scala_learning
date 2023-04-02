package OOP
import OOP.*


class Cat(name:String) extends Speaker, TailWagger, Runner:
  def printfullname:Unit = println(name+"\n")
  def speak():String = "Meow!"
  override def startRunning(): Unit = println("Yeah hum ... i dont run \n")
  override def stopRunning(): Unit = println("No need to stop \n")