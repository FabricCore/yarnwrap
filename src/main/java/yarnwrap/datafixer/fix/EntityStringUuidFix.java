package yarnwrap.datafixer.fix;
public class EntityStringUuidFix { public net.minecraft.datafixer.fix.EntityStringUuidFix wrapperContained; public EntityStringUuidFix(net.minecraft.datafixer.fix.EntityStringUuidFix wrapperContained) { this.wrapperContained = wrapperContained; }

public EntityStringUuidFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.EntityStringUuidFix(outputSchema,changesType); }
// public com.mojang.serialization.Dynamic method_4986(com.mojang.serialization.Dynamic entityDynamic) { return wrapperContained.method_4986(entityDynamic); }
// public com.mojang.datafixers.Typed method_4987(com.mojang.datafixers.Typed entityTyped) { return wrapperContained.method_4987(entityTyped); }

}