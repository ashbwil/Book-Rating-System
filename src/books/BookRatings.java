package books;

public class BookRatings {
    private String Book_Title;
    private String Author_Name;
    private String Book_Rating;
    private String Book_Category;

    BookRatings(){

        Book_Title = "No Title";
        Book_Rating = "Unknown";
        Author_Name = "Unknown";
        Book_Category ="None";
    }
    String bookTitle(String title){
        Book_Title = title;
        return Book_Title;
    }
    String authorName(String authorName){
        if (authorName.equals("FD")){
            Author_Name = "Franklin Dixon";
        }
        else if (authorName.equals("GO")){
            Author_Name = "George Orwell";
        }
        else {
            Author_Name = "Unknown";
        }
        return Author_Name;
    }
    String bookRating(int bookRating){
        Book_Rating = bookRating + " out of 10";
        return Book_Rating;
    }
    private String Category(int bookRating){
        String category = "";
        if (bookRating >= 0 && bookRating <= 3){
            category = "Bad";
        }
        else if (bookRating > 3 && bookRating <= 7 ){
            category = "Okay";
        }
        else if (bookRating > 7 && bookRating <= 10){
            category = "Good";
        }
        else{
            category = "Invalid Rating";
        }
        return "This book is " + category;
    }
    String getCategory(int bookRating){

        Book_Rating=this.Category(bookRating);
        return Book_Rating;
    }

}
