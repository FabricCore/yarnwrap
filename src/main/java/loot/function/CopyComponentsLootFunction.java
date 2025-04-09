package yarnwrap.loot.function;
public class CopyComponentsLootFunction { public net.minecraft.loot.function.CopyComponentsLootFunction wrapperContained; public CopyComponentsLootFunction(net.minecraft.loot.function.CopyComponentsLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public Object source() { return wrapperContained.source; }
// public java.util.Optional include() { return wrapperContained.include; }
// public java.util.Optional exclude() { return wrapperContained.exclude; }
// public java.util.function.Predicate filter() { return wrapperContained.filter; }
// public Object builder(Object source) { return wrapperContained.builder(source); }

}