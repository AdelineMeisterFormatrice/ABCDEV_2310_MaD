<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER &quot;Le produit des 2 nombres est nul&quot;"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2defaut="" F2para="" F2lignes=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param maxBoucle="500000" epaisseurPoint="2" totalBoucles="5000000" epaisseurLigne="2" totalAffichages="1000" nbDecimales="8" arrondiAuto="vrai"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#nombre1" algoitem="nombre1 EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#nombre2" algoitem="nombre2 EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Saisir le 1er nombre#0" algoitem="AFFICHER &quot;Saisir le 1er nombre&quot;"/>
        <item code="2#nombre1#pasliste" algoitem="LIRE nombre1"/>
        <item code="4#Saisir le 2eme nombre#0" algoitem="AFFICHER &quot;Saisir le 2eme nombre&quot;"/>
        <item code="2#nombre2#pasliste" algoitem="LIRE nombre2"/>
        <item code="6#nombre1 == 0 OU nombre2 == 0" algoitem="SI (nombre1 == 0 OU nombre2 == 0) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4#Le produit des 2 nombres est nul#0" algoitem="AFFICHER &quot;Le produit des 2 nombres est nul&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="6#(nombre1 > 0 ET nombre2 > 0) OU (nombre1 &lt; 0 ET nombre2 &lt; 0)" algoitem="SI ((nombre1 > 0 ET nombre2 > 0) OU (nombre1 &lt; 0 ET nombre2 &lt; 0)) ALORS">
                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                    <item code="4#le produit des 2 nombre est positif#0" algoitem="AFFICHER &quot;le produit des 2 nombre est positif&quot;"/>
                    <item code="8#finsi" algoitem="FIN_SI"/>
                    <item code="9#sinon" algoitem="SINON">
                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                        <item code="4#le produit des 2 nombre est negatif#0" algoitem="AFFICHER &quot;le produit des 2 nombre est negatif&quot;"/>
                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                    </item>
                </item>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
