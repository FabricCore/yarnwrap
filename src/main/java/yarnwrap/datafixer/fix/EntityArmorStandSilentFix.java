package yarnwrap.datafixer.fix;
public class EntityArmorStandSilentFix { public net.minecraft.datafixer.fix.EntityArmorStandSilentFix wrapperContained; public EntityArmorStandSilentFix(net.minecraft.datafixer.fix.EntityArmorStandSilentFix wrapperContained) { this.wrapperContained = wrapperContained; }

public EntityArmorStandSilentFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.EntityArmorStandSilentFix(outputSchema,changesType); }
public com.mojang.serialization.Dynamic fixSilent(com.mojang.serialization.Dynamic armorStandDynamic) { return wrapperContained.fixSilent(armorStandDynamic); }
// public static com.mojang.serialization.Dynamic fixSilent(com.mojang.serialization.Dynamic armorStandDynamic, ) { return net.minecraft.datafixer.fix.EntityArmorStandSilentFix.fixSilent(armorStandDynamic); }

}