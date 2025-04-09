package yarnwrap.client.sound;
public class AbstractSoundInstance { public net.minecraft.client.sound.AbstractSoundInstance wrapperContained; public AbstractSoundInstance(net.minecraft.client.sound.AbstractSoundInstance wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean relative() { return wrapperContained.relative; }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public double x() { return wrapperContained.x; }
// public Object attenuationType() { return wrapperContained.attenuationType; }
// public float pitch() { return wrapperContained.pitch; }
// public float volume() { return wrapperContained.volume; }
// public yarnwrap.client.sound.Sound sound() { return new yarnwrap.client.sound.Sound(wrapperContained.sound); }
// public boolean repeat() { return wrapperContained.repeat; }
// public yarnwrap.sound.SoundCategory category() { return new yarnwrap.sound.SoundCategory(wrapperContained.category); }
// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public double z() { return wrapperContained.z; }
// public double y() { return wrapperContained.y; }
// public int repeatDelay() { return wrapperContained.repeatDelay; }

}