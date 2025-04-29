package yarnwrap.entity.passive;
public class HorseEntity { public net.minecraft.entity.passive.HorseEntity wrapperContained; public HorseEntity(net.minecraft.entity.passive.HorseEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.BABY_BASE_DIMENSIONS); }
// public void BABY_BASE_DIMENSIONS(yarnwrap.entity.EntityDimensions value) { wrapperContained.BABY_BASE_DIMENSIONS = value.wrapperContained; }
// public static yarnwrap.entity.EntityDimensions BABY_BASE_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(net.minecraft.entity.passive.HorseEntity.BABY_BASE_DIMENSIONS); }
// public static void BABY_BASE_DIMENSIONS(yarnwrap.entity.EntityDimensions value, ) { net.minecraft.entity.passive.HorseEntity.BABY_BASE_DIMENSIONS = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VARIANT); }
// public void VARIANT(yarnwrap.entity.data.TrackedData value) { wrapperContained.VARIANT = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.HorseEntity.VARIANT); }
// public static void VARIANT(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.HorseEntity.VARIANT = value.wrapperContained; }

// public void setHorseVariant(yarnwrap.entity.passive.HorseColor color,yarnwrap.entity.passive.HorseMarking marking) { wrapperContained.setHorseVariant(color.wrapperContained,marking.wrapperContained); }
// public static void setHorseVariant(yarnwrap.entity.passive.HorseColor color,yarnwrap.entity.passive.HorseMarking marking, ) { net.minecraft.entity.passive.HorseEntity.setHorseVariant(color.wrapperContained,marking.wrapperContained); }
public yarnwrap.entity.passive.HorseMarking getMarking() { return new yarnwrap.entity.passive.HorseMarking(wrapperContained.getMarking()); }
// public static yarnwrap.entity.passive.HorseMarking getMarking() { return new yarnwrap.entity.passive.HorseMarking(net.minecraft.entity.passive.HorseEntity.getMarking()); }
// public void setHorseVariant(int variant) { wrapperContained.setHorseVariant(variant); }
// public static void setHorseVariant(int variant, ) { net.minecraft.entity.passive.HorseEntity.setHorseVariant(variant); }
// public int getHorseVariant() { return wrapperContained.getHorseVariant(); }
// public static int getHorseVariant() { return net.minecraft.entity.passive.HorseEntity.getHorseVariant(); }

}