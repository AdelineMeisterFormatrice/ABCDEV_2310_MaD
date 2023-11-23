<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER aire" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2defaut="" F2lignes="" F2para="" F2etat="inactif"/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalAffichages="1000" arrondiAuto="vrai" maxBoucle="500000" totalBoucles="5000000" epaisseurPoint="2" epaisseurLigne="2" nbDecimales="8"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="longueur EST_DU_TYPE NOMBRE" code="1#NOMBRE#longueur"/>
        <item algoitem="largeur EST_DU_TYPE NOMBRE" code="1#NOMBRE#largeur"/>
        <item algoitem="perimetre EST_DU_TYPE NOMBRE" code="1#NOMBRE#perimetre"/>
        <item algoitem="aire EST_DU_TYPE NOMBRE" code="1#NOMBRE#aire"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Saisir la longueur&quot;" code="4#Saisir la longueur#0"/>
        <item algoitem="LIRE longueur" code="2#longueur#pasliste"/>
        <item algoitem="AFFICHER &quot;Saisir la largeur&quot;" code="4#Saisir la largeur#0"/>
        <item algoitem="LIRE largeur" code="2#largeur#pasliste"/>
        <item algoitem="perimetre PREND_LA_VALEUR (longueur+largeur)*2" code="5#perimetre#(longueur+largeur)*2#pasliste"/>
        <item algoitem="aire PREND_LA_VALEUR longueur*largeur" code="5#aire#longueur*largeur#pasliste"/>
        <item algoitem="AFFICHER &quot;le perimetre du rectangle : &quot;" code="4#le perimetre du rectangle : #0"/>
        <item algoitem="AFFICHER perimetre" code="3#perimetre#1#pasliste"/>
        <item algoitem="AFFICHER &quot;L'aire du rectangle : &quot;" code="4#L'aire du rectangle : #0"/>
        <item algoitem="AFFICHER aire" code="3#aire#0#pasliste"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
