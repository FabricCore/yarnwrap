package yarnwrap.client.sound;
public class SoundLoader { public net.minecraft.client.sound.SoundLoader wrapperContained; public SoundLoader(net.minecraft.client.sound.SoundLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.resource.ResourceFactory resourceFactory() { return new yarnwrap.resource.ResourceFactory(wrapperContained.resourceFactory); }
// public void resourceFactory(yarnwrap.resource.ResourceFactory value) { wrapperContained.resourceFactory = value.wrapperContained; }
// public static yarnwrap.resource.ResourceFactory resourceFactory() { return new yarnwrap.resource.ResourceFactory(net.minecraft.client.sound.SoundLoader.resourceFactory); }
// public static void resourceFactory(yarnwrap.resource.ResourceFactory value, ) { net.minecraft.client.sound.SoundLoader.resourceFactory = value.wrapperContained; }

// public java.util.Map loadedSounds() { return wrapperContained.loadedSounds; }
// public void loadedSounds(java.util.Map value) { wrapperContained.loadedSounds = value; }
// public static java.util.Map loadedSounds() { return net.minecraft.client.sound.SoundLoader.loadedSounds; }
// public static void loadedSounds(java.util.Map value, ) { net.minecraft.client.sound.SoundLoader.loadedSounds = value; }

public SoundLoader(yarnwrap.resource.ResourceFactory resourceFactory) { this.wrapperContained = new net.minecraft.client.sound.SoundLoader(resourceFactory.wrapperContained); }
public void close() { wrapperContained.close(); }
// public static void close() { net.minecraft.client.sound.SoundLoader.close(); }
// public java.util.concurrent.CompletableFuture method_19740(yarnwrap.client.sound.Sound sound) { return wrapperContained.method_19740(sound.wrapperContained); }
// public static java.util.concurrent.CompletableFuture method_19740(yarnwrap.client.sound.Sound sound, ) { return net.minecraft.client.sound.SoundLoader.method_19740(sound.wrapperContained); }
public java.util.concurrent.CompletableFuture loadStatic(java.util.Collection sounds) { return wrapperContained.loadStatic(sounds); }
// public static java.util.concurrent.CompletableFuture loadStatic(java.util.Collection sounds, ) { return net.minecraft.client.sound.SoundLoader.loadStatic(sounds); }
// public void method_19742(java.util.concurrent.CompletableFuture soundFuture) { wrapperContained.method_19742(soundFuture); }
// public static void method_19742(java.util.concurrent.CompletableFuture soundFuture, ) { net.minecraft.client.sound.SoundLoader.method_19742(soundFuture); }
public java.util.concurrent.CompletableFuture loadStatic(yarnwrap.util.Identifier id) { return wrapperContained.loadStatic(id.wrapperContained); }
// public static java.util.concurrent.CompletableFuture loadStatic(yarnwrap.util.Identifier id, ) { return net.minecraft.client.sound.SoundLoader.loadStatic(id.wrapperContained); }
public java.util.concurrent.CompletableFuture loadStreamed(yarnwrap.util.Identifier id,boolean repeatInstantly) { return wrapperContained.loadStreamed(id.wrapperContained,repeatInstantly); }
// public static java.util.concurrent.CompletableFuture loadStreamed(yarnwrap.util.Identifier id,boolean repeatInstantly, ) { return net.minecraft.client.sound.SoundLoader.loadStreamed(id.wrapperContained,repeatInstantly); }
// public java.util.concurrent.CompletableFuture method_19746(yarnwrap.util.Identifier id2) { return wrapperContained.method_19746(id2.wrapperContained); }
// public static java.util.concurrent.CompletableFuture method_19746(yarnwrap.util.Identifier id2, ) { return net.minecraft.client.sound.SoundLoader.method_19746(id2.wrapperContained); }

}