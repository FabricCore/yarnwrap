package yarnwrap.client.sound;
public class SoundEntry { public net.minecraft.client.sound.SoundEntry wrapperContained; public SoundEntry(net.minecraft.client.sound.SoundEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List sounds() { return wrapperContained.sounds; }
// public void sounds(java.util.List value) { wrapperContained.sounds = value; }
// public static java.util.List sounds() { return net.minecraft.client.sound.SoundEntry.sounds; }
// public static void sounds(java.util.List value, ) { net.minecraft.client.sound.SoundEntry.sounds = value; }

// public java.lang.String subtitle() { return wrapperContained.subtitle; }
// public void subtitle(java.lang.String value) { wrapperContained.subtitle = value; }
// public static java.lang.String subtitle() { return net.minecraft.client.sound.SoundEntry.subtitle; }
// public static void subtitle(java.lang.String value, ) { net.minecraft.client.sound.SoundEntry.subtitle = value; }

// public boolean replace() { return wrapperContained.replace; }
// public void replace(boolean value) { wrapperContained.replace = value; }
// public static boolean replace() { return net.minecraft.client.sound.SoundEntry.replace; }
// public static void replace(boolean value, ) { net.minecraft.client.sound.SoundEntry.replace = value; }

public SoundEntry(java.util.List sounds,boolean replace,java.lang.String subtitle) { this.wrapperContained = new net.minecraft.client.sound.SoundEntry(sounds,replace,subtitle); }
public java.util.List getSounds() { return wrapperContained.getSounds(); }
// public static java.util.List getSounds() { return net.minecraft.client.sound.SoundEntry.getSounds(); }
public java.lang.String getSubtitle() { return wrapperContained.getSubtitle(); }
// public static java.lang.String getSubtitle() { return net.minecraft.client.sound.SoundEntry.getSubtitle(); }
public boolean canReplace() { return wrapperContained.canReplace(); }
// public static boolean canReplace() { return net.minecraft.client.sound.SoundEntry.canReplace(); }

}