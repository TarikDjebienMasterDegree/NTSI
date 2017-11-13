author : Djebien Tarik

CE QUI FONCTIONNE :

Création des entités
  Création des bean
  ajout des annotations JPA

Création des écrans de gestion d'un enseignant
  Création
  Suppression
  Mise a jour
  Visualisation de la liste des enseignants

Création des écrans de gestion d'une personne
  Création
  Visualisation de la liste des personnes

Création d'une réservation
  Saisie de la date de début et de fin de la réservation
  Sélection d'une salle
  Sélection d'un enseignant (validator ne marche pas surement le equals() )
  Sélection des étudiants (idem mais ecran fait)
  Récapitulatif (écran fait)
  
Ce qui ne fonctionne pas :

Visualiser les réservations d'un enseignant
Selection d'un enseignant
Selection des etudiants


Format de saisie de dates : 
Example : 18/12/12 12:20:02

Example de INSERT POUR LES TABLES DE CLASSROOM :

INSERT INTO classroom(
            typeclassroom, id_classroom, seatcapacity, building, name, videoprojector, 
            computertype, soundsystem)
    VALUES ('LECTUREHALL', 1, 200, 'M5', 'A09', true, 
            'HP', true);


REMARQUES :

SGBD utilisé : POSTGRESQL 9.2

Nom de ma base de donnée sur ma machine : examjpa

Lors du premier lancement dans persistence.xml, il faut créer le schema de BDD avec la valeur :
  
  <property name="hibernate.hbm2ddl.auto" value="create"/>

Ensuite, il faut mettre à jour cette valeur pour eviter de perdre les données en base :
  
  <property name="hibernate.hbm2ddl.auto" value="update"/>
  
Cordialement.