package lang.mxu;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class MxuFileType extends LanguageFileType {
    public static final MxuFileType INSTANCE = new MxuFileType();

    public MxuFileType() {
        super(MxuLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Mxu file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Mxu language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "mxu";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return MxuIcons.FILE;
    }
}
