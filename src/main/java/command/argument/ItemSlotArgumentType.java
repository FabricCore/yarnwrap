package yarnwrap.command.argument;
public class ItemSlotArgumentType { public net.minecraft.command.argument.ItemSlotArgumentType wrapperContained; public ItemSlotArgumentType(net.minecraft.command.argument.ItemSlotArgumentType wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType ONLY_SINGLE_ALLOWED_EXCEPTION() { return wrapperContained.ONLY_SINGLE_ALLOWED_EXCEPTION; }
// public com.mojang.brigadier.exceptions.DynamicCommandExceptionType UNKNOWN_SLOT_EXCEPTION() { return wrapperContained.UNKNOWN_SLOT_EXCEPTION; }
// public java.util.Collection EXAMPLES() { return wrapperContained.EXAMPLES; }
public int getItemSlot(com.mojang.brigadier.context.CommandContext context,java.lang.String name) { return wrapperContained.getItemSlot(context,name); }
public yarnwrap.command.argument.ItemSlotArgumentType itemSlot() { return new yarnwrap.command.argument.ItemSlotArgumentType(wrapperContained.itemSlot()); }

}