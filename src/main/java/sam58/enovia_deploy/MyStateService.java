package sam58.enovia_deploy;

import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.components.StoragePathMacros;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@State(
        name="Enovia_deploy",
        storages={
                @Storage()
        }

)
public class MyStateService implements PersistentStateComponent<MyStateService.State> {

    static class State {
        public String host;
        public String userName;
        public String password;

        public State(){
            host ="";
            userName = "";
            password = "";
        }

    }

    State myState;

    @Nullable
    @Override
    public State getState() {
        return myState;
    }

    @Override
    public void loadState(@NotNull State state) {
        myState=state;
    }
}
