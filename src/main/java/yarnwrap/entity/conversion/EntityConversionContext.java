package yarnwrap.entity.conversion;
public class EntityConversionContext { public net.minecraft.entity.conversion.EntityConversionContext wrapperContained; public EntityConversionContext(net.minecraft.entity.conversion.EntityConversionContext wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.conversion.EntityConversionContext create(yarnwrap.entity.mob.MobEntity entity,boolean keepEquipment,boolean preserveCanPickUpLoot) { return new yarnwrap.entity.conversion.EntityConversionContext(wrapperContained.create(entity.wrapperContained,keepEquipment,preserveCanPickUpLoot)); }
// public static yarnwrap.entity.conversion.EntityConversionContext create(yarnwrap.entity.mob.MobEntity entity,boolean keepEquipment,boolean preserveCanPickUpLoot, ) { return new yarnwrap.entity.conversion.EntityConversionContext(net.minecraft.entity.conversion.EntityConversionContext.create(entity.wrapperContained,keepEquipment,preserveCanPickUpLoot)); }

}