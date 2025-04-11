package yarnwrap.client.sound;
public class AbstractBeeSoundInstance { public net.minecraft.client.sound.AbstractBeeSoundInstance wrapperContained; public AbstractBeeSoundInstance(net.minecraft.client.sound.AbstractBeeSoundInstance wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.passive.BeeEntity bee() { return new yarnwrap.entity.passive.BeeEntity(wrapperContained.bee); }
// public void bee(yarnwrap.entity.passive.BeeEntity value) { wrapperContained.bee = value.wrapperContained; }
// public boolean replaced() { return wrapperContained.replaced; }
// public void replaced(boolean value) { wrapperContained.replaced = value; }
// public AbstractBeeSoundInstance(yarnwrap.entity.passive.BeeEntity entity,yarnwrap.sound.SoundEvent sound,yarnwrap.sound.SoundCategory soundCategory) { this.wrapperContained = new net.minecraft.client.sound.AbstractBeeSoundInstance(entity.wrapperContained,sound.wrapperContained,soundCategory.wrapperContained); }
// public yarnwrap.client.sound.MovingSoundInstance getReplacement() { return new yarnwrap.client.sound.MovingSoundInstance(wrapperContained.getReplacement()); }
// public boolean shouldReplace() { return wrapperContained.shouldReplace(); }
// public float getMinPitch() { return wrapperContained.getMinPitch(); }
// public float getMaxPitch() { return wrapperContained.getMaxPitch(); }

}