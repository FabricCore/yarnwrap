package yarnwrap.loot.function;
public class SetCustomDataLootFunction { public net.minecraft.loot.function.SetCustomDataLootFunction wrapperContained; public SetCustomDataLootFunction(net.minecraft.loot.function.SetCustomDataLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.nbt.NbtCompound nbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.nbt); }
// public void nbt(yarnwrap.nbt.NbtCompound value) { wrapperContained.nbt = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public SetCustomDataLootFunction(java.util.List conditions,yarnwrap.nbt.NbtCompound nbt) { this.wrapperContained = new net.minecraft.loot.function.SetCustomDataLootFunction(conditions,nbt.wrapperContained); }
// public yarnwrap.nbt.NbtCompound method_53391(yarnwrap.loot.function.SetCustomDataLootFunction function) { return new yarnwrap.nbt.NbtCompound(wrapperContained.method_53391(function.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_53392(Object instance) { return wrapperContained.method_53392(instance); }
public Object builder(yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.builder(nbt.wrapperContained); }
// public void method_57655(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.method_57655(nbt.wrapperContained); }
// public yarnwrap.loot.function.LootFunction method_675(yarnwrap.nbt.NbtCompound conditions) { return new yarnwrap.loot.function.LootFunction(wrapperContained.method_675(conditions.wrapperContained)); }

}