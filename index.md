Vous disposez en entrée d'une liste de mots à partir de laquelle vous devez réaliser un index.

Les entrées de l'index seront triées par ordre alphabétique :

* en Français (par exemple : é est après e et avant f)
* en éliminant les doublons
* en ne tenant pas compte de la casse (dans le cas où le même mot apparaît plusieurs fois sous des formes différentes, la première rencontrée dans le tableau sera conservée dans l'index)

A chaque entrée de l'index sera associée la liste des positions (commençant à 0) des mots correspondant dans la liste d'origine.

On devra donc implémenter deux méthodes :

* getIndexWords : renvoie simplement les mots de l'index sous forme de SortedSet
* getIndexMap : renvoie une structure de type SortedMap représentant l'index complet (clé : mot de l'index / valeur : liste des positions dans la liste en entrée)

