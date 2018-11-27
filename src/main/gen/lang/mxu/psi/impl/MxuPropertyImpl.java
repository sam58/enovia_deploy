// This is a generated file. Not intended for manual editing.
package gen.lang.mxu.psi.impl;

import java.util.List;

import gen.lang.mxu.psi.MxuProperty;
import gen.lang.mxu.psi.MxuVisitor;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static gen.lang.mxu.psi.MxuTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import lang.mxu.psi.*;

public class MxuPropertyImpl extends ASTWrapperPsiElement implements MxuProperty {

  public MxuPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull MxuVisitor visitor) {
    visitor.visitProperty(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof MxuVisitor) accept((MxuVisitor)visitor);
    else super.accept(visitor);
  }

}
