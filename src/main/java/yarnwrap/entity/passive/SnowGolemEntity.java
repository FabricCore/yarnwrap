package yarnwrap.entity.passive;
public class SnowGolemEntity { public net.minecraft.entity.passive.SnowGolemEntity wrapperContained; public SnowGolemEntity(net.minecraft.entity.passive.SnowGolemEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData SNOW_GOLEM_FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SNOW_GOLEM_FLAGS); }
// public void SNOW_GOLEM_FLAGS(yarnwrap.entity.data.TrackedData value) { wrapperContained.SNOW_GOLEM_FLAGS = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData SNOW_GOLEM_FLAGS() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.SnowGolemEntity.SNOW_GOLEM_FLAGS); }
// public static void SNOW_GOLEM_FLAGS(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.SnowGolemEntity.SNOW_GOLEM_FLAGS = value.wrapperContained; }

// public byte HAS_PUMPKIN_FLAG() { return wrapperContained.HAS_PUMPKIN_FLAG; }
// public void HAS_PUMPKIN_FLAG(byte value) { wrapperContained.HAS_PUMPKIN_FLAG = value; }
// public static byte HAS_PUMPKIN_FLAG() { return net.minecraft.entity.passive.SnowGolemEntity.HAS_PUMPKIN_FLAG; }
// public static void HAS_PUMPKIN_FLAG(byte value, ) { net.minecraft.entity.passive.SnowGolemEntity.HAS_PUMPKIN_FLAG = value; }

// public boolean DEFAULT_HAS_PUMPKIN() { return wrapperContained.DEFAULT_HAS_PUMPKIN; }
// public void DEFAULT_HAS_PUMPKIN(boolean value) { wrapperContained.DEFAULT_HAS_PUMPKIN = value; }
// public static boolean DEFAULT_HAS_PUMPKIN() { return net.minecraft.entity.passive.SnowGolemEntity.DEFAULT_HAS_PUMPKIN; }
// public static void DEFAULT_HAS_PUMPKIN(boolean value, ) { net.minecraft.entity.passive.SnowGolemEntity.DEFAULT_HAS_PUMPKIN = value; }

public void setHasPumpkin(boolean hasPumpkin) { wrapperContained.setHasPumpkin(hasPumpkin); }
// public static void setHasPumpkin(boolean hasPumpkin, ) { net.minecraft.entity.passive.SnowGolemEntity.setHasPumpkin(hasPumpkin); }
public boolean hasPumpkin() { return wrapperContained.hasPumpkin(); }
// public static boolean hasPumpkin() { return net.minecraft.entity.passive.SnowGolemEntity.hasPumpkin(); }
// public boolean method_18443(yarnwrap.entity.LivingEntity entity) { return wrapperContained.method_18443(entity.wrapperContained); }
// public static boolean method_18443(yarnwrap.entity.LivingEntity entity, ) { return net.minecraft.entity.passive.SnowGolemEntity.method_18443(entity.wrapperContained); }
// public Object createSnowGolemAttributes() { return wrapperContained.createSnowGolemAttributes(); }
public static Object createSnowGolemAttributes() { return net.minecraft.entity.passive.SnowGolemEntity.createSnowGolemAttributes(); }
// public void method_63010(double entity) { wrapperContained.method_63010(entity); }
// public static void method_63010(double entity, ) { net.minecraft.entity.passive.SnowGolemEntity.method_63010(entity); }

}