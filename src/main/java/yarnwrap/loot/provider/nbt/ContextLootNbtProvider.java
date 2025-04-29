package yarnwrap.loot.provider.nbt;
public class ContextLootNbtProvider { public net.minecraft.loot.provider.nbt.ContextLootNbtProvider wrapperContained; public ContextLootNbtProvider(net.minecraft.loot.provider.nbt.ContextLootNbtProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.loot.provider.nbt.ContextLootNbtProvider BLOCK_ENTITY() { return new yarnwrap.loot.provider.nbt.ContextLootNbtProvider(wrapperContained.BLOCK_ENTITY); }
// public void BLOCK_ENTITY(yarnwrap.loot.provider.nbt.ContextLootNbtProvider value) { wrapperContained.BLOCK_ENTITY = value.wrapperContained; }
public static yarnwrap.loot.provider.nbt.ContextLootNbtProvider BLOCK_ENTITY() { return new yarnwrap.loot.provider.nbt.ContextLootNbtProvider(net.minecraft.loot.provider.nbt.ContextLootNbtProvider.BLOCK_ENTITY); }
// public static void BLOCK_ENTITY(yarnwrap.loot.provider.nbt.ContextLootNbtProvider value, ) { net.minecraft.loot.provider.nbt.ContextLootNbtProvider.BLOCK_ENTITY = value.wrapperContained; }

// public Object BLOCK_ENTITY_TARGET() { return wrapperContained.BLOCK_ENTITY_TARGET; }
// // public void BLOCK_ENTITY_TARGET(Object value) { wrapperContained.BLOCK_ENTITY_TARGET = value; }
// // public static Object BLOCK_ENTITY_TARGET() { return net.minecraft.loot.provider.nbt.ContextLootNbtProvider.BLOCK_ENTITY_TARGET; }
// // public static void BLOCK_ENTITY_TARGET(Object value, ) { net.minecraft.loot.provider.nbt.ContextLootNbtProvider.BLOCK_ENTITY_TARGET = value; }

// public Object target() { return wrapperContained.target; }
// // public void target(Object value) { wrapperContained.target = value; }
// // public static Object target() { return net.minecraft.loot.provider.nbt.ContextLootNbtProvider.target; }
// // public static void target(Object value, ) { net.minecraft.loot.provider.nbt.ContextLootNbtProvider.target = value; }

// public java.lang.String BLOCK_ENTITY_TARGET_NAME() { return wrapperContained.BLOCK_ENTITY_TARGET_NAME; }
// public void BLOCK_ENTITY_TARGET_NAME(java.lang.String value) { wrapperContained.BLOCK_ENTITY_TARGET_NAME = value; }
// public static java.lang.String BLOCK_ENTITY_TARGET_NAME() { return net.minecraft.loot.provider.nbt.ContextLootNbtProvider.BLOCK_ENTITY_TARGET_NAME; }
// public static void BLOCK_ENTITY_TARGET_NAME(java.lang.String value, ) { net.minecraft.loot.provider.nbt.ContextLootNbtProvider.BLOCK_ENTITY_TARGET_NAME = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.provider.nbt.ContextLootNbtProvider.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.provider.nbt.ContextLootNbtProvider.CODEC = value; }

// public com.mojang.serialization.Codec INLINE_CODEC() { return wrapperContained.INLINE_CODEC; }
// public void INLINE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.INLINE_CODEC = value; }
public static com.mojang.serialization.Codec INLINE_CODEC() { return net.minecraft.loot.provider.nbt.ContextLootNbtProvider.INLINE_CODEC; }
// public static void INLINE_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.loot.provider.nbt.ContextLootNbtProvider.INLINE_CODEC = value; }

// public com.mojang.serialization.Codec TARGET_CODEC() { return wrapperContained.TARGET_CODEC; }
// public void TARGET_CODEC(com.mojang.serialization.Codec value) { wrapperContained.TARGET_CODEC = value; }
// public static com.mojang.serialization.Codec TARGET_CODEC() { return net.minecraft.loot.provider.nbt.ContextLootNbtProvider.TARGET_CODEC; }
// public static void TARGET_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.loot.provider.nbt.ContextLootNbtProvider.TARGET_CODEC = value; }

// public ContextLootNbtProvider(Object target) { this.wrapperContained = new net.minecraft.loot.provider.nbt.ContextLootNbtProvider(target); }
// public Object getTarget(Object entityTarget) { return wrapperContained.getTarget(entityTarget); }
// public static Object getTarget(Object entityTarget, ) { return net.minecraft.loot.provider.nbt.ContextLootNbtProvider.getTarget(entityTarget); }
// public yarnwrap.loot.provider.nbt.LootNbtProvider fromTarget(Object target) { return new yarnwrap.loot.provider.nbt.LootNbtProvider(wrapperContained.fromTarget(target)); }
// public static yarnwrap.loot.provider.nbt.LootNbtProvider fromTarget(Object target, ) { return new yarnwrap.loot.provider.nbt.LootNbtProvider(net.minecraft.loot.provider.nbt.ContextLootNbtProvider.fromTarget(target)); }
// public com.mojang.datafixers.kinds.App method_53430(Object instance) { return wrapperContained.method_53430(instance); }
// public static com.mojang.datafixers.kinds.App method_53430(Object instance, ) { return net.minecraft.loot.provider.nbt.ContextLootNbtProvider.method_53430(instance); }
// public Object method_53431(yarnwrap.loot.provider.nbt.ContextLootNbtProvider provider) { return wrapperContained.method_53431(provider.wrapperContained); }
// public static Object method_53431(yarnwrap.loot.provider.nbt.ContextLootNbtProvider provider, ) { return net.minecraft.loot.provider.nbt.ContextLootNbtProvider.method_53431(provider.wrapperContained); }
// public Object method_53432(java.lang.String type) { return wrapperContained.method_53432(type); }
// public static Object method_53432(java.lang.String type, ) { return net.minecraft.loot.provider.nbt.ContextLootNbtProvider.method_53432(type); }
// public Object method_53433(yarnwrap.loot.provider.nbt.ContextLootNbtProvider provider) { return wrapperContained.method_53433(provider.wrapperContained); }
// public static Object method_53433(yarnwrap.loot.provider.nbt.ContextLootNbtProvider provider, ) { return net.minecraft.loot.provider.nbt.ContextLootNbtProvider.method_53433(provider.wrapperContained); }

}