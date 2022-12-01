public class Books {
    String BookCode,BookTitle,BookAuthor,BookSubject;
    int price, QuantityInStock;
    public Books(String bookCode, String bookTitle, String bookAuthor, String bookSubject, int price,
            int quantityInStock) {
        BookCode = bookCode;
        BookTitle = bookTitle;
        BookAuthor = bookAuthor;
        BookSubject = bookSubject;
        this.price = price;
        QuantityInStock = quantityInStock;
    }
    public String getBookCode() {
        return BookCode;
    }
    public void setBookCode(String bookCode) {
        BookCode = bookCode;
    }
    public String getBookTitle() {
        return BookTitle;
    }
    public void setBookTitle(String bookTitle) {
        BookTitle = bookTitle;
    }
    public String getBookAuthor() {
        return BookAuthor;
    }
    public void setBookAuthor(String bookAuthor) {
        BookAuthor = bookAuthor;
    }
    public String getBookSubject() {
        return BookSubject;
    }
    public void setBookSubject(String bookSubject) {
        BookSubject = bookSubject;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getQuantityInStock() {
        return QuantityInStock;
    }
    public void setQuantityInStock(int quantityInStock) {
        QuantityInStock = quantityInStock;
    }
    
    public void Display() {
        System.out.println( "Book : [BookCode=" + BookCode + ", BookTitle=" + BookTitle + ", BookAuthor=" + BookAuthor
                + ", BookSubject=" + BookSubject + ", price=" + price + ", QuantityInStock=" + QuantityInStock + "]");
    }
}
