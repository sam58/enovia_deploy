// This is a generated file. Not intended for manual editing.
package gen.lang.mxu.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import lang.mxu.psi.impl.*;

public interface MxuTypes {

  IElementType PROPERTY = new MxuElementType("PROPERTY");

  IElementType COMMENT = new MxuTokenType("COMMENT");
  IElementType CRLF = new MxuTokenType("CRLF");
  IElementType KEY = new MxuTokenType("KEY");
  IElementType SEPARATOR = new MxuTokenType("SEPARATOR");
  IElementType VALUE = new MxuTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new MxuPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
