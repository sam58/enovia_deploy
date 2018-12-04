package sam58.enovia_deploy.language.mxu;

import com.intellij.lang.Language;

/**
 * Шаг 1. Создать определение языка
 */
public class MXULanguage extends Language {
    public static final MXULanguage INSTANCE = new MXULanguage();

    private MXULanguage() {
        super("MXU");
    }
}
