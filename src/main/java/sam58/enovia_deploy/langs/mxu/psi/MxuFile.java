package sam58.enovia_deploy.langs.mxu.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.jetbrains.annotations.NotNull;
import sam58.enovia_deploy.langs.mxu.MxuFileType;
import sam58.enovia_deploy.langs.mxu.MxuLanguage;
import javax.swing.Icon;
import java.util.HashMap;
import java.util.Map;

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

    @Override
    public Icon getIcon(int flags) {
        Map m = new HashMap<String,String>();
        return super.getIcon(flags);

    }
}
