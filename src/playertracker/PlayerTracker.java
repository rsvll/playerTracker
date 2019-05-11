/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playertracker;

/**
 *
 * @author svlln
 */
public class PlayerTracker {


    public static void main(String[] args) {

        long[] arr;                 //references array
        arr = new long[100];        // make array
        int nElems = 0;             // number of items 
        int j;                      // loop counter
        long searchKey;             // key item to search for
        
    //==========================================================================

    arr[0] = 77;                    // insert 10 items
    arr[1] = 99;
    arr[2] = 23;
    arr[3] = 24;
    arr[4] = 30;
    arr[5] = 66;
    arr[6] = 00;
    arr[7] = 10;
    arr[8] = 54;
    arr[9] = 33;
    nElems = 10;                    // now 10 items in array 
    
    //==========================================================================
    
    for (j = 0; j < nElems; j++ ){     // Display Items
        System.out.println(arr[j] + " ");
        System.out.println("");
    }
    
    //==========================================================================
    
    searchKey = 23;                                            // find item with key 23
    
    for( j = 0; j < nElems; j++){                              // for each element 
        if( arr[j] == searchKey)                                // Found item
            break;                                              // yes, exit before end
        if( j == nElems)                                       // at the end?
            System.out.println("Cant find " + searchKey);      // yes
        else
            System.out.println("Found " + searchKey);          // no 
        
    }
    
    //===========================================================================
    
    searchKey = 54;                                             // Delete item with key 55
    
    for(j = 0; j < nElems; j++ ){
        if(arr[j] == searchKey){                                // look for it 
            break;
        }
        
    for(int k = j; k < nElems; k++ ){                           // move higher ones up
        arr[k] = arr[k+1];
        nElems--;                                               // decrements size
        }    
    }
    
    //===========================================================================
    
    for( j = 0; j < nElems; j++){                               // Display items
        System.out.println(arr[j] + " ");
        System.out.println("");
    }
    
    
    }   // Ends main
    
}   // ends class
