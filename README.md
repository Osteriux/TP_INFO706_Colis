| Xavier MAZIERE
# TP INFO 706 : Développement d'architectures distribuées
## Gestionnaire de Colis

### Utilisation

La page d'acceuil est juste un menu sans corp et permet d'accéder aux trois interface demandés. Le menu reste présent sur toutes les pages afin de faciliter la navigation.

#### Enrgistrement

Cette interface est composé d'un formulaire permettant de créer un nouveau Colis. Une fois un Colis créer on est rediriger vers l'affichage en détail d'un colis.

#### Progression

Cette interface liste tous les colis enrgistré et permet de modifier leur emplacement, longitude, latitude et état ou de le supprimer.
Après une modification, on est redirigé vers l'affichage en détail du colis modifié. Il n'est pas obligatiore de modifier l'état.

#### Suivi

Cette interface liste tous les Colis enrgistrés et permet de consulter les détails de chaque colis idividuellement.

### Choix d'implémentation


#### Colis

L'attribut emplacement est une liste, ce qui permet de construire un historique des lieux par lequels le colis est passé. Dans l'affichage en liste, seul l'emplacement courrant est affiché, alors que dans l'affichage en détails, la liste complète est affichés.

#### Interface Progression / Suivi

Il a été décidé que l'affichage 'Progression' correspondait à un affichage ayant plus de permission comparé à 'Suivi', c'est pourquoi il est le seul à pouvoir supprimer des colis.
