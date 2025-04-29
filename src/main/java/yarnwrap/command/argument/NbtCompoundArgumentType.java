package yarnwrap.command.argument;
public class NbtCompoundArgumentType { public net.minecraft.command.argument.NbtCompoundArgumentType wrapperContained; public NbtCompoundArgumentType(net.minecraft.command.argument.NbtCompoundArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public static java.util.Collection EXAMPLES() { return net.minecraft.command.argument.NbtCompoundArgumentType.EXAMPLES; }
// public static void EXAMPLES(java.util.Collection value, ) { net.minecraft.command.argument.NbtCompoundArgumentType.EXAMPLES = value; }

// public yarnwrap.command.argument.NbtCompoundArgumentType nbtCompound() { return new yarnwrap.command.argument.NbtCompoundArgumentType(wrapperContained.nbtCompound()); }
public static yarnwrap.command.argument.NbtCompoundArgumentType nbtCompound() { return new yarnwrap.command.argument.NbtCompoundArgumentType(net.minecraft.command.argument.NbtCompoundArgumentType.nbtCompound()); }
// public yarnwrap.nbt.NbtCompound getNbtCompound(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.nbt.NbtCompound(wrapperContained.getNbtCompound(context,name)); }
// public static yarnwrap.nbt.NbtCompound getNbtCompound(com.mojang.brigadier.context.CommandContext context,java.lang.String name, ) { return new yarnwrap.nbt.NbtCompound(net.minecraft.command.argument.NbtCompoundArgumentType.getNbtCompound(context,name)); }
// public java.lang.Object parse(com.mojang.brigadier.StringReader reader) { return wrapperContained.parse(reader); }
// public static java.lang.Object parse(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.command.argument.NbtCompoundArgumentType.parse(reader); }

}