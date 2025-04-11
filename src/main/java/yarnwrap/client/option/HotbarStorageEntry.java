package yarnwrap.client.option;
public class HotbarStorageEntry { public net.minecraft.client.option.HotbarStorageEntry wrapperContained; public HotbarStorageEntry(net.minecraft.client.option.HotbarStorageEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public int HOTBAR_SIZE() { return wrapperContained.HOTBAR_SIZE; }
// public void HOTBAR_SIZE(int value) { wrapperContained.HOTBAR_SIZE = value; }
// public com.mojang.serialization.DynamicOps NBT_OPS() { return wrapperContained.NBT_OPS; }
// public void NBT_OPS(com.mojang.serialization.DynamicOps value) { wrapperContained.NBT_OPS = value; }
// public com.mojang.serialization.Dynamic EMPTY_STACK() { return wrapperContained.EMPTY_STACK; }
// public void EMPTY_STACK(com.mojang.serialization.Dynamic value) { wrapperContained.EMPTY_STACK = value; }
// public java.util.List stacks() { return wrapperContained.stacks; }
// public void stacks(java.util.List value) { wrapperContained.stacks = value; }
// public HotbarStorageEntry(java.util.List stacks) { this.wrapperContained = new net.minecraft.client.option.HotbarStorageEntry(stacks); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
public void serialize(yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.registry.DynamicRegistryManager registryManager) { wrapperContained.serialize(playerInventory.wrapperContained,registryManager.wrapperContained); }
// public boolean isEmpty(com.mojang.serialization.Dynamic stack) { return wrapperContained.isEmpty(stack); }
// public java.util.List method_56838(yarnwrap.client.option.HotbarStorageEntry entry) { return wrapperContained.method_56838(entry.wrapperContained); }
// public java.util.List deserialize(Object registryLookup) { return wrapperContained.deserialize(registryLookup); }
// public yarnwrap.item.ItemStack method_56840(Object stack) { return new yarnwrap.item.ItemStack(wrapperContained.method_56840(stack)); }
// public void method_56841(java.lang.String error) { wrapperContained.method_56841(error); }
// public com.mojang.serialization.DataResult method_56842(java.util.List stacks) { return wrapperContained.method_56842(stacks); }
// public com.mojang.serialization.Dynamic method_56843(yarnwrap.nbt.NbtElement nbt) { return wrapperContained.method_56843(nbt.wrapperContained); }
// public void method_56844(java.lang.String error) { wrapperContained.method_56844(error); }

}