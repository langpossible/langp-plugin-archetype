package ${package}.provider;

import com.langpossible.core.plugin.tool.ToolContract;
import com.langpossible.core.plugin.tool.ToolInput;
import com.langpossible.core.plugin.tool.ToolOutput;
import org.osgi.framework.BundleContext;

public class ${Name}Plugin implements ToolContract {

    @Override
    public void start(BundleContext context) {
        context.registerService(ToolContract.class.getName(), this, null);
    }

    @Override
    public void stop(BundleContext context) {
    }

    @Override
    public String getName() {
        return "${Name}Plugin";
    }

    @Override
    public ToolOutput invoke(String action, ToolInput input) {
        throw new IllegalArgumentException("Unknown action: " + action);
    }

}
