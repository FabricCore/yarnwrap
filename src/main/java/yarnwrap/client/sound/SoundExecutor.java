package yarnwrap.client.sound;
public class SoundExecutor { public net.minecraft.client.sound.SoundExecutor wrapperContained; public SoundExecutor(net.minecraft.client.sound.SoundExecutor wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Thread thread() { return wrapperContained.thread; }
// public void thread(java.lang.Thread value) { wrapperContained.thread = value; }
// public boolean stopped() { return wrapperContained.stopped; }
// public void stopped(boolean value) { wrapperContained.stopped = value; }
public void restart() { wrapperContained.restart(); }
// public java.lang.Thread createThread() { return wrapperContained.createThread(); }
// public void waitForStop() { wrapperContained.waitForStop(); }

}