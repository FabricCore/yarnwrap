package yarnwrap.client.sound;
public class SoundExecutor { public net.minecraft.client.sound.SoundExecutor wrapperContained; public SoundExecutor(net.minecraft.client.sound.SoundExecutor wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.Thread thread() { return wrapperContained.thread; }
// public void thread(java.lang.Thread value) { wrapperContained.thread = value; }
// public static java.lang.Thread thread() { return net.minecraft.client.sound.SoundExecutor.thread; }
// public static void thread(java.lang.Thread value, ) { net.minecraft.client.sound.SoundExecutor.thread = value; }

// public boolean stopped() { return wrapperContained.stopped; }
// public void stopped(boolean value) { wrapperContained.stopped = value; }
// public static boolean stopped() { return net.minecraft.client.sound.SoundExecutor.stopped; }
// public static void stopped(boolean value, ) { net.minecraft.client.sound.SoundExecutor.stopped = value; }

public void restart() { wrapperContained.restart(); }
// public static void restart() { net.minecraft.client.sound.SoundExecutor.restart(); }
// public java.lang.Thread createThread() { return wrapperContained.createThread(); }
// public static java.lang.Thread createThread() { return net.minecraft.client.sound.SoundExecutor.createThread(); }
// public void waitForStop() { wrapperContained.waitForStop(); }
// public static void waitForStop() { net.minecraft.client.sound.SoundExecutor.waitForStop(); }

}