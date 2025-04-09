package yarnwrap.client.sound;
public class SoundLoader { public net.minecraft.client.sound.SoundLoader wrapperContained; public SoundLoader(net.minecraft.client.sound.SoundLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.resource.ResourceFactory resourceFactory() { return new yarnwrap.resource.ResourceFactory(wrapperContained.resourceFactory); }
// public java.util.Map loadedSounds() { return wrapperContained.loadedSounds; }
public void close() { wrapperContained.close(); }
public java.util.concurrent.CompletableFuture loadStatic(java.util.Collection sounds) { return wrapperContained.loadStatic(sounds); }
public java.util.concurrent.CompletableFuture loadStatic(yarnwrap.util.Identifier id) { return wrapperContained.loadStatic(id.wrapperContained); }
public java.util.concurrent.CompletableFuture loadStreamed(yarnwrap.util.Identifier id,boolean repeatInstantly) { return wrapperContained.loadStreamed(id.wrapperContained,repeatInstantly); }

}