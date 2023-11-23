<?xml version="1.0" encoding="UTF-8"?>
<Algo>
    <description texte="" courant="AFFICHER &quot;Votre enfant est trop jeune qu'il grandisse encore un peu !!!&quot;"/>
    <extension extnom="inactif"/>
    <fonction fctetat="inactif" fctcode=""/>
    <F2 F2etat="inactif" F2defaut="" F2para="" F2lignes=""/>
    <repere repetat="inactif" repcode="-10#10#-10#10#2#2"/>
    <param maxBoucle="500000" epaisseurPoint="2" totalBoucles="5000000" epaisseurLigne="2" totalAffichages="1000" nbDecimales="8" arrondiAuto="vrai"/>
    <item code="200#declarationfonctions" algoitem="FONCTIONS_UTILISEES"/>
    <item code="100#declarationsvariables" algoitem="VARIABLES">
        <item code="1#NOMBRE#age" algoitem="age EST_DU_TYPE NOMBRE"/>
    </item>
    <item code="101#debutalgo" algoitem="DEBUT_ALGORITHME">
        <item code="4#Saisir l'age de l'enfant#0" algoitem="AFFICHER &quot;Saisir l'age de l'enfant&quot;"/>
        <item code="2#age#pasliste" algoitem="LIRE age"/>
        <item code="6#age >= 18" algoitem="SI (age >= 18) ALORS">
            <item code="7#debutsi" algoitem="DEBUT_SI"/>
            <item code="4#Votre enfant est majeur#0" algoitem="AFFICHER &quot;Votre enfant est majeur&quot;"/>
            <item code="8#finsi" algoitem="FIN_SI"/>
            <item code="9#sinon" algoitem="SINON">
                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                <item code="6#age >= 12" algoitem="SI (age >= 12) ALORS">
                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                    <item code="4#Categorie Cadet#0" algoitem="AFFICHER &quot;Categorie Cadet&quot;"/>
                    <item code="8#finsi" algoitem="FIN_SI"/>
                    <item code="9#sinon" algoitem="SINON">
                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                        <item code="6#age >= 10" algoitem="SI (age >= 10) ALORS">
                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                            <item code="4#Categorie Minime#0" algoitem="AFFICHER &quot;Categorie Minime&quot;"/>
                            <item code="8#finsi" algoitem="FIN_SI"/>
                            <item code="9#sinon" algoitem="SINON">
                                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                <item code="6#age >= 8" algoitem="SI (age >= 8) ALORS">
                                    <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                    <item code="4#Categorie Pupille#0" algoitem="AFFICHER &quot;Categorie Pupille&quot;"/>
                                    <item code="8#finsi" algoitem="FIN_SI"/>
                                    <item code="9#sinon" algoitem="SINON">
                                        <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                        <item code="6#age >= 6" algoitem="SI (age >= 6) ALORS">
                                            <item code="7#debutsi" algoitem="DEBUT_SI"/>
                                            <item code="4#Categorie Poussin #0" algoitem="AFFICHER &quot;Categorie Poussin &quot;"/>
                                            <item code="8#finsi" algoitem="FIN_SI"/>
                                            <item code="9#sinon" algoitem="SINON">
                                                <item code="10#debutsinon" algoitem="DEBUT_SINON"/>
                                                <item code="4#Votre enfant est trop jeune qu'il grandisse encore un peu !!!#0" algoitem="AFFICHER &quot;Votre enfant est trop jeune qu'il grandisse encore un peu !!!&quot;"/>
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
                <item code="11#finsinon" algoitem="FIN_SINON"/>
            </item>
        </item>
    </item>
    <item code="102#finalgo" algoitem="FIN_ALGORITHME"/>
</Algo>
