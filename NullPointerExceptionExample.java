public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;
        try {
            int length = str.length(); // Mengakses metode length() dari objek null
        } catch (NullPointerException e) {
            System.out.println("Terjadi NullPointerException: " + e.getMessage());
        }
    }
}
