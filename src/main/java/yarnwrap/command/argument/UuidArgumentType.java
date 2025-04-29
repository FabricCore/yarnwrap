package yarnwrap.command.argument;
public class UuidArgumentType { public net.minecraft.command.argument.UuidArgumentType wrapperContained; public UuidArgumentType(net.minecraft.command.argument.UuidArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_UUID() { return wrapperContained.INVALID_UUID; }
// public void INVALID_UUID(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.INVALID_UUID = value; }
public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType INVALID_UUID() { return net.minecraft.command.argument.UuidArgumentType.INVALID_UUID; }
// public static void INVALID_UUID(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.command.argument.UuidArgumentType.INVALID_UUID = value; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public static java.util.Collection EXAMPLES() { return net.minecraft.command.argument.UuidArgumentType.EXAMPLES; }
// public static void EXAMPLES(java.util.Collection value, ) { net.minecraft.command.argument.UuidArgumentType.EXAMPLES = value; }

// public java.util.regex.Pattern VALID_CHARACTERS() { return wrapperContained.VALID_CHARACTERS; }
// public void VALID_CHARACTERS(java.util.regex.Pattern value) { wrapperContained.VALID_CHARACTERS = value; }
// public static java.util.regex.Pattern VALID_CHARACTERS() { return net.minecraft.command.argument.UuidArgumentType.VALID_CHARACTERS; }
// public static void VALID_CHARACTERS(java.util.regex.Pattern value, ) { net.minecraft.command.argument.UuidArgumentType.VALID_CHARACTERS = value; }

// public yarnwrap.command.argument.UuidArgumentType uuid() { return new yarnwrap.command.argument.UuidArgumentType(wrapperContained.uuid()); }
public static yarnwrap.command.argument.UuidArgumentType uuid() { return new yarnwrap.command.argument.UuidArgumentType(net.minecraft.command.argument.UuidArgumentType.uuid()); }
// public java.util.UUID getUuid(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getUuid(context,name); }
// public static java.util.UUID getUuid(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return net.minecraft.command.argument.UuidArgumentType.getUuid(context,name); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }
// public static java.lang.Object parse(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.command.argument.UuidArgumentType.parse(reader); }

}