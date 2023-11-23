<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER &quot; essais&quot;"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2lignes="" F2etat="inactif" F2defaut=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param totalAffichages="1000" epaisseurLigne="2" arrondiAuto="vrai" totalBoucles="5000000" epaisseurPoint="2" maxBoucle="500000" nbDecimales="8"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#nb" algoitem="nb EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#nbJoueur" algoitem="nbJoueur EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#max" algoitem="max EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#min" algoitem="min EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#essai" algoitem="essai EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#win" algoitem="win EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="5#min#1#pasliste" algoitem="min PREND_LA_VALEUR 1"/>
        <item code="5#max#100#pasliste" algoitem="max PREND_LA_VALEUR 100"/>
        <item code="5#nb#ALGOBOX_ALEA_ENT(min,max)#pasliste" algoitem="nb PREND_LA_VALEUR ALGOBOX_ALEA_ENT(min,max)"/>
        <item code="5#essai#0#pasliste" algoitem="essai PREND_LA_VALEUR 0"/>
        <item code="5#win#0#pasliste" algoitem="win PREND_LA_VALEUR 0"/>
        <item code="15#win == 0" algoitem="TANT_QUE (win == 0) FAIRE">
            <item code="16#debuttantque" algoitem="DEBUT_TANT_QUE"/>
            <item code="4#Saisir un nombre entre #0" algoitem="AFFICHER &quot;Saisir un nombre entre &quot;"/>
            <item code="3#min#0#pasliste" algoitem="AFFICHER min"/>
            <item code="4# et #0" algoitem="AFFICHER &quot; et &quot;"/>
            <item code="3#max#0#pasliste" algoitem="AFFICHER max"/>
            <item code="2#nbJoueur#pasliste" algoitem="LIRE nbJoueur"/>
            <item code="6#nbJoueur > nb" algoitem="SI (nbJoueur > nb) ALORS">
                <item code="7#debutsi" algoitem="DEBUT_SI"/>
                <item code="4#C'est moins !!!#1" algoitem="AFFICHER &quot;C'est moins !!!&quot;"/>
                <item code="5#max#nbJoueur#pasliste" algoitem="max PREND_LA_VALEUR nbJoueur"/>
                <item code="8#finsi" algoitem="FIN_SI"/>
                <item code="9#sinon" algoitem="SINON">
                    <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                    <item code="6#nbJoueur &lt; nb" algoitem="SI (nbJoueur &lt; nb) ALORS">
                        <item code="7#debutsi" algoitem="DEBUT_SI"/>
                        <item code="4#C'est plus !!!#1" algoitem="AFFICHER &quot;C'est plus !!!&quot;"/>
                        <item code="5#min#nbJoueur#pasliste" algoitem="min PREND_LA_VALEUR nbJoueur"/>
                        <item code="8#finsi" algoitem="FIN_SI"/>
                        <item code="9#sinon" algoitem="SINON">
                            <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                            <item code="5#win#1#pasliste" algoitem="win PREND_LA_VALEUR 1"/>
                            <item code="11#finsinon" algoitem="FIN_SINON"/>
                        </item>
                    </item>
                    <item code="11#finsinon" algoitem="FIN_SINON"/>
                </item>
            </item>
            <item code="5#essai#essai+1#pasliste" algoitem="essai PREND_LA_VALEUR essai+1"/>
            <item code="17#fintantque" algoitem="FIN_TANT_QUE"/>
        </item>
        <item code="4#Bravo vous avez gagné en #0" algoitem="AFFICHER &quot;Bravo vous avez gagné en &quot;"/>
        <item code="3#essai#0#pasliste" algoitem="AFFICHER essai"/>
        <item code="4# essais#0" algoitem="AFFICHER &quot; essais&quot;"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
