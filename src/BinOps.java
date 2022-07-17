public class BinOps {

    public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись Реализуйте оба метода.
      Для парсинга из двоичной записи используйте Integer.parseInt(binStr, 2),
      для конвертации обратно - Integer.toBinaryString(Int)*/
        return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
    }
    public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
        return Integer.toBinaryString(Integer.parseInt(a, 2) * Integer.parseInt(b, 2));
    }
}