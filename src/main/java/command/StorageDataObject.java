package yarnwrap.command;
public class StorageDataObject { public net.minecraft.command.StorageDataObject wrapperContained; public StorageDataObject(net.minecraft.command.StorageDataObject wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.function.Function TYPE_FACTORY() { return wrapperContained.TYPE_FACTORY; }
// public com.mojang.brigadier.suggestion.SuggestionProvider SUGGESTION_PROVIDER() { return wrapperContained.SUGGESTION_PROVIDER; }
// public yarnwrap.command.DataCommandStorage storage() { return new yarnwrap.command.DataCommandStorage(wrapperContained.storage); }
// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public yarnwrap.command.DataCommandStorage of(com.mojang.brigadier.context.CommandContext context) { return new yarnwrap.command.DataCommandStorage(wrapperContained.of(context)); }

}