package yarnwrap.server;
public class QueueingWorldGenerationProgressListener { public net.minecraft.server.QueueingWorldGenerationProgressListener wrapperContained; public QueueingWorldGenerationProgressListener(net.minecraft.server.QueueingWorldGenerationProgressListener wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.server.WorldGenerationProgressListener progressListener() { return new yarnwrap.server.WorldGenerationProgressListener(wrapperContained.progressListener); }
// public yarnwrap.util.thread.TaskExecutor queue() { return new yarnwrap.util.thread.TaskExecutor(wrapperContained.queue); }
// public boolean running() { return wrapperContained.running; }
public yarnwrap.server.QueueingWorldGenerationProgressListener create(yarnwrap.server.WorldGenerationProgressListener progressListener,java.util.concurrent.Executor executor) { return new yarnwrap.server.QueueingWorldGenerationProgressListener(wrapperContained.create(progressListener.wrapperContained,executor)); }

}