package sam58.enovia_deploy.langs.mxu;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NotNull;

public class MxuLanguage extends Language {
    public static final String ID="Mxu"; //ID моего языка

    public static final MxuLanguage INSTANCE = new MxuLanguage();

    protected MxuLanguage() {
        super(ID);
    }
}
