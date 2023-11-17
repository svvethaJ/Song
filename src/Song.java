public class Song
{
    //1) Instance variables (only start with 2, then add)
    //Make sure to state that they are all private
    private String title;
    private String author;
    private double length;
    private int fileSize;

    private static int count = 0;
    //2) Constructors
    public Song()
    {
        title = "";
        author = "";
        length = 0;
        fileSize = 0;
    }// end default OR zero-arg constructor
    public Song(String myTitle, String myAuthor)
    {
        title = myTitle;
        author = myAuthor;
        length = 0;
        fileSize = 0;
    }

//    public Song(String myAuthor, String myTitle)
//    {
//        title = myTitle;
//        author = myAuthor;
//        length = 0;
//        fileSize = 0;
//    }
    public Song(String myTitle, String author, double length, int FileSize)
    {
        this.title = myTitle;
        this.author = author;
        this.length = length;
        this.fileSize = FileSize;
        count++;
    }// end full constructor, it is an overloaded constructor

    //4) Accessors (getters) and mutators (setters)
    public double getLength()
    {
        return length;
    }
    public String getAuthor()
    {
        return author;
    }
    public String getTitle()
    {
        return title;
    }
    public void setLength(int myLength)
    {
        length = myLength;
    }

    public static int getCount()
    {
        return count;
    }

    //5) brain methods (everything else the object can do)
    public String fromSeconds()
    {
        int minutes = 0,seconds = 0;
        if (length > 60)
        {
            minutes = (int)length / 60;
            seconds = (int)length - (minutes * 60);
        }

        return minutes + ":" + seconds;
    }


    //3) toString()
    public String toString()
    {
        String result = "Title is " + title;
        result += "\nAuthor is " + author +
                    "\nLength is " + length +
                    "\nFile size is " + fileSize;

        return result;
    }
}
