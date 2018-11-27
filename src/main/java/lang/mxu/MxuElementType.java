package lang.mxu;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class MxuElementType extends IElementType {

    public MxuElementType(@NotNull @NonNls String debugName) {
        super(debugName, MxuLanguage.INSTANCE);
    }
}
