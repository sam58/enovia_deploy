package sam58.enovia_deploy.langs.mxu;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.jetbrains.annotations.NotNull;
import sam58.enovia_deploy.langs.mxu.psi.MxuFile;


public class MxuParserDefinition  implements ParserDefinition {


    public static final IFileElementType FILE = new IFileElementType(MxuLanguage.INSTANCE);
//    public static final TokenSet COMMENTS = TokenSet.create(MxuTypes.END_OF_LINE_COMMENT);
//    public static final TokenSet WHITE_SPACES = TokenSet.create(MxuTypes.WHITE_SPACE);

    @NotNull
    @Override
    public Lexer createLexer(Project project) {
        return new MxuLexerAdapter();
    }

    @NotNull
    public TokenSet getWhitespaceTokens() {
        return null;
 //       return WHITE_SPACES;
    }

    @Override
    public PsiParser createParser(Project project) {
        return null;
      //  return new MxuParser();
    }

    @Override
    public IFileElementType getFileNodeType() {
        return FILE;
    }

    @NotNull
    @Override
    public TokenSet getCommentTokens() {
        return null;
       // return COMMENTS;
    }

    @NotNull
    @Override
    public TokenSet getStringLiteralElements() {
        return TokenSet.EMPTY;
    }

    @NotNull
    @Override
    public PsiElement createElement(ASTNode node) {
        return null;
        //return MxuTypes.Factory.createElement(node);
    }

    @Override
    public PsiFile createFile(FileViewProvider viewProvider) {
        return new MxuFile(viewProvider);
    }
}
