package controllers;

import models.Page;
import models.PageElements;
import models.CommentString;

public class Controller{

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