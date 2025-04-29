package yarnwrap.entity;
public class Shearable { public net.minecraft.entity.Shearable wrapperContained; public Shearable(net.minecraft.entity.Shearable wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean isShearable() { return wrapperContained.isShearable(); }
// public static boolean isShearable() { return net.minecraft.entity.Shearable.isShearable(); }
public void sheared(yarnwrap.sound.SoundCategory shearedSoundCategory) { wrapperContained.sheared(shearedSoundCategory.wrapperContained); }
// public static void sheared(yarnwrap.sound.SoundCategory shearedSoundCategory, ) { net.minecraft.entity.Shearable.sheared(shearedSoundCategory.wrapperContained); }

}