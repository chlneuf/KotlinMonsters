package org.example

import org.example.dresseur.Entraineur
import org.example.monstre.EspeceMonstre

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

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
/*    println(changeCouleur("Hello","rouge"))
    println(changeCouleur("World","magenta"))
    println("Hello ${changeCouleur("my","jaune")} World")
    println(changeCouleur("Truc","marron"))*/

//    joueur.afficheDetail()
//    rival.afficheDetail()
//    joueur.argents+=50
//    joueur.afficheDetail()

    println(especeBugsyface.nom)
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

