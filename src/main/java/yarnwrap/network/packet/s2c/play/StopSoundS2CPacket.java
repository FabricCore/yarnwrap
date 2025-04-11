package yarnwrap.network.packet.s2c.play;
public class StopSoundS2CPacket { public net.minecraft.network.packet.s2c.play.StopSoundS2CPacket wrapperContained; public StopSoundS2CPacket(net.minecraft.network.packet.s2c.play.StopSoundS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier soundId() { return new yarnwrap.util.Identifier(wrapperContained.soundId); }
// public void soundId(yarnwrap.util.Identifier value) { wrapperContained.soundId = value.wrapperContained; }
// public yarnwrap.sound.SoundCategory category() { return new yarnwrap.sound.SoundCategory(wrapperContained.category); }
// public void category(yarnwrap.sound.SoundCategory value) { wrapperContained.category = value.wrapperContained; }
// public int CATEGORY_MASK() { return wrapperContained.CATEGORY_MASK; }
// public void CATEGORY_MASK(int value) { wrapperContained.CATEGORY_MASK = value; }
// public int SOUND_ID_MASK() { return wrapperContained.SOUND_ID_MASK; }
// public void SOUND_ID_MASK(int value) { wrapperContained.SOUND_ID_MASK = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public StopSoundS2CPacket(yarnwrap.network.PacketByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.StopSoundS2CPacket(buf.wrapperContained); }
public StopSoundS2CPacket(yarnwrap.util.Identifier soundId,yarnwrap.sound.SoundCategory category) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.StopSoundS2CPacket(soundId.wrapperContained,category.wrapperContained); }
public yarnwrap.sound.SoundCategory getCategory() { return new yarnwrap.sound.SoundCategory(wrapperContained.getCategory()); }
public yarnwrap.util.Identifier getSoundId() { return new yarnwrap.util.Identifier(wrapperContained.getSoundId()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}