package yarnwrap.client.sound;
public class Channel { public net.minecraft.client.sound.Channel wrapperContained; public Channel(net.minecraft.client.sound.Channel wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.Set sources() { return wrapperContained.sources; }
// public void sources(java.util.Set value) { wrapperContained.sources = value; }
// public static java.util.Set sources() { return net.minecraft.client.sound.Channel.sources; }
// public static void sources(java.util.Set value, ) { net.minecraft.client.sound.Channel.sources = value; }

// public yarnwrap.client.sound.SoundEngine soundEngine() { return new yarnwrap.client.sound.SoundEngine(wrapperContained.soundEngine); }
// public void soundEngine(yarnwrap.client.sound.SoundEngine value) { wrapperContained.soundEngine = value.wrapperContained; }
// public static yarnwrap.client.sound.SoundEngine soundEngine() { return new yarnwrap.client.sound.SoundEngine(net.minecraft.client.sound.Channel.soundEngine); }
// public static void soundEngine(yarnwrap.client.sound.SoundEngine value, ) { net.minecraft.client.sound.Channel.soundEngine = value.wrapperContained; }

// public java.util.concurrent.Executor executor() { return wrapperContained.executor; }
// public void executor(java.util.concurrent.Executor value) { wrapperContained.executor = value; }
// public static java.util.concurrent.Executor executor() { return net.minecraft.client.sound.Channel.executor; }
// public static void executor(java.util.concurrent.Executor value, ) { net.minecraft.client.sound.Channel.executor = value; }

public Channel(yarnwrap.client.sound.SoundEngine soundEngine,java.util.concurrent.Executor executor) { this.wrapperContained = new net.minecraft.client.sound.Channel(soundEngine.wrapperContained,executor); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.client.sound.Channel.tick(); }
// public java.util.concurrent.CompletableFuture createSource(Object mode) { return wrapperContained.createSource(mode); }
// public static java.util.concurrent.CompletableFuture createSource(Object mode, ) { return net.minecraft.client.sound.Channel.createSource(mode); }
// public yarnwrap.client.sound.Source method_19725(Object source) { return new yarnwrap.client.sound.Source(wrapperContained.method_19725(source)); }
// public static yarnwrap.client.sound.Source method_19725(Object source, ) { return new yarnwrap.client.sound.Source(net.minecraft.client.sound.Channel.method_19725(source)); }
public void execute(java.util.function.Consumer sourcesConsumer) { wrapperContained.execute(sourcesConsumer); }
// public static void execute(java.util.function.Consumer sourcesConsumer, ) { net.minecraft.client.sound.Channel.execute(sourcesConsumer); }
public void close() { wrapperContained.close(); }
// public static void close() { net.minecraft.client.sound.Channel.close(); }

}