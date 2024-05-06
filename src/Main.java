public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 4},
                {5, 6, 4}
        };

        // Orjinal matrisin boyutlarını al
        int rows = matrix.length;
        int columns = matrix[0].length;

        // Transpoze matrisin boyutlarını oluştur
        int[][] transpose = new int[columns][rows];

        // Transpozunu al
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Transpoz matrisi yazdır
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}
