package books;

public class BookDetails {
    public static void main(String[] args){


        Recommend doI = new Recommend();
        String title = doI.bookTitle("Evie Drake Starts Over");
        System.out.println(title);
        String author = doI.authorName("Linda Holmes");
        System.out.println(author);
        String rating = doI.bookRating(5);
        System.out.println(rating);
        String bottomLine = doI.doIRecommend(5);
        System.out.println(bottomLine);


    }
}
