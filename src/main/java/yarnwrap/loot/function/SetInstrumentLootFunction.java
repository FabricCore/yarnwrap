package yarnwrap.loot.function;
public class SetInstrumentLootFunction { public net.minecraft.loot.function.SetInstrumentLootFunction wrapperContained; public SetInstrumentLootFunction(net.minecraft.loot.function.SetInstrumentLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.tag.TagKey options() { return new yarnwrap.registry.tag.TagKey(wrapperContained.options); }
// public void options(yarnwrap.registry.tag.TagKey value) { wrapperContained.options = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public Object builder(yarnwrap.registry.tag.TagKey options) { return wrapperContained.builder(options.wrapperContained); }

}