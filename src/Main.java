public class Main {
    public static void main(String[] args)
    {
        Song caGirls = new Song("California Gurls", "Katy Perry", 234, 136);
        Song singAbout = new Song ("Sing About Me", "Kendrick Lamar", 432, 5);
        Song peaceful = new Song ("Peaceful Moments", "Himiko Kikuchi", 363, 200);

        Song potato2= new Song("Potato", "Ota");
        //Song potato2 = new Song ("Potato", "Ota");
        potato2 = potato;
        if (potato == potato2)
        {
            System.out.println("They are the same");
        }else
        {
            System.out.println("They are not the same");
        }

        Song potato = new Song("Potato", "Ota");

        System.out.println(potato.toString());
        potato.setLength(10);
        System.out.println("The length of Potato is: " + potato.getLength());
        System.out.println("Song Name: " + peaceful.getTitle() + " is written by " + peaceful.getAuthor());
        System.out.println("The length of " + caGirls.getTitle() + " is: " + caGirls.getLength() + " seconds");

//        System.out.println(caGirls.toString() + "\n");
//        System.out.println(singAbout.toString() + "\n");
//        System.out.println(peaceful.toString());

        System.out.println("I have " + Song.getCount() + " songs.");

    }
}