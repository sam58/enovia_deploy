package sam58.enovia_deploy.configuration;

import com.intellij.ide.util.PropertiesComponent;
import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.options.ConfigurationException;
import com.intellij.openapi.project.Project;
import com.intellij.util.ui.FormBuilder;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.BorderLayout;

/**
 * Отвечает за вывод настроечной панели
 */
public class EnoviaDeploySettingPage implements Configurable {

    private Project project; //Текущий проект
    private JCheckBox enableEnoviaDeploy; //применять ли на проекте эту настройку
    private JTextField userField;
    private JPanel wrapper;

    public EnoviaDeploySettingPage(Project project) {
        this.project = project;
    }

    @Nls(capitalization = Nls.Capitalization.Title)
    @Override
    public String getDisplayName() {
        return "Enovia Deploy";
    }

    @Nullable
    @Override
    public JComponent createComponent() {
        if(wrapper ==null){
            enableEnoviaDeploy = new JCheckBox("Enable Enovia Plugin for this project");
            userField =new JTextField("User");
            PropertiesComponent properties = PropertiesComponent.getInstance(project);
            userField.setText(properties.getValue("userField", /*DefaultSettings.kohanaAppPath*/ "default value"));
            enableEnoviaDeploy.setSelected (true);
            //конструирует панел средствами идеи. Размещает компоненты по центру.Компоненты растягиваются по ширине
            JPanel panel = FormBuilder.createFormBuilder()
                    .addLabeledComponent("User",userField)
                    .addLabeledComponent("checkbox",enableEnoviaDeploy).getPanel();
            //врапер нужен что бы сделать панели прилипающие к верху. Без этого они будут по центру.
            wrapper = new JPanel(new BorderLayout());
            wrapper.add(panel, BorderLayout.NORTH);
        }

        return wrapper;
    }

    @Override
    public boolean isModified() {
        return true;
    }

    @Override
    public void apply() throws ConfigurationException {
        PropertiesComponent properties = PropertiesComponent.getInstance(project);
        properties.setValue("userField", userField.getText());
        properties.setValue("enableEnoviaDeploy", String.valueOf(enableEnoviaDeploy.isSelected()) );
    }
}
