package yarnwrap.command.argument;
public class CommandFunctionArgumentType { public net.minecraft.command.argument.CommandFunctionArgumentType wrapperContained; public CommandFunctionArgumentType(net.minecraft.command.argument.CommandFunctionArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_FUNCTION_TAG_EXCEPTION() { return wrapperContained.UNKNOWN_FUNCTION_TAG_EXCEPTION; }
// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_FUNCTION_EXCEPTION() { return wrapperContained.UNKNOWN_FUNCTION_EXCEPTION; }
// public com.mojang.datafixers.util.Pair getIdentifiedFunctions(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getIdentifiedFunctions(context,name); }
public yarnwrap.command.argument.CommandFunctionArgumentType commandFunction() { return new yarnwrap.command.argument.CommandFunctionArgumentType(wrapperContained.commandFunction()); }
// public yarnwrap.server.function.CommandFunction getFunction(com.mojang.brigadier.context.CommandContext context,yarnwrap.util.Identifier id) { return new yarnwrap.server.function.CommandFunction(wrapperContained.getFunction(context,id.wrapperContained)); }
// public java.util.Collection getFunctionTag(com.mojang.brigadier.context.CommandContext context,yarnwrap.util.Identifier id) { return wrapperContained.getFunctionTag(context,id.wrapperContained); }
// public com.mojang.datafixers.util.Pair getFunctionOrTag(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getFunctionOrTag(context,name); }
// public java.util.Collection getFunctions(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getFunctions(context,name); }

}