package yarnwrap.datafixer.fix;
public class EntityShulkerRotationFix { public net.minecraft.datafixer.fix.EntityShulkerRotationFix wrapperContained; public EntityShulkerRotationFix(net.minecraft.datafixer.fix.EntityShulkerRotationFix wrapperContained) { this.wrapperContained = wrapperContained; }

public EntityShulkerRotationFix(com.mojang.datafixers.schemas.Schema outputSchema) { this.wrapperContained = new net.minecraft.datafixer.fix.EntityShulkerRotationFix(outputSchema); }
public com.mojang.serialization.Dynamic fixRotation(com.mojang.serialization.Dynamic shulkerDynamic) { return wrapperContained.fixRotation(shulkerDynamic); }
// public static com.mojang.serialization.Dynamic fixRotation(com.mojang.serialization.Dynamic shulkerDynamic, ) { return net.minecraft.datafixer.fix.EntityShulkerRotationFix.fixRotation(shulkerDynamic); }
// public java.lang.Double method_27961(com.mojang.serialization.Dynamic rotationDynamic) { return wrapperContained.method_27961(rotationDynamic); }
// public static java.lang.Double method_27961(com.mojang.serialization.Dynamic rotationDynamic, ) { return net.minecraft.datafixer.fix.EntityShulkerRotationFix.method_27961(rotationDynamic); }

}