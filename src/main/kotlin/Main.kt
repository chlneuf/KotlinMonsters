package org.example

import org.example.dresseur.Entraineur
import org.example.item.Badge
import org.example.monde.Zone
import org.example.monstre.EspeceMonstre
import org.example.monstre.IndividuMonstre

//Dresseur
var joueur = Entraineur(1,"Sacha",100)
var rival = Entraineur(2, "Regis", 200)
//Especes
val especeSpringleaf= EspeceMonstre(
    "1",
    "Springleaf",
    "Graine",
    9,
    baseDefense = 10,
    baseVitesse = 0,
    baseAttaqueSpe = 0,
    baseDefenseSpe = 0,
    basePv = 10,
    modAttaque = 15.3,
    modDefense = 12.0,
    modAttaqueSpe = 10.2,
    modDefenseSpe = 10.6,
    modVitesse = 12.0,
    modPv = 50.1)

val especeFlamkip = EspeceMonstre(
    "4",
    "Animal",
    type = "Météo",
    baseAttaque = 10,
    baseDefense = 10,
    baseVitesse = 0,
    baseAttaqueSpe = 0,
    baseDefenseSpe = 0,
    basePv = 10,
    modAttaque = 15.3,
    modDefense = 12.0,
    modAttaqueSpe = 10.2,
    modDefenseSpe = 10.6,
    modVitesse = 12.0,
    modPv = 50.1)


val especeAquamy = EspeceMonstre(
    "7",
    "Aquamy",
    "Météo",
    baseAttaque = 10,
    baseDefense = 10,
    baseVitesse = 0,
    baseAttaqueSpe = 0,
    baseDefenseSpe = 0,
    basePv = 10,
    modAttaque = 15.3,
    modDefense = 12.0,
    modAttaqueSpe = 10.2,
    modDefenseSpe = 10.6,
    modVitesse = 12.0,
    modPv = 50.1)


val especeLaoumi = EspeceMonstre(
    "8",
    "Laoumi",
    "Météo",
    baseAttaque = 10,
    baseDefense = 10,
    baseVitesse = 0,
    baseAttaqueSpe = 0,
    baseDefenseSpe = 0,
    basePv = 10,
    modAttaque = 15.3,
    modDefense = 12.0,
    modAttaqueSpe = 10.2,
    modDefenseSpe = 10.6,
    modVitesse = 12.0,
    modPv = 50.1)


val especeBugsyface = EspeceMonstre(
    "10",
    "Bugsyface",
    "Insecte",
    baseAttaque = 10,
    baseDefense = 10,
    baseVitesse = 0,
    baseAttaqueSpe = 0,
    baseDefenseSpe = 0,
    basePv = 10,
    modAttaque = 15.3,
    modDefense = 12.0,
    modAttaqueSpe = 10.2,
    modDefenseSpe = 10.6,
    modVitesse = 12.0,
    modPv = 50.1)

val especeGalum = EspeceMonstre(
    "13",
    "Galum",
    "Minéral",
    baseAttaque = 10,
    baseDefense = 10,
    baseVitesse = 0,
    baseAttaqueSpe = 0,
    baseDefenseSpe = 0,
    basePv = 10,
    modAttaque = 15.3,
    modDefense = 12.0,
    modAttaqueSpe = 10.2,
    modDefenseSpe = 10.6,
    modVitesse = 12.0,
    modPv = 50.1)

val foret = Zone(
    id = 13,
    nom = "Forêt",
    especesMonstres = mutableListOf(especeGalum)
)
    val grotte = Zone(

        id = 14,
    nom = "Grotte",
    especesMonstres = mutableListOf(especeGalum)
    )


        //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

            foret.zoneSuivante = grotte
            grotte.zonePrecedente = foret

            /*    println(changeCouleur("Hello","rouge"))
                println(changeCouleur("World","magenta"))
                println("Hello ${changeCouleur("my","jaune")} World")
                println(changeCouleur("Truc","marron"))*/



//    joueur.argents+=50




            val monstre1 = IndividuMonstre(1, "springleaf", 1500.0, especeSpringleaf)
            val monstre2 = IndividuMonstre(2, "flamkip", 1500.0, especeFlamkip)
            val monstre3 = IndividuMonstre(3, "aquamy", 1500.0, especeAquamy)

            monstre1.exp = 2000.0
            monstre1.pv = -50
            monstre1.pvMax = 500
            monstre1.attaque = 60
            monstre1.id = 0
            monstre1.nom = "in"
            monstre1.espece = especeSpringleaf
            monstre1.entraineur = null
            monstre1.niveau = 5
            monstre1.attaque = 69
            monstre1.défense = 58
            monstre1.vitesse = 100
            monstre1.attaqueSpe = 73
            monstre1.défenseSpe = 71
            monstre1.pvMax = 138
            monstre1.potentiel = 10.5


            monstre2.exp = 2000.0
            monstre2.pv = -50
            monstre2.pvMax = 500
            monstre2.attaque = 60
            monstre1.id = 0
            monstre1.nom = "in"
            monstre1.espece = especeFlamkip
            monstre1.entraineur = null
            monstre1.niveau = 5
            monstre1.attaque = 69
            monstre1.défense = 58
            monstre1.vitesse = 100
            monstre1.attaqueSpe = 73
            monstre1.défenseSpe = 71
            monstre1.pvMax = 138
            monstre1.potentiel = 10.5

            monstre3.exp = 2000.0
            monstre3.pv = -50
            monstre3.pvMax = 500
            monstre3.attaque = 60
            monstre1.id = 0
            monstre1.nom = "in"
            monstre1.espece = especeAquamy
            monstre1.entraineur = null
            monstre1.niveau = 5
            monstre1.attaque = 69
            monstre1.défense = 58
            monstre1.vitesse = 100
            monstre1.attaqueSpe = 73
            monstre1.défenseSpe = 71
            monstre1.pvMax = 138
            monstre1.potentiel = 10.5

            val badge = Badge(
                1,
                "Badge feu",
                "Badge gagné lorsque le joueur atteint l'arène de pierre",
                champion = rival
            )

            println(badge.nom)

        }
/**
 * Change la couleur du message donné selon le nom de la couleur spécifié.
 * Cette fonction utilise les codes d'échappement ANSI pour appliquer une couleur à la sortie console. Si un nom de couleur
 * non reconnu ou une chaîne vide est fourni, aucune couleur n'est appliquée.
 *
 * @param message Le message auquel la couleur sera appliquée.
 * @param couleur Le nom de la couleur à appliquer (ex: "rouge", "vert", "bleu"). Par défaut c'est une chaîne vide, ce qui n'applique aucune couleur.
 * @return Le message coloré sous forme de chaîne, ou le même message si aucune couleur n'est appliquée.
 */

fun changeCouleur(message: String, couleur:String="Bleu"): String {
    val reset = "\u001B[0m"
    val codeCouleur = when (couleur.lowercase()) {
        "rouge" -> "\u001B[31m"
        "vert" -> "\u001B[32m"
        "jaune" -> "\u001B[33m"
        "bleu" -> "\u001B[34m"
        "magenta" -> "\u001B[35m"
        "cyan" -> "\u001B[36m"
        "blanc" -> "\u001B[37m"
        else -> "" // pas de couleur si non reconnu
    }

    return "$codeCouleur$message$reset"
}

