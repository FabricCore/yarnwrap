package yarnwrap.loot.function;
public class CopyNbtLootFunction { public net.minecraft.loot.function.CopyNbtLootFunction wrapperContained; public CopyNbtLootFunction(net.minecraft.loot.function.CopyNbtLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.loot.provider.nbt.LootNbtProvider source() { return new yarnwrap.loot.provider.nbt.LootNbtProvider(wrapperContained.source); }
// public java.util.List operations() { return wrapperContained.operations; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public Object builder(yarnwrap.loot.provider.nbt.LootNbtProvider source) { return wrapperContained.builder(source.wrapperContained); }
// public Object builder(Object target) { return wrapperContained.builder(target); }

}