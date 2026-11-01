package com.jaisocx.tools.combiner.i;

import java.util.List;



/**
* <b>  💡  For example, in UnitTests for the aim 100 pct cover. </b>
*
* <p> author: Jaisocx Inc Software Architect Illia Polianskyi </p>
*
* <p> JaisocxCombinerCls: the center logique class of Java package com.jaisocx.tools.combiner;
* </p>
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
public interface JaisocxCombinerClsInterface {

  /**
  * produced are combinations of every item in every dataset, enum, array.
  */
  public List<List<Object>> combine (List<?>... lists);



  /**
  * terminal prints every combination in one line
  */
  public void printCombinations (List<List<Object>> combinations);



  /**
   * terminal prints every field of a combinations' item
   */
  public void printCombinationsItem (List<Object> combinationItem);

}
