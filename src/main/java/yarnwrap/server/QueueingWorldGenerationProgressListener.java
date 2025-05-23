package yarnwrap.server;
public class QueueingWorldGenerationProgressListener { public net.minecraft.server.QueueingWorldGenerationProgressListener wrapperContained; public QueueingWorldGenerationProgressListener(net.minecraft.server.QueueingWorldGenerationProgressListener wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.WorldGenerationProgressListener progressListener() { return new yarnwrap.server.WorldGenerationProgressListener(wrapperContained.progressListener); }
// public void progressListener(yarnwrap.server.WorldGenerationProgressListener value) { wrapperContained.progressListener = value.wrapperContained; }
// public static yarnwrap.server.WorldGenerationProgressListener progressListener() { return new yarnwrap.server.WorldGenerationProgressListener(net.minecraft.server.QueueingWorldGenerationProgressListener.progressListener); }
// public static void progressListener(yarnwrap.server.WorldGenerationProgressListener value, ) { net.minecraft.server.QueueingWorldGenerationProgressListener.progressListener = value.wrapperContained; }

// public boolean running() { return wrapperContained.running; }
// public void running(boolean value) { wrapperContained.running = value; }
// public static boolean running() { return net.minecraft.server.QueueingWorldGenerationProgressListener.running; }
// public static void running(boolean value, ) { net.minecraft.server.QueueingWorldGenerationProgressListener.running = value; }

// public yarnwrap.util.thread.SimpleConsecutiveExecutor executor() { return new yarnwrap.util.thread.SimpleConsecutiveExecutor(wrapperContained.executor); }
// public void executor(yarnwrap.util.thread.SimpleConsecutiveExecutor value) { wrapperContained.executor = value.wrapperContained; }
// public static yarnwrap.util.thread.SimpleConsecutiveExecutor executor() { return new yarnwrap.util.thread.SimpleConsecutiveExecutor(net.minecraft.server.QueueingWorldGenerationProgressListener.executor); }
// public static void executor(yarnwrap.util.thread.SimpleConsecutiveExecutor value, ) { net.minecraft.server.QueueingWorldGenerationProgressListener.executor = value.wrapperContained; }

// public QueueingWorldGenerationProgressListener(yarnwrap.server.WorldGenerationProgressListener progressListener,java.util.concurrent.Executor executor) { this.wrapperContained = new net.minecraft.server.QueueingWorldGenerationProgressListener(progressListener.wrapperContained,executor); }
// public yarnwrap.server.QueueingWorldGenerationProgressListener create(yarnwrap.server.WorldGenerationProgressListener progressListener,java.util.concurrent.Executor executor) { return new yarnwrap.server.QueueingWorldGenerationProgressListener(wrapperContained.create(progressListener.wrapperContained,executor)); }
// public static yarnwrap.server.QueueingWorldGenerationProgressListener create(yarnwrap.server.WorldGenerationProgressListener progressListener,java.util.concurrent.Executor executor, ) { return new yarnwrap.server.QueueingWorldGenerationProgressListener(net.minecraft.server.QueueingWorldGenerationProgressListener.create(progressListener.wrapperContained,executor)); }

}