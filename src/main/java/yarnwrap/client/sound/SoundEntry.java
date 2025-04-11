package yarnwrap.client.sound;
public class SoundEntry { public net.minecraft.client.sound.SoundEntry wrapperContained; public SoundEntry(net.minecraft.client.sound.SoundEntry wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List sounds() { return wrapperContained.sounds; }
// public void sounds(java.util.List value) { wrapperContained.sounds = value; }
// public java.lang.String subtitle() { return wrapperContained.subtitle; }
// public void subtitle(java.lang.String value) { wrapperContained.subtitle = value; }
// public boolean replace() { return wrapperContained.replace; }
// public void replace(boolean value) { wrapperContained.replace = value; }
public java.util.List getSounds() { return wrapperContained.getSounds(); }
public java.lang.String getSubtitle() { return wrapperContained.getSubtitle(); }
public boolean canReplace() { return wrapperContained.canReplace(); }

}