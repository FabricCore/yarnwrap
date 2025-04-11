package yarnwrap.loot.provider.nbt;
public class ContextLootNbtProvider { public net.minecraft.loot.provider.nbt.ContextLootNbtProvider wrapperContained; public ContextLootNbtProvider(net.minecraft.loot.provider.nbt.ContextLootNbtProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.loot.provider.nbt.ContextLootNbtProvider BLOCK_ENTITY() { return new yarnwrap.loot.provider.nbt.ContextLootNbtProvider(wrapperContained.BLOCK_ENTITY); }
// public void BLOCK_ENTITY(yarnwrap.loot.provider.nbt.ContextLootNbtProvider value) { wrapperContained.BLOCK_ENTITY = value.wrapperContained; }
// public Object BLOCK_ENTITY_TARGET() { return wrapperContained.BLOCK_ENTITY_TARGET; }
// // public void BLOCK_ENTITY_TARGET(Object value) { wrapperContained.BLOCK_ENTITY_TARGET = value; }
// public Object target() { return wrapperContained.target; }
// // public void target(Object value) { wrapperContained.target = value; }
// public java.lang.String BLOCK_ENTITY_TARGET_NAME() { return wrapperContained.BLOCK_ENTITY_TARGET_NAME; }
// public void BLOCK_ENTITY_TARGET_NAME(java.lang.String value) { wrapperContained.BLOCK_ENTITY_TARGET_NAME = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public com.mojang.serialization.Codec INLINE_CODEC() { return wrapperContained.INLINE_CODEC; }
// public void INLINE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.INLINE_CODEC = value; }
// public com.mojang.serialization.Codec TARGET_CODEC() { return wrapperContained.TARGET_CODEC; }
// public void TARGET_CODEC(com.mojang.serialization.Codec value) { wrapperContained.TARGET_CODEC = value; }
// public Object getTarget(Object entityTarget) { return wrapperContained.getTarget(entityTarget); }
// public yarnwrap.loot.provider.nbt.LootNbtProvider fromTarget(Object target) { return new yarnwrap.loot.provider.nbt.LootNbtProvider(wrapperContained.fromTarget(target)); }

}