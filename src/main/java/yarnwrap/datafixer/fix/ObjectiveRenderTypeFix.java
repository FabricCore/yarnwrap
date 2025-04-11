package yarnwrap.datafixer.fix;
public class ObjectiveRenderTypeFix { public net.minecraft.datafixer.fix.ObjectiveRenderTypeFix wrapperContained; public ObjectiveRenderTypeFix(net.minecraft.datafixer.fix.ObjectiveRenderTypeFix wrapperContained) { this.wrapperContained = wrapperContained; }

public ObjectiveRenderTypeFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.ObjectiveRenderTypeFix(outputSchema,changesType); }
// public com.mojang.datafixers.Typed method_37376(com.mojang.datafixers.Typed typed) { return wrapperContained.method_37376(typed); }
// public com.mojang.serialization.Dynamic method_37377(com.mojang.serialization.Dynamic objective) { return wrapperContained.method_37377(objective); }
// public java.lang.String parseLegacyRenderType(java.lang.String oldName) { return wrapperContained.parseLegacyRenderType(oldName); }

}