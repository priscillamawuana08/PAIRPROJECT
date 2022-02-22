package BasicControlFlow.DecisionMakingStatements;

public class IfElseIfStatement {
    public static void main(String[] args) {
        int SamAge = 50;
        int Maage = 23;

        if(SamAge + Maage < 50){
            System.out.println("They are not yet 50 years in marriage ");
        }
        else if(SamAge + Maage >= 50){
            System.out.println("They are 50 years or more in marriage");
        }
        else{
            System.out.println("They are not married");
        }

    }
}
