package yarnwrap.sound;
public class SoundCategory { public net.minecraft.sound.SoundCategory wrapperContained; public SoundCategory(net.minecraft.sound.SoundCategory wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
public java.lang.String getName() { return wrapperContained.getName(); }

}