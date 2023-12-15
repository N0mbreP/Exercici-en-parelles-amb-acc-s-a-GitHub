import java.util.*

fun precioActual(preuCoche:Int, km:Int):Float{
    var preuCF:Float=preuCoche.toFloat()
    val resultat: Float = preuCoche * 0.00001f * km
    return resultat
}


fun menu(textoMenu:String):Int{
    val scan= Scanner(System.`in`)
    var numeroLlegit:Int=0
    println(textoMenu)
    do {
        var valorCorrecte:Boolean=scan.hasNextInt()
        if (!valorCorrecte){
            scan.nextLine()
        }else{
            numeroLlegit=scan.nextInt()
            scan.nextLine()
        }
    }while (!valorCorrecte)
    return numeroLlegit
}