package yarnwrap.server.function;
public class CommandFunctionManager { public net.minecraft.server.function.CommandFunctionManager wrapperContained; public CommandFunctionManager(net.minecraft.server.function.CommandFunctionManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier LOAD_TAG_ID() { return new yarnwrap.util.Identifier(wrapperContained.LOAD_TAG_ID); }
// public void LOAD_TAG_ID(yarnwrap.util.Identifier value) { wrapperContained.LOAD_TAG_ID = value.wrapperContained; }
// public static yarnwrap.util.Identifier LOAD_TAG_ID() { return new yarnwrap.util.Identifier(net.minecraft.server.function.CommandFunctionManager.LOAD_TAG_ID); }
// public static void LOAD_TAG_ID(yarnwrap.util.Identifier value, ) { net.minecraft.server.function.CommandFunctionManager.LOAD_TAG_ID = value.wrapperContained; }

// public yarnwrap.util.Identifier TICK_TAG_ID() { return new yarnwrap.util.Identifier(wrapperContained.TICK_TAG_ID); }
// public void TICK_TAG_ID(yarnwrap.util.Identifier value) { wrapperContained.TICK_TAG_ID = value.wrapperContained; }
// public static yarnwrap.util.Identifier TICK_TAG_ID() { return new yarnwrap.util.Identifier(net.minecraft.server.function.CommandFunctionManager.TICK_TAG_ID); }
// public static void TICK_TAG_ID(yarnwrap.util.Identifier value, ) { net.minecraft.server.function.CommandFunctionManager.TICK_TAG_ID = value.wrapperContained; }

// public java.util.List tickFunctions() { return wrapperContained.tickFunctions; }
// public void tickFunctions(java.util.List value) { wrapperContained.tickFunctions = value; }
// public static java.util.List tickFunctions() { return net.minecraft.server.function.CommandFunctionManager.tickFunctions; }
// public static void tickFunctions(java.util.List value, ) { net.minecraft.server.function.CommandFunctionManager.tickFunctions = value; }

// public yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(wrapperContained.server); }
// public void server(yarnwrap.server.MinecraftServer value) { wrapperContained.server = value.wrapperContained; }
// public static yarnwrap.server.MinecraftServer server() { return new yarnwrap.server.MinecraftServer(net.minecraft.server.function.CommandFunctionManager.server); }
// public static void server(yarnwrap.server.MinecraftServer value, ) { net.minecraft.server.function.CommandFunctionManager.server = value.wrapperContained; }

// public boolean justLoaded() { return wrapperContained.justLoaded; }
// public void justLoaded(boolean value) { wrapperContained.justLoaded = value; }
// public static boolean justLoaded() { return net.minecraft.server.function.CommandFunctionManager.justLoaded; }
// public static void justLoaded(boolean value, ) { net.minecraft.server.function.CommandFunctionManager.justLoaded = value; }

// public yarnwrap.server.function.FunctionLoader loader() { return new yarnwrap.server.function.FunctionLoader(wrapperContained.loader); }
// public void loader(yarnwrap.server.function.FunctionLoader value) { wrapperContained.loader = value.wrapperContained; }
// public static yarnwrap.server.function.FunctionLoader loader() { return new yarnwrap.server.function.FunctionLoader(net.minecraft.server.function.CommandFunctionManager.loader); }
// public static void loader(yarnwrap.server.function.FunctionLoader value, ) { net.minecraft.server.function.CommandFunctionManager.loader = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.server.function.CommandFunctionManager.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.server.function.CommandFunctionManager.LOGGER = value; }

public CommandFunctionManager(yarnwrap.server.MinecraftServer server,yarnwrap.server.function.FunctionLoader loader) { this.wrapperContained = new net.minecraft.server.function.CommandFunctionManager(server.wrapperContained,loader.wrapperContained); }
public yarnwrap.server.command.ServerCommandSource getScheduledCommandSource() { return new yarnwrap.server.command.ServerCommandSource(wrapperContained.getScheduledCommandSource()); }
// public static yarnwrap.server.command.ServerCommandSource getScheduledCommandSource() { return new yarnwrap.server.command.ServerCommandSource(net.minecraft.server.function.CommandFunctionManager.getScheduledCommandSource()); }
public com.mojang.brigadier.CommandDispatcher getDispatcher() { return wrapperContained.getDispatcher(); }
// public static com.mojang.brigadier.CommandDispatcher getDispatcher() { return net.minecraft.server.function.CommandFunctionManager.getDispatcher(); }
public void execute(yarnwrap.server.function.CommandFunction function,yarnwrap.server.command.ServerCommandSource source) { wrapperContained.execute(function.wrapperContained,source.wrapperContained); }
// public static void execute(yarnwrap.server.function.CommandFunction function,yarnwrap.server.command.ServerCommandSource source, ) { net.minecraft.server.function.CommandFunctionManager.execute(function.wrapperContained,source.wrapperContained); }
public java.util.Optional getFunction(yarnwrap.util.Identifier id) { return wrapperContained.getFunction(id.wrapperContained); }
// public static java.util.Optional getFunction(yarnwrap.util.Identifier id, ) { return net.minecraft.server.function.CommandFunctionManager.getFunction(id.wrapperContained); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.server.function.CommandFunctionManager.tick(); }
// public void executeAll(java.util.Collection functions,yarnwrap.util.Identifier label) { wrapperContained.executeAll(functions,label.wrapperContained); }
// public static void executeAll(java.util.Collection functions,yarnwrap.util.Identifier label, ) { net.minecraft.server.function.CommandFunctionManager.executeAll(functions,label.wrapperContained); }
public void setFunctions(yarnwrap.server.function.FunctionLoader loader) { wrapperContained.setFunctions(loader.wrapperContained); }
// public static void setFunctions(yarnwrap.server.function.FunctionLoader loader, ) { net.minecraft.server.function.CommandFunctionManager.setFunctions(loader.wrapperContained); }
public java.util.Collection getTag(yarnwrap.util.Identifier id) { return wrapperContained.getTag(id.wrapperContained); }
// public static java.util.Collection getTag(yarnwrap.util.Identifier id, ) { return net.minecraft.server.function.CommandFunctionManager.getTag(id.wrapperContained); }
public java.lang.Iterable getAllFunctions() { return wrapperContained.getAllFunctions(); }
// public static java.lang.Iterable getAllFunctions() { return net.minecraft.server.function.CommandFunctionManager.getAllFunctions(); }
public java.lang.Iterable getFunctionTags() { return wrapperContained.getFunctionTags(); }
// public static java.lang.Iterable getFunctionTags() { return net.minecraft.server.function.CommandFunctionManager.getFunctionTags(); }
// public void load(yarnwrap.server.function.FunctionLoader loader) { wrapperContained.load(loader.wrapperContained); }
// public static void load(yarnwrap.server.function.FunctionLoader loader, ) { net.minecraft.server.function.CommandFunctionManager.load(loader.wrapperContained); }
// public void method_54252(yarnwrap.server.function.Procedure context) { wrapperContained.method_54252(context.wrapperContained); }
// public static void method_54252(yarnwrap.server.function.Procedure context, ) { net.minecraft.server.function.CommandFunctionManager.method_54252(context.wrapperContained); }

}