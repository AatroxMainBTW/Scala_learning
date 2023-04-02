/*import ADT.*

enum ADT:
    case Sum(l:ADT, r:ADT)
    case Var(n:String)
    case Const(v:Int)


type Environement = String => Int
val ev: Environement = {case 'x' => 5 }



def eval(t:ADT, ev:Environement) : Int = t match
    case Sum(l,r) => eval(l,ev) + eval(r,ev)
    case Var(n) => ev(n)
    case Const(v) => v

*/