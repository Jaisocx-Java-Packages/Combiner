package com.jaisocx.tools.combiner;

import java.util.Arrays;
import java.util.List;



/**
* <b>  💡  The example for com.jaisocx.tools.combiner. JaisocxCombiner.combine( ... ) or ( new JaisocxCombinerCls() ).combine( ... ); </b>
*
* <p> author: Jaisocx Inc Software Architect Illia Polianskyi </p>
*
* <p>  🗓  since:  🌼  Summer in year AD 2024. 2024-07-29 </p>
*/
public class JaisocxCombinerExample {

  enum LoadingHtmlElems {
    STYLE,
    LINK;
  }

  String[] domainsNames = new String[] {
      "test-a234.example.com",
      "test-o987234.example.com",
      "release.example.com"
  };



  public static void main( String[] args ) {

    JaisocxCombinerExample loc_combinerExample = new JaisocxCombinerExample();

    List<String> locDomainsNames = Arrays.asList( loc_combinerExample.domainsNames );
    List<LoadingHtmlElems> locLoadingHtmlElems = Arrays.asList( LoadingHtmlElems.values() );

    //# Example declaration of a strings array
    // List<String> stringValues = Arrays.asList( "YES", "NO" );

    //# Example declaration of boolean values.
    List<Boolean> locBooleanValues = Arrays.asList( true, false );


    loc_combinerExample.printEnumHtmlElems ( locLoadingHtmlElems );

    System.out.println();
    loc_combinerExample.printArrayDomains ( locDomainsNames );


    // Generate all combinations in one-level loop
    List<List<Object>> combinations = JaisocxCombiner.combine (
        locDomainsNames,
        locLoadingHtmlElems,
        locBooleanValues
    );



    System.out.print("\n\n");

    // print all combinations less dangerous in a one-level loop
    loc_combinerExample.combinationsPrintExample ( combinations );

    // print all combinations less dangerous in a one-level loop
    // JaisocxCombiner.printCombinations( combinations );
  }



  public void printEnumHtmlElems ( List<LoadingHtmlElems> htmlElems ) {

    System.out.println( "enum LoadingHtmlElems {" );

    htmlElems.forEach( item ->
        System.out.print( "  " + item.name() + ",\n" )
    );

    System.out.println( "}" );

  }



  public void printArrayDomains ( List<String> domains ) {

    System.out.println( "String[] domainsNames = new String[] {" );

    domains.forEach( ( String item ) ->
        System.out.print( "  " + "\"" + item + "\"" + ",\n" )
    );

    System.out.println( "}" );

  }



  public void combinationsPrintExample ( List<List<Object>> combinations ) {

    System.out.print( "Combinations of every value in all 3 datasets:\n\n" );

    combinations.forEach(combinationItem -> this.printItemsDomainsHtmlElems (
        (String) combinationItem.get(0),
        (LoadingHtmlElems) combinationItem.get(1),
        (boolean) combinationItem.get(2)
      )
    );

  }



  public void printItemsDomainsHtmlElems (
      String domainName,
      LoadingHtmlElems loadingHtmlElem,
      boolean boolVal
  ) {

    System.out.print("  ");

    System.out.print( domainName + ", " );
    System.out.print( loadingHtmlElem.name() + ", " );
    System.out.print( boolVal );

    System.out.println();
  }

}


