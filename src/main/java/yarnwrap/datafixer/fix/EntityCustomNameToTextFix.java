package yarnwrap.datafixer.fix;
public class EntityCustomNameToTextFix { public net.minecraft.datafixer.fix.EntityCustomNameToTextFix wrapperContained; public EntityCustomNameToTextFix(net.minecraft.datafixer.fix.EntityCustomNameToTextFix wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Dynamic fixCustomName(com.mojang.serialization.Dynamic entityDynamic) { return wrapperContained.fixCustomName(entityDynamic); }

}