package yarnwrap.client.option;
public class HotbarStorageEntry { public net.minecraft.client.option.HotbarStorageEntry wrapperContained; public HotbarStorageEntry(net.minecraft.client.option.HotbarStorageEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.client.option.HotbarStorageEntry.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.client.option.HotbarStorageEntry.CODEC = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.option.HotbarStorageEntry.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.option.HotbarStorageEntry.LOGGER = value; }

// public int HOTBAR_SIZE() { return wrapperContained.HOTBAR_SIZE; }
// public void HOTBAR_SIZE(int value) { wrapperContained.HOTBAR_SIZE = value; }
// public static int HOTBAR_SIZE() { return net.minecraft.client.option.HotbarStorageEntry.HOTBAR_SIZE; }
// public static void HOTBAR_SIZE(int value, ) { net.minecraft.client.option.HotbarStorageEntry.HOTBAR_SIZE = value; }

// public com.mojang.serialization.DynamicOps NBT_OPS() { return wrapperContained.NBT_OPS; }
// public void NBT_OPS(com.mojang.serialization.DynamicOps value) { wrapperContained.NBT_OPS = value; }
// public static com.mojang.serialization.DynamicOps NBT_OPS() { return net.minecraft.client.option.HotbarStorageEntry.NBT_OPS; }
// public static void NBT_OPS(com.mojang.serialization.DynamicOps value, ) { net.minecraft.client.option.HotbarStorageEntry.NBT_OPS = value; }

// public com.mojang.serialization.Dynamic EMPTY_STACK() { return wrapperContained.EMPTY_STACK; }
// public void EMPTY_STACK(com.mojang.serialization.Dynamic value) { wrapperContained.EMPTY_STACK = value; }
// public static com.mojang.serialization.Dynamic EMPTY_STACK() { return net.minecraft.client.option.HotbarStorageEntry.EMPTY_STACK; }
// public static void EMPTY_STACK(com.mojang.serialization.Dynamic value, ) { net.minecraft.client.option.HotbarStorageEntry.EMPTY_STACK = value; }

// public java.util.List stacks() { return wrapperContained.stacks; }
// public void stacks(java.util.List value) { wrapperContained.stacks = value; }
// public static java.util.List stacks() { return net.minecraft.client.option.HotbarStorageEntry.stacks; }
// public static void stacks(java.util.List value, ) { net.minecraft.client.option.HotbarStorageEntry.stacks = value; }

// public HotbarStorageEntry(java.util.List stacks) { this.wrapperContained = new net.minecraft.client.option.HotbarStorageEntry(stacks); }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
// public static boolean isEmpty() { return net.minecraft.client.option.HotbarStorageEntry.isEmpty(); }
public void serialize(yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.registry.DynamicRegistryManager registryManager) { wrapperContained.serialize(playerInventory.wrapperContained,registryManager.wrapperContained); }
// public static void serialize(yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.registry.DynamicRegistryManager registryManager, ) { net.minecraft.client.option.HotbarStorageEntry.serialize(playerInventory.wrapperContained,registryManager.wrapperContained); }
// public boolean isEmpty(com.mojang.serialization.Dynamic stack) { return wrapperContained.isEmpty(stack); }
// public static boolean isEmpty(com.mojang.serialization.Dynamic stack, ) { return net.minecraft.client.option.HotbarStorageEntry.isEmpty(stack); }
// public java.util.List method_56838(yarnwrap.client.option.HotbarStorageEntry entry) { return wrapperContained.method_56838(entry.wrapperContained); }
// public static java.util.List method_56838(yarnwrap.client.option.HotbarStorageEntry entry, ) { return net.minecraft.client.option.HotbarStorageEntry.method_56838(entry.wrapperContained); }
// public java.util.List deserialize(Object registryLookup) { return wrapperContained.deserialize(registryLookup); }
// public static java.util.List deserialize(Object registryLookup, ) { return net.minecraft.client.option.HotbarStorageEntry.deserialize(registryLookup); }
// public yarnwrap.item.ItemStack method_56840(Object stack) { return new yarnwrap.item.ItemStack(wrapperContained.method_56840(stack)); }
// public static yarnwrap.item.ItemStack method_56840(Object stack, ) { return new yarnwrap.item.ItemStack(net.minecraft.client.option.HotbarStorageEntry.method_56840(stack)); }
// public void method_56841(java.lang.String error) { wrapperContained.method_56841(error); }
// public static void method_56841(java.lang.String error, ) { net.minecraft.client.option.HotbarStorageEntry.method_56841(error); }
// public com.mojang.serialization.DataResult method_56842(java.util.List stacks) { return wrapperContained.method_56842(stacks); }
// public static com.mojang.serialization.DataResult method_56842(java.util.List stacks, ) { return net.minecraft.client.option.HotbarStorageEntry.method_56842(stacks); }
// public com.mojang.serialization.Dynamic method_56843(yarnwrap.nbt.NbtElement nbt) { return wrapperContained.method_56843(nbt.wrapperContained); }
// public static com.mojang.serialization.Dynamic method_56843(yarnwrap.nbt.NbtElement nbt, ) { return net.minecraft.client.option.HotbarStorageEntry.method_56843(nbt.wrapperContained); }
// public void method_56844(java.lang.String error) { wrapperContained.method_56844(error); }
// public static void method_56844(java.lang.String error, ) { net.minecraft.client.option.HotbarStorageEntry.method_56844(error); }

}