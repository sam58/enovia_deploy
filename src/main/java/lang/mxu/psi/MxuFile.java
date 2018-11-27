package lang.mxu.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import lang.mxu.MxuFileType;
import lang.mxu.MxuLanguage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class MxuFile extends PsiFileBase {

    public MxuFile(@NotNull FileViewProvider viewProvider) {
        super(viewProvider, MxuLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public FileType getFileType() {
        return MxuFileType.INSTANCE;
    }

    @Override
    public String toString() {
        return "Mxu File";
    }

    @Nullable
    @Override
    public Icon getIcon(int flags) {
        return super.getIcon(flags);
    }
}
