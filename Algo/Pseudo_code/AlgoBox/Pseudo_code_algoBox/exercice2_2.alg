<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="inferieurEgale PREND_LA_VALEUR &quot; &lt;= &quot;" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2para="" F2lignes="" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param epaisseurLigne="2" maxBoucle="500000" epaisseurPoint="2" totalBoucles="5000000" nbDecimales="8" totalAffichages="1000" arrondiAuto="vrai"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="a EST_DU_TYPE NOMBRE" code="1#NOMBRE#a"/>
        <item algoitem="b EST_DU_TYPE NOMBRE" code="1#NOMBRE#b"/>
        <item algoitem="inferieurEgale EST_DU_TYPE CHAINE" code="1#CHAINE#inferieurEgale"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="inferieurEgale PREND_LA_VALEUR &quot; &lt;= &quot;" code="5#inferieurEgale#&quot; &lt;= &quot;#pasliste"/>
        <item algoitem="AFFICHER &quot;Saisir le nombre a&quot;" code="4#Saisir le nombre a#0"/>
        <item algoitem="LIRE a" code="2#a#pasliste"/>
        <item algoitem="AFFICHER &quot;Saisir le nombre b&quot;" code="4#Saisir le nombre b#0"/>
        <item algoitem="LIRE b" code="2#b#pasliste"/>
        <item algoitem="SI (a&lt;=b) ALORS" code="6#a&lt;=b">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="AFFICHER a" code="3#a#0#pasliste"/>
            <item algoitem="AFFICHER inferieurEgale" code="3#inferieurEgale#0#pasliste"/>
            <item algoitem="AFFICHER b" code="3#b#0#pasliste"/>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon">
                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                <item algoitem="AFFICHER b" code="3#b#0#pasliste"/>
                <item algoitem="AFFICHER inferieurEgale" code="3#inferieurEgale#0#pasliste"/>
                <item algoitem="AFFICHER a" code="3#a#0#pasliste"/>
                <item algoitem="FIN_SINON" code="11#finsinon"/>
            </item>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
