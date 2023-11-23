<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER &quot;Non Imposable&quot;"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2defaut="" F2para="" F2lignes=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param maxBoucle="500000" epaisseurPoint="2" totalBoucles="5000000" epaisseurLigne="2" totalAffichages="1000" nbDecimales="8" arrondiAuto="vrai"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#CHAINE#genre" algoitem="genre EST_DU_TYPE CHAINE"/>
        <item code="1#NOMBRE#age" algoitem="age EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Saisir le genre (M/F) : #0" algoitem="AFFICHER &quot;Saisir le genre (M/F) : &quot;"/>
        <item code="2#genre#pasliste" algoitem="LIRE genre"/>
        <item code="4#Saisir l'age#0" algoitem="AFFICHER &quot;Saisir l'age&quot;"/>
        <item code="2#age#pasliste" algoitem="LIRE age"/>
        <item code="6#genre == &quot;M&quot; ET age > 20 OU genre == &quot;F&quot; ET (age > 18 ET age &lt; 35)" algoitem="SI (genre == &quot;M&quot; ET age > 20 OU genre == &quot;F&quot; ET (age > 18 ET age &lt; 35)) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4#Imposable#0" algoitem="AFFICHER &quot;Imposable&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="4#Non Imposable#0" algoitem="AFFICHER &quot;Non Imposable&quot;"/>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
