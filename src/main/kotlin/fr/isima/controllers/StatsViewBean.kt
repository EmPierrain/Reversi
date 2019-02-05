package fr.isima.controllers

import fr.isima.business.SessionUtilisation
import fr.isima.business.Utilisateur
import fr.isima.business.Utilisateurs

import java.util.Objects

class StatsViewBean internal constructor(private val utilisateurs: Utilisateurs, private val sessionUtilisation: SessionUtilisation) {

    val nombreSessionEnCours: Int
        get() = utilisateur.nombreSessionUtilisation

    private val utilisateur: Utilisateur
        get() = sessionUtilisation.utilisateur

    val nombreGameJoueePourLaSessionEnCours: Int
        get() = sessionUtilisation.nombreDeCitationVue

    val nombreGameJoueeAuTotal: Int
        get() = utilisateurs.nombreCitationVuAuTotal

    val nombreDeGamePourLUtilisateur: Int
        get() = utilisateur.nombreCitationVue

}
