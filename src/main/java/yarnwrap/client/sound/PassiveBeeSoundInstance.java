package yarnwrap.client.sound;
public class PassiveBeeSoundInstance { public net.minecraft.client.sound.PassiveBeeSoundInstance wrapperContained; public PassiveBeeSoundInstance(net.minecraft.client.sound.PassiveBeeSoundInstance wrapperContained) { this.wrapperContained = wrapperContained; }

public PassiveBeeSoundInstance(yarnwrap.entity.passive.BeeEntity entity) { this.wrapperContained = new net.minecraft.client.sound.PassiveBeeSoundInstance(entity.wrapperContained); }

}