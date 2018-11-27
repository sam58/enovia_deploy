package lang.mxu;

import com.intellij.lang.Language;
import org.jetbrains.annotations.NotNull;

public class MxuLanguage extends Language {
    //Определили экземпляр
    public static final MxuLanguage INSTANCE = new MxuLanguage();

    public MxuLanguage() {
        super("Mxu");
    }
}
