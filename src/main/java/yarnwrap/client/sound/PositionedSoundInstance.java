package yarnwrap.client.sound;
public class PositionedSoundInstance { public net.minecraft.client.sound.PositionedSoundInstance wrapperContained; public PositionedSoundInstance(net.minecraft.client.sound.PositionedSoundInstance wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.sound.PositionedSoundInstance ambient(yarnwrap.sound.SoundEvent sound,float pitch,float volume) { return new yarnwrap.client.sound.PositionedSoundInstance(wrapperContained.ambient(sound.wrapperContained,pitch,volume)); }
public yarnwrap.client.sound.PositionedSoundInstance ambient(yarnwrap.sound.SoundEvent sound) { return new yarnwrap.client.sound.PositionedSoundInstance(wrapperContained.ambient(sound.wrapperContained)); }
public yarnwrap.client.sound.PositionedSoundInstance ambient(yarnwrap.sound.SoundEvent sound,yarnwrap.util.math.random.Random random,double x,double y,double z) { return new yarnwrap.client.sound.PositionedSoundInstance(wrapperContained.ambient(sound.wrapperContained,random.wrapperContained,x,y,z)); }
public yarnwrap.client.sound.PositionedSoundInstance master(yarnwrap.sound.SoundEvent sound,float pitch,float volume) { return new yarnwrap.client.sound.PositionedSoundInstance(wrapperContained.master(sound.wrapperContained,pitch,volume)); }
public yarnwrap.client.sound.PositionedSoundInstance master(yarnwrap.sound.SoundEvent sound,float pitch) { return new yarnwrap.client.sound.PositionedSoundInstance(wrapperContained.master(sound.wrapperContained,pitch)); }
public yarnwrap.client.sound.PositionedSoundInstance music(yarnwrap.sound.SoundEvent sound) { return new yarnwrap.client.sound.PositionedSoundInstance(wrapperContained.music(sound.wrapperContained)); }
public yarnwrap.client.sound.PositionedSoundInstance record(yarnwrap.sound.SoundEvent sound,yarnwrap.util.math.Vec3d pos) { return new yarnwrap.client.sound.PositionedSoundInstance(wrapperContained.record(sound.wrapperContained,pos.wrapperContained)); }
public yarnwrap.client.sound.PositionedSoundInstance master(yarnwrap.registry.entry.RegistryEntry sound,float pitch) { return new yarnwrap.client.sound.PositionedSoundInstance(wrapperContained.master(sound.wrapperContained,pitch)); }

}