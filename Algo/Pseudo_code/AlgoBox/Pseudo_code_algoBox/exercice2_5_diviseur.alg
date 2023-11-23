<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER &quot; diviseur&quot;"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2para="" F2lignes="" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param maxBoucle="500000" totalBoucles="5000000" arrondiAuto="vrai" epaisseurPoint="2" totalAffichages="1000" epaisseurLigne="2" nbDecimales="8"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#nb" algoitem="nb EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#i" algoitem="i EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#compteur" algoitem="compteur EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Saisir un nombre entier#0" algoitem="AFFICHER &quot;Saisir un nombre entier&quot;"/>
        <item code="2#nb#pasliste" algoitem="LIRE nb"/>
        <item code="5#compteur#0#pasliste" algoitem="compteur PREND_LA_VALEUR 0"/>
        <item code="12#i#2#nb-1" algoitem="POUR i ALLANT_DE 2 A nb-1">
            <item code="13#debutpour" algoitem="DEBUT_POUR"/>
            <item code="6#nb %  i == 0" algoitem="SI (nb %  i == 0) ALORS">
                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                <item code="3#nb#0#pasliste" algoitem="AFFICHER nb"/>
                <item code="4# est divisible par : #0" algoitem="AFFICHER &quot; est divisible par : &quot;"/>
                <item code="3#i#1#pasliste" algoitem="AFFICHER i"/>
                <item code="5#compteur#compteur+1#pasliste" algoitem="compteur PREND_LA_VALEUR compteur+1"/>
                <item code="8#finsi" algoitem="FIN_SI"/>
            </item>
            <item code="14#finpour" algoitem="FIN_POUR"/>
        </item>
        <item code="4#Le nombre #0" algoitem="AFFICHER &quot;Le nombre &quot;"/>
        <item code="3#nb#0#pasliste" algoitem="AFFICHER nb"/>
        <item code="4# a #0" algoitem="AFFICHER &quot; a &quot;"/>
        <item code="3#compteur#0#pasliste" algoitem="AFFICHER compteur"/>
        <item code="4# diviseur#0" algoitem="AFFICHER &quot; diviseur&quot;"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
