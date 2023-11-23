<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER &quot;Ballotage defavorable&quot;"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2defaut="" F2para="" F2lignes=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param maxBoucle="500000" epaisseurPoint="2" totalBoucles="5000000" epaisseurLigne="2" totalAffichages="1000" nbDecimales="8" arrondiAuto="vrai"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#candidat1" algoitem="candidat1 EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#candidat2" algoitem="candidat2 EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#candidat3" algoitem="candidat3 EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#candidat4" algoitem="candidat4 EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Saisir le score du candidat 1 : #0" algoitem="AFFICHER &quot;Saisir le score du candidat 1 : &quot;"/>
        <item code="2#candidat1#pasliste" algoitem="LIRE candidat1"/>
        <item code="4#Saisir le score du candidat 2 : #0" algoitem="AFFICHER &quot;Saisir le score du candidat 2 : &quot;"/>
        <item code="2#candidat2#pasliste" algoitem="LIRE candidat2"/>
        <item code="4#Saisir le score du candidat 3 : #0" algoitem="AFFICHER &quot;Saisir le score du candidat 3 : &quot;"/>
        <item code="2#candidat3#pasliste" algoitem="LIRE candidat3"/>
        <item code="4#Saisir le score du candidat 4 : #0" algoitem="AFFICHER &quot;Saisir le score du candidat 4 : &quot;"/>
        <item code="2#candidat4#pasliste" algoitem="LIRE candidat4"/>
        <item code="6#candidat1 > 50" algoitem="SI (candidat1 > 50) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4#Elu au 1er tour#0" algoitem="AFFICHER &quot;Elu au 1er tour&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="6#candidat2 > 50 OU candidat3 > 50 OU candidat4 > 50 OU candidat1 &lt; 12.5" algoitem="SI (candidat2 > 50 OU candidat3 > 50 OU candidat4 > 50 OU candidat1 &lt; 12.5) ALORS">
                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                    <item code="4#Battu, eliminé, sorti !!!#0" algoitem="AFFICHER &quot;Battu, eliminé, sorti !!!&quot;"/>
                    <item code="8#finsi" algoitem="FIN_SI"/>
                    <item code="9#sinon" algoitem="SINON">
                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                        <item code="6#candidat1 >= candidat2 ET candidat1 >= candidat3 ET candidat1 >= candidat4" algoitem="SI (candidat1 >= candidat2 ET candidat1 >= candidat3 ET candidat1 >= candidat4) ALORS">
                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                            <item code="4#Ballotage favorable#0" algoitem="AFFICHER &quot;Ballotage favorable&quot;"/>
                            <item code="8#finsi" algoitem="FIN_SI"/>
                            <item code="9#sinon" algoitem="SINON">
                                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                <item code="4#Ballotage defavorable#0" algoitem="AFFICHER &quot;Ballotage defavorable&quot;"/>
                                <item code="11#finsinon" algoitem="FIN_SINON"/>
                            </item>
                        </item>
                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                    </item>
                </item>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
