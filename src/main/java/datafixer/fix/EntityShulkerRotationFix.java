package yarnwrap.datafixer.fix;
public class EntityShulkerRotationFix { public net.minecraft.datafixer.fix.EntityShulkerRotationFix wrapperContained; public EntityShulkerRotationFix(net.minecraft.datafixer.fix.EntityShulkerRotationFix wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Dynamic fixRotation(com.mojang.serialization.Dynamic shulkerDynamic) { return wrapperContained.fixRotation(shulkerDynamic); }

}