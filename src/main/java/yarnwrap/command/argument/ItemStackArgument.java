package yarnwrap.command.argument;
public class ItemStackArgument { public net.minecraft.command.argument.ItemStackArgument wrapperContained; public ItemStackArgument(net.minecraft.command.argument.ItemStackArgument wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry item() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.item); }
// public void item(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.item = value.wrapperContained; }
// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType OVERSTACKED_EXCEPTION() { return wrapperContained.OVERSTACKED_EXCEPTION; }
// public void OVERSTACKED_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.OVERSTACKED_EXCEPTION = value; }
// public yarnwrap.component.ComponentChanges components() { return new yarnwrap.component.ComponentChanges(wrapperContained.components); }
// public void components(yarnwrap.component.ComponentChanges value) { wrapperContained.components = value.wrapperContained; }
// public java.lang.String getIdString() { return wrapperContained.getIdString(); }
// public java.lang.String componentsAsString(Object registries) { return wrapperContained.componentsAsString(registries); }
// public yarnwrap.item.ItemStack createStack(int amount,boolean checkOverstack) { return new yarnwrap.item.ItemStack(wrapperContained.createStack(amount,checkOverstack)); }
// public java.lang.String asString(Object registries) { return wrapperContained.asString(registries); }
public yarnwrap.item.Item getItem() { return new yarnwrap.item.Item(wrapperContained.getItem()); }

}