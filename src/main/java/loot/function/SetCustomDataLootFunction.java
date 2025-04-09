package yarnwrap.loot.function;
public class SetCustomDataLootFunction { public net.minecraft.loot.function.SetCustomDataLootFunction wrapperContained; public SetCustomDataLootFunction(net.minecraft.loot.function.SetCustomDataLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.nbt.NbtCompound nbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.nbt); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public Object builder(yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.builder(nbt.wrapperContained); }

}