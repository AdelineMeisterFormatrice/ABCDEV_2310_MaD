<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER &quot; Euros&quot;"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2defaut="" F2para="" F2lignes=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param maxBoucle="500000" epaisseurPoint="2" totalBoucles="5000000" epaisseurLigne="2" totalAffichages="1000" nbDecimales="8" arrondiAuto="vrai"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#nb" algoitem="nb EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#prix" algoitem="prix EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Saisir le nombre de photocopies#0" algoitem="AFFICHER &quot;Saisir le nombre de photocopies&quot;"/>
        <item code="2#nb#pasliste" algoitem="LIRE nb"/>
        <item code="6#nb &lt;= 10" algoitem="SI (nb &lt;= 10) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="5#prix#nb * 0.1#pasliste" algoitem="prix PREND_LA_VALEUR nb * 0.1"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="6#nb &lt;= 30" algoitem="SI (nb &lt;= 30) ALORS">
                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                    <item code="5#prix#10 * 0.1 + (nb - 10) * 0.09#pasliste" algoitem="prix PREND_LA_VALEUR 10 * 0.1 + (nb - 10) * 0.09"/>
                    <item code="8#finsi" algoitem="FIN_SI"/>
                    <item code="9#sinon" algoitem="SINON">
                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                        <item code="5#prix#10 * 0.1 + 20 * 0.09 + (nb - 30) * 0.08#pasliste" algoitem="prix PREND_LA_VALEUR 10 * 0.1 + 20 * 0.09 + (nb - 30) * 0.08"/>
                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                    </item>
                </item>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
        <item code="4#Le prix total est : #0" algoitem="AFFICHER &quot;Le prix total est : &quot;"/>
        <item code="3#prix#0#pasliste" algoitem="AFFICHER prix"/>
        <item code="4# Euros#0" algoitem="AFFICHER &quot; Euros&quot;"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
