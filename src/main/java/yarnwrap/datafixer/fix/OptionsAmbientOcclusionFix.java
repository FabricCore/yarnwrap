package yarnwrap.datafixer.fix;
public class OptionsAmbientOcclusionFix { public net.minecraft.datafixer.fix.OptionsAmbientOcclusionFix wrapperContained; public OptionsAmbientOcclusionFix(net.minecraft.datafixer.fix.OptionsAmbientOcclusionFix wrapperContained) { this.wrapperContained = wrapperContained; }

public OptionsAmbientOcclusionFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.OptionsAmbientOcclusionFix(outputSchema); }
// public com.mojang.datafixers.Typed method_47995(com.mojang.datafixers.Typed optionsTyped) { return wrapperContained.method_47995(optionsTyped); }
// public com.mojang.serialization.Dynamic method_47996(com.mojang.serialization.Dynamic optionsdynamic) { return wrapperContained.method_47996(optionsdynamic); }
// public com.mojang.serialization.Dynamic method_47997(com.mojang.serialization.Dynamic setting) { return wrapperContained.method_47997(setting); }
// public java.lang.String fixValue(java.lang.String oldValue) { return wrapperContained.fixValue(oldValue); }

}