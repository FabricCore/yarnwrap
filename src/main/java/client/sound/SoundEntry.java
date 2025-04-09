package yarnwrap.client.sound;
public class SoundEntry { public net.minecraft.client.sound.SoundEntry wrapperContained; public SoundEntry(net.minecraft.client.sound.SoundEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List sounds() { return wrapperContained.sounds; }
// public java.lang.String subtitle() { return wrapperContained.subtitle; }
// public boolean replace() { return wrapperContained.replace; }
public java.util.List getSounds() { return wrapperContained.getSounds(); }
public java.lang.String getSubtitle() { return wrapperContained.getSubtitle(); }
public boolean canReplace() { return wrapperContained.canReplace(); }

}