package lang.mxu;

import com.intellij.lexer.FlexAdapter;

import java.io.Reader;

public class MxuLexerAdapter extends FlexAdapter {

    public MxuLexerAdapter (){
        super(new MxuLexer((Reader) null));
    }
}
