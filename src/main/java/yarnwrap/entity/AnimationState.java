package yarnwrap.entity;
public class AnimationState { public net.minecraft.entity.AnimationState wrapperContained; public AnimationState(net.minecraft.entity.AnimationState wrapperContained) { this.wrapperContained = wrapperContained; }

// public int STOPPED() { return wrapperContained.STOPPED; }
// public void STOPPED(int value) { wrapperContained.STOPPED = value; }
// public static int STOPPED() { return net.minecraft.entity.AnimationState.STOPPED; }
// public static void STOPPED(int value, ) { net.minecraft.entity.AnimationState.STOPPED = value; }

// public int startTick() { return wrapperContained.startTick; }
// public void startTick(int value) { wrapperContained.startTick = value; }
// public static int startTick() { return net.minecraft.entity.AnimationState.startTick; }
// public static void startTick(int value, ) { net.minecraft.entity.AnimationState.startTick = value; }

public void start(int tick) { wrapperContained.start(tick); }
// public static void start(int tick, ) { net.minecraft.entity.AnimationState.start(tick); }
public void run(java.util.function.Consumer consumer) { wrapperContained.run(consumer); }
// public static void run(java.util.function.Consumer consumer, ) { net.minecraft.entity.AnimationState.run(consumer); }
public void startIfNotRunning(int tick) { wrapperContained.startIfNotRunning(tick); }
// public static void startIfNotRunning(int tick, ) { net.minecraft.entity.AnimationState.startIfNotRunning(tick); }
public void stop() { wrapperContained.stop(); }
// public static void stop() { net.minecraft.entity.AnimationState.stop(); }
public boolean isRunning() { return wrapperContained.isRunning(); }
// public static boolean isRunning() { return net.minecraft.entity.AnimationState.isRunning(); }
public void setRunning(boolean running,int tick) { wrapperContained.setRunning(running,tick); }
// public static void setRunning(boolean running,int tick, ) { net.minecraft.entity.AnimationState.setRunning(running,tick); }
public void skip(int ticks,float speedMultiplier) { wrapperContained.skip(ticks,speedMultiplier); }
// public static void skip(int ticks,float speedMultiplier, ) { net.minecraft.entity.AnimationState.skip(ticks,speedMultiplier); }
public long getTimeInMilliseconds(float age) { return wrapperContained.getTimeInMilliseconds(age); }
// public static long getTimeInMilliseconds(float age, ) { return net.minecraft.entity.AnimationState.getTimeInMilliseconds(age); }
public void copyFrom(yarnwrap.entity.AnimationState state) { wrapperContained.copyFrom(state.wrapperContained); }
// public static void copyFrom(yarnwrap.entity.AnimationState state, ) { net.minecraft.entity.AnimationState.copyFrom(state.wrapperContained); }

}