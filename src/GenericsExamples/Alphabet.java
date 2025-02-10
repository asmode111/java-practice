package GenericsExamples;

public class Alphabet<T> {

    T letter;

    public void setLetter(T letter) {
        this.letter = letter;
    }

    public T getLetter() {
        return this.letter;
    }
}
