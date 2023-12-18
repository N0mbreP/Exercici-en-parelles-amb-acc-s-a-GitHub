








fun main() {

    println("Benvingut a l'aplicació per calcular el valor de mercat.")

    var model: Int
    var km: Int
    var preufinal: Float = 0f
    do {

        model = menu("Si tens una Volkswagen Grand California escriu 1, si tens una Volkswagen Grand California Full Equip escriu 2.")
        km = menu("Introdueix el número de km que té el vehicle:")

        if (model == 1) {


            var preuinicial:Int = 73490
            preufinal = precioActual(preuinicial, km)


        } else if (model == 2) {

            var preuinicial:Int = 93490
            preufinal = precioActual(preuinicial, km)

        } else {
            println("ERROR: Valor introduït incorrecte")
        }

    } while (model != 1 && model != 2)
    var kmD:Double=km.toDouble()
    var preu:Double=preufinal.toDouble()
    preu=preuNeumatics(km=kmD, preuCoche = preu)

    println("El preu final tenint en compte que el vehicle te $km, és de $preu€")

}

