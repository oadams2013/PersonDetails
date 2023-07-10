package com.zipcodewilmington;

import java.sql.Array;

/**
 * Created by leon on 1/24/18.
 */
public class PersonHandler {
    private final Person[] personArray;

    public PersonHandler(Person[] personArray) {
        this.personArray = personArray;
    }

    // NOTICE how the comments can be used to step-by-step break down the problem into 
    // simple lines of code...
    
    public String whileLoop() {
        StringBuilder result = new StringBuilder("");
        int ct = 0 ;
        Person[] ppl = getPersonArray();

        // create a `counter`
        // while `counter` is less than length of array
            // begin loop

                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable

            // end loop
     while ( ct < ppl.length){
         result.append(ppl[ct].toString());
         ct++;

     }
        return result.toString();
    }



    public String forLoop() {
        StringBuilder result = new StringBuilder("");

        Person[] ppl = getPersonArray();

        // identify initial value
        // identify terminal condition
        // identify increment

        // use the above clauses to declare for-loop signature
            // begin loop
                // use `counter` to identify the `current Person` in the array
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        for (int i = 0; i < ppl.length; i++){
            result.append(ppl[i].toString());
        }
        return result.toString();
    }



    public String forEachLoop() {
        StringBuilder result = new StringBuilder("");

        Person[] ppl = getPersonArray();
        // identify array's type
        // identify array's variable-name

        // use the above discoveries to declare for-each-loop signature
            // begin loop
                // get `string Representation` of `currentPerson`
                // append `stringRepresentation` to `result` variable
            // end loop
        for (Person p: ppl){
            result.append(p.toString());

        }
        return result.toString();
    }


    public Person[] getPersonArray() {
        return personArray;
    }
}
