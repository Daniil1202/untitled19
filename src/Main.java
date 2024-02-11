import java.util.Random;

public class Main {
    public static void main(String[] args) {
                byte [][] array = new byte[3][3];
                fillArray(array);
                printArray(array);

                byte [][] copyOfField = new byte[3][3];
                int field = copyOfField(array);
                returnField(copyOfField,field);
                System.out.println();
                printArray(copyOfField);


            }
            public static void fillArray(byte[][]array){
                Random random = new Random();
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array.length; j++) {
                        array[i][j] = (byte) random.nextInt(0,4);
                    }
                }
            }
            public static void printArray(byte[][]array){
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array.length; j++) {
                        System.out.println(array[i][j]+" ");
                    }
                    System.out.println();
                }

            }
            public static int copyOfField(byte[][] array){
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array.length; j++) {
                        stringBuilder.append(array[i][j]);
                    }
                }
                if (stringBuilder.toString().startsWith("0")){
                    String res = stringBuilder.toString().replaceFirst("0", "-");
                    return Integer.parseInt(res);
                }
                return Integer.parseInt(stringBuilder.toString());
            }
            public static void returnField(byte[][] array,int field){
                String num = String.valueOf(field);
                int target = 0;
                if (num.charAt(target) == '-'){
                    num = num.replaceFirst("-","0");
                }
                for (int i = 0; i < array.length; i++) {
                    for (int j = 0; j < array.length; j++) {
                        array[i][j]= Byte.parseByte(String.valueOf(num.charAt(target)));
                        target++;

                    }

                }
            }
        }