package bai2;

import javax.swing.text.html.HTMLDocument.HTMLReader.PreAction;

public class LibraryCard {
    private long lbCode;
    private String owner;
    private int borrowCount;

    public LibraryCard() {
        this.lbCode = 0;
        this.owner = null;
        this.borrowCount = 0;
    }

    public LibraryCard(long lbCode, String owner, int borrowCount) {
        this.lbCode = lbCode;
        this.owner = owner;
        this.borrowCount = borrowCount;
    }

    public long getLbCode(){
        return this.lbCode;
    }

    public String getOwner(){
        return this.owner;
    }

    public long getBorrowCount(){
        return this.borrowCount;
    }

    public void setLbCode(long code) {
        this.lbCode = code;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void checkOut(int num) {
        this.borrowCount++;
    }

    @Override
    public String toString() {
        return "{" +
                " lbCode='" + getLbCode() + "'" +
                ", owner='" + getOwner() + "'" +
                ", borrowCount='" + getBorrowCount() + "'" +
                "}";
    }

}
