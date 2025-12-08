package ${package};

import com.langpossible.core.plugin.PluginInput;
import com.langpossible.core.plugin.PluginOutput;

public class ${Name}Plugin {

    public PluginOutput demo(PluginInput input) {
        return PluginOutput.builder()
                .text("hello world")
                .build();
    }

}