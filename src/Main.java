public class Main {
    public static void main(String[] args) {
        //Задание 1
        int onePersonAge = 11;
        int twoPersonAge = 31;
        if (twoPersonAge >= 18) {
            System.out.println("Поздравляем с совершеннолетием, дружище!" +
                    "\nТеперь тебе всё можно!\n");
        }
        if (onePersonAge < 18) {
            System.out.println("Ты еще маленький, детка!\n" +
                    "Подрасти, прежде чем пускаться во все тяжкие!\n");
        }
        //Задание 2
        int age1 = 9;
        int age2 = 21;
        int age3 = 39;
        if (age1 >= 7 && age1 < 18) {
            System.out.println("Ребенок ходит в школу\n");
        }
        if (age2 >= 18) {
            System.out.println("Человек закончил школу\n");
        }
        if (age3 >= 24) {
            System.out.println("Человек закончил универ. Пора искать работу.\n");
        }
        //Задание 3
        int countManOnTheTrain1 = 10;
        int countManOnTheTrain2 = 70;
        int countManOnTheTrain3 = 102;
        if (countManOnTheTrain1 < 60) {
            System.out.println("В вагоне есть сидячие места\n");
        }
        if (countManOnTheTrain2 >= 60 && countManOnTheTrain2 < 102) {
            System.out.println("В вагоне есть только стоячие места\n");
        }
        if (countManOnTheTrain3 >= 102) {
            System.out.println("В этом вагоне места закончились, поищи другой!\n");
        }

        //Задание 1.1
        int personAge = 35;
        if (personAge >= 18) {
            System.out.println("Поздравляем с совершеннолетием, дружище!" +
                    "\nТеперь тебе всё можно!\n");
        } else {
            System.out.println("Ты еще маленький, детка!\n" +
                    "Подрасти, прежде чем пускаться во все тяжкие!\n");
        }
        //Задание 2
        int age4 = 21;
        if (age4 < 7) {
            System.out.println("Мы не придумали сообщение на этот случай...\n");
        }
        if (age4 >= 7 && age4 < 18) {
            System.out.println("Ребенок ходит в школу\n");
        }
        if (age4 >= 18 && age4 < 24) {
            System.out.println("Человек закончил школу\n");
        } else {
            System.out.println("Человек закончил универ. Пора искать работу.\n");
        }
        //Задание 3
        int countManOnTheTrain4 = 70;

        if (countManOnTheTrain4 < 60) {
            System.out.println("В вагоне есть сидячие места\n");
        }
        if (countManOnTheTrain4 >= 60 && countManOnTheTrain2 < 102) {
            System.out.println("В вагоне есть только стоячие места\n");
        } else {
            System.out.println("В этом вагоне места закончились, поищи другой!\n");
        }
        //Задача 3.1
        int ageOfMan1 = 4;
        int ageOfMan2 = 10;
        int ageOfMan3 = 19;
        int ageOfMan4 = 31;
        boolean goToKindergarten = ageOfMan1 >= 2 && ageOfMan1 <= 6;
        boolean goToSchool = ageOfMan2 >= 7 && ageOfMan2 <= 18;
        boolean goToUniversity = ageOfMan3 >= 18 && ageOfMan3 <= 24;
        boolean goToWork = ageOfMan4 > 24;
        if (goToKindergarten) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в детский сад\n", ageOfMan1);
        }
        if (goToSchool) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в школу\n", ageOfMan2);
        }
        if (goToUniversity) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить в университет\n", ageOfMan3);
        }
        if (goToWork) {
            System.out.printf("Если возраст человека равен %d, то ему нужно ходить на работку\n", ageOfMan4);
        }
        else {
            System.out.printf("Человек еще слишком маленький, чтобы куда-то ходить\n");
        }

        //Задача 3.2
        int ageOfAttractionVisitor1 = 3;
        int ageOfAttractionVisitor2 = 9;
        int ageOfAttractionVisitor3 = 21;
        boolean canNotByATicket = ageOfAttractionVisitor1 <=5;
        boolean visitingAccompanied = ageOfAttractionVisitor2 >5 && ageOfAttractionVisitor2 <=14;
        boolean visitingUnaccompanied = ageOfAttractionVisitor3 >14 && ageOfAttractionVisitor3 <100;
                if (canNotByATicket){
            System.out.println("Ты не можешь кататься на аттракционе, подрасти еще немного!");
        }
        if (visitingAccompanied){
            System.out.println("Попроси взрослого покататься с тобой, одного тебя не пустят!");
        }
        if (visitingUnaccompanied){
            System.out.println("Ты можешь прокатиться сам, без сопровождения.");
        }
        else{
            System.out.println("Люди столько не живут) А если живут - им вредно кататься на каруселях!");
        }

        //Задание 3.3
        int one = 5;
        int two = 80;
        int three = 1;
        if (one>two && one>three){
            System.out.printf("Число %d самое большое из трех.", one);
        }
        if (two>one && two>three){
            System.out.printf("Число %d самое большое из трех.", two);
        }
        else{
            System.out.printf("Число %d самое большое из трех.", three);
        }
    }

    }
