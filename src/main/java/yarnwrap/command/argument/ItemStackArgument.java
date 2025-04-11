package yarnwrap.command.argument;
public class ItemStackArgument { public net.minecraft.command.argument.ItemStackArgument wrapperContained; public ItemStackArgument(net.minecraft.command.argument.ItemStackArgument wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry item() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.item); }
// public void item(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.item = value.wrapperContained; }
// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType OVERSTACKED_EXCEPTION() { return wrapperContained.OVERSTACKED_EXCEPTION; }
// public void OVERSTACKED_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.OVERSTACKED_EXCEPTION = value; }
// public yarnwrap.component.ComponentChanges components() { return new yarnwrap.component.ComponentChanges(wrapperContained.components); }
// public void components(yarnwrap.component.ComponentChanges value) { wrapperContained.components = value.wrapperContained; }
public ItemStackArgument(yarnwrap.registry.entry.RegistryEntry item,yarnwrap.component.ComponentChanges components) { this.wrapperContained = new net.minecraft.command.argument.ItemStackArgument(item.wrapperContained,components.wrapperContained); }
// public java.lang.String getIdString() { return wrapperContained.getIdString(); }
// public java.util.stream.Stream method_57800(com.mojang.serialization.DynamicOps entry) { return wrapperContained.method_57800(entry); }
// public java.lang.String componentsAsString(Object registries) { return wrapperContained.componentsAsString(registries); }
// public java.lang.String method_60378(yarnwrap.util.Identifier value) { return wrapperContained.method_60378(value.wrapperContained); }
// public yarnwrap.item.ItemStack createStack(int amount,boolean checkOverstack) { return new yarnwrap.item.ItemStack(wrapperContained.createStack(amount,checkOverstack)); }
// public java.lang.String asString(Object registries) { return wrapperContained.asString(registries); }
// public com.mojang.brigadier.Message method_9784(java.lang.Object item,java.lang.Object maxCount) { return wrapperContained.method_9784(item,maxCount); }
public yarnwrap.item.Item getItem() { return new yarnwrap.item.Item(wrapperContained.getItem()); }

}