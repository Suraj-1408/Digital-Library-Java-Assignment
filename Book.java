class Book{

    private String bookId,title,author,genre,status;

    //using constructor to initialize the objects.
    public Book(String bookId,String title,String author,String genre,String status){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.status = status;
    }


    //helper functions to extract book details and update book details/
    public String getBookId(){
        return bookId;
    } 

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getGenre(){ 
        return genre;
    }
    
    public void setGenre(String genre){ 
        this.genre = genre; 
    }

    public String getStatus(){ 
        return status; 
    }

    public void setStatus(String status){ 
        this.status = status; 
    }



    @Override
    public String toString() {
        return "ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Genre: " + genre + ", Status: " + status;
    }

}
