package yarnwrap.command.argument;
public class NbtElementArgumentType { public net.minecraft.command.argument.NbtElementArgumentType wrapperContained; public NbtElementArgumentType(net.minecraft.command.argument.NbtElementArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public static java.util.Collection EXAMPLES() { return net.minecraft.command.argument.NbtElementArgumentType.EXAMPLES; }
// public static void EXAMPLES(java.util.Collection value, ) { net.minecraft.command.argument.NbtElementArgumentType.EXAMPLES = value; }

// public yarnwrap.util.packrat.Parser PARSER() { return new yarnwrap.util.packrat.Parser(wrapperContained.PARSER); }
// public void PARSER(yarnwrap.util.packrat.Parser value) { wrapperContained.PARSER = value.wrapperContained; }
// public static yarnwrap.util.packrat.Parser PARSER() { return new yarnwrap.util.packrat.Parser(net.minecraft.command.argument.NbtElementArgumentType.PARSER); }
// public static void PARSER(yarnwrap.util.packrat.Parser value, ) { net.minecraft.command.argument.NbtElementArgumentType.PARSER = value.wrapperContained; }

// public yarnwrap.command.argument.NbtElementArgumentType nbtElement() { return new yarnwrap.command.argument.NbtElementArgumentType(wrapperContained.nbtElement()); }
public static yarnwrap.command.argument.NbtElementArgumentType nbtElement() { return new yarnwrap.command.argument.NbtElementArgumentType(net.minecraft.command.argument.NbtElementArgumentType.nbtElement()); }
// public yarnwrap.nbt.NbtElement getNbtElement(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.nbt.NbtElement(wrapperContained.getNbtElement(context,name)); }
// public static yarnwrap.nbt.NbtElement getNbtElement(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return new yarnwrap.nbt.NbtElement(net.minecraft.command.argument.NbtElementArgumentType.getNbtElement(context,name)); }

}