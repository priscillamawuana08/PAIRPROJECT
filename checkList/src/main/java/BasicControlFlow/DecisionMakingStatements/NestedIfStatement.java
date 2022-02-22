package BasicControlFlow.DecisionMakingStatements;

public class NestedIfStatement {
    public static void main(String[] args) {
        String name = "Samuel Afotey";

        if(name.endsWith("y")){
            System.out.println("Afotey");
            if(name.equals("Samuel afotey")){
                System.out.println("It is equal to Samuel Afotey");
            }
            else{
                System.out.println("Incorrect name");
            }
        }



    }
}
