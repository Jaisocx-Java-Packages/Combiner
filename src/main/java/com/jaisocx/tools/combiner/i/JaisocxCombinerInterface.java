package com.jaisocx.tools.combiner.i;



import java.util.ArrayList;
import java.util.List;



/**
* <b>  💡  same like CombinerCls for the fine syntax call like JaisocxCombiner.combine( ... ); </b>
*
* <p> author: Jaisocx Inc Software Architect Illia Polianskyi </p>
*
* <p> the Combiner class produces all unique combinations of evey dataset,
*       like enum, array.
*     Later the combinations are used in one-level loop, avoiding multi-level loops.
* </p>
*
* <p>  advantage: one-level loop implementation, more code review friendly. variable arguments number, easy to use with Strings, enums, oher data types.</p>
*
* <p>  🗓  since:  🌼  Summer in year AD 2024. 2024-07-29 </p>
*/
public interface JaisocxCombinerInterface {

  public static JaisocxCombinerClsInterface getInstance() {
    return null;
  }



  public static List<List<Object>> combine ( List<?>... lists ) {
    List<List<Object>> combinations = ( new ArrayList<>() );

    return combinations;
  }



  public static void printCombinations ( List<List<Object>> combinations ) {
    return;
  }



  public static void printCombinationsItem ( List<Object> combinationItem ) {
    return;
  }

}


