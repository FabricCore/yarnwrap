package yarnwrap.client.sound;
public class SoundContainer { public net.minecraft.client.sound.SoundContainer wrapperContained; public SoundContainer(net.minecraft.client.sound.SoundContainer wrapperContained) { this.wrapperContained = wrapperContained; }

public void preload(yarnwrap.client.sound.SoundSystem soundSystem) { wrapperContained.preload(soundSystem.wrapperContained); }
public java.lang.Object getSound(yarnwrap.util.math.random.Random random) { return wrapperContained.getSound(random.wrapperContained); }
public int getWeight() { return wrapperContained.getWeight(); }

}