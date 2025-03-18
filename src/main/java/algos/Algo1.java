package algos;

public class Algo1 {

    public static void main(String[] args) {
        Algo1 algo1 = new Algo1();
        assert algo1.openBook(new String[] {"book1"}) == false;
        assert algo1.openBook(new String[] {"book1", "Sapience"}) == true;
        assert algo1.openBook(new String[] {"The Alchemist", "Sapience"}) == true;
        assert algo1.openBook(new String[] {"book1","book2", "book3", "books4", "Sapience"}) == true;
        assert algo1.openBook(new String[] {"book1","book2", "book3", "books4", "boook5", "Sapience"}) == false;


    }

    boolean openBook(String[] bookNames) {

        String[] availableBooks = {"Sapience", "The Alchemist", "The Art of War"};
        //re-write for-loop with while loop
        int attempt = 0;
        int bookIndex = 0;

        while (attempt != 5 && attempt < bookNames.length) {

            String currentBook = bookNames[bookIndex];
            bookIndex++;

            if (isBookAvailable(currentBook, availableBooks)) {
                System.out.println("Opening " + currentBook);
                return true;
            }
            attempt++;

        }

//        for (int attempt = 0; attempt < 5 && attempt< bookNames.length; attempt++) {
//
//            String currentBook = bookNames[attempt];
//            if (isBookAvailable(currentBook, availableBooks)) {
//                System.out.println("Opening " + currentBook);
//                return true;
//            }
//
//        }
        System.out.println("no books found");
        return false;
    }

        private boolean isBookAvailable (String bookName, String[]availableBooks){
            for (int i = 0; i < availableBooks.length; i++) {
                if (bookName.equals(availableBooks[i])) {
                    return true;
                }
            }
            return false;
        }

}
