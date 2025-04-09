package yarnwrap.loot.function;
public class SetBannerPatternLootFunction { public net.minecraft.loot.function.SetBannerPatternLootFunction wrapperContained; public SetBannerPatternLootFunction(net.minecraft.loot.function.SetBannerPatternLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.component.type.BannerPatternsComponent patterns() { return new yarnwrap.component.type.BannerPatternsComponent(wrapperContained.patterns); }
// public boolean append() { return wrapperContained.append; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public Object builder(boolean append) { return wrapperContained.builder(append); }

}