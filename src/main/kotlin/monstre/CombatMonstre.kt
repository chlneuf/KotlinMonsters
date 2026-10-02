package org.example.monstre

import org.example.joueur

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
                }





}

