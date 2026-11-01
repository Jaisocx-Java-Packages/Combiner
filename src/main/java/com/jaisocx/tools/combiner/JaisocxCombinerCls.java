package com.jaisocx.tools.combiner;

import com.jaisocx.tools.combiner.i.JaisocxCombinerClsInterface;

import java.util.ArrayList;
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
public final class JaisocxCombinerCls implements JaisocxCombinerClsInterface {

  /**
  * produced are combinations of every item in every dataset, enum, array.
  */
  public List<List<Object>> combine (List<?>... lists) {
    List<List<Object>> combinations = new ArrayList<>();

    long iterationsCount = lists.length;
    int[] listItemSize = new int[lists.length];
    for (int i = 0; i < lists.length; i++) {
      List<Object> list = (List<Object>) lists[i];
      listItemSize[i] = list.size();
      iterationsCount = iterationsCount * list.size();
    }

    // since we have many lists items, we need the counter for this.
    int listItemIndex = 0;
    int listItemIndexLast = lists.length - 1;

    // for each list item, on the same position in the list, we keep the current list item inner position
    int[] listsInnerLoops = new int[lists.length];
    List<Object> oneCombination = new ArrayList<>();
    for (int i = 0; i < iterationsCount; i++) {

      // a loop inside all lists
      oneCombination.add(lists[listItemIndex].get(listsInnerLoops[listItemIndex]));

      // next arg
      listItemIndex += 1;

      // out of bounds of lists args set
      if (listItemIndex >= lists.length) {

        // start again for each lists args set
        listItemIndex = 0;

        // append the args values combination
        combinations.add(oneCombination);
        oneCombination = new ArrayList<>();

        // inner iteration inc to next index
        for (int j = listItemIndexLast; j >= 0; j--) {
          listsInnerLoops[j] += 1;
          if (listsInnerLoops[j] >= listItemSize[j]) {
            listsInnerLoops[j] = 0;
          } else {
            break;
          }
        }
      }
    }

    return combinations;
  }



  /**
  * terminal prints every combination in one line
  */
  public void printCombinations (List<List<Object>> combinations) {
    combinations.forEach(combinationItem -> this.printCombinationsItem( combinationItem ));
  }



  /**
  * terminal prints every field of a combinations' item
  */
  public void printCombinationsItem (List<Object> combinationItem) {

    // terminal prints every field of a combinations' item
    combinationItem.forEach(object -> System.out.print( object.toString() + " " ));

    // new line
    System.out.println();
  }

}


