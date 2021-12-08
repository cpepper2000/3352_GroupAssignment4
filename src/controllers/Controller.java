package controllers;

import models.Page;
import models.PageElements;
import models.CommentString;

import views.ViewPage;
import views.ViewCommentString;
import views.ViewPageElement;

//This controller class would hold all logic that allows for the lnkages between
//The model classes (including pages, elements and comments) and their associated view classes
public class Controller{

    //objects from the classes instantiated so that they can be passed into the constructor
    models.CommentString commentString;
    models.Page page;
    models.PageElements pageElements;

    views.ViewPage viewPage;
    views.ViewCommentString viewCommentString;
    views.ViewPageElement viewPageElement;

    public Controller(models.CommentString commentString, models.Page page, models.PageElements pageElements, views.ViewPage viewPage, views.ViewCommentString viewCommentString, views.ViewPageElement viewPageElement ){

        this.commentString = commentString;
        this.page = page;
        this.pageElements;

        this.viewPageElement = viewPageElement;
        this.viewPageElement.setPageElementController(this);

        this.viewPage = viewPage;
        this.viewPage.setPageController(this);

        this.viewCommentString = viewCommentString;
        this.viewCommentString.setCommentStringController(this);

    }
    /*
     The following methods when instantiated would contain the logic necessary for inserting
     or editing different class objects into the model section of the architechture
     There are essentially three types of objects, pageElements, pages and commentstring
     And as such each of them has functionality for their addition, deletion and modification,
     Which together form the core functionalities of the system. The controller does not implement
     the changes internally, it manipulates the model to make the changes. Note that the newElement
     function includes a passed argument because the element object itself is essentially treated
     as a frame for the page to use and reference when dealing with text, images, vides etc.
    */
    public void newElement(PageElement elementType){
        pageElements.attach(elementType);
    }

    public void editElement(){

    }

    public void removeElement(){

    }

    public void newPage(){

    }

    public void editPage(){

    }

    public void removePage(){

    }

    public void newCommentString(){

    }

    public void editCommentString(){

    }

    public void removeCommentString(){

    }
}