package nl.saxion.iad.countingCharacters;

public class CountingCharactersMain {

    public void run(){
        String text = "The hobbits rode on up a gentle slope, passing a few detached houses, and drew up outside the inn. The houses looked large and strange to them. Sam stared up at the inn with its three storeys and many windows, and felt his heart sink. He had imagined himself meeting giants taller than trees, and other creatures even more terrify- ing, some time or other in the course of his journey; but at the moment he was finding his first sight of Men and their tall houses quite enough, indeed too much for the dark end of a tiring day. He pictured black horses standing all saddled in the shadows of the inn-yard, and Black Riders peering out of dark upper windows.";
        System.out.println("The letter occured: "+countOccurences(text, 'T')+" times");
    }

    public int countOccurences(String text, char Character) {
        char[] charText = text.toCharArray();
        int count = 0;
        for (int i=0; i<charText.length;i++) {
            if (java.lang.Character.toLowerCase(charText[i]) == java.lang.Character.toLowerCase(Character)) {
                count++;
            }
        }

        return count;
    }




    public static void main(String[] args) {
        new CountingCharactersMain().run();
    }
}
