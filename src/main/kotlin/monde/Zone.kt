package org.example.monde

import org.example.monstre.EspeceMonstre

class Zone(id: Int, nom: String, especesMonstres: MutableList<EspeceMonstre>) {
    lateinit var zoneSuivante: Zone
    lateinit var zonePrecedente: Zone
    var id = 10
    val nom = "C"
    var expZone = "more"
    var especeMonstre = 5
    val zoneSuivant = null
    val zonePrecedante = null
    //TODO genereMonstre
    //TODO recontreMonstre
  }