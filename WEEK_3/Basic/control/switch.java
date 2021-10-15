class switch{
    public static void main(String args[]){
        throws java.io.IOException;
        char choice;
        do{
            System.out.println("Help on:");
            System.out.println("1. if");
            System.out.println("2. Switch");
            System.out.println("3. While");
            System.out.println("4. do While");
            System.out.println("5. for\n");
            System.out.println("choose one:");
            choice=(char)System.in.read();

        }while(choice<'1' || choice>'5');
        System.out.println("\n");
        switch(choice){
            case '1':
            System.out.println("The if\n");
            System.out.println("if(condition) statement");
            System.out.println("else statement");
            break;
            case '2':
            System.out.println("the switch\n");
            System.out.println("switch expression() [");
            System.out.println("case constant");
            System.out.println("statement sequence");
            System.out.println("break");
            System.out.println("//...");
            System.out.println("]");
            break;
            case '3':
            System.out.println("The while\n");
            System.out.println("while(condition) statement");
            break;
            case '4':
            System.out.println("The do while\n");
            System.out.println("do {");
            System.out.println("statement;");
            System.out.println("} while(condition);");
            break;
            case '5':
            System.out.println("The for:\n");
            System.out.println("for(init;condition;iterator)");
            System.out.println("statement;");
            break;
        }
    }
}