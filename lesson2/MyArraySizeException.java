package lesson2;

public class MyArraySizeException extends MyException {
    public MyArraySizeException() {
        super("Введите корректны размер матрицы: 4х4");
    }
}
