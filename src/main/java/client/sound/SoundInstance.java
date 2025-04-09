package yarnwrap.client.sound;
public class SoundInstance { public net.minecraft.client.sound.SoundInstance wrapperContained; public SoundInstance(net.minecraft.client.sound.SoundInstance wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean canPlay() { return wrapperContained.canPlay(); }
// public yarnwrap.util.math.random.Random createRandom() { return new yarnwrap.util.math.random.Random(wrapperContained.createRandom()); }
public yarnwrap.sound.SoundCategory getCategory() { return new yarnwrap.sound.SoundCategory(wrapperContained.getCategory()); }
public yarnwrap.util.Identifier getId() { return new yarnwrap.util.Identifier(wrapperContained.getId()); }
public yarnwrap.client.sound.Sound getSound() { return new yarnwrap.client.sound.Sound(wrapperContained.getSound()); }
public Object getAttenuationType() { return wrapperContained.getAttenuationType(); }
public double getZ() { return wrapperContained.getZ(); }
public double getY() { return wrapperContained.getY(); }
public int getRepeatDelay() { return wrapperContained.getRepeatDelay(); }
public float getVolume() { return wrapperContained.getVolume(); }
public float getPitch() { return wrapperContained.getPitch(); }
public yarnwrap.client.sound.WeightedSoundSet getSoundSet(yarnwrap.client.sound.SoundManager soundManager) { return new yarnwrap.client.sound.WeightedSoundSet(wrapperContained.getSoundSet(soundManager.wrapperContained)); }
public double getX() { return wrapperContained.getX(); }
public boolean shouldAlwaysPlay() { return wrapperContained.shouldAlwaysPlay(); }
public boolean isRepeatable() { return wrapperContained.isRepeatable(); }
public boolean isRelative() { return wrapperContained.isRelative(); }

}