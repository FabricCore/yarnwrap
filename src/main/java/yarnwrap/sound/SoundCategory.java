package yarnwrap.sound;
public class SoundCategory { public net.minecraft.sound.SoundCategory wrapperContained; public SoundCategory(net.minecraft.sound.SoundCategory wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String name() { return wrapperContained.name; }
// public void name(java.lang.String value) { wrapperContained.name = value; }
// public static java.lang.String name() { return net.minecraft.sound.SoundCategory.name; }
// public static void name(java.lang.String value, ) { net.minecraft.sound.SoundCategory.name = value; }

// public SoundCategory(java.lang.String name) { this.wrapperContained = new net.minecraft.sound.SoundCategory(name); }
public java.lang.String getName() { return wrapperContained.getName(); }
// public static java.lang.String getName() { return net.minecraft.sound.SoundCategory.getName(); }

}