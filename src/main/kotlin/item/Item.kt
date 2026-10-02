package org.example.item

import org.example.monstre.IndividuMonstre

open class Item(var id: Int,var nom: String,var description: String) {
    open fun utiliser(monstreSauvage: org.example.monstre.IndividuMonstre) {}

}