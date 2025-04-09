package yarnwrap.entity.mob;
public class SkeletonEntity { public net.minecraft.entity.mob.SkeletonEntity wrapperContained; public SkeletonEntity(net.minecraft.entity.mob.SkeletonEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData CONVERTING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CONVERTING); }
// public int inPowderSnowTime() { return wrapperContained.inPowderSnowTime; }
// public int conversionTime() { return wrapperContained.conversionTime; }
public java.lang.String STRAY_CONVERSION_TIME_KEY() { return wrapperContained.STRAY_CONVERSION_TIME_KEY; }
// public int TOTAL_CONVERSION_TIME() { return wrapperContained.TOTAL_CONVERSION_TIME; }
// public void setConversionTime(int time) { wrapperContained.setConversionTime(time); }
public boolean isConverting() { return wrapperContained.isConverting(); }
// public void convertToStray() { wrapperContained.convertToStray(); }
public void setConverting(boolean converting) { wrapperContained.setConverting(converting); }

}