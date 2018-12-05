package sam58.enovia_deploy.langs.mxu.psi;

import com.intellij.lang.Language;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sam58.enovia_deploy.langs.mxu.MxuLanguage;
/*
http://www.jetbrains.org/intellij/sdk/docs/tutorials/custom_language_support/grammar_and_parser.html
 */
public class MxuTokenType extends IElementType {

    public MxuTokenType(@NotNull @NonNls String debugName) {
        super(debugName, MxuLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "MxuTokenType." + super.toString();
    }
}
