package yarnwrap.datafixer.fix;
public class EntityWolfColorFix { public net.minecraft.datafixer.fix.EntityWolfColorFix wrapperContained; public EntityWolfColorFix(net.minecraft.datafixer.fix.EntityWolfColorFix wrapperContained) { this.wrapperContained = wrapperContained; }

public EntityWolfColorFix(com.mojang.datafixers.schemas.Schema outputSchema,boolean changesType) { this.wrapperContained = new net.minecraft.datafixer.fix.EntityWolfColorFix(outputSchema,changesType); }
public com.mojang.serialization.Dynamic fixCollarColor(com.mojang.serialization.Dynamic wolfDynamic) { return wrapperContained.fixCollarColor(wolfDynamic); }
// public com.mojang.serialization.Dynamic method_4989(com.mojang.serialization.Dynamic colorDynamic) { return wrapperContained.method_4989(colorDynamic); }

}