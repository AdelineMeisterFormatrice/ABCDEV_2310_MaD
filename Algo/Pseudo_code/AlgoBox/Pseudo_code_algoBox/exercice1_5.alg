<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER &quot;Valeur de b : &quot;" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2defaut="" F2para="" F2lignes="" F2etat="inactif"/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param epaisseurLigne="2" maxBoucle="500000" arrondiAuto="vrai" totalAffichages="1000" totalBoucles="5000000" epaisseurPoint="2" nbDecimales="8"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#a" algoitem="a EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#b" algoitem="b EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#c" algoitem="c EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Saisir la valeur de a#1" algoitem="AFFICHER &quot;Saisir la valeur de a&quot;"/>
        <item code="2#a#pasliste" algoitem="LIRE a"/>
        <item code="4#saisir la valeur de b#1" algoitem="AFFICHER &quot;saisir la valeur de b&quot;"/>
        <item code="2#b#pasliste" algoitem="LIRE b"/>
        <item code="4#Valeur de a : #0" algoitem="AFFICHER &quot;Valeur de a : &quot;"/>
        <item code="3#a#1#pasliste" algoitem="AFFICHER a"/>
        <item code="4#Valeur de b : #0" algoitem="AFFICHER &quot;Valeur de b : &quot;"/>
        <item code="3#b#1#pasliste" algoitem="AFFICHER b"/>
        <item code="5#c#a#pasliste" algoitem="c PREND_LA_VALEUR a"/>
        <item code="5#a#b#pasliste" algoitem="a PREND_LA_VALEUR b"/>
        <item code="5#b#c#pasliste" algoitem="b PREND_LA_VALEUR c"/>
        <item code="4#valeur de a : #0" algoitem="AFFICHER &quot;valeur de a : &quot;"/>
        <item code="3#a#1#pasliste" algoitem="AFFICHER a"/>
        <item code="4#Valeur de b : #0" algoitem="AFFICHER &quot;Valeur de b : &quot;"/>
        <item code="3#b#0#pasliste" algoitem="AFFICHER b"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
