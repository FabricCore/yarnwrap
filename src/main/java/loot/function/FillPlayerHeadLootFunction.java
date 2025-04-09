package yarnwrap.loot.function;
public class FillPlayerHeadLootFunction { public net.minecraft.loot.function.FillPlayerHeadLootFunction wrapperContained; public FillPlayerHeadLootFunction(net.minecraft.loot.function.FillPlayerHeadLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object entity() { return wrapperContained.entity; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public Object builder(Object target) { return wrapperContained.builder(target); }

}