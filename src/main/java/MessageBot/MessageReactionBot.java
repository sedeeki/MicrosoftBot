package MessageBot;

import com.microsoft.bot.builder.ActivityHandler;
import com.microsoft.bot.builder.MessageFactory;
import com.microsoft.bot.builder.TurnContext;
import com.microsoft.bot.schema.ActivityTypes;
import java.util.concurrent.CompletableFuture;

/**
 * From the UI you need to @mention the bot, then add a message reaction to the message the bot sent.
 */
public class MessageReactionBot extends ActivityHandler {

    /**
     * {@inheritDoc}
     */
    @Override
    protected CompletableFuture<Void> onMessageActivity(TurnContext turnContext) {
        if (turnContext.getActivity().isType(ActivityTypes.MESSAGE) && turnContext.getActivity().getText() != null) {
            return turnContext.sendActivity(MessageFactory.text("Hello World!"))
                    .thenApply(sendResult -> null);
        }
        return CompletableFuture.completedFuture(null);
    }
}