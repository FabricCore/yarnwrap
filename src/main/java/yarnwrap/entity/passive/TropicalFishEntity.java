package yarnwrap.entity.passive;
public class TropicalFishEntity { public net.minecraft.entity.passive.TropicalFishEntity wrapperContained; public TropicalFishEntity(net.minecraft.entity.passive.TropicalFishEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VARIANT); }
// public void VARIANT(yarnwrap.entity.data.TrackedData value) { wrapperContained.VARIANT = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.passive.TropicalFishEntity.VARIANT); }
// public static void VARIANT(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.passive.TropicalFishEntity.VARIANT = value.wrapperContained; }

// public boolean commonSpawn() { return wrapperContained.commonSpawn; }
// public void commonSpawn(boolean value) { wrapperContained.commonSpawn = value; }
// public static boolean commonSpawn() { return net.minecraft.entity.passive.TropicalFishEntity.commonSpawn; }
// public static void commonSpawn(boolean value, ) { net.minecraft.entity.passive.TropicalFishEntity.commonSpawn = value; }

// public java.util.List COMMON_VARIANTS() { return wrapperContained.COMMON_VARIANTS; }
// public void COMMON_VARIANTS(java.util.List value) { wrapperContained.COMMON_VARIANTS = value; }
public static java.util.List COMMON_VARIANTS() { return net.minecraft.entity.passive.TropicalFishEntity.COMMON_VARIANTS; }
// public static void COMMON_VARIANTS(java.util.List value, ) { net.minecraft.entity.passive.TropicalFishEntity.COMMON_VARIANTS = value; }

// public Object DEFAULT_VARIANT() { return wrapperContained.DEFAULT_VARIANT; }
// // public void DEFAULT_VARIANT(Object value) { wrapperContained.DEFAULT_VARIANT = value; }
// public static Object DEFAULT_VARIANT() { return net.minecraft.entity.passive.TropicalFishEntity.DEFAULT_VARIANT; }
// // public static void DEFAULT_VARIANT(Object value, ) { net.minecraft.entity.passive.TropicalFishEntity.DEFAULT_VARIANT = value; }

// public java.lang.String getToolTipForVariant(int variant) { return wrapperContained.getToolTipForVariant(variant); }
// public static java.lang.String getToolTipForVariant(int variant, ) { return net.minecraft.entity.passive.TropicalFishEntity.getToolTipForVariant(variant); }
// public yarnwrap.util.DyeColor getPatternColor(int variant) { return new yarnwrap.util.DyeColor(wrapperContained.getPatternColor(variant)); }
// public static yarnwrap.util.DyeColor getPatternColor(int variant, ) { return new yarnwrap.util.DyeColor(net.minecraft.entity.passive.TropicalFishEntity.getPatternColor(variant)); }
// public yarnwrap.util.DyeColor getBaseColor(int variant) { return new yarnwrap.util.DyeColor(wrapperContained.getBaseColor(variant)); }
// public static yarnwrap.util.DyeColor getBaseColor(int variant, ) { return new yarnwrap.util.DyeColor(net.minecraft.entity.passive.TropicalFishEntity.getBaseColor(variant)); }
public yarnwrap.util.DyeColor getPatternColor() { return new yarnwrap.util.DyeColor(wrapperContained.getPatternColor()); }
// public static yarnwrap.util.DyeColor getPatternColor() { return new yarnwrap.util.DyeColor(net.minecraft.entity.passive.TropicalFishEntity.getPatternColor()); }
public yarnwrap.util.DyeColor getBaseColor() { return new yarnwrap.util.DyeColor(wrapperContained.getBaseColor()); }
// public static yarnwrap.util.DyeColor getBaseColor() { return new yarnwrap.util.DyeColor(net.minecraft.entity.passive.TropicalFishEntity.getBaseColor()); }
// public boolean canTropicalFishSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason reason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canTropicalFishSpawn(type.wrapperContained,world.wrapperContained,reason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static boolean canTropicalFishSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason reason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return net.minecraft.entity.passive.TropicalFishEntity.canTropicalFishSpawn(type.wrapperContained,world.wrapperContained,reason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public void setVariety(Object variety) { wrapperContained.setVariety(variety); }
// public static void setVariety(Object variety, ) { net.minecraft.entity.passive.TropicalFishEntity.setVariety(variety); }
// public int getVariantId(Object variety,yarnwrap.util.DyeColor baseColor,yarnwrap.util.DyeColor patternColor) { return wrapperContained.getVariantId(variety,baseColor.wrapperContained,patternColor.wrapperContained); }
// public static int getVariantId(Object variety,yarnwrap.util.DyeColor baseColor,yarnwrap.util.DyeColor patternColor, ) { return net.minecraft.entity.passive.TropicalFishEntity.getVariantId(variety,baseColor.wrapperContained,patternColor.wrapperContained); }
// public int getTropicalFishVariant() { return wrapperContained.getTropicalFishVariant(); }
// public static int getTropicalFishVariant() { return net.minecraft.entity.passive.TropicalFishEntity.getTropicalFishVariant(); }
// public Object getVariety(int variant) { return wrapperContained.getVariety(variant); }
// public static Object getVariety(int variant, ) { return net.minecraft.entity.passive.TropicalFishEntity.getVariety(variant); }
// public void setTropicalFishVariant(int variant) { wrapperContained.setTropicalFishVariant(variant); }
// public static void setTropicalFishVariant(int variant, ) { net.minecraft.entity.passive.TropicalFishEntity.setTropicalFishVariant(variant); }
// public void setBaseColor(yarnwrap.util.DyeColor baseColor) { wrapperContained.setBaseColor(baseColor.wrapperContained); }
// public static void setBaseColor(yarnwrap.util.DyeColor baseColor, ) { net.minecraft.entity.passive.TropicalFishEntity.setBaseColor(baseColor.wrapperContained); }
// public void setPatternColor(yarnwrap.util.DyeColor patternColor) { wrapperContained.setPatternColor(patternColor.wrapperContained); }
// public static void setPatternColor(yarnwrap.util.DyeColor patternColor, ) { net.minecraft.entity.passive.TropicalFishEntity.setPatternColor(patternColor.wrapperContained); }
public Object getVariety() { return wrapperContained.getVariety(); }
// public static Object getVariety() { return net.minecraft.entity.passive.TropicalFishEntity.getVariety(); }

}