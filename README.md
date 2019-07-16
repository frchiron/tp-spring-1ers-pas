# TP Spring - Injection de dépendances via configuration xml


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

## Support


voir https://www.dev-institut.fr/formation-spring-07-2018/01-context/

## Objectifs :

 - Créer des beans
 - Injecter des dépendances 

##Etapes :

1- Créer une interface Instrument avec une méthode play()

2- Créer les classes Piano et Guitar qui implémentent l'interface Instrument. Compléter la méthode play() avec des sorties écran (```System.out.println```) distinctes pour chaque instrument

3- Créer une classe Artist avec un attribut de type Instrument et une méthode perform(), qui fait appel à la méthode Instrument::play()

3- Déclarer et assembler ces beans dans le contexte XML Spring
- un Artist john avec un piano
- un Artist paul avec une guitar

4- Ajouter des tests pour vérifier le bon chargement des beans john et paul

```
    Artist john = context.getBean("john", Artist.class);
     assertThat(john.perform()).contains("PLINK");
```        

5- Tester le bon chargement des beans via les tests 
```
mvn test
```

