package yarnwrap.entity;
public class AnimationState { public net.minecraft.entity.AnimationState wrapperContained; public AnimationState(net.minecraft.entity.AnimationState wrapperContained) { this.wrapperContained = wrapperContained; }

// public long STOPPED() { return wrapperContained.STOPPED; }
// public void STOPPED(long value) { wrapperContained.STOPPED = value; }
// public static long STOPPED() { return net.minecraft.entity.AnimationState.STOPPED; }
// public static void STOPPED(long value, ) { net.minecraft.entity.AnimationState.STOPPED = value; }

// public long updatedAt() { return wrapperContained.updatedAt; }
// public void updatedAt(long value) { wrapperContained.updatedAt = value; }
// public static long updatedAt() { return net.minecraft.entity.AnimationState.updatedAt; }
// public static void updatedAt(long value, ) { net.minecraft.entity.AnimationState.updatedAt = value; }

// public long timeRunning() { return wrapperContained.timeRunning; }
// public void timeRunning(long value) { wrapperContained.timeRunning = value; }
// public static long timeRunning() { return net.minecraft.entity.AnimationState.timeRunning; }
// public static void timeRunning(long value, ) { net.minecraft.entity.AnimationState.timeRunning = value; }

public void start(int age) { wrapperContained.start(age); }
// public static void start(int age, ) { net.minecraft.entity.AnimationState.start(age); }
public void run(java.util.function.Consumer consumer) { wrapperContained.run(consumer); }
// public static void run(java.util.function.Consumer consumer, ) { net.minecraft.entity.AnimationState.run(consumer); }
public void startIfNotRunning(int age) { wrapperContained.startIfNotRunning(age); }
// public static void startIfNotRunning(int age, ) { net.minecraft.entity.AnimationState.startIfNotRunning(age); }
public void stop() { wrapperContained.stop(); }
// public static void stop() { net.minecraft.entity.AnimationState.stop(); }
public boolean isRunning() { return wrapperContained.isRunning(); }
// public static boolean isRunning() { return net.minecraft.entity.AnimationState.isRunning(); }
public void update(float animationProgress,float speedMultiplier) { wrapperContained.update(animationProgress,speedMultiplier); }
// public static void update(float animationProgress,float speedMultiplier, ) { net.minecraft.entity.AnimationState.update(animationProgress,speedMultiplier); }
public long getTimeRunning() { return wrapperContained.getTimeRunning(); }
// public static long getTimeRunning() { return net.minecraft.entity.AnimationState.getTimeRunning(); }
public void setRunning(boolean running,int age) { wrapperContained.setRunning(running,age); }
// public static void setRunning(boolean running,int age, ) { net.minecraft.entity.AnimationState.setRunning(running,age); }
public void skip(int seconds,float speedMultiplier) { wrapperContained.skip(seconds,speedMultiplier); }
// public static void skip(int seconds,float speedMultiplier, ) { net.minecraft.entity.AnimationState.skip(seconds,speedMultiplier); }

}