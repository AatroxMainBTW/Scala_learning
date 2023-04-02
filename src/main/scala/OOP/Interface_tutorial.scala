package OOP


trait Speaker:
  def speak():String

trait TailWagger:
  def startTail(): Unit = println("tail is wagging.....")
  def stopTail(): Unit =  println("tail is stopped.....")

trait Runner:
  def startRunning():Unit = println("Im running!!")
  def stopRunning():Unit = println("Stoped running")





