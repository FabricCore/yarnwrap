package yarnwrap.client.sound;
public class SoundExecutor { public net.minecraft.client.sound.SoundExecutor wrapperContained; public SoundExecutor(net.minecraft.client.sound.SoundExecutor wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Thread thread() { return wrapperContained.thread; }
// public boolean stopped() { return wrapperContained.stopped; }
public void restart() { wrapperContained.restart(); }
// public java.lang.Thread createThread() { return wrapperContained.createThread(); }
// public void waitForStop() { wrapperContained.waitForStop(); }

}