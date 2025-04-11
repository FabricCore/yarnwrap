package yarnwrap.loot.function;
public class CopyNbtLootFunction { public net.minecraft.loot.function.CopyNbtLootFunction wrapperContained; public CopyNbtLootFunction(net.minecraft.loot.function.CopyNbtLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.loot.provider.nbt.LootNbtProvider source() { return new yarnwrap.loot.provider.nbt.LootNbtProvider(wrapperContained.source); }
// public void source(yarnwrap.loot.provider.nbt.LootNbtProvider value) { wrapperContained.source = value.wrapperContained; }
// public java.util.List operations() { return wrapperContained.operations; }
// public void operations(java.util.List value) { wrapperContained.operations = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public CopyNbtLootFunction(java.util.List conditions,yarnwrap.loot.provider.nbt.LootNbtProvider source,java.util.List operations) { this.wrapperContained = new net.minecraft.loot.function.CopyNbtLootFunction(conditions,source.wrapperContained,operations); }
// public void method_16846(java.util.function.Supplier operation) { wrapperContained.method_16846(operation); }
public Object builder(yarnwrap.loot.provider.nbt.LootNbtProvider source) { return wrapperContained.builder(source.wrapperContained); }
// public Object builder(Object target) { return wrapperContained.builder(target); }
// public java.util.List method_53315(yarnwrap.loot.function.CopyNbtLootFunction function) { return wrapperContained.method_53315(function.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53316(Object instance) { return wrapperContained.method_53316(instance); }
// public yarnwrap.loot.provider.nbt.LootNbtProvider method_53317(yarnwrap.loot.function.CopyNbtLootFunction function) { return new yarnwrap.loot.provider.nbt.LootNbtProvider(wrapperContained.method_53317(function.wrapperContained)); }

}