package yarnwrap.network.packet.s2c.play;
public class LightData { public net.minecraft.network.packet.s2c.play.LightData wrapperContained; public LightData(net.minecraft.network.packet.s2c.play.LightData wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.BitSet initedSky() { return wrapperContained.initedSky; }
// public java.util.BitSet initedBlock() { return wrapperContained.initedBlock; }
// public java.util.BitSet uninitedSky() { return wrapperContained.uninitedSky; }
// public java.util.BitSet uninitedBlock() { return wrapperContained.uninitedBlock; }
// public java.util.List skyNibbles() { return wrapperContained.skyNibbles; }
// public java.util.List blockNibbles() { return wrapperContained.blockNibbles; }
// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public java.util.BitSet getInitedSky() { return wrapperContained.getInitedSky(); }
// public void putChunk(yarnwrap.util.math.ChunkPos pos,yarnwrap.world.chunk.light.LightingProvider lightProvider,yarnwrap.world.LightType type,int y,java.util.BitSet initialized,java.util.BitSet uninitialized,java.util.List nibbles) { wrapperContained.putChunk(pos.wrapperContained,lightProvider.wrapperContained,type.wrapperContained,y,initialized,uninitialized,nibbles); }
public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
public java.util.BitSet getUninitedSky() { return wrapperContained.getUninitedSky(); }
public java.util.List getSkyNibbles() { return wrapperContained.getSkyNibbles(); }
public java.util.BitSet getInitedBlock() { return wrapperContained.getInitedBlock(); }
public java.util.BitSet getUninitedBlock() { return wrapperContained.getUninitedBlock(); }
public java.util.List getBlockNibbles() { return wrapperContained.getBlockNibbles(); }

}