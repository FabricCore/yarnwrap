package yarnwrap.datafixer.fix;
public class RemoveFeatureTogglesFix { public net.minecraft.datafixer.fix.RemoveFeatureTogglesFix wrapperContained; public RemoveFeatureTogglesFix(net.minecraft.datafixer.fix.RemoveFeatureTogglesFix wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public java.util.Set featureToggleIds() { return wrapperContained.featureToggleIds; }
// public void featureToggleIds(java.util.Set value) { wrapperContained.featureToggleIds = value; }
public RemoveFeatureTogglesFix(com.mojang.datafixers.schemas.Schema outputSchema,java.lang.String name,java.util.Set featureToggleIds) { this.wrapperContained = new net.minecraft.datafixer.fix.RemoveFeatureTogglesFix(outputSchema,name,featureToggleIds); }
// public com.mojang.datafixers.Typed method_49766(com.mojang.datafixers.Typed levelTyped) { return wrapperContained.method_49766(levelTyped); }
// public com.mojang.serialization.Dynamic removeFeatureToggles(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.removeFeatureToggles(dynamic); }
// public com.mojang.serialization.Dynamic method_49768(java.util.List enabledFeatures) { return wrapperContained.method_49768(enabledFeatures); }
// public java.util.stream.Stream method_49769(java.util.List stream) { return wrapperContained.method_49769(stream); }
// public boolean method_49770(java.util.List enabledFeature) { return wrapperContained.method_49770(enabledFeature); }

}