/**
 * Copyright KonceptGeeek
 */
package konceptgeek.nlp.sentiment.nrc.utils;

import java.util.Iterator;

/**
 * @author konceptgeek
 *
 */
class NGramIterator implements Iterator<String> {

    String[] words;
    int pos = 0, n;

    public NGramIterator(int n, String str) {
        this.n = n;
        words = str.split(" ");
    }

    public boolean hasNext() {
        return pos < words.length - n + 1;
    }

    public String next() {
        StringBuilder sb = new StringBuilder();
        for (int i = pos; i < pos + n; i++)
            sb.append((i > pos ? " " : "") + words[i]);
        pos++;
        return sb.toString();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}