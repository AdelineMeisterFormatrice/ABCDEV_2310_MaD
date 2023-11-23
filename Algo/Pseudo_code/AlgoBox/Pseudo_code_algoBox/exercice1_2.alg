<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER volumeSphere"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2para="" F2defaut="" F2lignes="" F2etat="inactif"/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalAffichages="1000" epaisseurLigne="2" maxBoucle="500000" nbDecimales="8" totalBoucles="5000000" arrondiAuto="vrai" epaisseurPoint="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#rayonR" algoitem="rayonR EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#aireSphere" algoitem="aireSphere EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#volumeSphere" algoitem="volumeSphere EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Saisir le rayon#1" algoitem="AFFICHER &quot;Saisir le rayon&quot;"/>
        <item code="2#rayonR#pasliste" algoitem="LIRE rayonR"/>
        <item code="5#aireSphere#4*Math.PI*pow(rayonR,2)#pasliste" algoitem="aireSphere PREND_LA_VALEUR 4*Math.PI*pow(rayonR,2)"/>
        <item code="5#volumeSphere#4/3*Math.PI*pow(rayonR,3)#pasliste" algoitem="volumeSphere PREND_LA_VALEUR 4/3*Math.PI*pow(rayonR,3)"/>
        <item code="4#L'aire de la sphere est : #0" algoitem="AFFICHER &quot;L'aire de la sphere est : &quot;"/>
        <item code="3#aireSphere#1#pasliste" algoitem="AFFICHER aireSphere"/>
        <item code="4#Le volume de la sphere est : #0" algoitem="AFFICHER &quot;Le volume de la sphere est : &quot;"/>
        <item code="3#volumeSphere#1#pasliste" algoitem="AFFICHER volumeSphere"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
