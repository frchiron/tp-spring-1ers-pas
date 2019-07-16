# TP Spring - Injection de dépendances via annotations


## Prequis
- Maven 3.+
    
  ```
  mvn -version
  ```
- JDK 8+
  ```
  java -version
  ```
- Intellij


## Objectifs :

 - Créer des beans
 - Injecter des dépendances 

## Etapes :

1- Créer une interface Instrument avec une méthode play() qui retourne une chaîne de caractères

2- Créer les classes Piano et Guitar qui implémentent l'interface Instrument. Compléter la méthode play() avec des réponses distinctes pour chaque instrument

3- Créer une classe Artist avec un attribut de type Instrument et une méthode perform(), qui retourne le résultat de la méthode Instrument::play()

3- Déclarer et assembler ces beans dans le contexte XML Spring
- un Artist john avec un piano
- un Artist paul avec une guitar

4- Tester le bon chargement des beans via les tests 
```
mvn test
```

