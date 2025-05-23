package yarnwrap.command.argument;
public class IdentifierArgumentType { public net.minecraft.command.argument.IdentifierArgumentType wrapperContained; public IdentifierArgumentType(net.minecraft.command.argument.IdentifierArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public static java.util.Collection EXAMPLES() { return net.minecraft.command.argument.IdentifierArgumentType.EXAMPLES; }
// public static void EXAMPLES(java.util.Collection value, ) { net.minecraft.command.argument.IdentifierArgumentType.EXAMPLES = value; }

// public yarnwrap.command.argument.IdentifierArgumentType identifier() { return new yarnwrap.command.argument.IdentifierArgumentType(wrapperContained.identifier()); }
public static yarnwrap.command.argument.IdentifierArgumentType identifier() { return new yarnwrap.command.argument.IdentifierArgumentType(net.minecraft.command.argument.IdentifierArgumentType.identifier()); }
// public yarnwrap.util.Identifier getIdentifier(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.util.Identifier(wrapperContained.getIdentifier(context,name)); }
// public static yarnwrap.util.Identifier getIdentifier(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return new yarnwrap.util.Identifier(net.minecraft.command.argument.IdentifierArgumentType.getIdentifier(context,name)); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }
// public static java.lang.Object parse(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.command.argument.IdentifierArgumentType.parse(reader); }

}