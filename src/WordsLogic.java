public class WordsLogic {


    private int totalLength;
    private int totalLines;
    private int totalWordAmount;
    private String longestWord = "";


    public int characterCount(String input) {
        totalLength = totalLength + input.length();
        totalWordAmount++;
        if(input.length()>longestWord.length()){
            longestWord = input;
        }
        return  input.length();
    }

    public void addRow() {
        totalLines ++;
    }

    public int getRows() {
        return totalLines;
    }

    public int getCharacters() {
        return totalLength;
    }

    public boolean input(String input) {
        boolean isRunning = true;
        String[] words = input.split(" ");
        int arrayLength = words.length;

        while(isRunning) {
            addRow();
            for (int i = 0; i < arrayLength; i++) {
                if (words[i].equals("stop") && arrayLength == 1) {  //om linjen inehåller endast ordet stop så räknar vi inte med den linjen
                    totalLines --;
                    return false;
                }else if(words[i].equals("stop")){                  // om ordet stop hittas men är inte det enda ordet på linjen så avbryter vi bara där
                    return false;
                }
                else {
                    characterCount(words[i]);
                }
            }
            return true;
        }
        return true;
    }

    public String getLongestWord() {
        return longestWord;
    }

    public int getWordAmount() {
        return totalWordAmount;
    }
}

