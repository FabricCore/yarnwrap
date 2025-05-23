package yarnwrap.datafixer.fix;
public class EntityArmorStandSilentFix { public net.minecraft.datafixer.fix.EntityArmorStandSilentFix wrapperContained; public EntityArmorStandSilentFix(net.minecraft.datafixer.fix.EntityArmorStandSilentFix wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Dynamic fixSilent(com.mojang.serialization.Dynamic armorStandDynamic) { return wrapperContained.fixSilent(armorStandDynamic); }
// public static com.mojang.serialization.Dynamic fixSilent(com.mojang.serialization.Dynamic armorStandDynamic, ) { return net.minecraft.datafixer.fix.EntityArmorStandSilentFix.fixSilent(armorStandDynamic); }

}