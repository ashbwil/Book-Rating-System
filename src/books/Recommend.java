package books;

import jdk.jfr.Category;

public class Recommend extends BookRatings{

    private String recommend;

    Recommend(){
        super();
        recommend = "I do not know";
    }
    String doIRecommend(int bookRating){
        String recommendation = getCategory(bookRating);


        if (recommendation.equals("This book is Bad")){
            this.recommend = "Do not recommend.";
        }
        else if(recommendation.equals("This book is Okay")){
            this.recommend = "Somewhat recommend.";
        }
        else if(recommendation.equals("This book is Good")){
            this.recommend = "Highly recommend.";
        }
        else{
            this.recommend = "I don't know what to recommend.";
        }
        return this.recommend;
    }
}
