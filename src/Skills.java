import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

class Skills {

    private static String[] selectedSkillList = new String[18];
    private static LinkedList<String> choosesSkill = new LinkedList<>();

    public static void selectSkill(String className) throws Exception {
        Scanner in = new Scanner(new File("Skills.txt"));
        Scanner dsc = new Scanner(new File("Description.txt"));
        Scanner sc = new Scanner(System.in);
        int inLevel = MainGame18v5.level;
        System.out.println("Your Level is " + inLevel + "\nyou can Only Choose " + inLevel + " Skills for your Character");
        char yesNo;
        int count = 0;
        int proficiency;

        LinkedList<String> skillList = new LinkedList<>();
        LinkedList<String> descript = new LinkedList<>();
        for (int i = 0; i < 18; i++) {
            skillList.add(in.nextLine());
            descript.add(dsc.nextLine());
        }

        outerloop:  //(Label)
        while (true) {
            for (int i = 0; i < skillList.size(); i++) {
                System.out.println(skillList.get(i));
                System.out.println(descript.get(i));
                System.out.println("Do You Want This Skill for Your Character?(Y/N)");
                yesNo = sc.next().charAt(0);
                if (yesNo == 'y' || yesNo == 'Y') {
                    choosesSkill.add(skillList.get(i));
                    count++;
                    if (inLevel == count) {
                        break outerloop; //it's break the nested loop.(Label)
                    }
                }
            }
        }
        System.out.println("_______________________________________________________________________________________ ");
        System.out.println("You Select: " + choosesSkill);
        for (int i = 0; i < choosesSkill.size(); i++) {
            selectedSkillList[i] = choosesSkill.get(i);
        }

        if (inLevel <= 4) {
            proficiency = 2;
        } else if (inLevel <= 8) {
            proficiency = 3;
        } else if (inLevel <= 12) {
            proficiency = 4;
        } else if (inLevel <= 16) {
            proficiency = 5;
        } else {
            proficiency = 6;
        }
        System.out.println("Affinity :" + (proficiency + inLevel));
        double rank;
        if (className.equalsIgnoreCase("Barbarian")) {
            for (int i = 0; i < inLevel; i++) {
                if (selectedSkillList[i].equals("Athletics") || selectedSkillList[i].equals("Animal Handling") ||
                        selectedSkillList[i].equals("Nature") || selectedSkillList[i].equals("Intimidation") ||
                        selectedSkillList[i].equals("Perception") || selectedSkillList[i].equals("Survival")) {
                    rank = 1;
                    System.out.println(selectedSkillList[i] + "\t\tRank:" + rank);
                } else {
                    rank = 0.5;
                    System.out.println(selectedSkillList[i] + "\t\tRank:" + rank);
                }
            }
        } else if (className.equalsIgnoreCase("Bard")) {
            rank = 1;
            for (int i = 0; i < inLevel; i++) {
                System.out.println(selectedSkillList[i] + "\t\tRank:" + rank);
            }
        } else if (className.equalsIgnoreCase("Cleric")) {
            for (int i = 0; i < inLevel; i++) {
                if (selectedSkillList[i].equals("History") || selectedSkillList[i].equals("Insight") ||
                        selectedSkillList[i].equals("Medicine") || selectedSkillList[i].equals("Persuasion") ||
                        selectedSkillList[i].equals("Religion")) {
                    rank = 1;
                    System.out.println(selectedSkillList[i] + "\t\tRank:" + rank);
                } else {
                    rank = 0.5;
                    System.out.println(selectedSkillList[i] + "\t\tRank:" + rank);
                }
            }
        } else if (className.equalsIgnoreCase("Druid")) {
            for (int i = 0; i < inLevel; i++) {
                if (selectedSkillList[i].equals("Animal Handling") || selectedSkillList[i].equals("Arcana") ||
                        selectedSkillList[i].equals("Medicine") || selectedSkillList[i].equals("Insight") ||
                        selectedSkillList[i].equals("Nature") || selectedSkillList[i].equals("Religion") ||
                        selectedSkillList[i].equals("Perception") || selectedSkillList[i].equals("Survival")) {
                    rank = 1;
                    System.out.println(selectedSkillList[i] + "\t\tRank:" + rank);
                } else {
                    rank = 0.5;
                    System.out.println(selectedSkillList[i] + "\t\tRank:" + rank);
                }
            }
        } else if (className.equalsIgnoreCase("Fighter")) {
            for (int i = 0; i < inLevel; i++) {
                if (selectedSkillList[i].equals("Acrobatics") || selectedSkillList[i].equals("Animal Handling") ||
                        selectedSkillList[i].equals("Athletics") || selectedSkillList[i].equals("History") ||
                        selectedSkillList[i].equals("Insight") || selectedSkillList[i].equals("Intimidation") ||
                        selectedSkillList[i].equals("Perception") || selectedSkillList[i].equals("Survival")) {
                    rank = 1;
                    System.out.println(selectedSkillList[i] + "\t\tRank:" + rank);
                } else {
                    rank = 0.5;
                    System.out.println(selectedSkillList[i] + "\t\tRank:" + rank);
                }
            }
        } else if (className.equalsIgnoreCase("Monk")) {
            for (int i = 0; i < inLevel; i++) {
                if (selectedSkillList[i].equals("Acrobatics") ||
                        selectedSkillList[i].equals("Athletics") || selectedSkillList[i].equals("History") ||
                        selectedSkillList[i].equals("Insight") || selectedSkillList[i].equals("Religion") ||
                        selectedSkillList[i].equals("Stealth")) {
                    rank = 1;
                    System.out.println(selectedSkillList[i] + "\t\tRank:" + rank);
                } else {
                    rank = 0.5;
                    System.out.println(selectedSkillList[i] + "\t\tRank:" + rank);
                }
            }
        } else if (className.equalsIgnoreCase("Paladin")) {
            for (int i = 0; i < inLevel; i++) {
                if (
                        selectedSkillList[i].equals("Athletics") || selectedSkillList[i].equals("Religion") ||
                                selectedSkillList[i].equals("Insight") || selectedSkillList[i].equals("Intimidation") ||
                                selectedSkillList[i].equals("Persuasion") || selectedSkillList[i].equals("Medicine")) {
                    rank = 1;
                    System.out.println(selectedSkillList[i] + "\t\tRank:" + rank);
                } else {
                    rank = 0.5;
                    System.out.println(selectedSkillList[i] + "\t\tRank:" + rank);
                }
            }
        } else if (className.equalsIgnoreCase("Ranger")) {
            for (int i = 0; i < inLevel; i++) {
                if (selectedSkillList[i].equals("Athletics") || selectedSkillList[i].equals("Animal Handling") ||
                        selectedSkillList[i].equals("Insight") || selectedSkillList[i].equals("Investigation") ||
                        selectedSkillList[i].equals("Nature") || selectedSkillList[i].equals("Perception") ||
                        selectedSkillList[i].equals("Stealth") || selectedSkillList[i].equals("Survival")) {
                    rank = 1;
                    System.out.println(selectedSkillList[i] + "\t\tRank:" + rank);
                } else {
                    rank = 0.5;
                    System.out.println(selectedSkillList[i] + "\t\tRank:" + rank);
                }
            }
        } else if (className.equalsIgnoreCase("Rogue")) {
            for (int i = 0; i < inLevel; i++) {
                if (selectedSkillList[i].equals("Acrobatics") || selectedSkillList[i].equals("Athletics") ||
                        selectedSkillList[i].equals("Deception") || selectedSkillList[i].equals("Insight") ||
                        selectedSkillList[i].equals("Intimidation") || selectedSkillList[i].equals("Investigation") ||
                        selectedSkillList[i].equals("Perception") || selectedSkillList[i].equals("Performance") ||
                        selectedSkillList[i].equals("Persuasion") || selectedSkillList[i].equals("Sleight of Hand") ||
                        selectedSkillList[i].equals("Stealth")) {
                    rank = 1;
                    System.out.println(selectedSkillList[i] + "\t\tRank:" + rank);
                } else {
                    rank = 0.5;
                    System.out.println(selectedSkillList[i] + "\t\tRank:" + rank);
                }
            }
        } else if (className.equalsIgnoreCase("Sorcerer")) {
            for (int i = 0; i < inLevel; i++) {
                if (selectedSkillList[i].equals("Arcana") || selectedSkillList[i].equals("Deception") ||
                        selectedSkillList[i].equals("Insight") || selectedSkillList[i].equals("Intimidation") ||
                        selectedSkillList[i].equals("Persuasion") || selectedSkillList[i].equals("Religion")) {
                    rank = 1;
                    System.out.println(selectedSkillList[i] + "\t\tRank:" + rank);
                } else {
                    rank = 0.5;
                    System.out.println(selectedSkillList[i] + "\t\tRank:" + rank);
                }
            }
        } else if (className.equalsIgnoreCase("Warlock")) {
            for (int i = 0; i < inLevel; i++) {
                if (selectedSkillList[i].equals("Arcana") || selectedSkillList[i].equals("Deception") ||
                        selectedSkillList[i].equals("History") || selectedSkillList[i].equals("Investigation") ||
                        selectedSkillList[i].equals("Nature") || selectedSkillList[i].equals("Intimidation") ||
                        selectedSkillList[i].equals("Religion")) {
                    rank = 1;
                    System.out.println(selectedSkillList[i] + "\t\tRank:" + rank);
                } else {
                    rank = 0.5;
                    System.out.println(selectedSkillList[i] + "\t\tRank:" + rank);
                }
            }
        } else if (className.equalsIgnoreCase("Wizard")) {
            for (int i = 0; i < inLevel; i++) {
                if (selectedSkillList[i].equals("Arcana") || selectedSkillList[i].equals("History") ||
                        selectedSkillList[i].equals("Insight") || selectedSkillList[i].equals("Investigation") ||
                        selectedSkillList[i].equals("Medicine") || selectedSkillList[i].equals("Religion")) {
                    rank = 1;
                    System.out.println(selectedSkillList[i] + "\t\tRank:" + rank);
                } else {
                    rank = 0.5;
                    System.out.println(selectedSkillList[i] + "\t\tRank:" + rank);
                }
            }
        }
    }
}

