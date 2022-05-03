import java.math.BigInteger

fun main(){
    var nbGrzRizCase = BigInteger.ONE
    var nbGrzRizTotaux = BigInteger.ONE
    println("Calcul du nombre de grains de riz par case")
    println("Case 1 : $nbGrzRizCase")
    for (case in 2..64){
        nbGrzRizCase = nbGrzRizCase.multiply(BigInteger("2"))
        println("Case $case : $nbGrzRizCase")
        nbGrzRizTotaux = nbGrzRizTotaux.plus(nbGrzRizCase)
    }
    println("Grains Totaux : $nbGrzRizTotaux")

}
