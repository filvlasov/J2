package lesson2;

public class MyArrayDataException extends MyException {
    public MyArrayDataException(int row, int column) {
        super(String.format("Некорректный формат в [%d][%d]", row,column));
    }
}
