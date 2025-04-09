package yarnwrap.datafixer.fix;
public class EntityWolfColorFix { public net.minecraft.datafixer.fix.EntityWolfColorFix wrapperContained; public EntityWolfColorFix(net.minecraft.datafixer.fix.EntityWolfColorFix wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Dynamic fixCollarColor(com.mojang.serialization.Dynamic wolfDynamic) { return wrapperContained.fixCollarColor(wolfDynamic); }

}