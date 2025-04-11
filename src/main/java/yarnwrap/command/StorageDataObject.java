package yarnwrap.command;
public class StorageDataObject { public net.minecraft.command.StorageDataObject wrapperContained; public StorageDataObject(net.minecraft.command.StorageDataObject wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.function.Function TYPE_FACTORY() { return wrapperContained.TYPE_FACTORY; }
// public void TYPE_FACTORY(java.util.function.Function value) { wrapperContained.TYPE_FACTORY = value; }
// public com.mojang.brigadier.suggestion.SuggestionProvider SUGGESTION_PROVIDER() { return wrapperContained.SUGGESTION_PROVIDER; }
// public void SUGGESTION_PROVIDER(com.mojang.brigadier.suggestion.SuggestionProvider value) { wrapperContained.SUGGESTION_PROVIDER = value; }
// public yarnwrap.command.DataCommandStorage storage() { return new yarnwrap.command.DataCommandStorage(wrapperContained.storage); }
// public void storage(yarnwrap.command.DataCommandStorage value) { wrapperContained.storage = value.wrapperContained; }
// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
// public StorageDataObject(yarnwrap.command.DataCommandStorage storage,yarnwrap.util.Identifier id) { this.wrapperContained = new net.minecraft.command.StorageDataObject(storage.wrapperContained,id.wrapperContained); }
// public java.util.concurrent.CompletableFuture method_22840(com.mojang.brigadier.context.CommandContext context,com.mojang.brigadier.suggestion.SuggestionsBuilder builder) { return wrapperContained.method_22840(context,builder); }
// public Object method_22841(java.lang.String argumentName) { return wrapperContained.method_22841(argumentName); }
// public yarnwrap.command.DataCommandStorage of(com.mojang.brigadier.context.CommandContext context) { return new yarnwrap.command.DataCommandStorage(wrapperContained.of(context)); }

}