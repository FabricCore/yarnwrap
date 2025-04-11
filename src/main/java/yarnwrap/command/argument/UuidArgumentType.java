package yarnwrap.command.argument;
public class UuidArgumentType { public net.minecraft.command.argument.UuidArgumentType wrapperContained; public UuidArgumentType(net.minecraft.command.argument.UuidArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_UUID() { return wrapperContained.INVALID_UUID; }
// public void INVALID_UUID(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.INVALID_UUID = value; }
// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public java.util.regex.Pattern VALID_CHARACTERS() { return wrapperContained.VALID_CHARACTERS; }
// public void VALID_CHARACTERS(java.util.regex.Pattern value) { wrapperContained.VALID_CHARACTERS = value; }
public yarnwrap.command.argument.UuidArgumentType uuid() { return new yarnwrap.command.argument.UuidArgumentType(wrapperContained.uuid()); }
public java.util.UUID getUuid(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getUuid(context,name); }

}