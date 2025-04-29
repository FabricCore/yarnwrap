package yarnwrap.loot.function;
public class SetBannerPatternLootFunction { public net.minecraft.loot.function.SetBannerPatternLootFunction wrapperContained; public SetBannerPatternLootFunction(net.minecraft.loot.function.SetBannerPatternLootFunction wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.component.type.BannerPatternsComponent patterns() { return new yarnwrap.component.type.BannerPatternsComponent(wrapperContained.patterns); }
// public void patterns(yarnwrap.component.type.BannerPatternsComponent value) { wrapperContained.patterns = value.wrapperContained; }
// public static yarnwrap.component.type.BannerPatternsComponent patterns() { return new yarnwrap.component.type.BannerPatternsComponent(net.minecraft.loot.function.SetBannerPatternLootFunction.patterns); }
// public static void patterns(yarnwrap.component.type.BannerPatternsComponent value, ) { net.minecraft.loot.function.SetBannerPatternLootFunction.patterns = value.wrapperContained; }

// public boolean append() { return wrapperContained.append; }
// public void append(boolean value) { wrapperContained.append = value; }
// public static boolean append() { return net.minecraft.loot.function.SetBannerPatternLootFunction.append; }
// public static void append(boolean value, ) { net.minecraft.loot.function.SetBannerPatternLootFunction.append = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.loot.function.SetBannerPatternLootFunction.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.loot.function.SetBannerPatternLootFunction.CODEC = value; }

// public SetBannerPatternLootFunction(java.util.List conditions,yarnwrap.component.type.BannerPatternsComponent patterns,boolean append) { this.wrapperContained = new net.minecraft.loot.function.SetBannerPatternLootFunction(conditions,patterns.wrapperContained,append); }
// public Object builder(boolean append) { return wrapperContained.builder(append); }
// public static Object builder(boolean append, ) { return net.minecraft.loot.function.SetBannerPatternLootFunction.builder(append); }
// public java.lang.Boolean method_53360(yarnwrap.loot.function.SetBannerPatternLootFunction function) { return wrapperContained.method_53360(function.wrapperContained); }
// public static java.lang.Boolean method_53360(yarnwrap.loot.function.SetBannerPatternLootFunction function, ) { return net.minecraft.loot.function.SetBannerPatternLootFunction.method_53360(function.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_53361(Object instance) { return wrapperContained.method_53361(instance); }
// public static com.mojang.datafixers.kinds.App method_53361(Object instance, ) { return net.minecraft.loot.function.SetBannerPatternLootFunction.method_53361(instance); }
// public yarnwrap.component.type.BannerPatternsComponent method_53362(yarnwrap.loot.function.SetBannerPatternLootFunction function) { return new yarnwrap.component.type.BannerPatternsComponent(wrapperContained.method_53362(function.wrapperContained)); }
// public static yarnwrap.component.type.BannerPatternsComponent method_53362(yarnwrap.loot.function.SetBannerPatternLootFunction function, ) { return new yarnwrap.component.type.BannerPatternsComponent(net.minecraft.loot.function.SetBannerPatternLootFunction.method_53362(function.wrapperContained)); }
// public yarnwrap.component.type.BannerPatternsComponent method_57648(yarnwrap.component.type.BannerPatternsComponent current,yarnwrap.component.type.BannerPatternsComponent newPatterns) { return new yarnwrap.component.type.BannerPatternsComponent(wrapperContained.method_57648(current.wrapperContained,newPatterns.wrapperContained)); }
// public static yarnwrap.component.type.BannerPatternsComponent method_57648(yarnwrap.component.type.BannerPatternsComponent current,yarnwrap.component.type.BannerPatternsComponent newPatterns, ) { return new yarnwrap.component.type.BannerPatternsComponent(net.minecraft.loot.function.SetBannerPatternLootFunction.method_57648(current.wrapperContained,newPatterns.wrapperContained)); }

}