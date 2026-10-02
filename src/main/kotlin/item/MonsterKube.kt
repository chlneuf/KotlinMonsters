package org.example.item

import org.example.dresseur.Entraineur
import org.example.joueur
import org.example.monstre.IndividuMonstre
import kotlin.random.Random

class MonsterKube(
    id: Int,
    nom: String,
    description: String,
    var chanceCapture: Double,

) : Item(id, nom, description), Utilisable {

    fun utiliser(cible: IndividuMonstre) {
        print("Vous lancez le Monster Kube")

        if (cible.entraineur != null) {
            print("Monstre ne peut pas être capturé")
        } else {
            val nbAleatoire = Random.nextInt(0, 101)

            if (nbAleatoire < chanceCapture) {
                print("Monstre capturé !")
            } else {
                print(("Presque ! Le Kube n'a pas pu capturer le monstre !"))
            }
        }
        print("Entrez un nouveau nom : ")
        val nouveauNom = readln()
        if (nouveauNom.isNotEmpty()) {
            cible.nom = nouveauNom

            if (joueur.equipeMonstre.size < 6) {
                cible.entraineur = joueur
                joueur.equipeMonstre.add(cible)
            }


        }
    }
}







