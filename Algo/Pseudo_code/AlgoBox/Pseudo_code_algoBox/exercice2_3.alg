<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER &quot;c &lt;= b &lt;= a&quot;"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2para="" F2etat="inactif" F2lignes="" F2defaut=""/>
    <repere repcode="-10#10#-10#10#2#2" repetat="inactif"/>
    <param maxBoucle="500000" totalAffichages="1000" totalBoucles="5000000" epaisseurPoint="2" arrondiAuto="vrai" nbDecimales="8" epaisseurLigne="2"/>
    <item algoitem="FONCTIONS_UTILISEES" code="200#declarationfonctions"/>
    <item algoitem="VARIABLES" code="100#declarationsvariables">
        <item algoitem="a EST_DU_TYPE NOMBRE" code="1#NOMBRE#a"/>
        <item algoitem="b EST_DU_TYPE NOMBRE" code="1#NOMBRE#b"/>
        <item algoitem="c EST_DU_TYPE NOMBRE" code="1#NOMBRE#c"/>
        <item algoitem="inferieurEgale EST_DU_TYPE CHAINE" code="1#CHAINE#inferieurEgale"/>
    </item>
    <item algoitem="DEBUT_ALGORITHME" code="101#debutalgo">
        <item algoitem="AFFICHER &quot;saisir le nombre a&quot;" code="4#saisir le nombre a#0"/>
        <item algoitem="LIRE a" code="2#a#pasliste"/>
        <item algoitem="AFFICHER &quot;saisir le nombre b&quot;" code="4#saisir le nombre b#0"/>
        <item algoitem="LIRE b" code="2#b#pasliste"/>
        <item algoitem="AFFICHER &quot;saisir le nombre c&quot;" code="4#saisir le nombre c#0"/>
        <item algoitem="LIRE c" code="2#c#pasliste"/>
        <item algoitem="inferieurEgale PREND_LA_VALEUR &quot; &lt;= &quot;" code="5#inferieurEgale#&quot; &lt;= &quot;#pasliste"/>
        <item algoitem="SI (a&lt;=b ET a&lt;=c) ALORS" code="6#a&lt;=b ET a&lt;=c">
            <item algoitem="DEBUT_SI" code="7#debutsi"/>
            <item algoitem="SI (b&lt;=c) ALORS" code="6#b&lt;=c">
                <item algoitem="DEBUT_SI" code="7#debutsi"/>
                <item algoitem="AFFICHER &quot;a &lt;= b &lt;= c&quot;" code="4#a &lt;= b &lt;= c#0"/>
                <item algoitem="FIN_SI" code="8#finsi"/>
                <item algoitem="SINON" code="9#sinon">
                    <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                    <item algoitem="AFFICHER &quot;a &lt;= c &lt;= b&quot;" code="4#a &lt;= c &lt;= b#0"/>
                    <item algoitem="FIN_SINON" code="11#finsinon"/>
                </item>
            </item>
            <item algoitem="FIN_SI" code="8#finsi"/>
            <item algoitem="SINON" code="9#sinon">
                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                <item algoitem="SI (b &lt;= a ET b &lt;= c) ALORS" code="6#b &lt;= a ET b &lt;= c">
                    <item algoitem="DEBUT_SI" code="7#debutsi"/>
                    <item algoitem="SI (a &lt;= c) ALORS" code="6#a &lt;= c">
                        <item algoitem="DEBUT_SI" code="7#debutsi"/>
                        <item algoitem="AFFICHER &quot;b &lt;= a &lt;= c&quot;" code="4#b &lt;= a &lt;= c#0"/>
                        <item algoitem="FIN_SI" code="8#finsi"/>
                        <item algoitem="SINON" code="9#sinon">
                            <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                            <item algoitem="AFFICHER &quot;b &lt;= c &lt;= a&quot;" code="4#b &lt;= c &lt;= a#0"/>
                            <item algoitem="FIN_SINON" code="11#finsinon"/>
                        </item>
                    </item>
                    <item algoitem="FIN_SI" code="8#finsi"/>
                    <item algoitem="SINON" code="9#sinon">
                        <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                        <item algoitem="SI (a&lt;= b) ALORS" code="6#a&lt;= b">
                            <item algoitem="DEBUT_SI" code="7#debutsi"/>
                            <item algoitem="AFFICHER &quot;c &lt;= a &lt;= b&quot;" code="4#c &lt;= a &lt;= b#0"/>
                            <item algoitem="FIN_SI" code="8#finsi"/>
                            <item algoitem="SINON" code="9#sinon">
                                <item algoitem="DEBUT_SINON" code="10#debutsinon"/>
                                <item algoitem="AFFICHER &quot;c &lt;= b &lt;= a&quot;" code="4#c &lt;= b &lt;= a#0"/>
                                <item algoitem="FIN_SINON" code="11#finsinon"/>
                            </item>
                        </item>
                        <item algoitem="FIN_SINON" code="11#finsinon"/>
                    </item>
                </item>
                <item algoitem="FIN_SINON" code="11#finsinon"/>
            </item>
        </item>
    </item>
    <item algoitem="FIN_ALGORITHME" code="102#finalgo"/>
</Algo>
