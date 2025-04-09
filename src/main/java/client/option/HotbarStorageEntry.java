package yarnwrap.client.option;
public class HotbarStorageEntry { public net.minecraft.client.option.HotbarStorageEntry wrapperContained; public HotbarStorageEntry(net.minecraft.client.option.HotbarStorageEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public int HOTBAR_SIZE() { return wrapperContained.HOTBAR_SIZE; }
// public com.mojang.serialization.DynamicOps NBT_OPS() { return wrapperContained.NBT_OPS; }
// public com.mojang.serialization.Dynamic EMPTY_STACK() { return wrapperContained.EMPTY_STACK; }
// public java.util.List stacks() { return wrapperContained.stacks; }
public boolean isEmpty() { return wrapperContained.isEmpty(); }
public void serialize(yarnwrap.entity.player.PlayerInventory playerInventory,yarnwrap.registry.DynamicRegistryManager registryManager) { wrapperContained.serialize(playerInventory.wrapperContained,registryManager.wrapperContained); }
// public boolean isEmpty(com.mojang.serialization.Dynamic stack) { return wrapperContained.isEmpty(stack); }
// public java.util.List deserialize(Object registryLookup) { return wrapperContained.deserialize(registryLookup); }

}