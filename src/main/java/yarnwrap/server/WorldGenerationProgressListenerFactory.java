package yarnwrap.server;
public class WorldGenerationProgressListenerFactory { public net.minecraft.server.WorldGenerationProgressListenerFactory wrapperContained; public WorldGenerationProgressListenerFactory(net.minecraft.server.WorldGenerationProgressListenerFactory wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.server.WorldGenerationProgressListener create(int radius) { return new yarnwrap.server.WorldGenerationProgressListener(wrapperContained.create(radius)); }
// public static yarnwrap.server.WorldGenerationProgressListener create(int radius, ) { return new yarnwrap.server.WorldGenerationProgressListener(net.minecraft.server.WorldGenerationProgressListenerFactory.create(radius)); }

}