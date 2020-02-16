package books;

public class BookDetails {
    public static void main(String[] args){


        Recommend doI = new Recommend();
        String rating = doI.bookRating(5);
        System.out.println(rating);
        String bottomLine = doI.doIRecommend(5);
        System.out.print(bottomLine);

    }
}
