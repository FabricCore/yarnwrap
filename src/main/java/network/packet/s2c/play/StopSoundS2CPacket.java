package yarnwrap.network.packet.s2c.play;
public class StopSoundS2CPacket { public net.minecraft.network.packet.s2c.play.StopSoundS2CPacket wrapperContained; public StopSoundS2CPacket(net.minecraft.network.packet.s2c.play.StopSoundS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier soundId() { return new yarnwrap.util.Identifier(wrapperContained.soundId); }
// public yarnwrap.sound.SoundCategory category() { return new yarnwrap.sound.SoundCategory(wrapperContained.category); }
// public int CATEGORY_MASK() { return wrapperContained.CATEGORY_MASK; }
// public int SOUND_ID_MASK() { return wrapperContained.SOUND_ID_MASK; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public yarnwrap.sound.SoundCategory getCategory() { return new yarnwrap.sound.SoundCategory(wrapperContained.getCategory()); }
public yarnwrap.util.Identifier getSoundId() { return new yarnwrap.util.Identifier(wrapperContained.getSoundId()); }
// public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}