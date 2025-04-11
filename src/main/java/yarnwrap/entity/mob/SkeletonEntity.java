package yarnwrap.entity.mob;
public class SkeletonEntity { public net.minecraft.entity.mob.SkeletonEntity wrapperContained; public SkeletonEntity(net.minecraft.entity.mob.SkeletonEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData CONVERTING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CONVERTING); }
// public void CONVERTING(yarnwrap.entity.data.TrackedData value) { wrapperContained.CONVERTING = value.wrapperContained; }
// public int inPowderSnowTime() { return wrapperContained.inPowderSnowTime; }
// public void inPowderSnowTime(int value) { wrapperContained.inPowderSnowTime = value; }
// public int conversionTime() { return wrapperContained.conversionTime; }
// public void conversionTime(int value) { wrapperContained.conversionTime = value; }
public java.lang.String STRAY_CONVERSION_TIME_KEY() { return wrapperContained.STRAY_CONVERSION_TIME_KEY; }
// public void STRAY_CONVERSION_TIME_KEY(java.lang.String value) { wrapperContained.STRAY_CONVERSION_TIME_KEY = value; }
// public int TOTAL_CONVERSION_TIME() { return wrapperContained.TOTAL_CONVERSION_TIME; }
// public void TOTAL_CONVERSION_TIME(int value) { wrapperContained.TOTAL_CONVERSION_TIME = value; }
// public void setConversionTime(int time) { wrapperContained.setConversionTime(time); }
public boolean isConverting() { return wrapperContained.isConverting(); }
// public void convertToStray() { wrapperContained.convertToStray(); }
public void setConverting(boolean converting) { wrapperContained.setConverting(converting); }

}