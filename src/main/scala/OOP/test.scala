package OOP



@main def test():Unit = {
  val cat = new Cat("Aurore")
  val dog = new Dog("Rufus")

  cat.printfullname
  println(cat.speak()+"\n")
  cat.startRunning()
  cat.stopRunning()

  dog.printfullnamex
  println(dog.speak())
}