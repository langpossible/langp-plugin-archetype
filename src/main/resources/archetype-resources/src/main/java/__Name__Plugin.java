package ${package}.plugin;

import ${package}.core.PluginInput;
import ${package}.core.PluginOutput;

public class ${Name}Plugin {

    public PluginOutput demo(PluginInput input) {
        return PluginOutput.builder()
                .text("hello world")
                .build();
    }

}