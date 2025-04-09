package yarnwrap.command.argument;
public class UuidArgumentType { public net.minecraft.command.argument.UuidArgumentType wrapperContained; public UuidArgumentType(net.minecraft.command.argument.UuidArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_UUID() { return wrapperContained.INVALID_UUID; }
// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public java.util.regex.Pattern VALID_CHARACTERS() { return wrapperContained.VALID_CHARACTERS; }
public yarnwrap.command.argument.UuidArgumentType uuid() { return new yarnwrap.command.argument.UuidArgumentType(wrapperContained.uuid()); }
public java.util.UUID getUuid(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getUuid(context,name); }

}