package yarnwrap.entity;
public class SaddledComponent { public net.minecraft.entity.SaddledComponent wrapperContained; public SaddledComponent(net.minecraft.entity.SaddledComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean boosted() { return wrapperContained.boosted; }
// public void boosted(boolean value) { wrapperContained.boosted = value; }
// public static boolean boosted() { return net.minecraft.entity.SaddledComponent.boosted; }
// public static void boosted(boolean value, ) { net.minecraft.entity.SaddledComponent.boosted = value; }

// public int boostedTime() { return wrapperContained.boostedTime; }
// public void boostedTime(int value) { wrapperContained.boostedTime = value; }
// public static int boostedTime() { return net.minecraft.entity.SaddledComponent.boostedTime; }
// public static void boostedTime(int value, ) { net.minecraft.entity.SaddledComponent.boostedTime = value; }

// public yarnwrap.entity.data.DataTracker dataTracker() { return new yarnwrap.entity.data.DataTracker(wrapperContained.dataTracker); }
// public void dataTracker(yarnwrap.entity.data.DataTracker value) { wrapperContained.dataTracker = value.wrapperContained; }
// public static yarnwrap.entity.data.DataTracker dataTracker() { return new yarnwrap.entity.data.DataTracker(net.minecraft.entity.SaddledComponent.dataTracker); }
// public static void dataTracker(yarnwrap.entity.data.DataTracker value, ) { net.minecraft.entity.SaddledComponent.dataTracker = value.wrapperContained; }

// public yarnwrap.entity.data.TrackedData boostTime() { return new yarnwrap.entity.data.TrackedData(wrapperContained.boostTime); }
// public void boostTime(yarnwrap.entity.data.TrackedData value) { wrapperContained.boostTime = value.wrapperContained; }
// public static yarnwrap.entity.data.TrackedData boostTime() { return new yarnwrap.entity.data.TrackedData(net.minecraft.entity.SaddledComponent.boostTime); }
// public static void boostTime(yarnwrap.entity.data.TrackedData value, ) { net.minecraft.entity.SaddledComponent.boostTime = value.wrapperContained; }

// public int MIN_BOOST_TIME() { return wrapperContained.MIN_BOOST_TIME; }
// public void MIN_BOOST_TIME(int value) { wrapperContained.MIN_BOOST_TIME = value; }
// public static int MIN_BOOST_TIME() { return net.minecraft.entity.SaddledComponent.MIN_BOOST_TIME; }
// public static void MIN_BOOST_TIME(int value, ) { net.minecraft.entity.SaddledComponent.MIN_BOOST_TIME = value; }

public SaddledComponent(yarnwrap.entity.data.DataTracker dataTracker,yarnwrap.entity.data.TrackedData boostTime) { this.wrapperContained = new net.minecraft.entity.SaddledComponent(dataTracker.wrapperContained,boostTime.wrapperContained); }
public void boost() { wrapperContained.boost(); }
// public static void boost() { net.minecraft.entity.SaddledComponent.boost(); }
public boolean boost(yarnwrap.util.math.random.Random random) { return wrapperContained.boost(random.wrapperContained); }
// public static boolean boost(yarnwrap.util.math.random.Random random, ) { return net.minecraft.entity.SaddledComponent.boost(random.wrapperContained); }
public void tickBoost() { wrapperContained.tickBoost(); }
// public static void tickBoost() { net.minecraft.entity.SaddledComponent.tickBoost(); }
public float getMovementSpeedMultiplier() { return wrapperContained.getMovementSpeedMultiplier(); }
// public static float getMovementSpeedMultiplier() { return net.minecraft.entity.SaddledComponent.getMovementSpeedMultiplier(); }
// public int getBoostTime() { return wrapperContained.getBoostTime(); }
// public static int getBoostTime() { return net.minecraft.entity.SaddledComponent.getBoostTime(); }

}