package actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.openapi.vfs.VirtualFile;

public class MxUpdate extends AnAction {

    public MxUpdate() {
        super("mxUpdate");
    }

    @Override
    public void actionPerformed(AnActionEvent event) {
        System.out.println("123");
        Project project = event.getProject();
//        Messages.showMessageDialog(project, "Hello mx2Update!", "Greeting", Messages.getInformationIcon());
        StringBuffer dlgMsg = new StringBuffer(event.getPresentation().getText() + " Selected!");
        //TODO:Убрать в настройки и конструировать из них.
        VirtualFile vFile = event.getDataContext().getData(CommonDataKeys.VIRTUAL_FILE);//в
        //конструирую строку запуска


    }

    /**
     * Выполняет провертку доступно ли применение
     *
     * @param e
     */
    @Override
    public void update(AnActionEvent e) {
        //perform action if and only if EDITOR != null т.е я в редакторе
        boolean enabled = e.getData(CommonDataKeys.EDITOR) != null;
        //TODO: перевести на custom language
        VirtualFile vFile = e.getDataContext().getData(CommonDataKeys.VIRTUAL_FILE);//временное решение. Надо действовать через тип файла - custom language
        enabled  = enabled && "mxu".equalsIgnoreCase(vFile.getExtension());
        e.getPresentation().setEnabled(enabled);//Активен или нет пункт
      }

}
