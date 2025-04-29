package yarnwrap.client.sound;
public class WeightedSoundSet { public net.minecraft.client.sound.WeightedSoundSet wrapperContained; public WeightedSoundSet(net.minecraft.client.sound.WeightedSoundSet wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text subtitle() { return new yarnwrap.text.Text(wrapperContained.subtitle); }
// public void subtitle(yarnwrap.text.Text value) { wrapperContained.subtitle = value.wrapperContained; }
// public static yarnwrap.text.Text subtitle() { return new yarnwrap.text.Text(net.minecraft.client.sound.WeightedSoundSet.subtitle); }
// public static void subtitle(yarnwrap.text.Text value, ) { net.minecraft.client.sound.WeightedSoundSet.subtitle = value.wrapperContained; }

// public java.util.List sounds() { return wrapperContained.sounds; }
// public void sounds(java.util.List value) { wrapperContained.sounds = value; }
// public static java.util.List sounds() { return net.minecraft.client.sound.WeightedSoundSet.sounds; }
// public static void sounds(java.util.List value, ) { net.minecraft.client.sound.WeightedSoundSet.sounds = value; }

public WeightedSoundSet(yarnwrap.util.Identifier id,java.lang.String subtitle) { this.wrapperContained = new net.minecraft.client.sound.WeightedSoundSet(id.wrapperContained,subtitle); }
public void add(yarnwrap.client.sound.SoundContainer container) { wrapperContained.add(container.wrapperContained); }
// public static void add(yarnwrap.client.sound.SoundContainer container, ) { net.minecraft.client.sound.WeightedSoundSet.add(container.wrapperContained); }
public yarnwrap.text.Text getSubtitle() { return new yarnwrap.text.Text(wrapperContained.getSubtitle()); }
// public static yarnwrap.text.Text getSubtitle() { return new yarnwrap.text.Text(net.minecraft.client.sound.WeightedSoundSet.getSubtitle()); }

}