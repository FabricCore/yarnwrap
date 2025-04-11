package yarnwrap.command.argument;
public class NbtElementArgumentType { public net.minecraft.command.argument.NbtElementArgumentType wrapperContained; public NbtElementArgumentType(net.minecraft.command.argument.NbtElementArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
public yarnwrap.command.argument.NbtElementArgumentType nbtElement() { return new yarnwrap.command.argument.NbtElementArgumentType(wrapperContained.nbtElement()); }
public yarnwrap.nbt.NbtElement getNbtElement(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.nbt.NbtElement(wrapperContained.getNbtElement(context,name)); }

}