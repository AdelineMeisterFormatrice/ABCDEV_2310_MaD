<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="situation PREND_LA_VALEUR &quot;Refuser&quot;"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2defaut="" F2para="" F2lignes=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param maxBoucle="500000" epaisseurPoint="2" totalBoucles="5000000" epaisseurLigne="2" totalAffichages="1000" nbDecimales="8" arrondiAuto="vrai"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#age" algoitem="age EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#anneePermis" algoitem="anneePermis EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#nbAccident" algoitem="nbAccident EST_DU_TYPE NOMBRE"/>
        <item code="1#NOMBRE#anneeAssurance" algoitem="anneeAssurance EST_DU_TYPE NOMBRE"/>
        <item code="1#CHAINE#situation" algoitem="situation EST_DU_TYPE CHAINE"/>
        <item code="1#NOMBRE#point" algoitem="point EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Saisir l'age : #0" algoitem="AFFICHER &quot;Saisir l'age : &quot;"/>
        <item code="2#age#pasliste" algoitem="LIRE age"/>
        <item code="4#Saisir le nombre d'annees de permis : #0" algoitem="AFFICHER &quot;Saisir le nombre d'annees de permis : &quot;"/>
        <item code="2#anneePermis#pasliste" algoitem="LIRE anneePermis"/>
        <item code="4#Saisir le nombre d'accidents : #0" algoitem="AFFICHER &quot;Saisir le nombre d'accidents : &quot;"/>
        <item code="2#nbAccident#pasliste" algoitem="LIRE nbAccident"/>
        <item code="4#Saisir le nombre d'annees d'assurance : #0" algoitem="AFFICHER &quot;Saisir le nombre d'annees d'assurance : &quot;"/>
        <item code="2#anneeAssurance#pasliste" algoitem="LIRE anneeAssurance"/>
        <item code="5#point#0#pasliste" algoitem="point PREND_LA_VALEUR 0"/>
        <item code="6#age &lt; 25" algoitem="SI (age &lt; 25) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="5#point#point+1#pasliste" algoitem="point PREND_LA_VALEUR point+1"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
        </item>
        <item code="6#anneePermis &lt; 2" algoitem="SI (anneePermis &lt; 2) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="5#point#point+1#pasliste" algoitem="point PREND_LA_VALEUR point+1"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
        </item>
        <item code="5#point#point + nbAccident#pasliste" algoitem="point PREND_LA_VALEUR point + nbAccident"/>
        <item code="6#point &lt; 3 ET anneeAssurance > 5" algoitem="SI (point &lt; 3 ET anneeAssurance > 5) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="5#point#point-1#pasliste" algoitem="point PREND_LA_VALEUR point-1"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
        </item>
        <item code="6#point == -1" algoitem="SI (point == -1) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="5#situation#&quot;Bleu&quot;#pasliste" algoitem="situation PREND_LA_VALEUR &quot;Bleu&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="6#point == 0" algoitem="SI (point == 0) ALORS">
                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                    <item code="5#situation#&quot;Vert&quot;#pasliste" algoitem="situation PREND_LA_VALEUR &quot;Vert&quot;"/>
                    <item code="8#finsi" algoitem="FIN_SI"/>
                    <item code="9#sinon" algoitem="SINON">
                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                        <item code="6#point == 1" algoitem="SI (point == 1) ALORS">
                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                            <item code="5#situation#&quot;Orange&quot;#pasliste" algoitem="situation PREND_LA_VALEUR &quot;Orange&quot;"/>
                            <item code="8#finsi" algoitem="FIN_SI"/>
                            <item code="9#sinon" algoitem="SINON">
                                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                <item code="6#point == 2" algoitem="SI (point == 2) ALORS">
                                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                    <item code="5#situation#&quot;Rouge&quot;#pasliste" algoitem="situation PREND_LA_VALEUR &quot;Rouge&quot;"/>
                                    <item code="8#finsi" algoitem="FIN_SI"/>
                                    <item code="9#sinon" algoitem="SINON">
                                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                        <item code="5#situation#&quot;Refuser&quot;#pasliste" algoitem="situation PREND_LA_VALEUR &quot;Refuser&quot;"/>
                                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                                    </item>
                                </item>
                                <item code="11#finsinon" algoitem="FIN_SINON"/>
                            </item>
                        </item>
                        <item code="11#finsinon" algoitem="FIN_SINON"/>
                    </item>
                </item>
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
        <item code="4#Votre situation : #0" algoitem="AFFICHER &quot;Votre situation : &quot;"/>
        <item code="3#situation#0#pasliste" algoitem="AFFICHER situation"/>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
