import java.util.*;

import jdk.nashorn.internal.codegen.CompilationException;
import jdk.nashorn.internal.runtime.Context.ThrowErrorManager;

import java.io.*;
import java.lang.Exception;
import java.lang.IndexOutOfBoundsException;

class University {
        public static void main(String[] args) {
                TechnicalFaculty student1 = new TechnicalFaculty("Lisa Drongy", "Java", 5, "German", 6, "Programming",
                                9, "Biological Science");
                TechnicalFaculty student2 = new TechnicalFaculty("Victor Depp", "Php", 8, "Psychology", 3,
                                "Programming", 8, "Cosmology");
                TechnicalFaculty student3 = new TechnicalFaculty("Merri Smith", "Java", 7, "English", 9, "Programming",
                                5, "Psychology and Literature");
                TechnicalFaculty student4 = new TechnicalFaculty("Harvey Spector", "Java", 9, "Englich", 10,
                                "Programming", 4, "Law and Politics");
                TechnicalFaculty student5 = new TechnicalFaculty("Lili Shmid", "Physics", 8, "Cosmology", 9,
                                "Programming", 3, "Classical Mechanics");
                TechnicalFaculty student6 = new TechnicalFaculty("Elena Blich", "Physics", 5, "Chemistry", 8,
                                "Programming", 3, "The Quantum Physics");
                TechnicalFaculty student7 = new TechnicalFaculty("Ali Brink", "Physics", 9, "Psychology", 2,
                                "Programming", 4, "Classical Mechanics");

                LawFaculty student01 = new LawFaculty("Jin Woahu", "Law", 2, "Politics", 7, 000777);
                LawFaculty student02 = new LawFaculty("Yan Winkler", "Law", 7, "Psychology", 9, 000111);
                LawFaculty student03 = new LawFaculty("Katya Petersen", "Law", 3, "Politics", 9, 000645);
                LawFaculty student04 = new LawFaculty("Robert Jons", "Law", 8, "Government", 6, 000255);
                LawFaculty student777 = new LawFaculty("Fina Zipt", "Right", 112, "Government", -10, 0);
                LawFaculty student444 = new LawFaculty("", "", 1, "", 1, 0);

                MedicalFaculty student001 = new MedicalFaculty("Vo Nichi", "Medicine", 6, "Psychology", 2, "Biology", 3,
                                "Surgery", 7);
                MedicalFaculty student002 = new MedicalFaculty("Yan Lebedev", "Medicine", 7, "Psychology", 3, "Biology",
                                5, "Cardiology", 8);
                MedicalFaculty student003 = new MedicalFaculty("Robert Klimentiv", "Medicine", 4, "Psychology", 6,
                                "Biology", 8, "Urology", 6);
                MedicalFaculty student004 = new MedicalFaculty("Hon Ji", "Biology", 4, "Science", 9, "Microbiology", 8,
                                "Anatomy", 3);
                MedicalFaculty student005 = new MedicalFaculty("Violetta Vitinka", "Biology", 3, "Science", 7,
                                "Microbiology", 6, "Plants.Animals", 6);
                MedicalFaculty student006 = new MedicalFaculty("Lara Crolly", "Biology", 5, "Science", 2, "Ecology", 9,
                                "Evolution and History of the Planet", 7);

                ArrayList<TechnicalFaculty> computerScienceGroup = new ArrayList<TechnicalFaculty>();
                computerScienceGroup.add(student1);
                computerScienceGroup.add(student2);
                computerScienceGroup.add(student3);
                computerScienceGroup.add(student4);

                ArrayList<TechnicalFaculty> physicsAndCosmologyGroup = new ArrayList<TechnicalFaculty>();
                physicsAndCosmologyGroup.add(student5);
                physicsAndCosmologyGroup.add(student6);
                physicsAndCosmologyGroup.add(student7);

                ArrayList<LawFaculty> lawScienceGroup = new ArrayList<LawFaculty>();
                lawScienceGroup.add(student01);
                lawScienceGroup.add(student02);
                lawScienceGroup.add(student03);
                lawScienceGroup.add(student04);

                ArrayList<LawFaculty> group = new ArrayList<LawFaculty>();
                group.add(student444);

                ArrayList<LawFaculty> groupFBI = new ArrayList<LawFaculty>();
                groupFBI.add(student777);

                ArrayList<MedicalFaculty> medicineGroup = new ArrayList<MedicalFaculty>();
                medicineGroup.add(student001);
                medicineGroup.add(student002);
                medicineGroup.add(student003);

                ArrayList<MedicalFaculty> biologicalScienceGroup = new ArrayList<MedicalFaculty>();
                biologicalScienceGroup.add(student004);
                biologicalScienceGroup.add(student005);
                biologicalScienceGroup.add(student006);

                // Calculating the average score of each student
                System.out.println("\nTechnical Faculty. Computer Science Group. Average score of each student: ");
                for (TechnicalFaculty averageScore : computerScienceGroup) {
                        System.out.println("Average score of " + averageScore.getNameAndSurnameOfAStudent() + " = "
                                        + "{" + averageScore.getAverageScoreOfAStudentOfTechnicalFaculty() + "}");
                }

                System.out.println("\nTechnical Faculty. Physics and Cosmology Group. Average score of each student: ");
                for (TechnicalFaculty averageScore : physicsAndCosmologyGroup) {
                        System.out.println("Average score of " + averageScore.getNameAndSurnameOfAStudent() + " = "
                                        + "{" + averageScore.getAverageScoreOfAStudentOfTechnicalFaculty() + "}");
                }

                System.out.println("\nLaw Faculty. Law Science Group. Average score of each student: ");
                for (LawFaculty averageScore : lawScienceGroup) {
                        System.out.println("Average score of " + averageScore.getNameAndSurnameOfAStudent() + " = "
                                        + "{" + averageScore.getAverageScoreOfAStudentOfLawFaculty() + "}");
                }

                System.out.println("\nLaw Faculty. FBI Group. Average score of each student: ");
                for (LawFaculty score : groupFBI) {
                        if (score.getScore1() > 10 || score.getScore1() < 0) {
                                try {
                                        throw new Exception();

                                } catch (Exception impossibleScore) {
                                        System.out.println("ERROR : The score can't be less than 0 and more than 10!");
                                }
                        } else {
                                System.out.println("Average score is " + score.getAverageScoreOfAStudentOfLawFaculty());
                        }
                }

                System.out.println("\nMedical Faculty. Medicine Group. Average score of each student: ");
                for (MedicalFaculty averageScore : medicineGroup) {
                        System.out.println("Average score of " + averageScore.getNameAndSurnameOfAStudent() + " = "
                                        + "{" + averageScore.getAverageScoreOfAStudentOfMedicalFaculty() + "}");
                }

                System.out.println("\nMedical Faculty. Biological Science Group. Average score of each student: ");
                for (MedicalFaculty averageScore : biologicalScienceGroup) {
                        System.out.println("Average score of " + averageScore.getNameAndSurnameOfAStudent() + " = "
                                        + "{" + averageScore.getAverageScoreOfAStudentOfMedicalFaculty() + "}");
                }

                // Calculating the medicine group's average score for a medicine subject
                int sum = 0;
                int numberOfStudents = 3;
                for (Faculties averageScoreOfMedicineGroupByMedicineSubject : medicineGroup) {
                        sum += averageScoreOfMedicineGroupByMedicineSubject.getScore1();
                }
                System.out.println("\nAverage Score of Medicne Group by Medicine subject: " + "{"
                                + (sum / numberOfStudents) + "}");

                // Calculating the University's average score by Psychology subject
                int sum1 = 0;
                for (Faculties classes : computerScienceGroup) {
                        if (classes.getSubject2() == "Psychology") {
                                sum1 += classes.getScore2();
                        }
                }

                for (Faculties classes : physicsAndCosmologyGroup) {
                        if (classes.getSubject2() == "Psychology") {
                                sum1 += classes.getScore2();
                        }
                }

                for (Faculties classes : lawScienceGroup) {
                        if (classes.getSubject2() == "Psychology") {
                                sum1 += classes.getScore2();
                        }
                }

                for (Faculties classes : groupFBI) {
                        if ((classes.getSubject2() != "Psychology") && (classes.getSubject1() != "Psychology")) {
                                try {
                                        throw new Exception();
                                } catch (Exception noSuchSubject) {
                                        System.out.println("ERROR : There is no such subject!");
                                }
                        } else if (classes.getSubject1() == "Psychology") {
                                sum1 += classes.getScore1();

                        } else {
                                sum1 += classes.getScore2();
                        }
                }

                for (Faculties classes : medicineGroup) {
                        if (classes.getSubject2() == "Psychology") {
                                sum1 += classes.getScore2();
                        }
                }

                for (Faculties classes : biologicalScienceGroup) {
                        if (classes.getSubject2() == "Psychology") {
                                sum1 += classes.getScore2();
                        }
                }
                System.out.println("\nThe University's average score by Psychology subject: " + "{" + (sum1 / 6) + "}");

                // Exceptions//
                // computerScienceGroup = N0; physicsAndCosmologyGroup = N1; lawScienceGroup =
                // N2; group = N3; groupFBI = N4; medicineGroup = N5; biologicalScienceGroup =
                // N6
                try {
                        int[] allGroups = new int[7];
                        int N = 1;
                        for (int i = 0; i < 7; i++) {
                                allGroups[i] = N;
                                N++;
                        }
                        System.out.println(allGroups[8]);

                } catch (IndexOutOfBoundsException e) {
                        System.err.println("ERROR : There is no group  with number 8!");
                }

                try {
                        for (LawFaculty classes : group) {
                                classes.getNameAndSurnameOfAStudent();
                                if (classes.getNameAndSurnameOfAStudent() == "") {
                                        throw new Exception();
                                }
                        }
                } catch (Exception e) {
                        System.out.println("ERROR : There are no students!");
                }

                try {
                        String requiredFaculty = "Anatomical Faculty";
                        if (requiredFaculty != "Technical Faculty" || requiredFaculty != "Law Faculty"
                                        || requiredFaculty != "Medical Faculty") {
                                throw new Exception("...");
                        }
                } catch (Exception e) {
                        System.out.println("ERROR : The University doesn't have such faculty!");
                }
        }
}