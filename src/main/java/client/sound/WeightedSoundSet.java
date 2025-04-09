package yarnwrap.client.sound;
public class WeightedSoundSet { public net.minecraft.client.sound.WeightedSoundSet wrapperContained; public WeightedSoundSet(net.minecraft.client.sound.WeightedSoundSet wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text subtitle() { return new yarnwrap.text.Text(wrapperContained.subtitle); }
// public java.util.List sounds() { return wrapperContained.sounds; }
public void add(yarnwrap.client.sound.SoundContainer container) { wrapperContained.add(container.wrapperContained); }
public yarnwrap.text.Text getSubtitle() { return new yarnwrap.text.Text(wrapperContained.getSubtitle()); }

}