package yarnwrap.server.command;
public class DatapackCommand { public net.minecraft.server.command.DatapackCommand wrapperContained; public DatapackCommand(net.minecraft.server.command.DatapackCommand wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.suggestion.SuggestionProvider DISABLED_CONTAINERS_SUGGESTION_PROVIDER() { return wrapperContained.DISABLED_CONTAINERS_SUGGESTION_PROVIDER; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_DATAPACK_EXCEPTION() { return wrapperContained.UNKNOWN_DATAPACK_EXCEPTION; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType ALREADY_ENABLED_EXCEPTION() { return wrapperContained.ALREADY_ENABLED_EXCEPTION; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType ALREADY_DISABLED_EXCEPTION() { return wrapperContained.ALREADY_DISABLED_EXCEPTION; }
// public com.mojang.brigadier.suggestion.SuggestionProvider ENABLED_CONTAINERS_SUGGESTION_PROVIDER() { return wrapperContained.ENABLED_CONTAINERS_SUGGESTION_PROVIDER; }
// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType NO_FLAGS_EXCEPTION() { return wrapperContained.NO_FLAGS_EXCEPTION; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType CANNOT_DISABLE_FEATURE_EXCEPTION() { return wrapperContained.CANNOT_DISABLE_FEATURE_EXCEPTION; }
// public int executeEnable(yarnwrap.server.command.ServerCommandSource source,yarnwrap.resource.ResourcePackProfile container,Object packAdder) { return wrapperContained.executeEnable(source.wrapperContained,container.wrapperContained,packAdder); }
// public int executeList(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeList(source.wrapperContained); }
public void register(com.mojang.brigadier.CommandDispatcher dispatcher) { wrapperContained.register(dispatcher); }
// public int executeListEnabled(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeListEnabled(source.wrapperContained); }
// public yarnwrap.resource.ResourcePackProfile getPackContainer(com.mojang.brigadier.context.CommandContext context,java.lang.String name,boolean enable) { return new yarnwrap.resource.ResourcePackProfile(wrapperContained.getPackContainer(context,name,enable)); }
// public int executeListAvailable(yarnwrap.server.command.ServerCommandSource source) { return wrapperContained.executeListAvailable(source.wrapperContained); }
// public int executeDisable(yarnwrap.server.command.ServerCommandSource source,yarnwrap.resource.ResourcePackProfile container) { return wrapperContained.executeDisable(source.wrapperContained,container.wrapperContained); }

}