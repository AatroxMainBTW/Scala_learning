class Complex(real: Double,  imaginary:Double):
      def re = real
      def im = imaginary

      override def toString() = "" + re + (if im>=0 then "+" else "") + im + "j"



@main def complex():Unit = {
  val cmx = new Complex(2.2,-3.3)
  println(cmx.toString())
}