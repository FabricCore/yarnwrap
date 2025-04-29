package yarnwrap.entity.passive;
public class SnowGolemEntity { public net.minecraft.entity.passive.SnowGolemEntity wrapperContained; public SnowGolemEntity(net.minecraft.entity.passive.SnowGolemEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public byte HAS_PUMPKIN_FLAG() { return wrapperContained.HAS_PUMPKIN_FLAG; }
// public void HAS_PUMPKIN_FLAG(byte value) { wrapperContained.HAS_PUMPKIN_FLAG = value; }
// public static byte HAS_PUMPKIN_FLAG() { return net.minecraft.entity.passive.SnowGolemEntity.HAS_PUMPKIN_FLAG; }
// public static void HAS_PUMPKIN_FLAG(byte value, ) { net.minecraft.entity.passive.SnowGolemEntity.HAS_PUMPKIN_FLAG = value; }

// public yarnwrap.entity.data.TrackedData SNOW_GOLEM_FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.SNOW_GOLEM_FLAGS); }
// public void SNOW_GOLEM_FLAGS(yarnwrap.entity.data.TrackedData value) { wrapperContained.SNOW_GOLEM_FLAGS = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData SNOW_GOLEM_FLAGS() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.SnowGolemEntity.SNOW_GOLEM_FLAGS); }
// public static void SNOW_GOLEM_FLAGS(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.SnowGolemEntity.SNOW_GOLEM_FLAGS = value.wrapperContained; }

// public boolean method_18443(yarnwrap.entity.LivingEntity entity) { return wrapperContained.method_18443(entity.wrapperContained); }
// public static boolean method_18443(yarnwrap.entity.LivingEntity entity, ) { return net.minecraft.entity.passive.SnowGolemEntity.method_18443(entity.wrapperContained); }
// public Object createSnowGolemAttributes() { return wrapperContained.createSnowGolemAttributes(); }
public static Object createSnowGolemAttributes() { return net.minecraft.entity.passive.SnowGolemEntity.createSnowGolemAttributes(); }
public void setHasPumpkin(boolean hasPumpkin) { wrapperContained.setHasPumpkin(hasPumpkin); }
// public static void setHasPumpkin(boolean hasPumpkin, ) { net.minecraft.entity.passive.SnowGolemEntity.setHasPumpkin(hasPumpkin); }
public boolean hasPumpkin() { return wrapperContained.hasPumpkin(); }
// public static boolean hasPumpkin() { return net.minecraft.entity.passive.SnowGolemEntity.hasPumpkin(); }

}