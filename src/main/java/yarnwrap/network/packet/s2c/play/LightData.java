package yarnwrap.network.packet.s2c.play;
public class LightData { public net.minecraft.network.packet.s2c.play.LightData wrapperContained; public LightData(net.minecraft.network.packet.s2c.play.LightData wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.BitSet initedSky() { return wrapperContained.initedSky; }
// public void initedSky(java.util.BitSet value) { wrapperContained.initedSky = value; }
// public java.util.BitSet initedBlock() { return wrapperContained.initedBlock; }
// public void initedBlock(java.util.BitSet value) { wrapperContained.initedBlock = value; }
// public java.util.BitSet uninitedSky() { return wrapperContained.uninitedSky; }
// public void uninitedSky(java.util.BitSet value) { wrapperContained.uninitedSky = value; }
// public java.util.BitSet uninitedBlock() { return wrapperContained.uninitedBlock; }
// public void uninitedBlock(java.util.BitSet value) { wrapperContained.uninitedBlock = value; }
// public java.util.List skyNibbles() { return wrapperContained.skyNibbles; }
// public void skyNibbles(java.util.List value) { wrapperContained.skyNibbles = value; }
// public java.util.List blockNibbles() { return wrapperContained.blockNibbles; }
// public void blockNibbles(java.util.List value) { wrapperContained.blockNibbles = value; }
// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public LightData(yarnwrap.util.math.ChunkPos pos,yarnwrap.world.chunk.light.LightingProvider lightProvider,java.util.BitSet skyBits,java.util.BitSet blockBits) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.LightData(pos.wrapperContained,lightProvider.wrapperContained,skyBits,blockBits); }
public LightData(yarnwrap.network.PacketByteBuf buf,int x,int y) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.LightData(buf.wrapperContained,x,y); }
public java.util.BitSet getInitedSky() { return wrapperContained.getInitedSky(); }
// public void putChunk(yarnwrap.util.math.ChunkPos pos,yarnwrap.world.chunk.light.LightingProvider lightProvider,yarnwrap.world.LightType type,int y,java.util.BitSet initialized,java.util.BitSet uninitialized,java.util.List nibbles) { wrapperContained.putChunk(pos.wrapperContained,lightProvider.wrapperContained,type.wrapperContained,y,initialized,uninitialized,nibbles); }
public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
public java.util.BitSet getUninitedSky() { return wrapperContained.getUninitedSky(); }
public java.util.List getSkyNibbles() { return wrapperContained.getSkyNibbles(); }
public java.util.BitSet getInitedBlock() { return wrapperContained.getInitedBlock(); }
public java.util.BitSet getUninitedBlock() { return wrapperContained.getUninitedBlock(); }
public java.util.List getBlockNibbles() { return wrapperContained.getBlockNibbles(); }

}