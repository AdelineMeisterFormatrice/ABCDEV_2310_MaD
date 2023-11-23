<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER interetComposer"/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2para="" F2defaut="" F2lignes="" F2etat="inactif"/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalAffichages="1000" epaisseurLigne="2" maxBoucle="500000" nbDecimales="8" totalBoucles="5000000" arrondiAuto="vrai" epaisseurPoint="2"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#somme" algoitem="somme EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#interet" algoitem="interet EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#nbAnnee" algoitem="nbAnnee EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#interetSimple" algoitem="interetSimple EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#interetComposer" algoitem="interetComposer EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Saisir la somme #1" algoitem="AFFICHER &quot;Saisir la somme &quot;"/>
        <item code="2#somme#pasliste" algoitem="LIRE somme"/>
        <item code="4#Saisir l'interet#1" algoitem="AFFICHER &quot;Saisir l'interet&quot;"/>
        <item code="2#interet#pasliste" algoitem="LIRE interet"/>
        <item code="4#Saisir le nombre d'annee#1" algoitem="AFFICHER &quot;Saisir le nombre d'annee&quot;"/>
        <item code="2#nbAnnee#pasliste" algoitem="LIRE nbAnnee"/>
        <item code="5#interetSimple#somme*(1+nbAnnee*interet/100)#pasliste" algoitem="interetSimple PREND_LA_VALEUR somme*(1+nbAnnee*interet/100)"/>
        <item code="5#interetComposer#somme*pow(1+interet/100,nbAnnee)#pasliste" algoitem="interetComposer PREND_LA_VALEUR somme*pow(1+interet/100,nbAnnee)"/>
        <item code="4#La valeur acquise avec un ineret simple est : #0" algoitem="AFFICHER &quot;La valeur acquise avec un ineret simple est : &quot;"/>
        <item code="3#interetSimple#1#pasliste" algoitem="AFFICHER interetSimple"/>
        <item code="4#La valeur acquise avec un interet composer est : #0" algoitem="AFFICHER &quot;La valeur acquise avec un interet composer est : &quot;"/>
        <item code="3#interetComposer#0#pasliste" algoitem="AFFICHER interetComposer"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
