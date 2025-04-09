package yarnwrap.loot.provider.nbt;
public class ContextLootNbtProvider { public net.minecraft.loot.provider.nbt.ContextLootNbtProvider wrapperContained; public ContextLootNbtProvider(net.minecraft.loot.provider.nbt.ContextLootNbtProvider wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.loot.provider.nbt.ContextLootNbtProvider BLOCK_ENTITY() { return new yarnwrap.loot.provider.nbt.ContextLootNbtProvider(wrapperContained.BLOCK_ENTITY); }
// public Object BLOCK_ENTITY_TARGET() { return wrapperContained.BLOCK_ENTITY_TARGET; }
// public Object target() { return wrapperContained.target; }
// public java.lang.String BLOCK_ENTITY_TARGET_NAME() { return wrapperContained.BLOCK_ENTITY_TARGET_NAME; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public com.mojang.serialization.Codec INLINE_CODEC() { return wrapperContained.INLINE_CODEC; }
// public com.mojang.serialization.Codec TARGET_CODEC() { return wrapperContained.TARGET_CODEC; }
// public Object getTarget(Object entityTarget) { return wrapperContained.getTarget(entityTarget); }
// public yarnwrap.loot.provider.nbt.LootNbtProvider fromTarget(Object target) { return new yarnwrap.loot.provider.nbt.LootNbtProvider(wrapperContained.fromTarget(target)); }

}