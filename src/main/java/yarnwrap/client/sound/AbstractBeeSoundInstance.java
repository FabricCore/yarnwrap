package yarnwrap.client.sound;
public class AbstractBeeSoundInstance { public net.minecraft.client.sound.AbstractBeeSoundInstance wrapperContained; public AbstractBeeSoundInstance(net.minecraft.client.sound.AbstractBeeSoundInstance wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.passive.BeeEntity bee() { return new yarnwrap.entity.passive.BeeEntity(wrapperContained.bee); }
// public void bee(yarnwrap.entity.passive.BeeEntity value) { wrapperContained.bee = value.wrapperContained; }
// public boolean replaced() { return wrapperContained.replaced; }
// public void replaced(boolean value) { wrapperContained.replaced = value; }
// public yarnwrap.client.sound.MovingSoundInstance getReplacement() { return new yarnwrap.client.sound.MovingSoundInstance(wrapperContained.getReplacement()); }
// public boolean shouldReplace() { return wrapperContained.shouldReplace(); }
// public float getMinPitch() { return wrapperContained.getMinPitch(); }
// public float getMaxPitch() { return wrapperContained.getMaxPitch(); }

}