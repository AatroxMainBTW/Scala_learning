def oncePerSecond(callback:() => Unit):Unit = {
  while true do {callback(); Thread.sleep(1000)}
}

def timeFlies():Unit = {
    println("FAWZIIII")
}

@main def Timer():Unit = {
  oncePerSecond(timeFlies)
}