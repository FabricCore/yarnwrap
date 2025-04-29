package yarnwrap.client.network;
public class ClientCommandSource { public net.minecraft.client.network.ClientCommandSource wrapperContained; public ClientCommandSource(net.minecraft.client.network.ClientCommandSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.network.ClientPlayNetworkHandler networkHandler() { return new yarnwrap.client.network.ClientPlayNetworkHandler(wrapperContained.networkHandler); }
// public void networkHandler(yarnwrap.client.network.ClientPlayNetworkHandler value) { wrapperContained.networkHandler = value.wrapperContained; }
// public static yarnwrap.client.network.ClientPlayNetworkHandler networkHandler() { return new yarnwrap.client.network.ClientPlayNetworkHandler(net.minecraft.client.network.ClientCommandSource.networkHandler); }
// public static void networkHandler(yarnwrap.client.network.ClientPlayNetworkHandler value, ) { net.minecraft.client.network.ClientCommandSource.networkHandler = value.wrapperContained; }

// public java.util.concurrent.CompletableFuture pendingCommandCompletion() { return wrapperContained.pendingCommandCompletion; }
// public void pendingCommandCompletion(java.util.concurrent.CompletableFuture value) { wrapperContained.pendingCommandCompletion = value; }
// public static java.util.concurrent.CompletableFuture pendingCommandCompletion() { return net.minecraft.client.network.ClientCommandSource.pendingCommandCompletion; }
// public static void pendingCommandCompletion(java.util.concurrent.CompletableFuture value, ) { net.minecraft.client.network.ClientCommandSource.pendingCommandCompletion = value; }

// public int completionId() { return wrapperContained.completionId; }
// public void completionId(int value) { wrapperContained.completionId = value; }
// public static int completionId() { return net.minecraft.client.network.ClientCommandSource.completionId; }
// public static void completionId(int value, ) { net.minecraft.client.network.ClientCommandSource.completionId = value; }

// public yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(wrapperContained.client); }
// public void client(yarnwrap.client.MinecraftClient value) { wrapperContained.client = value.wrapperContained; }
// public static yarnwrap.client.MinecraftClient client() { return new yarnwrap.client.MinecraftClient(net.minecraft.client.network.ClientCommandSource.client); }
// public static void client(yarnwrap.client.MinecraftClient value, ) { net.minecraft.client.network.ClientCommandSource.client = value.wrapperContained; }

// public java.util.Set chatSuggestions() { return wrapperContained.chatSuggestions; }
// public void chatSuggestions(java.util.Set value) { wrapperContained.chatSuggestions = value; }
// public static java.util.Set chatSuggestions() { return net.minecraft.client.network.ClientCommandSource.chatSuggestions; }
// public static void chatSuggestions(java.util.Set value, ) { net.minecraft.client.network.ClientCommandSource.chatSuggestions = value; }

public ClientCommandSource(yarnwrap.client.network.ClientPlayNetworkHandler networkHandler,yarnwrap.client.MinecraftClient client) { this.wrapperContained = new net.minecraft.client.network.ClientCommandSource(networkHandler.wrapperContained,client.wrapperContained); }
// public java.lang.String format(double d) { return wrapperContained.format(d); }
// public static java.lang.String format(double d, ) { return net.minecraft.client.network.ClientCommandSource.format(d); }
// public java.lang.String format(int i) { return wrapperContained.format(i); }
// public static java.lang.String format(int i, ) { return net.minecraft.client.network.ClientCommandSource.format(i); }
public void onCommandSuggestions(int completionId,com.mojang.brigadier.suggestion.Suggestions suggestions) { wrapperContained.onCommandSuggestions(completionId,suggestions); }
// public static void onCommandSuggestions(int completionId,com.mojang.brigadier.suggestion.Suggestions suggestions, ) { net.minecraft.client.network.ClientCommandSource.onCommandSuggestions(completionId,suggestions); }
// public java.util.concurrent.CompletableFuture method_41232(Object registry) { return wrapperContained.method_41232(registry); }
// public static java.util.concurrent.CompletableFuture method_41232(Object registry, ) { return net.minecraft.client.network.ClientCommandSource.method_41232(registry); }
// public void onChatSuggestions(Object action,java.util.List suggestions) { wrapperContained.onChatSuggestions(action,suggestions); }
// public static void onChatSuggestions(Object action,java.util.List suggestions, ) { net.minecraft.client.network.ClientCommandSource.onChatSuggestions(action,suggestions); }

}