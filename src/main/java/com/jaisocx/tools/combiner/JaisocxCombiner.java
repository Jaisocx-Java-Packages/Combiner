package com.jaisocx.tools.combiner;

import com.jaisocx.tools.combiner.i.JaisocxCombinerClsInterface;
import com.jaisocx.tools.combiner.i.JaisocxCombinerInterface;

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
public final class JaisocxCombiner implements JaisocxCombinerInterface {

  private static JaisocxCombinerCls combinerInstance = null;

  private JaisocxCombiner() {}



  public static JaisocxCombinerClsInterface getInstance() {

    if ( combinerInstance == null ) {
      combinerInstance = ( new JaisocxCombinerCls() );
    }

    JaisocxCombinerCls combinerCls = combinerInstance;

    return combinerCls;
  }



  public static List<List<Object>> combine(List<?>... lists) {

    List<List<Object>> combinations = ( new ArrayList<>() );

    JaisocxCombinerCls combinerCls = ( (JaisocxCombinerCls) JaisocxCombiner.getInstance() );

    combinations = combinerCls.combine( lists );

    return combinations;
  }



  public static void printCombinations (List<List<Object>> combinations) {

    JaisocxCombinerCls combinerCls = ( (JaisocxCombinerCls) JaisocxCombiner.getInstance() );

    combinerCls.printCombinations( combinations );

    return;
  }



  public static void printCombinationsItem (List<Object> combinationItem) {

    JaisocxCombinerCls combinerCls = ( (JaisocxCombinerCls) JaisocxCombiner.getInstance() );

    combinerCls.printCombinationsItem( combinationItem );

    return;
  }

}

