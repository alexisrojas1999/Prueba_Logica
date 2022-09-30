import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        while (true) {
            System.out.println("Please Enter a Number [number of times you want the cycle to repeate],[the number displayed in the display]\n");
            String number = userInput.next();
            if (number.equals("0,0")) break;
            int repetitionNum=Integer.parseInt(number.split( ",")[0]);
            String decimal=number.split(",")[1];

            String [][] displayArray=new String[decimal.length()][7];
            int [] Arrayfigure=new int[decimal.length()];
            for (int i=0;i<decimal.length();i++){
                Arrayfigure[i]=Integer.parseInt(String.valueOf(decimal.charAt(i)));
            }

            for (int i = 0; i < decimal.length(); i++) {
                switch (Arrayfigure[i]) {

                    case 1: {
                        displayArray[i][0] = "   ";
                        displayArray[i][1] = " ";
                        displayArray[i][2] = "|";
                        displayArray[i][3] = "   ";
                        displayArray[i][4] = " ";
                        displayArray[i][5] = "|";
                        displayArray[i][6] = "   ";
                        break;
                    }

                    case 2: {
                        displayArray[i][0] = "---";
                        displayArray[i][1] = " ";
                        displayArray[i][2] = "|";
                        displayArray[i][3] = "---";
                        displayArray[i][4] = "|";
                        displayArray[i][5] = " ";
                        displayArray[i][6] = "---";
                        break;
                    }

                    case 3: {
                        displayArray[i][0] = "---";
                        displayArray[i][1] = " ";
                        displayArray[i][2] = "|";
                        displayArray[i][3] = "---";
                        displayArray[i][4] = " ";
                        displayArray[i][5] = "| ";
                        displayArray[i][6] = "---";
                        break;
                    }
                    case 4: {
                        displayArray[i][0] = "   ";
                        displayArray[i][1] = "|";
                        displayArray[i][2] = "|";
                        displayArray[i][3] = "---";
                        displayArray[i][4] = "";
                        displayArray[i][5] = "|";
                        displayArray[i][6] = "";
                        break;
                    }
                    case 5: {
                        displayArray[i][0] = "---";
                        displayArray[i][1] = "|";
                        displayArray[i][2] = " ";
                        displayArray[i][3] = "---";
                        displayArray[i][4] = " ";
                        displayArray[i][5] = "|";
                        displayArray[i][6] = "---";
                        break;
                    }
                    case 6: {
                        displayArray[i][0] = "---";
                        displayArray[i][1] = "|";
                        displayArray[i][2] = " ";
                        displayArray[i][3] = "---";
                        displayArray[i][4] = "|";
                        displayArray[i][5] = "|";
                        displayArray[i][6] = "---";
                        break;
                    }
                    case 7: {
                        displayArray[i][0] = "---";
                        displayArray[i][1] = " ";
                        displayArray[i][2] = "|";
                        displayArray[i][3] = "   ";
                        displayArray[i][4] = " ";
                        displayArray[i][5] = "|";
                        displayArray[i][6] = "   ";
                        break;
                    }
                    case 8: {
                        displayArray[i][0] = "---";
                        displayArray[i][1] = "|";
                        displayArray[i][2] = "|";
                        displayArray[i][3] = "---";
                        displayArray[i][4] = "|";
                        displayArray[i][5] = "|";
                        displayArray[i][6] = "---";
                        break;
                    }
                    case 9: {
                        displayArray[i][0] = "---";
                        displayArray[i][1] = "|";
                        displayArray[i][2] = "|";
                        displayArray[i][3] = "---";
                        displayArray[i][4] = " ";
                        displayArray[i][5] = "|";
                        displayArray[i][6] = "---";
                        break;

                    }
                }
            }
            for (int j=0; j < repetitionNum; j++){
                for (int i = 0; i < decimal.length(); i++) {
                    System.out.printf(" %s  ", displayArray[i][0]);
                }
                System.out.println("");
                for (int i = 0; i < decimal.length(); i++) {
                    System.out.printf("%s   %s ", displayArray[i][1], displayArray[i][2]);
                }
                System.out.println("");
                for (int i = 0; i < decimal.length(); i++) {
                    System.out.printf(" %s  ", displayArray[i][3]);
                }
                System.out.println("");
                for (int i = 0; i < decimal.length(); i++) {
                    System.out.printf("%s   %s ", displayArray[i][4], displayArray[i][5]);
                }
                System.out.println("");
                for (int i = 0; i < decimal.length(); i++) {
                    System.out.printf(" %s  ", displayArray[i][6]);
                }

                System.out.println("");
            }
        }
    }
}

