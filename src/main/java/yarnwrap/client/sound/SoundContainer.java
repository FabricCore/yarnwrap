package yarnwrap.client.sound;
public class SoundContainer { public net.minecraft.client.sound.SoundContainer wrapperContained; public SoundContainer(net.minecraft.client.sound.SoundContainer wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.Object getSound(yarnwrap.util.math.random.Random random) { return wrapperContained.getSound(random.wrapperContained); }
// public static java.lang.Object getSound(yarnwrap.util.math.random.Random random, ) { return net.minecraft.client.sound.SoundContainer.getSound(random.wrapperContained); }
public int getWeight() { return wrapperContained.getWeight(); }
// public static int getWeight() { return net.minecraft.client.sound.SoundContainer.getWeight(); }
public void preload(yarnwrap.client.sound.SoundSystem soundSystem) { wrapperContained.preload(soundSystem.wrapperContained); }
// public static void preload(yarnwrap.client.sound.SoundSystem soundSystem, ) { net.minecraft.client.sound.SoundContainer.preload(soundSystem.wrapperContained); }

}