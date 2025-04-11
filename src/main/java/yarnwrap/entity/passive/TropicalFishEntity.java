package yarnwrap.entity.passive;
public class TropicalFishEntity { public net.minecraft.entity.passive.TropicalFishEntity wrapperContained; public TropicalFishEntity(net.minecraft.entity.passive.TropicalFishEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String BUCKET_VARIANT_TAG_KEY() { return wrapperContained.BUCKET_VARIANT_TAG_KEY; }
// public void BUCKET_VARIANT_TAG_KEY(java.lang.String value) { wrapperContained.BUCKET_VARIANT_TAG_KEY = value; }
public java.util.List COMMON_VARIANTS() { return wrapperContained.COMMON_VARIANTS; }
// public void COMMON_VARIANTS(java.util.List value) { wrapperContained.COMMON_VARIANTS = value; }
// public yarnwrap.entity.data.TrackedData VARIANT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.VARIANT); }
// public void VARIANT(yarnwrap.entity.data.TrackedData value) { wrapperContained.VARIANT = value.wrapperContained; }
// public boolean commonSpawn() { return wrapperContained.commonSpawn; }
// public void commonSpawn(boolean value) { wrapperContained.commonSpawn = value; }
public boolean canTropicalFishSpawn(yarnwrap.entity.EntityType type,yarnwrap.world.WorldAccess world,yarnwrap.entity.SpawnReason reason,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.canTropicalFishSpawn(type.wrapperContained,world.wrapperContained,reason.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public int getVariantId(Object variety,yarnwrap.util.DyeColor baseColor,yarnwrap.util.DyeColor patternColor) { return wrapperContained.getVariantId(variety,baseColor.wrapperContained,patternColor.wrapperContained); }
// public int getTropicalFishVariant() { return wrapperContained.getTropicalFishVariant(); }
public Object getVariety(int variant) { return wrapperContained.getVariety(variant); }
// public void setTropicalFishVariant(int variant) { wrapperContained.setTropicalFishVariant(variant); }
public java.lang.String getToolTipForVariant(int variant) { return wrapperContained.getToolTipForVariant(variant); }
public yarnwrap.util.DyeColor getPatternDyeColor(int variant) { return new yarnwrap.util.DyeColor(wrapperContained.getPatternDyeColor(variant)); }
public yarnwrap.util.DyeColor getBaseDyeColor(int variant) { return new yarnwrap.util.DyeColor(wrapperContained.getBaseDyeColor(variant)); }
public yarnwrap.util.DyeColor getPatternColorComponents() { return new yarnwrap.util.DyeColor(wrapperContained.getPatternColorComponents()); }
public yarnwrap.util.DyeColor getBaseColorComponents() { return new yarnwrap.util.DyeColor(wrapperContained.getBaseColorComponents()); }

}