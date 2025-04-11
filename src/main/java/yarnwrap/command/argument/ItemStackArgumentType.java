package yarnwrap.command.argument;
public class ItemStackArgumentType { public net.minecraft.command.argument.ItemStackArgumentType wrapperContained; public ItemStackArgumentType(net.minecraft.command.argument.ItemStackArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
// public void EXAMPLES(java.util.Collection value) { wrapperContained.EXAMPLES = value; }
// public yarnwrap.command.argument.ItemStringReader reader() { return new yarnwrap.command.argument.ItemStringReader(wrapperContained.reader); }
// public void reader(yarnwrap.command.argument.ItemStringReader value) { wrapperContained.reader = value.wrapperContained; }
public yarnwrap.command.argument.ItemStackArgumentType itemStack(yarnwrap.command.CommandRegistryAccess commandRegistryAccess) { return new yarnwrap.command.argument.ItemStackArgumentType(wrapperContained.itemStack(commandRegistryAccess.wrapperContained)); }
public yarnwrap.command.argument.ItemStackArgument getItemStackArgument(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return new yarnwrap.command.argument.ItemStackArgument(wrapperContained.getItemStackArgument(context,name)); }

}