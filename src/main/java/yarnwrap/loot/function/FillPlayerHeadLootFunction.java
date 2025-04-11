package yarnwrap.loot.function;
public class FillPlayerHeadLootFunction { public net.minecraft.loot.function.FillPlayerHeadLootFunction wrapperContained; public FillPlayerHeadLootFunction(net.minecraft.loot.function.FillPlayerHeadLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object entity() { return wrapperContained.entity; }
// // public void entity(Object value) { wrapperContained.entity = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public Object builder(Object target) { return wrapperContained.builder(target); }

}