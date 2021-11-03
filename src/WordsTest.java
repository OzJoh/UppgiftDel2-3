import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class WordsTest {

    @Test
    public void LettersAmount() {

        //Arrange
        WordsLogic myWords = new WordsLogic();

        //Act
        int actual = myWords.characterCount("Hello there!");

        //Assert
        int expected = 12;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RowAmountSingular() {

        //Arrange
        WordsLogic myWords = new WordsLogic();
        myWords.addRow();

        //Act
        int actual = myWords.getRows();

        //Assert

        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RowAmountMultiple() {

        //Arrange
        WordsLogic myWords = new WordsLogic();
        myWords.addRow();
        myWords.addRow();
        myWords.addRow();

        //Act
        int actual = myWords.getRows();

        //Assert
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RowAndCharacterFromInput() {

        //Arrange
        WordsLogic myWords = new WordsLogic();

        myWords.input("Hello there!");

        //Act

        int actualrows = myWords.getRows();
        int actualcharacters = myWords.getCharacters();
        //Assert
        int expectedrows = 1;
        int expectedcharacters = 11;

        Assertions.assertEquals(expectedrows, actualrows);
        Assertions.assertEquals(expectedcharacters, actualcharacters);
    }

    @Test
    public void ContainsStop() {

        //Arrange
        WordsLogic myWords = new WordsLogic();

        myWords.input("Hello there! stop");

        //Act

        int actualrows = myWords.getRows();
        int actualcharacters = myWords.getCharacters();
        //Assert
        int expectedrows = 1;
        int expectedcharacters = 11;

        Assertions.assertEquals(expectedrows, actualrows);
        Assertions.assertEquals(expectedcharacters, actualcharacters);
    }

    @Test
    public void LongestWord() {

        //Arrange
        WordsLogic myWords = new WordsLogic();

        myWords.input("Hello there!");
        myWords.input("supercalifragilisticexpialidocious");
        myWords.input("Hi");

        //Act

        String actual = myWords.getLongestWord();
        //Assert
        String expected = "supercalifragilisticexpialidocious";

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void WordAmount() {

        //Arrange
        WordsLogic myWords = new WordsLogic();

        myWords.input("Hello there!");
        myWords.input("supercalifragilisticexpialidocious");
        myWords.input("Hi stop");

        //Act

        int actual = myWords.getWordAmount();
        //Assert
        int expected = 4;

        Assertions.assertEquals(expected, actual);
    }
}