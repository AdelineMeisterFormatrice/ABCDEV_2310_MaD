<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER moyenne"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2defaut="" F2lignes="" F2etat="inactif"/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param nbDecimales="8" maxBoucle="500000" epaisseurLigne="2" totalAffichages="1000" totalBoucles="5000000" epaisseurPoint="2" arrondiAuto="vrai"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="nombre1 EST_DU_TYPE NOMBRE" code="1#NOMBRE#nombre1"/>
        <item algoitem="nombre2 EST_DU_TYPE NOMBRE" code="1#NOMBRE#nombre2"/>
        <item algoitem="moyenne EST_DU_TYPE NOMBRE" code="1#NOMBRE#moyenne"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Saisir le 1er nombre&quot;" code="4#Saisir le 1er nombre#1"/>
        <item algoitem="LIRE nombre1" code="2#nombre1#pasliste"/>
        <item algoitem="AFFICHER &quot;Saisir le 2eme nombre&quot;" code="4#Saisir le 2eme nombre#1"/>
        <item algoitem="LIRE nombre2" code="2#nombre2#pasliste"/>
        <item algoitem="moyenne PREND_LA_VALEUR (nombre1 + nombre2)/2" code="5#moyenne#(nombre1 + nombre2)/2#pasliste"/>
        <item algoitem="AFFICHER &quot;La moyenne est : &quot;" code="4#La moyenne est : #0"/>
        <item algoitem="AFFICHER moyenne" code="3#moyenne#0#pasliste"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
