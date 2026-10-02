package org.example.monstre

import org.example.dresseur.Entraineur
import org.example.especeGalum
import java.security.SecureRandom
import kotlin.math.pow


class IndividuMonstre() {
    constructor(i: Int, string: String, d: Double, especeAquamy: EspeceMonstre) : this()

    var id = 0
    var nom = "in"
    var espece = especeGalum
    var entraineur: Entraineur? = null
    val ExpInit = 0.0

    var niveau: Int = 1

    var attaque: Int = this.espece.baseAttaque + (-2..2).random()

    var défense: Int = this.espece.baseDefense + (-2..2).random()

    var vitesse: Int = 50

    var attaqueSpe: Int = 21

    var défenseSpe: Int = 32

    var pvMax: Int = 100 + 5

    var potentiel: Double = 0.5 + SecureRandom().nextDouble(1.5)


    var exp: Double = 20.0
        get() = field
        set(value) {
            field = value
            var estNiveau1 = false
            if (niveau == 1) {
                estNiveau1 = true
            }
            if (field >= palierExp(niveau)) {
                levelUp()
                if (estNiveau1 == false) {
                    println("Me monstre $nom est maintenant niveau $niveau !")
                }
            }

        }

    var pv: Int = this.pvMax
        get() = field
        set(nouveauPv) {
            field = pvMax
        }


    init {
        this.exp = ExpInit // applique le setter et déclenche un éventuel level-up
    }

    //palierExp(100*niveau - 1)


    /**
     *  @property pv  Points de vie actuels.
     * Ne peut pas être inférieur à 0 ni supérieur à [pvMax].
     */


    fun levelUp() {
        this.attaque += ((this.espece.modAttaque * this.potentiel) + (-2..2).random()).toInt()
        //TODO
        this.niveau += 1
    }

    /**
     * Calcule l'expérience totale nécessaire pour atteindre un niveau donné.
     *
     * @param niveau Niveau cible.
     * @return Expérience cumulée nécessaire pour atteindre ce niveau.
     */
    fun palierExp(niveau: Int): Double {

        return (100 * (niveau - 1)).toDouble().pow(2)

    }

    /**
     * Attaque un autre [IndividuMonstre] et inflige des dégâts.
     *
     * Les dégâts sont calculés de manière très simple :
     * dégâts = attaque - (défense / 2) (minimum 1 dégât).
     *
     * @param cible Monstre cible de l'attaque.
     */
    fun attaquer(cible: IndividuMonstre) {
        val degatBrut = this.attaque
        var degatTotal = degatBrut - (cible.défense / 2)

        if (degatTotal < 1) {
            degatTotal = 1
        }
        val pvAvant = cible.pv
        cible.pv -= degatTotal
        val pvApres = cible.pv
        println("[attaqueSpe] inflige (pvAvant - pvApres dégâts à [cible.nom]")

        /**
         * Demande au joueur de renommer le monstre.
         * Si l'utilisateur entre un texte vide, le nom n'est pas modifié.
         */
        fun renommer() {
            println("Renommer$nom?")
            val nouveauNom = readLine()
            if (nouveauNom != null && nouveauNom.isNotEmpty()) {
                this.nom = nouveauNom


            }
        }
    }
}




