package yarnwrap.entity;
public class Shearable { public net.minecraft.entity.Shearable wrapperContained; public Shearable(net.minecraft.entity.Shearable wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean isShearable() { return wrapperContained.isShearable(); }
public void sheared(yarnwrap.sound.SoundCategory shearedSoundCategory) { wrapperContained.sheared(shearedSoundCategory.wrapperContained); }

}