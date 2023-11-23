<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="compteur PREND_LA_VALEUR compteur+1"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2defaut="" F2para="" F2lignes=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param maxBoucle="500000" epaisseurPoint="2" totalBoucles="5000000" epaisseurLigne="2" totalAffichages="1000" nbDecimales="8" arrondiAuto="vrai"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#compteur" algoitem="compteur EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#i" algoitem="i EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="5#compteur#0#pasliste" algoitem="compteur PREND_LA_VALEUR 0"/>
        <item code="12#i#1#10" algoitem="POUR i ALLANT_DE 1 A 10">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="5#compteur#compteur+1#pasliste" algoitem="compteur PREND_LA_VALEUR compteur+1"/>
            <item code="4#Valeur du compteur : #0" algoitem="AFFICHER &quot;Valeur du compteur : &quot;"/>
            <item code="3#compteur#1#pasliste" algoitem="AFFICHER compteur"/>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
