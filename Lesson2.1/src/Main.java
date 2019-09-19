public class Main {
    public static void main(String[] args) {


            String[][] stringArray0 = new String[][] {
                    {"1", "1", "1", "1"},
                    {"1", "1", "1", "1"},
                    {"1", "1", "1", "1"},
                    {"1", "1", "1", "1"}
            };
            String[][] stringArray1 = new String[][] {
                    {"2", "2", "2", "2"},
                    {"2", "2", "2", "2"},
                    {"2", "2", "2", "2"},
                    {"2", "2", "2", "2"}
            };
            String[][] stringArray2 = new String[][] {
                    {"3", "3", "3", "3"},
                    {"3", "3", "3", "3"},
                    {"3", "3", "3", "3"},
                    {"3", "3", "3", "3"}
            };
            String[][] stringArray3 = new String[][] {
                    {"4", "4", "4", "4"},
                    {"4", "4", "4", "4"},
                    {"4", "4", "4", "4"},
                    {"4", "4", "4", "4"}
            };

            try {
                System.out.println("Сумма элементов массива равна " + transformAndSum(stringArray0));
            } catch (MyArraySizeException | MyArrayDataException e) {
                System.out.println(e);
            }
            try {
                System.out.println("Сумма элементов массива равна " + transformAndSum(stringArray1));
            } catch (MyArraySizeException | MyArrayDataException e) {
                System.out.println(e);
            }
            try {
                System.out.println("Сумма элементов массива равна " + transformAndSum(stringArray2));
            } catch (MyArraySizeException | MyArrayDataException e) {
                System.out.println(e);
            }
            try {
                System.out.println("Сумма элементов массива равна " + transformAndSum(stringArray3));
            } catch (MyArraySizeException | MyArrayDataException e) {
                System.out.println(e);
            }
        }

        private static int transformAndSum (String[][] in) throws MyArraySizeException, MyArrayDataException {
            int arrDim = 4;
            int sum = 0;

            // Проверка массива
            if (in.length != 4) {
                throw new MyArraySizeException(String.format("Размерность массива должна быть %dх%d.", arrDim, arrDim));
            }
            //Из-за того что размерность вложенных массивов не всегда может быть одинакова, то нужна проверить чо, что в каждом из 4-х основных измерений находится массив ровно из 4 элементов//
            for (int i = 0; i < in.length; i++) {
                if (in[i].length != 4) {
                    throw new MyArraySizeException(String.format("Размерность массива должна быть %dх%d.", arrDim, arrDim));
                }
            }

            for (int i = 0; i < in.length; i++) {
                for (int j = 0; j < in[i].length; j++) {
                    try {
                        sum += valueOf(in[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(String.format("В позиции [%d][%d] исходного массива находится не целое число %s.", i, j, in[i][j]));
                    }
                }
            }

            return sum;
        }

    private static int valueOf(String s) {
        return 0;
    }

}






