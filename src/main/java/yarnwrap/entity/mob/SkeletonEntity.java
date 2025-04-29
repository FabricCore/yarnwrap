package yarnwrap.entity.mob;
public class SkeletonEntity { public net.minecraft.entity.mob.SkeletonEntity wrapperContained; public SkeletonEntity(net.minecraft.entity.mob.SkeletonEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.data.TrackedData CONVERTING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.CONVERTING); }
// public void CONVERTING(yarnwrap.entity.data.TrackedData value) { wrapperContained.CONVERTING = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData CONVERTING() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.mob.SkeletonEntity.CONVERTING); }
// public static void CONVERTING(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.mob.SkeletonEntity.CONVERTING = value.wrapperContained; }

// public int inPowderSnowTime() { return wrapperContained.inPowderSnowTime; }
// public void inPowderSnowTime(int value) { wrapperContained.inPowderSnowTime = value; }
// public static int inPowderSnowTime() { return net.minecraft.entity.mob.SkeletonEntity.inPowderSnowTime; }
// public static void inPowderSnowTime(int value, ) { net.minecraft.entity.mob.SkeletonEntity.inPowderSnowTime = value; }

// public int conversionTime() { return wrapperContained.conversionTime; }
// public void conversionTime(int value) { wrapperContained.conversionTime = value; }
// public static int conversionTime() { return net.minecraft.entity.mob.SkeletonEntity.conversionTime; }
// public static void conversionTime(int value, ) { net.minecraft.entity.mob.SkeletonEntity.conversionTime = value; }

// public java.lang.String STRAY_CONVERSION_TIME_KEY() { return wrapperContained.STRAY_CONVERSION_TIME_KEY; }
// public void STRAY_CONVERSION_TIME_KEY(java.lang.String value) { wrapperContained.STRAY_CONVERSION_TIME_KEY = value; }
public static java.lang.String STRAY_CONVERSION_TIME_KEY() { return net.minecraft.entity.mob.SkeletonEntity.STRAY_CONVERSION_TIME_KEY; }
// public static void STRAY_CONVERSION_TIME_KEY(java.lang.String value, ) { net.minecraft.entity.mob.SkeletonEntity.STRAY_CONVERSION_TIME_KEY = value; }

// public int TOTAL_CONVERSION_TIME() { return wrapperContained.TOTAL_CONVERSION_TIME; }
// public void TOTAL_CONVERSION_TIME(int value) { wrapperContained.TOTAL_CONVERSION_TIME = value; }
// public static int TOTAL_CONVERSION_TIME() { return net.minecraft.entity.mob.SkeletonEntity.TOTAL_CONVERSION_TIME; }
// public static void TOTAL_CONVERSION_TIME(int value, ) { net.minecraft.entity.mob.SkeletonEntity.TOTAL_CONVERSION_TIME = value; }

// public void setConversionTime(int time) { wrapperContained.setConversionTime(time); }
// public static void setConversionTime(int time, ) { net.minecraft.entity.mob.SkeletonEntity.setConversionTime(time); }
public boolean isConverting() { return wrapperContained.isConverting(); }
// public static boolean isConverting() { return net.minecraft.entity.mob.SkeletonEntity.isConverting(); }
// public void convertToStray() { wrapperContained.convertToStray(); }
// public static void convertToStray() { net.minecraft.entity.mob.SkeletonEntity.convertToStray(); }
public void setConverting(boolean converting) { wrapperContained.setConverting(converting); }
// public static void setConverting(boolean converting, ) { net.minecraft.entity.mob.SkeletonEntity.setConverting(converting); }

}