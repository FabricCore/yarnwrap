package yarnwrap.server;
public class QueueingWorldGenerationProgressListener { public net.minecraft.server.QueueingWorldGenerationProgressListener wrapperContained; public QueueingWorldGenerationProgressListener(net.minecraft.server.QueueingWorldGenerationProgressListener wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.WorldGenerationProgressListener progressListener() { return new yarnwrap.server.WorldGenerationProgressListener(wrapperContained.progressListener); }
// public void progressListener(yarnwrap.server.WorldGenerationProgressListener value) { wrapperContained.progressListener = value.wrapperContained; }
// public yarnwrap.util.thread.TaskExecutor queue() { return new yarnwrap.util.thread.TaskExecutor(wrapperContained.queue); }
// public void queue(yarnwrap.util.thread.TaskExecutor value) { wrapperContained.queue = value.wrapperContained; }
// public boolean running() { return wrapperContained.running; }
// public void running(boolean value) { wrapperContained.running = value; }
// public QueueingWorldGenerationProgressListener(yarnwrap.server.WorldGenerationProgressListener progressListener,java.util.concurrent.Executor executor) { this.wrapperContained = new net.minecraft.server.QueueingWorldGenerationProgressListener(progressListener.wrapperContained,executor); }
public yarnwrap.server.QueueingWorldGenerationProgressListener create(yarnwrap.server.WorldGenerationProgressListener progressListener,java.util.concurrent.Executor executor) { return new yarnwrap.server.QueueingWorldGenerationProgressListener(wrapperContained.create(progressListener.wrapperContained,executor)); }

}