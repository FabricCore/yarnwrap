package yarnwrap.command.argument;
public class ItemStackArgument { public net.minecraft.command.argument.ItemStackArgument wrapperContained; public ItemStackArgument(net.minecraft.command.argument.ItemStackArgument wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry item() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.item); }
// public void item(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.item = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry item() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.command.argument.ItemStackArgument.item); }
// public static void item(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.command.argument.ItemStackArgument.item = value.wrapperContained; }

// public com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType OVERSTACKED_EXCEPTION() { return wrapperContained.OVERSTACKED_EXCEPTION; }
// public void OVERSTACKED_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value) { wrapperContained.OVERSTACKED_EXCEPTION = value; }
// public static com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType OVERSTACKED_EXCEPTION() { return net.minecraft.command.argument.ItemStackArgument.OVERSTACKED_EXCEPTION; }
// public static void OVERSTACKED_EXCEPTION(com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType value, ) { net.minecraft.command.argument.ItemStackArgument.OVERSTACKED_EXCEPTION = value; }

// public yarnwrap.component.ComponentChanges components() { return new yarnwrap.component.ComponentChanges(wrapperContained.components); }
// public void components(yarnwrap.component.ComponentChanges value) { wrapperContained.components = value.wrapperContained; }
// public static yarnwrap.component.ComponentChanges components() { return new yarnwrap.component.ComponentChanges(net.minecraft.command.argument.ItemStackArgument.components); }
// public static void components(yarnwrap.component.ComponentChanges value, ) { net.minecraft.command.argument.ItemStackArgument.components = value.wrapperContained; }

public ItemStackArgument(yarnwrap.registry.entry.RegistryEntry item,yarnwrap.component.ComponentChanges components) { this.wrapperContained = new net.minecraft.command.argument.ItemStackArgument(item.wrapperContained,components.wrapperContained); }
// public yarnwrap.item.ItemStack createStack(int amount,boolean checkOverstack) { return new yarnwrap.item.ItemStack(wrapperContained.createStack(amount,checkOverstack)); }
// public static yarnwrap.item.ItemStack createStack(int amount,boolean checkOverstack, ) { return new yarnwrap.item.ItemStack(net.minecraft.command.argument.ItemStackArgument.createStack(amount,checkOverstack)); }
// public java.lang.String asString(Object registries) { return wrapperContained.asString(registries); }
// public static java.lang.String asString(Object registries, ) { return net.minecraft.command.argument.ItemStackArgument.asString(registries); }
// public com.mojang.brigadier.Message method_9784(java.lang.Object item,java.lang.Object maxCount) { return wrapperContained.method_9784(item,maxCount); }
// public static com.mojang.brigadier.Message method_9784(java.lang.Object item,java.lang.Object maxCount, ) { return net.minecraft.command.argument.ItemStackArgument.method_9784(item,maxCount); }
public yarnwrap.item.Item getItem() { return new yarnwrap.item.Item(wrapperContained.getItem()); }
// public static yarnwrap.item.Item getItem() { return new yarnwrap.item.Item(net.minecraft.command.argument.ItemStackArgument.getItem()); }
// public java.lang.String getIdString() { return wrapperContained.getIdString(); }
// public static java.lang.String getIdString() { return net.minecraft.command.argument.ItemStackArgument.getIdString(); }
// public java.util.stream.Stream method_57800(com.mojang.serialization.DynamicOps entry) { return wrapperContained.method_57800(entry); }
// public static java.util.stream.Stream method_57800(com.mojang.serialization.DynamicOps entry, ) { return net.minecraft.command.argument.ItemStackArgument.method_57800(entry); }
// public java.lang.String componentsAsString(Object registries) { return wrapperContained.componentsAsString(registries); }
// public static java.lang.String componentsAsString(Object registries, ) { return net.minecraft.command.argument.ItemStackArgument.componentsAsString(registries); }
// public java.lang.String method_60378(yarnwrap.util.Identifier value) { return wrapperContained.method_60378(value.wrapperContained); }
// public static java.lang.String method_60378(yarnwrap.util.Identifier value, ) { return net.minecraft.command.argument.ItemStackArgument.method_60378(value.wrapperContained); }

}