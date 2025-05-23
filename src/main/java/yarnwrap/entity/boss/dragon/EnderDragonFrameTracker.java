package yarnwrap.entity.boss.dragon;
public class EnderDragonFrameTracker { public net.minecraft.entity.boss.dragon.EnderDragonFrameTracker wrapperContained; public EnderDragonFrameTracker(net.minecraft.entity.boss.dragon.EnderDragonFrameTracker wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object frames() { return wrapperContained.frames; }
// // public void frames(Object value) { wrapperContained.frames = value; }
// // public static Object frames() { return net.minecraft.entity.boss.dragon.EnderDragonFrameTracker.frames; }
// // public static void frames(Object value, ) { net.minecraft.entity.boss.dragon.EnderDragonFrameTracker.frames = value; }

// public int currentIndex() { return wrapperContained.currentIndex; }
// public void currentIndex(int value) { wrapperContained.currentIndex = value; }
// public static int currentIndex() { return net.minecraft.entity.boss.dragon.EnderDragonFrameTracker.currentIndex; }
// public static void currentIndex(int value, ) { net.minecraft.entity.boss.dragon.EnderDragonFrameTracker.currentIndex = value; }

public void tick(double y,float yaw) { wrapperContained.tick(y,yaw); }
// public static void tick(double y,float yaw, ) { net.minecraft.entity.boss.dragon.EnderDragonFrameTracker.tick(y,yaw); }
public Object getFrame(int age) { return wrapperContained.getFrame(age); }
// public static Object getFrame(int age, ) { return net.minecraft.entity.boss.dragon.EnderDragonFrameTracker.getFrame(age); }
public Object getLerpedFrame(int age,float tickProgress) { return wrapperContained.getLerpedFrame(age,tickProgress); }
// public static Object getLerpedFrame(int age,float tickProgress, ) { return net.minecraft.entity.boss.dragon.EnderDragonFrameTracker.getLerpedFrame(age,tickProgress); }
public void copyFrom(yarnwrap.entity.boss.dragon.EnderDragonFrameTracker other) { wrapperContained.copyFrom(other.wrapperContained); }
// public static void copyFrom(yarnwrap.entity.boss.dragon.EnderDragonFrameTracker other, ) { net.minecraft.entity.boss.dragon.EnderDragonFrameTracker.copyFrom(other.wrapperContained); }

}