package org.example.monstre

import org.example.joueur

annotation class monstreSauvage

class CombatMonstre(
    private val monstreJoueur: IndividuMonstre,
    private val monstreSauvage: IndividuMonstre
) {

    /**
     * Vérifie si le joueur a perdu le combat.
     *
     * Condition de défaite :
     * - Aucun monstre de l'équipe du joueur n'a de PV > 0.
     *
     * @return true si le joueur a perdu, sinon false.
     */
    fun gameOver(): Boolean {
        return monstreJoueur.pv <= 0
    }

    /**
     * Vérifie si le joueur a gagné.
     */

    fun joueurGagne(): Boolean {
        if (monstreSauvage.pv <= 0) {
            println("${monstreJoueur.nom} a gagné")

            val gainExp = (monstreSauvage.exp * 0.20).toInt()
            monstreJoueur.exp += gainExp

            println("${monstreJoueur.nom} gagne $gainExp EXP")

            return true
        }
        if (monstreSauvage.entraineur== joueur) {
            println ("${monstreSauvage.nom} a été capturé !")
            return true
            }else {
                return false
            }

        fun actionAdversaire() {
            if (monstreSauvage.pv > 0) {
                monstreSauvage.attaquer(monstreJoueur)
            }
        }

        fun actionJoueur(): Boolean {
            println("Que voulez-vous faire ?")
            println("1 - Attaquer")
            println("2 - Utiliser un item")
            println("3 - Changer de monstre")

            val choix = readln().toInt()

            when (choix) {
                1 -> {
                   monstreJoueur.attaquer(monstreSauvage)
                }

                2 -> {

                        println("Choisissez un objet :")
                        println(joueur.sacAItems)

                        val indexChoix = readln().toInt()

                        if (indexChoix in joueur.sacAItems.indices) {
                            val objetChoisi = joueur.sacAItems[indexChoix]

                            println("Vous avez choisi : $objetChoisi")

                            // Code de l'utilisation de l'objet ici
                        } else {
                            println("Objet non utilisable")
                        }


                }

                3 -> {
                    println(equipeMonstres.pv>0)
                    val indexChoix = readln().toInt()
                    if (indexChoix in joueur.sacAItems.indices) {
                        val objetChoisi = joueur.equipeMonstre[indexChoix]
                        if (choixMonstre.pv<=0)

                        println("Quel monstre voulez-vous envoyer ?")
                    // ton code pour choisir un autre monstre ici
                }

                else -> {
                    println("Choix invalide")
                }
            }

            // Le combat continue si les deux monstres ont encore des PV
            return monstreJoueur.pv > 0 && monstreSauvage.pv > 0
        }

    }





}

