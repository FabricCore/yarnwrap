package yarnwrap.client.network;
public class ClientCommandSource { public net.minecraft.client.network.ClientCommandSource wrapperContained; public ClientCommandSource(net.minecraft.client.network.ClientCommandSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.network.ClientPlayNetworkHandler networkHandler() { return new yarnwrap.client.network.ClientPlayNetworkHandler(wrapperContained.networkHandler); }
// public java.util.concurrent.CompletableFuture pendingCommandCompletion() { return wrapperContained.pendingCommandCompletion; }
// public int completionId() { return wrapperContained.completionId; }
// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public java.util.Set chatSuggestions() { return wrapperContained.chatSuggestions; }
// public java.lang.String format(double d) { return wrapperContained.format(d); }
// public java.lang.String format(int i) { return wrapperContained.format(i); }
public void onCommandSuggestions(int completionId,com.mojang.brigadier.suggestion.Suggestions suggestions) { wrapperContained.onCommandSuggestions(completionId,suggestions); }
// public void onChatSuggestions(Object action,java.util.List suggestions) { wrapperContained.onChatSuggestions(action,suggestions); }

}