package yarnwrap.loot.function;
public class SetBannerPatternLootFunction { public net.minecraft.loot.function.SetBannerPatternLootFunction wrapperContained; public SetBannerPatternLootFunction(net.minecraft.loot.function.SetBannerPatternLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.component.type.BannerPatternsComponent patterns() { return new yarnwrap.component.type.BannerPatternsComponent(wrapperContained.patterns); }
// public void patterns(yarnwrap.component.type.BannerPatternsComponent value) { wrapperContained.patterns = value.wrapperContained; }
// public boolean append() { return wrapperContained.append; }
// public void append(boolean value) { wrapperContained.append = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public Object builder(boolean append) { return wrapperContained.builder(append); }

}