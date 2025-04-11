package yarnwrap.client.sound;
public class EntityTrackingSoundInstance { public net.minecraft.client.sound.EntityTrackingSoundInstance wrapperContained; public EntityTrackingSoundInstance(net.minecraft.client.sound.EntityTrackingSoundInstance wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.Entity entity() { return new yarnwrap.entity.Entity(wrapperContained.entity); }
// public void entity(yarnwrap.entity.Entity value) { wrapperContained.entity = value.wrapperContained; }
public EntityTrackingSoundInstance(yarnwrap.sound.SoundEvent sound,yarnwrap.sound.SoundCategory category,float volume,float pitch,yarnwrap.entity.Entity entity,long seed) { this.wrapperContained = new net.minecraft.client.sound.EntityTrackingSoundInstance(sound.wrapperContained,category.wrapperContained,volume,pitch,entity.wrapperContained,seed); }

}