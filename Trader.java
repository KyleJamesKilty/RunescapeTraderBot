import org.dreambot.api.script.Category;
import org.dreambot.api.script.ScriptManifest;
import org.dreambot.api.script.listener.ChatListener;
import org.dreambot.api.wrappers.widgets.message.Message;
import org.dreambot.api.script.AbstractScript;

@ScriptManifest(version = 1.0, author = "Riverlamp", category = Category.MISC, name = "Trader")
public class Trader extends AbstractScript implements ChatListener {

    @Override
    public int onLoop() {
        return 0;

    }


    @Override
    public void onTradeMessage(Message message) {
        log(message);

    }
}

