package net.cmsc_434.cs_advising_app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataItems {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableDetailList = new HashMap<String, List<String>>();

        List<String> mathRequirements = new ArrayList<String>();
        mathRequirements.add("MATH140 Calculus I (4 credits)");
        mathRequirements.add("MATH141 Calculus II (4 credits)");
        mathRequirements.add("STAT4XX (3 credits)");
        mathRequirements.add("MATH/STATXXX (3/4 Credits)");

        List<String> computerScienceRequirements = new ArrayList<String>();
        computerScienceRequirements.add("CMSC131 Object-Oriented Programming I (4 credits) or CMSC1332 Object-Oriented Programming I Beyond Fun (2 Credits)");
        computerScienceRequirements.add("CMSC132 Object-Oriented Programming II (4 credit)");
        computerScienceRequirements.add("CMSC216 Introduction to Computer Systems (4 credits)");
        computerScienceRequirements.add("CMSC250 Discrete Structures (4 credits)");
        computerScienceRequirements.add("CMSC330 Organization of Programming Languages (3 credits)");
        computerScienceRequirements.add("CMSC351 Algorithms (3 credits)");

        expandableDetailList.put("Math Requirements", mathRequirements);
        expandableDetailList.put("Computer Science Requirements", computerScienceRequirements);
        return expandableDetailList;

    }
}
