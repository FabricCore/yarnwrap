package yarnwrap.entity.conversion;
public class EntityConversionType { public net.minecraft.entity.conversion.EntityConversionType wrapperContained; public EntityConversionType(net.minecraft.entity.conversion.EntityConversionType wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean discardOldEntity() { return wrapperContained.discardOldEntity; }
// public void discardOldEntity(boolean value) { wrapperContained.discardOldEntity = value; }
// public static boolean discardOldEntity() { return net.minecraft.entity.conversion.EntityConversionType.discardOldEntity; }
// public static void discardOldEntity(boolean value, ) { net.minecraft.entity.conversion.EntityConversionType.discardOldEntity = value; }

// public java.util.Set CUSTOM_COMPONENTS() { return wrapperContained.CUSTOM_COMPONENTS; }
// public void CUSTOM_COMPONENTS(java.util.Set value) { wrapperContained.CUSTOM_COMPONENTS = value; }
// public static java.util.Set CUSTOM_COMPONENTS() { return net.minecraft.entity.conversion.EntityConversionType.CUSTOM_COMPONENTS; }
// public static void CUSTOM_COMPONENTS(java.util.Set value, ) { net.minecraft.entity.conversion.EntityConversionType.CUSTOM_COMPONENTS = value; }

// public EntityConversionType(java.lang.String discardOldEntity) { this.wrapperContained = new net.minecraft.entity.conversion.EntityConversionType(discardOldEntity); }
public boolean shouldDiscardOldEntity() { return wrapperContained.shouldDiscardOldEntity(); }
// public static boolean shouldDiscardOldEntity() { return net.minecraft.entity.conversion.EntityConversionType.shouldDiscardOldEntity(); }
// public void setUpNewEntity(yarnwrap.entity.mob.MobEntity oldEntity,yarnwrap.entity.mob.MobEntity newEntity,yarnwrap.entity.conversion.EntityConversionContext context) { wrapperContained.setUpNewEntity(oldEntity.wrapperContained,newEntity.wrapperContained,context.wrapperContained); }
// public static void setUpNewEntity(yarnwrap.entity.mob.MobEntity oldEntity,yarnwrap.entity.mob.MobEntity newEntity,yarnwrap.entity.conversion.EntityConversionContext context, ) { net.minecraft.entity.conversion.EntityConversionType.setUpNewEntity(oldEntity.wrapperContained,newEntity.wrapperContained,context.wrapperContained); }
// public void copyData(yarnwrap.entity.mob.MobEntity oldEntity,yarnwrap.entity.mob.MobEntity newEntity,yarnwrap.entity.conversion.EntityConversionContext context) { wrapperContained.copyData(oldEntity.wrapperContained,newEntity.wrapperContained,context.wrapperContained); }
// public static void copyData(yarnwrap.entity.mob.MobEntity oldEntity,yarnwrap.entity.mob.MobEntity newEntity,yarnwrap.entity.conversion.EntityConversionContext context, ) { net.minecraft.entity.conversion.EntityConversionType.copyData(oldEntity.wrapperContained,newEntity.wrapperContained,context.wrapperContained); }
// public void copyComponent(yarnwrap.entity.mob.MobEntity oldEntity,yarnwrap.entity.mob.MobEntity newEntity,yarnwrap.component.ComponentType type) { wrapperContained.copyComponent(oldEntity.wrapperContained,newEntity.wrapperContained,type.wrapperContained); }
// public static void copyComponent(yarnwrap.entity.mob.MobEntity oldEntity,yarnwrap.entity.mob.MobEntity newEntity,yarnwrap.component.ComponentType type, ) { net.minecraft.entity.conversion.EntityConversionType.copyComponent(oldEntity.wrapperContained,newEntity.wrapperContained,type.wrapperContained); }

}