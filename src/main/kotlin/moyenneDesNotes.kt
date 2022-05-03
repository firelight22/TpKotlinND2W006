import java.math.BigInteger

var listValeurs = mutableListOf<Float>()
//fun main(){
//    println("Entrez le nombre de valeurs :")
//
//    var input = readln().toIntOrNull()
//    if(input!= null){
//        for (i in 1..input){
//            askAndAddToList()
//        }
//        print("La Moyenne est de ${listValeurs.sum()/listValeurs.size}")
//    }
//}
//
//fun askAndAddToList(){
//    println("Valeur :")
//    var input = readln().toFloatOrNull()
//    input?.let { listValeurs.add(it) }
//}
const val QUIT_INPUT = -1.0f
fun main(){
    var input =0f
    do{
        println("Note -1 pour terminer")
        val inputFloat = readln().toFloatOrNull()
        if(inputFloat != null && inputFloat != QUIT_INPUT){
            listValeurs.add(inputFloat)
        }else input = QUIT_INPUT
    }while (input != QUIT_INPUT)
    print("La Moyenne est de ${listValeurs.sum()/listValeurs.size}")
}


