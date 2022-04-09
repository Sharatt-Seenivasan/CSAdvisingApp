package net.cmsc_434.cs_advising_app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataItems {
    public static HashMap<String, List<String>> getLLRData() {
        HashMap<String, List<String>> expandableDetailList = new HashMap<String, List<String>>();

        List<String> mathRequirements = new ArrayList<String>();
        mathRequirements.add("MATH140 (4 credits) Calculus I ");
        mathRequirements.add("MATH141 (4 credits) Calculus II ");
        mathRequirements.add("STAT4XX (3 credits)");
        mathRequirements.add("MATH/STATXXX (3/4 Credits)");

        List<String> computerScienceRequirements = new ArrayList<String>();
        computerScienceRequirements.add("CMSC131 Object-Oriented (4 credits) Programming I  or CMSC133 (2 Credits) Object-Oriented Programming I Beyond Fun ");
        computerScienceRequirements.add("CMSC132 (4 credit) Object-Oriented Programming II ");
        computerScienceRequirements.add("CMSC216 (4 credits) Introduction to Computer Systems ");
        computerScienceRequirements.add("CMSC250 (4 credits) Discrete Structures ");
        computerScienceRequirements.add("CMSC330 (3 credits) Organization of Programming Languages ");
        computerScienceRequirements.add("CMSC351 (3 credits) Algorithms ");

        expandableDetailList.put("Math", mathRequirements);
        expandableDetailList.put("Computer Science", computerScienceRequirements);
        return expandableDetailList;

    }

    public static HashMap<String, List<String>> getGRData(){
        HashMap<String, List<String>> expandableDetailList = new HashMap<String, List<String>>();

        List<String> systems = new ArrayList<String>();
        systems.add("CMSC 411 (3 credits) Computer Systems Architecture");
        systems.add("CMSC 412 (4 credits) Operating Systems");
        systems.add("CMSC 414 (3 credits) Computer and Network Security");
        systems.add("CMSC 416 (3 credits) Introduction to Parallel Computing");
        systems.add("CMSC 417 (3 credits) Computer Networks ");

        List<String> infoProcessing = new ArrayList<String>();
        infoProcessing.add("CMSC 420 (3 credits) Data Structures ");
        infoProcessing.add("CMSC 421 (3 credits) Introduction to Artificial Intelligence ");
        infoProcessing.add("CMSC 422 (3 credits) Machine Learning ");
        infoProcessing.add("CMSC 423 (3 credits) Bioinformatic Algorithms, Databases, and Tools ");
        infoProcessing.add("CMSC 424 (3 credits) Database Design ");
        infoProcessing.add("CMSC 426 (3 credits) Computer Vision ");
        infoProcessing.add("CMSC 427 (3 credits) Computer Graphics ");
        infoProcessing.add("CMSC 470 (3 credits) Introduction to Natural Language Processing ");
        infoProcessing.add("CMSC 471 (3 credits) Introduction to Data Visualization ");

        List<String> software_and_programming = new ArrayList<>();
        software_and_programming.add("CMSC 430 (3 credits) Introduction to Compilers ");
        software_and_programming.add("CMSC 433 (3 credits) Programming Language Technologies and Paradigms ");
        software_and_programming.add("CMSC 434 (3 credits) Introduction to Human-Computer Interaction ");
        software_and_programming.add("CMSC 435 (3 credits) Software Engineering ");
        software_and_programming.add("CMSC 436 (3 credits) Hand Held Programming Devices ");
        software_and_programming.add("CMSC 471 (3 credits) Introduction to Data Visualization ");

        List<String> theory = new ArrayList<>();
        theory.add("CMSC 451 (3 credits) Design and Analysis of Computer Algorithms ");
        theory.add("CMSC 452 (3 credits) Elementary Theory of Computation ");
        theory.add("CMSC 454 (3 credits) Algorithms for Data Science ");
        theory.add("CMSC 456 (3 credits) Cryptology ");
        theory.add("CMSC 457 (3 credits) Introduction to Quantum Computing ");
        theory.add("CMSC 474 (3 credits) Introduction to Computational Game Theory");

        List<String> numericalAnalysis = new ArrayList<>();
        numericalAnalysis.add("CMSC 460 (3 credits) Computational Methods  or CMSC 466 (3 credits) Introduction to Numerical Analysis");

        expandableDetailList.put("Area 1: Systems",systems);
        expandableDetailList.put("Area 2: Information Processing", infoProcessing);
        expandableDetailList.put("Area 3: Software Engineering and Programming Languages", software_and_programming);
        expandableDetailList.put("Area 4: Theory", theory);
        expandableDetailList.put("Area 5: Numerical Analysis", numericalAnalysis);

        return expandableDetailList;



    }


    public static HashMap<String, List<String>> getDataScienceReqsData(){
        HashMap<String, List<String>> expandableDetailList = new HashMap<String, List<String>>();

        List<String> required = new ArrayList<String>();
        required.add("MATH 240 (4 credits) Linear Algebra ");
        required.add("STAT 400 (3 credits) Applied Probability and Statistics I");
        required.add("CMSC 320 (3 credits) Introduction to Data Science");
        required.add("CMSC 422 (3) Introduction to Machine Learning");
        required.add("CMSC 424 (3 credits) Database Design");

        List<String> courses1 = new ArrayList<String>();
        courses1.add("CMSC 402 (3 credits) Bioinformatic Algorithms & Methods for Functional Genomics and Proteomics");
        courses1.add("CMSC 420 (3 credits) Data Structures");
        courses1.add("CMSC 421 (3 credits) Introduction to Artificial Intelligence");
        courses1.add("CMSC 423 (3 credits) Bioinformatic Algorithms, Databases, and Tools");
        courses1.add("CMSC 425 (3 credits) Game Programming");
        courses1.add("CMSC 426 (3 credits) Computer Vision");
        courses1.add("CMSC 427 (3 credits) Computer Graphics ");

        List<String> courses2 = new ArrayList<String>();
        courses2.add("CMSC 451 (3 credits) Design and Analysis of Computer Algorithms");
        courses2.add("CMSC 454 (3 credits) Algorithms for Data Science");
        courses2.add("CMSC 460 (3 credits) Computational Methods");

        List<String> courses3 = new ArrayList<String>();
        courses3.add("CMSC 411 (3 credits) Computer Systems Architecture");
        courses3.add("CMSC 412 (4 credits) Operating Systems");
        courses3.add("CMSC 414 (3 credits) Computer and Network Security");
        courses3.add("CMSC 417 (3 credits) Computer Networks");
        courses3.add("CMSC 430 (3 credits) Introduction to Compilers");
        courses3.add("CMSC 433 (3 credits) Programming Language Technologies and Paradigms");
        courses3.add("CMSC 434 (3 credits) Introduction to Human-Computer Interaction");
        courses3.add("CMSC 435 (3 credits) Software Engineering");

        expandableDetailList.put("Required",required);
        expandableDetailList.put("Choose one course from:",courses1);
        expandableDetailList.put("Choose one course from: ", courses2);
        expandableDetailList.put("Choose two courses from: ", courses3);

        return expandableDetailList;
    }


    public static HashMap<String, List<String>> getCyberSecruityReqsData(){
        HashMap<String, List<String>> expandableDetailList = new HashMap<String, List<String>>();

        List<String> required = new ArrayList<String>();
        required.add("CMSC 414 (3 credits) Computer and Network Security");
        required.add("CMSC 456 (3 credits) Cryptology");

        List<String> courses1 = new ArrayList<>();
        courses1.add("CMSC 411 (3 credits) Computer Systems Architecture");
        courses1.add("CMSC 412 (4 credits) Operating Systems ");
        courses1.add("CMSC 417 (3 credits) Computer Networks");
        courses1.add("CMSC 430 (3 credits) Introduction to Compilers");
        courses1.add("CMSC 433 (3 credits) Programming Language Technologies and Paradigms");
        courses1.add("CMSC 451 (3 credits) Design and Analysis of Computer Algorithms");

        List<String> upperlevelelectives = new ArrayList<>();
        upperlevelelectives.add("CMSC3XX/4XX (3/4 Credits)");
        upperlevelelectives.add("CMSC3XX/4XX (3/4 Credits)");

        expandableDetailList.put("Upper Level Electives", upperlevelelectives);
        expandableDetailList.put("Choose four courses from:", courses1);
        expandableDetailList.put("Required", required);


        return expandableDetailList;


    }


    public static HashMap<String, List<String>> getMachineLearningReqsData(){
        HashMap<String, List<String>> expandableDetailList = new HashMap<String, List<String>>();

        List<String> required = new ArrayList<String>();
        required.add("MATH 240 (4 credits) Linear Algebra");
        required.add("CMSC 320 (3 credits) Introduction to Data Science");
        required.add("CMSC 421 (3 credits) Introduction to Artificial Intelligence");
        required.add("CMSC 422 (3 credits) Introduction to Machine Learning");

        List<String> courses = new ArrayList<>();
        courses.add("CMSC 426 (3 credits) Computer Vision");
        courses.add("CMSC/AMSC 460 (3 credits) Computational Methods or  CMSC/AMSC 466 (3 credits) Introduction to Numerical Analysis I or MATH 401 (3 credits) Applications of Linear Algebra");
        courses.add("CMSC 470 (3) Natural Language Processing");
        courses.add("CMSC 472 (3) Introduction to Deep Learning");
        courses.add("CMSC 473 (3) Capstone in Machine Learning");
        courses.add("CMSC 474 (3) Introduction to Computational Game Theory");
        courses.add("CMSC 476 (3) Robotics and Perception");


        List<String> upperlevelelectives = new ArrayList<>();
        upperlevelelectives.add("CMSC3XX/4XX (3/4 Credits)");
        upperlevelelectives.add("CMSC3XX/4XX (3/4 Credits)");


        expandableDetailList.put("Required", required);
        expandableDetailList.put("Choose two courses from:", courses);
        expandableDetailList.put("Upper Level Electives", upperlevelelectives);

        return  expandableDetailList;

    }

    public static HashMap<String, List<String>> getQuantumInformation(){
        HashMap<String, List<String>> expandableDetailList = new HashMap<String, List<String>>();

        List<String> required = new ArrayList<String>();
        required.add("MATH 240 (4 credits) Linear Algebra");
        required.add("CMSC 457 (3 credits) Introduction to Quantum Computing");
        required.add("PHYS 467 (3 credits) Introduction to Quantum Technology");

        List<String> courses = new ArrayList<String>();
        courses.add("<b><u>Area 1: Systems</u></b>");
        courses.add("CMSC 411 (3 credits) Computer Systems Architecture");
        courses.add("CMSC 412 (4 credits) Operating Systems");
        courses.add("CMSC 414 (3 credits) Computer and Network Security");
        courses.add("CMSC 416 (3 credits) Introduction to Parallel Computing");
        courses.add("CMSC 417 (3 credits) Computer Networks");
        courses.add("<b><u>Area 2: Information Processing</u></b>");
        courses.add("CMSC 402 (3 credits) Bioinformatic Algorithms and Methods");
        courses.add("CMSC 420 (3 credits) Data Structures");
        courses.add("CMSC 421 (3 credits) Introduction to Artificial Intelligence");
        courses.add("CMSC 422 (3 credits) Machine Learning");
        courses.add("CMSC 423 (3 credits) Bioinformatic Algorithms, Databases, and Tools");
        courses.add("CMSC 424 (3 credits) Database Design");
        courses.add("CMSC 426 (3 credits) Computer Vision");
        courses.add("CMSC 427 (3 credits) Computer Graphics");
        courses.add("CMSC 470 (3 credits) Introduction to Natural Language Processing");
        courses.add("CMSC 471 (3) Introduction to Data Visualization (Area 2 OR Area 3)");
        courses.add("<b><u>Area 3: Software Engineering and Programming Languages</u></b>");
        courses.add("CMSC 430 (3 credits) Introduction to Compilers");
        courses.add("CMSC 433 (3 credits) Programming Language Technologies and Paradigms");
        courses.add("CMSC 434 (3 credits) Introduction to Human-Computer Interaction");
        courses.add("CMSC 435 (3 credits) Software Engineering");
        courses.add("CMSC 436 (3 credits) Hand Held Programming Devices");
        courses.add("CMSC 471 (3 credits) Introduction to Data Visualization (Area 2 OR Area 3)");
        courses.add("<b><u>Area 4: Theory</u></b>");
        courses.add("CMSC 451 (3 credits) Design and Analysis of Computer Algorithms");
        courses.add("CMSC 452 (3 credits) Elementary Theory of Computation");
        courses.add("CMSC 454 (3 credits) Algorithms for Data Science");
        courses.add("CMSC 456 (3 credits) Cryptology");
        courses.add("CMSC 474 (3 credits) Introduction to Computational Game Theory");
        courses.add("<b><u>Area 5: Numerical Analysis</u></b>");
        courses.add("CMSC 460 (3) Computational Methods (credit will only be given for CMSC 460 or CMSC 466)");
        courses.add("CMSC 466 (3) Introduction to Numerical Analysis (credit will only be given for CMSC 466 or CMSC 460)");


        expandableDetailList.put("Required", required);
        expandableDetailList.put("Choose four courses from:", courses);

        return expandableDetailList;
    }

    public static HashMap<String, List<String>> getUpperLevel(){
        HashMap<String, List<String>> expandableDetailList = new HashMap<String, List<String>>();

        List<String> coursesCompleted = new ArrayList<String>();

        expandableDetailList.put("Upper Level Concentration Classes completed:", coursesCompleted);

        return expandableDetailList;
    }
}
