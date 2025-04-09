package yarnwrap.server.function;
public class CommandFunctionManager { public net.minecraft.server.function.CommandFunctionManager wrapperContained; public CommandFunctionManager(net.minecraft.server.function.CommandFunctionManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier LOAD_TAG_ID() { return new yarnwrap.util.Identifier(wrapperContained.LOAD_TAG_ID); }
// public yarnwrap.util.Identifier TICK_TAG_ID() { return new yarnwrap.util.Identifier(wrapperContained.TICK_TAG_ID); }
// public java.util.List tickFunctions() { return wrapperContained.tickFunctions; }
// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public boolean justLoaded() { return wrapperContained.justLoaded; }
// public yarnwrap.server.function.FunctionLoader loader() { return new yarnwrap.server.function.FunctionLoader(wrapperContained.loader); }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
public yarnwrap.server.command.ServerCommandSource getScheduledCommandSource() { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.getScheduledCommandSource()); }
public com.mojang.brigadier.CommandDispatcher getDispatcher() { return wrapperContained.getDispatcher(); }
public void execute(yarnwrap.server.function.CommandFunction function,yarnwrap.server.command.ServerCommandSource source) { wrapperContained.execute(function.wrapperContained,source.wrapperContained); }
public java.util.Optional getFunction(yarnwrap.util.Identifier id) { return wrapperContained.getFunction(id.wrapperContained); }
public void tick() { wrapperContained.tick(); }
// public void executeAll(java.util.Collection functions,yarnwrap.util.Identifier label) { wrapperContained.executeAll(functions,label.wrapperContained); }
public void setFunctions(yarnwrap.server.function.FunctionLoader loader) { wrapperContained.setFunctions(loader.wrapperContained); }
public java.util.Collection getTag(yarnwrap.util.Identifier id) { return wrapperContained.getTag(id.wrapperContained); }
public java.lang.Iterable getAllFunctions() { return wrapperContained.getAllFunctions(); }
public java.lang.Iterable getFunctionTags() { return wrapperContained.getFunctionTags(); }
// public void load(yarnwrap.server.function.FunctionLoader loader) { wrapperContained.load(loader.wrapperContained); }

}