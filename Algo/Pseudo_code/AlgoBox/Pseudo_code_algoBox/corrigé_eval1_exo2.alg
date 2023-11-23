<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description courant="AFFICHER mail2" texte=""/>
    <extension extnom="inactif"/>
    <fonction fctcode="" fctetat="inactif"/>
    <F2 F2defaut="" F2lignes="" F2para="" F2etat="inactif"/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalAffichages="1000" arrondiAuto="vrai" maxBoucle="500000" totalBoucles="5000000" epaisseurPoint="2" epaisseurLigne="2" nbDecimales="8"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="prenom EST_DU_TYPE CHAINE" code="1#CHAINE#prenom"/>
        <item algoitem="nom EST_DU_TYPE CHAINE" code="1#CHAINE#nom"/>
        <item algoitem="departement EST_DU_TYPE NOMBRE" code="1#NOMBRE#departement"/>
        <item algoitem="mail1 EST_DU_TYPE CHAINE" code="1#CHAINE#mail1"/>
        <item algoitem="mail2 EST_DU_TYPE CHAINE" code="1#CHAINE#mail2"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;Saisir votre prenom&quot;" code="4#Saisir votre prenom#0"/>
        <item algoitem="LIRE prenom" code="2#prenom#pasliste"/>
        <item algoitem="AFFICHER &quot;Saisir votre nom&quot;" code="4#Saisir votre nom#0"/>
        <item algoitem="LIRE nom" code="2#nom#pasliste"/>
        <item algoitem="AFFICHER &quot;Saisir votre departement&quot;" code="4#Saisir votre departement#0"/>
        <item algoitem="LIRE departement" code="2#departement#pasliste"/>
        <item algoitem="mail1 PREND_LA_VALEUR prenom+&quot;.&quot;+nom+&quot;.&quot;+departement+&quot;@arfp.asso.fr&quot;" code="5#mail1#prenom+&quot;.&quot;+nom+&quot;.&quot;+departement+&quot;@arfp.asso.fr&quot;#pasliste"/>
        <item algoitem="mail2 PREND_LA_VALEUR nom+departement+prenom+&quot;@arfp.asso.fr&quot;" code="5#mail2#nom+departement+prenom+&quot;@arfp.asso.fr&quot;#pasliste"/>
        <item algoitem="AFFICHER &quot;Mail 1 : &quot;" code="4#Mail 1 : #0"/>
        <item algoitem="AFFICHER mail1" code="3#mail1#1#pasliste"/>
        <item algoitem="AFFICHER &quot;Mail 2 : &quot;" code="4#Mail 2 : #0"/>
        <item algoitem="AFFICHER mail2" code="3#mail2#0#pasliste"/>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
