import java.util.*;

class Library{

    //making use Map interface  to store books details
    //as you map interface and its class HashMap we can store data in form of Key-Value pair .

    private Map<String,Book> books;

    //making use of constructor to implement of above map using HashMap class.

    public Library(){
        books = new HashMap<>();    //books is object of class HashMap that creates memeory for the new instance.
    }


    //creating methods for different operations.
    public void addBook(String bookId,String title,String author,String genre,String status){
            //to prevent duplicate entry for bookId,check in hashmap before inserting new record.
            if(books.containsKey(bookId)){
                System.out.println("BookID , already exits.");
                return;
            }

            //to ensure title & author are not empty. using isEmpty() method on string 
            if(title.isEmpty() || author.isEmpty()){
                System.out.println("Title or Author Field cannot be empty.");
                return;
            }

            //to keep values of status either "Available or checked out" 
            if(!status.equals("Available") && !status.equals("Checked Out")){
                System.out.println("Status Value can either be Available or Checked Out");
                return;
            }

            books.put(bookId,new Book(bookId,title,author,genre,status));
            System.out.println("Book Added successfully!");
    }


    //method to list all existing books.
    public void viewBooks(){
        //check if book exist.
        if(books.isEmpty()){
            System.out.println("No books added yet.");
            return;
        }

        for(Book book :books.values()){
            System.out.println(book);
        }
    }


    //method to search a book
    public void searchBook(String input){

        boolean found = false;

        for(Book book : books.values()){
            if(book.getBookId().equals(input) || book.getTitle().equals(input)){
                System.out.println(book);
                found = true;
            }
        }

        if(!found){
            System.out.println("Book not found.");
        }
    }

    //method to updateBook Attribute.
    public void updateBook(String bookId,String title,String author,String genre,String status){
        
        if(!books.containsKey(bookId)){
            System.out.println("Book Id Not found");
            return;
        }

        //extract the bookId.
        Book book = books.get(bookId);

        if(title != null && !title.isEmpty()){
            book.setTitle(title);
        }

        if(author != null && !author.isEmpty()){
            book.setAuthor(author);
        }

        if(genre != null && !genre.isEmpty()){
            book.setGenre(genre);
        }

        if(status != null && (status.equals("Available") || status.equals("Checked Out"))){
            book.setStatus(status);
        }

        System.out.println("Book Details updated successfully.");
    }

    //method to delete a using key
     public void deleteBook(String bookId) {
        if (books.remove(bookId) != null) {
            System.out.println("Book deleted successfully.");
        } else {
            System.out.println("Error: Book ID not found.");
        }
    }
}
