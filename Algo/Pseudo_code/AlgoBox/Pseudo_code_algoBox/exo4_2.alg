<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER &quot; seconde(s)&quot;"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2defaut="" F2para="" F2lignes=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param maxBoucle="500000" epaisseurPoint="2" totalBoucles="5000000" epaisseurLigne="2" totalAffichages="1000" nbDecimales="8" arrondiAuto="vrai"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#heures" algoitem="heures EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#minutes" algoitem="minutes EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#secondes" algoitem="secondes EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#saisir les heures#0" algoitem="AFFICHER &quot;saisir les heures&quot;"/>
        <item code="2#heures#pasliste" algoitem="LIRE heures"/>
        <item code="4#Saisir les minutes#0" algoitem="AFFICHER &quot;Saisir les minutes&quot;"/>
        <item code="2#minutes#pasliste" algoitem="LIRE minutes"/>
        <item code="4#Saisir les secondes#0" algoitem="AFFICHER &quot;Saisir les secondes&quot;"/>
        <item code="2#secondes#pasliste" algoitem="LIRE secondes"/>
        <item code="5#secondes#secondes+1#pasliste" algoitem="secondes PREND_LA_VALEUR secondes+1"/>
        <item code="6#secondes==60" algoitem="SI (secondes==60) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="5#secondes#0#pasliste" algoitem="secondes PREND_LA_VALEUR 0"/>
            <item code="5#minutes#minutes+1#pasliste" algoitem="minutes PREND_LA_VALEUR minutes+1"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
        </item>
        <item code="6#minutes == 60" algoitem="SI (minutes == 60) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="5#minutes#0#pasliste" algoitem="minutes PREND_LA_VALEUR 0"/>
            <item code="5#heures#heures+1#pasliste" algoitem="heures PREND_LA_VALEUR heures+1"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
        </item>
        <item code="6#heures==24" algoitem="SI (heures==24) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="5#heures#0#pasliste" algoitem="heures PREND_LA_VALEUR 0"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
        </item>
        <item code="4#Dans une secondes il sera #0" algoitem="AFFICHER &quot;Dans une secondes il sera &quot;"/>
        <item code="3#heures#0#pasliste" algoitem="AFFICHER heures"/>
        <item code="4# heure(s) #0" algoitem="AFFICHER &quot; heure(s) &quot;"/>
        <item code="3#minutes#0#pasliste" algoitem="AFFICHER minutes"/>
        <item code="4# minute(s)#0" algoitem="AFFICHER &quot; minute(s)&quot;"/>
        <item code="4# et #0" algoitem="AFFICHER &quot; et &quot;"/>
        <item code="3#secondes#0#pasliste" algoitem="AFFICHER secondes"/>
        <item code="4# seconde(s)#0" algoitem="AFFICHER &quot; seconde(s)&quot;"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
