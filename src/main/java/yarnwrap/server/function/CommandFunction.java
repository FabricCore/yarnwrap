package yarnwrap.server.function;
public class CommandFunction { public net.minecraft.server.function.CommandFunction wrapperContained; public CommandFunction(net.minecraft.server.function.CommandFunction wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id()); }
// // public boolean continuesToNextLine(java.lang.CharSequence string) { return wrapperContained.continuesToNextLine(string); }
// public yarnwrap.server.function.Procedure withMacroReplaced(yarnwrap.nbt.NbtCompound arguments,com.mojang.brigadier.CommandDispatcher dispatcher) { return new yarnwrap.server.function.Procedure(wrapperContained.withMacroReplaced(arguments.wrapperContained,dispatcher)); }
// public yarnwrap.command.SourcedCommandAction parse(com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.server.command.AbstractServerCommandSource source,com.mojang.brigadier.StringReader reader) { return new yarnwrap.command.SourcedCommandAction(wrapperContained.parse(dispatcher,source.wrapperContained,reader)); }
// public void validateCommandLength(java.lang.CharSequence command) { wrapperContained.validateCommandLength(command); }
// public yarnwrap.server.function.CommandFunction create(yarnwrap.util.Identifier id,com.mojang.brigadier.CommandDispatcher dispatcher,yarnwrap.server.command.AbstractServerCommandSource source,java.util.List lines) { return new yarnwrap.server.function.CommandFunction(wrapperContained.create(id.wrapperContained,dispatcher,source.wrapperContained,lines)); }

}