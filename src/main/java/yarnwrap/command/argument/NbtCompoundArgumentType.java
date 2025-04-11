package yarnwrap.command.argument;
public class NbtCompoundArgumentType { public net.minecraft.command.argument.NbtCompoundArgumentType wrapperContained; public NbtCompoundArgumentType(net.minecraft.command.argument.NbtCompoundArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
public yarnwrap.command.argument.NbtCompoundArgumentType nbtCompound() { return new yarnwrap.command.argument.NbtCompoundArgumentType(wrapperContained.nbtCompound()); }
public yarnwrap.nbt.NbtCompound getNbtCompound(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.nbt.NbtCompound(wrapperContained.getNbtCompound(context,name)); }

}