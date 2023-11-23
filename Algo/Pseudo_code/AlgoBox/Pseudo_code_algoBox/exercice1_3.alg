<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER aire"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2para="" F2defaut="" F2lignes="" F2etat="inactif"/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalAffichages="1000" epaisseurLigne="2" maxBoucle="500000" nbDecimales="8" totalBoucles="5000000" arrondiAuto="vrai" epaisseurPoint="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#rayonR" algoitem="rayonR EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#angleA" algoitem="angleA EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#aire" algoitem="aire EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Saisir le rayon#1" algoitem="AFFICHER &quot;Saisir le rayon&quot;"/>
        <item code="2#rayonR#pasliste" algoitem="LIRE rayonR"/>
        <item code="4#Saisir l'angle#1" algoitem="AFFICHER &quot;Saisir l'angle&quot;"/>
        <item code="2#angleA#pasliste" algoitem="LIRE angleA"/>
        <item code="5#aire#(Math.PI*pow(rayonR,2)*angleA)/360#pasliste" algoitem="aire PREND_LA_VALEUR (Math.PI*pow(rayonR,2)*angleA)/360"/>
        <item code="4#L'aire du secteur circulaire est : #0" algoitem="AFFICHER &quot;L'aire du secteur circulaire est : &quot;"/>
        <item code="3#aire#0#pasliste" algoitem="AFFICHER aire"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
