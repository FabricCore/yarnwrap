package yarnwrap.client.sound;
public class SoundInstance { public net.minecraft.client.sound.SoundInstance wrapperContained; public SoundInstance(net.minecraft.client.sound.SoundInstance wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean canPlay() { return wrapperContained.canPlay(); }
// public static boolean canPlay() { return net.minecraft.client.sound.SoundInstance.canPlay(); }
// public yarnwrap.util.math.random.Random createRandom() { return new yarnwrap.util.math.random.Random(wrapperContained.createRandom()); }
public static yarnwrap.util.math.random.Random createRandom() { return new yarnwrap.util.math.random.Random(net.minecraft.client.sound.SoundInstance.createRandom()); }
public yarnwrap.sound.SoundCategory getCategory() { return new yarnwrap.sound.SoundCategory(wrapperContained.getCategory()); }
// public static yarnwrap.sound.SoundCategory getCategory() { return new yarnwrap.sound.SoundCategory(net.minecraft.client.sound.SoundInstance.getCategory()); }
public yarnwrap.util.Identifier getId() { return new yarnwrap.util.Identifier(wrapperContained.getId()); }
// public static yarnwrap.util.Identifier getId() { return new yarnwrap.util.Identifier(net.minecraft.client.sound.SoundInstance.getId()); }
public yarnwrap.client.sound.Sound getSound() { return new yarnwrap.client.sound.Sound(wrapperContained.getSound()); }
// public static yarnwrap.client.sound.Sound getSound() { return new yarnwrap.client.sound.Sound(net.minecraft.client.sound.SoundInstance.getSound()); }
public Object getAttenuationType() { return wrapperContained.getAttenuationType(); }
// public static Object getAttenuationType() { return net.minecraft.client.sound.SoundInstance.getAttenuationType(); }
public double getZ() { return wrapperContained.getZ(); }
// public static double getZ() { return net.minecraft.client.sound.SoundInstance.getZ(); }
public double getY() { return wrapperContained.getY(); }
// public static double getY() { return net.minecraft.client.sound.SoundInstance.getY(); }
public int getRepeatDelay() { return wrapperContained.getRepeatDelay(); }
// public static int getRepeatDelay() { return net.minecraft.client.sound.SoundInstance.getRepeatDelay(); }
public float getVolume() { return wrapperContained.getVolume(); }
// public static float getVolume() { return net.minecraft.client.sound.SoundInstance.getVolume(); }
public float getPitch() { return wrapperContained.getPitch(); }
// public static float getPitch() { return net.minecraft.client.sound.SoundInstance.getPitch(); }
public yarnwrap.client.sound.WeightedSoundSet getSoundSet(yarnwrap.client.sound.SoundManager soundManager) { return new yarnwrap.client.sound.WeightedSoundSet(wrapperContained.getSoundSet(soundManager.wrapperContained)); }
// public static yarnwrap.client.sound.WeightedSoundSet getSoundSet(yarnwrap.client.sound.SoundManager soundManager, ) { return new yarnwrap.client.sound.WeightedSoundSet(net.minecraft.client.sound.SoundInstance.getSoundSet(soundManager.wrapperContained)); }
public double getX() { return wrapperContained.getX(); }
// public static double getX() { return net.minecraft.client.sound.SoundInstance.getX(); }
public boolean shouldAlwaysPlay() { return wrapperContained.shouldAlwaysPlay(); }
// public static boolean shouldAlwaysPlay() { return net.minecraft.client.sound.SoundInstance.shouldAlwaysPlay(); }
public boolean isRepeatable() { return wrapperContained.isRepeatable(); }
// public static boolean isRepeatable() { return net.minecraft.client.sound.SoundInstance.isRepeatable(); }
public boolean isRelative() { return wrapperContained.isRelative(); }
// public static boolean isRelative() { return net.minecraft.client.sound.SoundInstance.isRelative(); }

}