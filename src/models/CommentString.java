package models;

import java.util.ArrayList;
import java.util.List;

public class CommentString {

    List<CommentString> comment= new ArrayList<CommentString>();
    
    //This is the implementation of the subject abstract class to allow
    //Attachment of observers that show when elemtns are modified
    //And can notify users accordingly 
    public void attach(CommentString comment){
        this.comment.add(comment);
    }

    //In fully realized functionality, this would include logic for storing a large string that
    //could be split based on user and time of entry and would be modified/set such that
    //seperate entries are distinct
    public void setCommentString(String commentString, int index) {
        this.comment = commentString;
    }

    public List<CommentString> getCommentString(){
        return comment;
    }

    //Functionality for removing comment string objects from the data structure of the application
    public void removeCommentString(int index){
    }

    public void respondComment(String respond, int index){
        //this is where the program would add the response to the comment at the given index

    }
}