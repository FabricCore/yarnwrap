package yarnwrap.command.argument;
public class CommandFunctionArgumentType { public net.minecraft.command.argument.CommandFunctionArgumentType wrapperContained; public CommandFunctionArgumentType(net.minecraft.command.argument.CommandFunctionArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_FUNCTION_TAG_EXCEPTION() { return wrapperContained.UNKNOWN_FUNCTION_TAG_EXCEPTION; }
// public void UNKNOWN_FUNCTION_TAG_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.UNKNOWN_FUNCTION_TAG_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_FUNCTION_TAG_EXCEPTION() { return net.minecraft.command.argument.CommandFunctionArgumentType.UNKNOWN_FUNCTION_TAG_EXCEPTION; }
// public static void UNKNOWN_FUNCTION_TAG_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.command.argument.CommandFunctionArgumentType.UNKNOWN_FUNCTION_TAG_EXCEPTION = value; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public static java.util.Collection EXAMPLES() { return net.minecraft.command.argument.CommandFunctionArgumentType.EXAMPLES; }
// public static void EXAMPLES(java.util.Collection value, ) { net.minecraft.command.argument.CommandFunctionArgumentType.EXAMPLES = value; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_FUNCTION_EXCEPTION() { return wrapperContained.UNKNOWN_FUNCTION_EXCEPTION; }
// public void UNKNOWN_FUNCTION_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value) { wrapperContained.UNKNOWN_FUNCTION_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_FUNCTION_EXCEPTION() { return net.minecraft.command.argument.CommandFunctionArgumentType.UNKNOWN_FUNCTION_EXCEPTION; }
// public static void UNKNOWN_FUNCTION_EXCEPTION(com.mojang.brigadier.exceptions.DynamicCommandExceptionType value, ) { net.minecraft.command.argument.CommandFunctionArgumentType.UNKNOWN_FUNCTION_EXCEPTION = value; }

// public yarnwrap.command.argument.CommandFunctionArgumentType commandFunction() { return new yarnwrap.command.argument.CommandFunctionArgumentType(wrapperContained.commandFunction()); }
public static yarnwrap.command.argument.CommandFunctionArgumentType commandFunction() { return new yarnwrap.command.argument.CommandFunctionArgumentType(net.minecraft.command.argument.CommandFunctionArgumentType.commandFunction()); }
// public yarnwrap.server.function.CommandFunction getFunction(com.mojang.brigadier.context.CommandContext context,yarnwrap.util.Identifier id) { return new yarnwrap.server.function.CommandFunction(wrapperContained.getFunction(context,id.wrapperContained)); }
// public static yarnwrap.server.function.CommandFunction getFunction(com.mojang.brigadier.context.CommandContext context,yarnwrap.util.Identifier id, ) { return new yarnwrap.server.function.CommandFunction(net.minecraft.command.argument.CommandFunctionArgumentType.getFunction(context,id.wrapperContained)); }
// public com.mojang.brigadier.Message method_9762(java.lang.Object id) { return wrapperContained.method_9762(id); }
// public static com.mojang.brigadier.Message method_9762(java.lang.Object id, ) { return net.minecraft.command.argument.CommandFunctionArgumentType.method_9762(id); }
// public com.mojang.brigadier.Message method_9765(java.lang.Object id) { return wrapperContained.method_9765(id); }
// public static com.mojang.brigadier.Message method_9765(java.lang.Object id, ) { return net.minecraft.command.argument.CommandFunctionArgumentType.method_9765(id); }
// public java.util.Collection getFunctionTag(com.mojang.brigadier.context.CommandContext context,yarnwrap.util.Identifier id) { return wrapperContained.getFunctionTag(context,id.wrapperContained); }
// public static java.util.Collection getFunctionTag(com.mojang.brigadier.context.CommandContext context,yarnwrap.util.Identifier id, ) { return net.minecraft.command.argument.CommandFunctionArgumentType.getFunctionTag(context,id.wrapperContained); }
// public com.mojang.datafixers.util.Pair getFunctionOrTag(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getFunctionOrTag(context,name); }
// public static com.mojang.datafixers.util.Pair getFunctionOrTag(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return net.minecraft.command.argument.CommandFunctionArgumentType.getFunctionOrTag(context,name); }
// public java.util.Collection getFunctions(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getFunctions(context,name); }
// public static java.util.Collection getFunctions(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return net.minecraft.command.argument.CommandFunctionArgumentType.getFunctions(context,name); }
// public com.mojang.datafixers.util.Pair getIdentifiedFunctions(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getIdentifiedFunctions(context,name); }
// public static com.mojang.datafixers.util.Pair getIdentifiedFunctions(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return net.minecraft.command.argument.CommandFunctionArgumentType.getIdentifiedFunctions(context,name); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }
// public static java.lang.Object parse(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.command.argument.CommandFunctionArgumentType.parse(reader); }

}