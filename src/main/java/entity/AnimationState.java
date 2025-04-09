package yarnwrap.entity;
public class AnimationState { public net.minecraft.entity.AnimationState wrapperContained; public AnimationState(net.minecraft.entity.AnimationState wrapperContained) { this.wrapperContained = wrapperContained; }

// public long STOPPED() { return wrapperContained.STOPPED; }
// public long updatedAt() { return wrapperContained.updatedAt; }
// public long timeRunning() { return wrapperContained.timeRunning; }
public void start(int age) { wrapperContained.start(age); }
public void run(java.util.function.Consumer consumer) { wrapperContained.run(consumer); }
public void startIfNotRunning(int age) { wrapperContained.startIfNotRunning(age); }
public void stop() { wrapperContained.stop(); }
public boolean isRunning() { return wrapperContained.isRunning(); }
public void update(float animationProgress,float speedMultiplier) { wrapperContained.update(animationProgress,speedMultiplier); }
public long getTimeRunning() { return wrapperContained.getTimeRunning(); }
public void setRunning(boolean running,int age) { wrapperContained.setRunning(running,age); }
public void skip(int seconds,float speedMultiplier) { wrapperContained.skip(seconds,speedMultiplier); }

}