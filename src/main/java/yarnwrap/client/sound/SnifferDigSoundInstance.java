package yarnwrap.client.sound;
public class SnifferDigSoundInstance { public net.minecraft.client.sound.SnifferDigSoundInstance wrapperContained; public SnifferDigSoundInstance(net.minecraft.client.sound.SnifferDigSoundInstance wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.passive.SnifferEntity sniffer() { return new yarnwrap.entity.passive.SnifferEntity(wrapperContained.sniffer); }
// public void sniffer(yarnwrap.entity.passive.SnifferEntity value) { wrapperContained.sniffer = value.wrapperContained; }
public SnifferDigSoundInstance(yarnwrap.entity.passive.SnifferEntity sniffer) { this.wrapperContained = new net.minecraft.client.sound.SnifferDigSoundInstance(sniffer.wrapperContained); }

}