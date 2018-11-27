package lang.mxu;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class MxuTokenType extends IElementType {


    public MxuTokenType(@NotNull @NonNls String debugName) {
        super(debugName, MxuLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "MxuTokenType." + super.toString();
    }
}
