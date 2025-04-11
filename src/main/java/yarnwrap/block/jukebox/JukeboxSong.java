package yarnwrap.block.jukebox;
public class JukeboxSong { public net.minecraft.block.jukebox.JukeboxSong wrapperContained; public JukeboxSong(net.minecraft.block.jukebox.JukeboxSong wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
// public void ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ENTRY_CODEC = value; }
public yarnwrap.network.codec.PacketCodec ENTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.ENTRY_PACKET_CODEC); }
// public void ENTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.ENTRY_PACKET_CODEC = value.wrapperContained; }
// public int TICKS_PER_SECOND() { return wrapperContained.TICKS_PER_SECOND; }
// public void TICKS_PER_SECOND(int value) { wrapperContained.TICKS_PER_SECOND = value; }
public int getLengthInTicks() { return wrapperContained.getLengthInTicks(); }
public boolean shouldStopPlaying(long ticksSinceSongStarted) { return wrapperContained.shouldStopPlaying(ticksSinceSongStarted); }
// public java.util.Optional getSongEntryFromStack(Object registryLookup,yarnwrap.item.ItemStack stack) { return wrapperContained.getSongEntryFromStack(registryLookup,stack.wrapperContained); }

}