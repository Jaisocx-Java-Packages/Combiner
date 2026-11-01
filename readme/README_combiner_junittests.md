

Jaisocx &#8482; &#169;


![/software_labels/Jaisocx/software_tm_label_jaisocx_combiner_3_2.svg](./software_labels/Jaisocx/software_tm_label_jaisocx_combiner_3_2.svg)


# Combiner for JUnitTests

  >  💡  every combination of several datasets, in one-level loop


  🍮  **️Library**   `com.jaisocx.tools.combiner` | 🏷 **️ver.**: `3.2`  

  💶  **Earn**      Raise QA coverage easier, saving up on writing multilevel combining tasks.

  🗓  **Since**     AD 2024  🌼  Summer  | `AD 2024 Oct 29`

  🗓  **Date**      AD 2026  🌾  Autumn  | `AD 2026 Oct 31 01:40.500 GMT_24h`

  📐  **Size**      📝  JaisocxCombinerCls.java 3 KB  |  📦  jar 12 KB |  🗂  Dir 5 MB

  ⚡   **Keywords**  `[ "Java", "Test", "Unit Tests", "Combiner", "Combinations" ]`

  📝  **Java**     `src/main/java/com/jaisocx/tools/combiner/JaisocxCombinerCls.java`



  
  **Combiner** Java Class raises JUnitTests coverage level.
  
  For example, a Java Class Method accepts 3 ( three ) input args:

```Java
// a class with a method being tested
class ClsA {

  public void sampleMethod (
    String domainName,
    LoadingHtmlElems loadingHtmlElem,
    boolean boolVal
  ) {
    // ...
  }
}
```


  
  With a JUnitTest, 
  You want to cover 100% of test cases,
  for every value possible for every input arg, 
  for example, declared in data sets like these:
  


**Test Cases**

```Java
  // array variables as test cases
  
  String[] domainsNames = new String[] {
    "tests-a234.example.com",
    "tests-o987234.example.com",
    "release.example.com"
  };

  enum LoadingHtmlElems {
    STYLE,
    LINK;
  }

  Boolean[] booleanValues = new Boolean[] {
    true,
    false
  };

```


  
  The Combiner produces the entire set of unique combinations 
  of data sets entries,
  like this:

```Java
  // Test. combinations
  
  ClsA clsA = new ClsA();
  
  
  List<String> locDomainsNames = Arrays.asList( domainsNames );
  List<LoadingHtmlElems> locLoadingHtmlElems = Arrays.asList( LoadingHtmlElems.values() );
  List<Boolean> locBooleanValues = Arrays.asList( booleanValues );
  
  
  // combinations for every test case
  List<List<Object>> combinations = JaisocxCombiner.combine (
    locDomainsNames,
    locLoadingHtmlElems,
    locBooleanValues
  );
```


  
  Then, the method being tested is called for every combination, 
  like this:

```Java
  // Test. every test case by the combinations
  
  combinations.forEach ( 
  
    combinationItem -> clsA.sampleMethod (
      (String) combinationItem.get(0),
      (LoadingHtmlElems) combinationItem.get(1),
      (boolean) combinationItem.get(2)
    ) 

  );
```



## CssVariablesProducer

  >  works like Main class, too.


```Java
// CssVariablesProducer.java

package com.jaisocx.tools.combiner;

import java.util.Arrays;
import java.util.List;

public class CssVariablesProducer {

  String[] position = new String[] {
    "absolute",
    "sticky",
    "relative",
    "static"
  };

  enum FlexDirection {
    column,
    row;
  }

  enum Overflow {
    hidden,
    visible,
    auto,
    scroll;
  }

  String[] leftCodeBlock = new String[] {
    "0",
    "var(--column-numbers-holder--width)",
    "50px",
    "100px",
  };

  String[] leftColumnLinesNumbers = new String[] {
    "0",
    "50px",
    "100px",
    "150px",
    "calc(0 - var(--column-numbers-holder--width))",
    "-50px",
    "-100px",
    "-150px",
  };



  public static void main(String[] args) {

    CssVariablesProducer producer = new CssVariablesProducer();

    List<String> position = Arrays.asList( producer.position );
    List<FlexDirection> flexDirection = Arrays.asList( FlexDirection.values() );
    List<Overflow> overflow = Arrays.asList( Overflow.values() );
    List<String> leftCodeBlock = Arrays.asList( producer.leftCodeBlock );
    List<String> leftColumnLinesNumbers = Arrays.asList( producer.leftColumnLinesNumbers );
    List<String> currencyValues = Arrays.asList( "USD", "EUR", "CHF" );
    List<Boolean> booleanValues = Arrays.asList( true, false );

    // Generate all combinations in one-level loop
    List<List<Object>> combinations = Combiner.combine (
        position,
        flexDirection,
        overflow,
        leftCodeBlock,
        leftColumnLinesNumbers,
        currencyValues,
        booleanValues
    );

    // use all combinations less dangerous in a one-level loop
    CssVariablesProducer.combinationsUsageSample( combinations );
  }
  
  public static void combinationsUsageSample ( List<List<Object>> combinations ) {
    combinations.forEach(combinationItem -> CssVariablesProducer.sampleMethod (
        (String) combinationItem.get(0),
        (FlexDirection) combinationItem.get(1),
        (Overflow) combinationItem.get(2),
        (String) combinationItem.get(3),
        (String) combinationItem.get(4),
        (String) combinationItem.get(5),
        (boolean) combinationItem.get(6)
      )
    );
  }

  public static void sampleMethod (
      String position,
      FlexDirection flexDirection,
      Overflow overflow,
      String leftCodeBlock,
      String leftColumnLinesNumbers,
      String currency,
      boolean isSuggestionValid
  ) {
    System.out.print(position + ", ");
    System.out.print(flexDirection.name() + ", ");
    System.out.print(overflow.name() + ", ");
    System.out.print(leftCodeBlock + ", ");
    System.out.print(leftColumnLinesNumbers + ", ");
    System.out.print(currency + ", ");
    System.out.print(isSuggestionValid);
    System.out.println();
  }

  public static void printCombinations(List<List<Object>> combinations) {
    combinations.forEach(combinationItem -> CssVariablesProducer.printCombinationsItem(combinationItem));
  }
  public static void printCombinationsItem(List<Object> combinationItem) {
    combinationItem.forEach(object -> System.out.print(object.toString() + " "));
    System.out.println();
  }
}
```



---


Have a nice day, Jaisocx Inc. Software Architect Illia Polianskyi





