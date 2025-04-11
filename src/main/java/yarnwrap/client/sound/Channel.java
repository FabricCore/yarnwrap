package yarnwrap.client.sound;
public class Channel { public net.minecraft.client.sound.Channel wrapperContained; public Channel(net.minecraft.client.sound.Channel wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set sources() { return wrapperContained.sources; }
// public void sources(java.util.Set value) { wrapperContained.sources = value; }
// public yarnwrap.client.sound.SoundEngine soundEngine() { return new yarnwrap.client.sound.SoundEngine(wrapperContained.soundEngine); }
// public void soundEngine(yarnwrap.client.sound.SoundEngine value) { wrapperContained.soundEngine = value.wrapperContained; }
// public java.util.concurrent.Executor executor() { return wrapperContained.executor; }
// public void executor(java.util.concurrent.Executor value) { wrapperContained.executor = value; }
public void tick() { wrapperContained.tick(); }
// public java.util.concurrent.CompletableFuture createSource(Object mode) { return wrapperContained.createSource(mode); }
public void execute(java.util.function.Consumer sourcesConsumer) { wrapperContained.execute(sourcesConsumer); }
public void close() { wrapperContained.close(); }

}