package net.cmsc_434.cs_advising_app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataItems {
    public static HashMap<String, List<String>> getLLRData() {
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

    public static HashMap<String, List<String>> getGRData(){
        HashMap<String, List<String>> expandableDetailList = new HashMap<String, List<String>>();

        List<String> systems = new ArrayList<String>();
        systems.add("CMSC 411 Computer Systems Architecture (3 credits)");
        systems.add("CMSC 412 Operating Systems (4 credits)");
        systems.add("CMSC 414 Computer and Network Security  (3 credits)");
        systems.add("CMSC 416 Introduction to Parallel Computing (3 credits)");
        systems.add("CMSC 417 Computer Networks (3 credits)");

        List<String> infoProcessing = new ArrayList<String>();
        systems.add("CMSC 420 Data Structures (3 credits)");
        systems.add("CMSC 421 Introduction to Artificial Intelligence (3 credits)");
        systems.add("CMSC 422 Machine Learning (3 credits)");
        systems.add("CMSC 423 Bioinformatic Algorithms, Databases, and Tools (3 credits)");
        systems.add("CMSC 424 Database Design (3 credits)");
        systems.add("CMSC 426 Computer Vision (3 credits)");
        systems.add("CMSC 427 Computer Graphics (3 credits)");
        systems.add("CMSC 470 Introduction to Natural Language Processing (3 credits)");
        systems.add("CMSC 471 Introduction to Data Visualization (3 credits)");

        List<String> software_and_programming = new ArrayList<>();
        software_and_programming.add("CMSC 430 Introduction to Compilers (3 credits)");
        software_and_programming.add("CMSC 433 Programming Language Technologies and Paradigms (3 credits)");
        software_and_programming.add("CMSC 434 Introduction to Human-Computer Interaction (3 credits)");
        software_and_programming.add("CMSC 435 Software Engineering (3 credits)");
        software_and_programming.add("CMSC 436 Hand Held Programming Devices (3 credits)");
        software_and_programming.add("CMSC 471 Introduction to Data Visualization (3 credits)");

        List<String> theory = new ArrayList<>();
        software_and_programming.add("CMSC 451 Design and Analysis of Computer Algorithms (3 credits)");
        software_and_programming.add("CMSC 452 Elementary Theory of Computation (3 credits)");
        software_and_programming.add("CMSC 454 Algorithms for Data Science (3 credits)");
        software_and_programming.add("CMSC 456 Cryptology (3 credits)");
        software_and_programming.add("CMSC 457 Introduction to Quantum Computing (3 credits)");
        software_and_programming.add("CMSC 474 Introduction to Computational Game Theory (3 credits)");

        List<String> numericalAnalysis = new ArrayList<>();
        numericalAnalysis.add("CMSC 460 Computational Methods (3 credits) or CMSC 466 Introduction to Numerical Analysis (3 credits)");


        return expandableDetailList;



    }
}
