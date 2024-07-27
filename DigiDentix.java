import java.util.Scanner;
class DentalHealth {
    private String name;
    int age;
    private double weight;
    private String sex;
    int brushingDuration;
    int brushingFrequency;
    String mouthwashUsage;
    String dietaryHabits;
    String toothbrushReplacement;
    String tongueCleaning;
    String smoking;
    String alcohol;
    public DentalHealth(String name, int age, double weight, String sex, int brushingDuration, int
            brushingFrequency,
                        String mouthwashUsage, String dietaryHabits, String toothbrushReplacement,
                        String tongueCleaning, String smoking, String alcohol) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.sex = sex;
        this.brushingDuration = brushingDuration;
        this.brushingFrequency = brushingFrequency;
        this.mouthwashUsage = mouthwashUsage;
        this.dietaryHabits = dietaryHabits;
        this.toothbrushReplacement = toothbrushReplacement;
        this.tongueCleaning = tongueCleaning;
        this.smoking = smoking;
        this.alcohol = alcohol;
    }
    String OralHealthScore() {
        if (brushingDuration >=2 && brushingFrequency >=2 && mouthwashUsage.equalsIgnoreCase("y")
                &&
                dietaryHabits.equalsIgnoreCase("1") && toothbrushReplacement.equalsIgnoreCase("y") &&
                tongueCleaning.equalsIgnoreCase("y") && smoking.equalsIgnoreCase("n") &&
                alcohol.equalsIgnoreCase("n")) {
            return "Good Oral Health";
        } else {
            return "Needs Improvement in Oral Health";
        }
    }
    public void printPersonalDetails() {
        System.out.println();
        System.out.println("Personal Details:");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Gender : " + sex);
    }
}
class DentalInsurance extends DentalHealth {
    private double baseInsuranceAmount;
    public DentalInsurance(String name, int age, double weight, String sex, int brushingDuration, int
            brushingFrequency,
                           String mouthwashUsage, String dietaryHabits, String toothbrushReplacement,
                           String tongueCleaning, String smoking, String alcohol) {
        super(name, age, weight, sex, brushingDuration, brushingFrequency, mouthwashUsage,
                dietaryHabits,
                toothbrushReplacement, tongueCleaning, smoking, alcohol);
        if (age < 20) {
            baseInsuranceAmount = 1000;
        } else if (age >= 20 && age <= 30) {
            baseInsuranceAmount = 2000;
        } else if (age >= 30 && age <= 40) {
            baseInsuranceAmount = 4000;
        } else if (age >= 40 && age <= 50) {
            baseInsuranceAmount = 4500;
        } else if (age >= 50 && age <= 60) {
            baseInsuranceAmount = 4900;
        } else if (age >= 60 && age <= 70) {
            baseInsuranceAmount = 5000;
        } else if (age >= 70 && age <= 80) {
            baseInsuranceAmount = 5240;
        }
    }
    public double calculateInsuranceAmount() {
        String oralHealthScore1 = OralHealthScore();
        if (oralHealthScore1.equalsIgnoreCase("Good Oral Health")) {
            return baseInsuranceAmount - 500;
        } else {
            return baseInsuranceAmount + 500;
        }
    }
    public void printInsuranceDetails() {
        System.out.println();
        System.out.println("Insurance Details:");
        System.out.println("Base Insurance Amount : ₹" + baseInsuranceAmount);
        System.out.println("Oral Health Score : " + OralHealthScore());
        System.out.println("Final Insurance Amount: ₹" + calculateInsuranceAmount());
    }
}
public class DigiDentix{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter age: ");
        int age;
        while (true) {
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                if (age >= 0 && age<=100) {
                    break;
                } else {
                    System.out.println("Age cannot be negative. Please enter a valid age:");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid age:");
                scanner.next();
            }
        }
        System.out.print("Enter weight: ");
        double weight;
        while (true) {
            if (scanner.hasNextDouble()) {
                weight = scanner.nextDouble();
                if (weight >= 0 && weight <=150) {
                    break;
                } else {
                    System.out.println("Weight cannot be negative. Please enter a valid weight:");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid weight:");
                scanner.next();
            }
        }
        scanner.nextLine();
        String sex;
        while (true) {
            System.out.print("Enter Gender(M/F): ");
            sex = scanner.nextLine().toLowerCase();
            if (sex.equals("m") || sex.equals("f")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter 'M' or 'F'.");
            }
        }
        int brushingDuration;
        while (true) {
            System.out.print("Enter brushing duration (in minutes): ");
            if (scanner.hasNextInt()) {
                brushingDuration = scanner.nextInt();
                if (brushingDuration >0 && brushingDuration<=30) {
                    break;
                } else {
                    System.out.println("Brushing duration cannot be negative. Please enter a valid duration:");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }
        int brushingFrequency;
        while (true) {
            System.out.print("Enter brushing frequency (times per day): ");
            if (scanner.hasNextInt()) {
                brushingFrequency = scanner.nextInt();
                if (brushingFrequency >0 && brushingFrequency <=4 ) {
                    break;
                } else {
                    System.out.println("Brushing frequency cannot be negative. Please enter a valid frequency:");
                }
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();
            }
        }
        scanner.nextLine();
        String mouthwashUsage;
        while (true) {
            System.out.print("Do you use mouthwash (Y/N): ");
            mouthwashUsage = scanner.nextLine().toLowerCase();
            if (mouthwashUsage.equals("y") || mouthwashUsage.equals("n")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter 'Y' or 'N'.");
            }
        }
        String dietaryHabits;
        while (true) {
            System.out.print("Enter dietary habits (1.Balanced Diet/2.Imbalanced diet): ");
            dietaryHabits = scanner.nextLine();
            if (dietaryHabits.equalsIgnoreCase("1") || dietaryHabits.equalsIgnoreCase("2")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter (1.Balanced Diet/2.Imbalanced diet):.");
            }
        }
        String toothbrushReplacement;
        while (true) {
            System.out.print("Do you replace your toothbrush regularly (Y/N): ");
            toothbrushReplacement = scanner.nextLine().toLowerCase();
            if (toothbrushReplacement.equals("y") || toothbrushReplacement.equals("n")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter 'Y' or 'N'.");
            }
        }
        String tongueCleaning;
        while (true) {
            System.out.print("Do you clean your tongue (Y/N): ");
            tongueCleaning = scanner.nextLine().toLowerCase();
            if (tongueCleaning.equals("y") || tongueCleaning.equals("n")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter 'Y' or 'N'.");
            }
        }
        String smoking;
        while (true) {
            System.out.print("Do you smoke (Y/N): ");
            smoking = scanner.nextLine().toLowerCase();
            if (smoking.equals("y") || smoking.equals("n")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter 'Y' or 'N'.");
            }
        }
        String alcohol;
        while (true) {
            System.out.print("Do you consume alcohol (Y/N): ");
            alcohol = scanner.nextLine().toLowerCase();
            if (alcohol.equals("y") || alcohol.equals("n")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter 'Y' or 'N'.");
            }
        }
        DentalInsurance dentalInsurance = new DentalInsurance(name, age, weight, sex, brushingDuration,
                brushingFrequency, mouthwashUsage, dietaryHabits, toothbrushReplacement, tongueCleaning, smoking,
                alcohol);
        dentalInsurance.printPersonalDetails();
        dentalInsurance.printInsuranceDetails();
        scanner.close();
    }
} 

