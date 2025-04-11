package yarnwrap.client.sound;
public class AggressiveBeeSoundInstance { public net.minecraft.client.sound.AggressiveBeeSoundInstance wrapperContained; public AggressiveBeeSoundInstance(net.minecraft.client.sound.AggressiveBeeSoundInstance wrapperContained) { this.wrapperContained = wrapperContained; }

public AggressiveBeeSoundInstance(yarnwrap.entity.passive.BeeEntity entity) { this.wrapperContained = new net.minecraft.client.sound.AggressiveBeeSoundInstance(entity.wrapperContained); }

}