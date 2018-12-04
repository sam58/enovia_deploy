package sam58.enovia_deploy.language.mxu;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class MXUFileType extends LanguageFileType {
    public static final MXUFileType INSTANCE = new MXUFileType();

    private MXUFileType() {
        super(MXULanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "MXU file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "MXU language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "mxu";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return MXUIcons.FILE;
    }
}
