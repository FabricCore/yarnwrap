package yarnwrap.network.packet.s2c.play;
public class LightData { public net.minecraft.network.packet.s2c.play.LightData wrapperContained; public LightData(net.minecraft.network.packet.s2c.play.LightData wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.BitSet initedSky() { return wrapperContained.initedSky; }
// public void initedSky(java.util.BitSet value) { wrapperContained.initedSky = value; }
// public static java.util.BitSet initedSky() { return net.minecraft.network.packet.s2c.play.LightData.initedSky; }
// public static void initedSky(java.util.BitSet value, ) { net.minecraft.network.packet.s2c.play.LightData.initedSky = value; }

// public java.util.BitSet initedBlock() { return wrapperContained.initedBlock; }
// public void initedBlock(java.util.BitSet value) { wrapperContained.initedBlock = value; }
// public static java.util.BitSet initedBlock() { return net.minecraft.network.packet.s2c.play.LightData.initedBlock; }
// public static void initedBlock(java.util.BitSet value, ) { net.minecraft.network.packet.s2c.play.LightData.initedBlock = value; }

// public java.util.BitSet uninitedSky() { return wrapperContained.uninitedSky; }
// public void uninitedSky(java.util.BitSet value) { wrapperContained.uninitedSky = value; }
// public static java.util.BitSet uninitedSky() { return net.minecraft.network.packet.s2c.play.LightData.uninitedSky; }
// public static void uninitedSky(java.util.BitSet value, ) { net.minecraft.network.packet.s2c.play.LightData.uninitedSky = value; }

// public java.util.BitSet uninitedBlock() { return wrapperContained.uninitedBlock; }
// public void uninitedBlock(java.util.BitSet value) { wrapperContained.uninitedBlock = value; }
// public static java.util.BitSet uninitedBlock() { return net.minecraft.network.packet.s2c.play.LightData.uninitedBlock; }
// public static void uninitedBlock(java.util.BitSet value, ) { net.minecraft.network.packet.s2c.play.LightData.uninitedBlock = value; }

// public java.util.List skyNibbles() { return wrapperContained.skyNibbles; }
// public void skyNibbles(java.util.List value) { wrapperContained.skyNibbles = value; }
// public static java.util.List skyNibbles() { return net.minecraft.network.packet.s2c.play.LightData.skyNibbles; }
// public static void skyNibbles(java.util.List value, ) { net.minecraft.network.packet.s2c.play.LightData.skyNibbles = value; }

// public java.util.List blockNibbles() { return wrapperContained.blockNibbles; }
// public void blockNibbles(java.util.List value) { wrapperContained.blockNibbles = value; }
// public static java.util.List blockNibbles() { return net.minecraft.network.packet.s2c.play.LightData.blockNibbles; }
// public static void blockNibbles(java.util.List value, ) { net.minecraft.network.packet.s2c.play.LightData.blockNibbles = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
// public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.LightData.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.LightData.CODEC = value.wrapperContained; }

public LightData(yarnwrap.util.math.ChunkPos pos,yarnwrap.world.chunk.light.LightingProvider lightProvider,java.util.BitSet skyBits,java.util.BitSet blockBits) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.LightData(pos.wrapperContained,lightProvider.wrapperContained,skyBits,blockBits); }
public LightData(yarnwrap.network.PacketByteBuf buf,int x,int y) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.LightData(buf.wrapperContained,x,y); }
public java.util.BitSet getInitedSky() { return wrapperContained.getInitedSky(); }
// public static java.util.BitSet getInitedSky() { return net.minecraft.network.packet.s2c.play.LightData.getInitedSky(); }
// public void putChunk(yarnwrap.util.math.ChunkPos pos,yarnwrap.world.chunk.light.LightingProvider lightProvider,yarnwrap.world.LightType type,int y,java.util.BitSet initialized,java.util.BitSet uninitialized,java.util.List nibbles) { wrapperContained.putChunk(pos.wrapperContained,lightProvider.wrapperContained,type.wrapperContained,y,initialized,uninitialized,nibbles); }
// public static void putChunk(yarnwrap.util.math.ChunkPos pos,yarnwrap.world.chunk.light.LightingProvider lightProvider,yarnwrap.world.LightType type,int y,java.util.BitSet initialized,java.util.BitSet uninitialized,java.util.List nibbles, ) { net.minecraft.network.packet.s2c.play.LightData.putChunk(pos.wrapperContained,lightProvider.wrapperContained,type.wrapperContained,y,initialized,uninitialized,nibbles); }
public void write(yarnwrap.network.PacketByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf, ) { net.minecraft.network.packet.s2c.play.LightData.write(buf.wrapperContained); }
public java.util.BitSet getUninitedSky() { return wrapperContained.getUninitedSky(); }
// public static java.util.BitSet getUninitedSky() { return net.minecraft.network.packet.s2c.play.LightData.getUninitedSky(); }
public java.util.List getSkyNibbles() { return wrapperContained.getSkyNibbles(); }
// public static java.util.List getSkyNibbles() { return net.minecraft.network.packet.s2c.play.LightData.getSkyNibbles(); }
public java.util.BitSet getInitedBlock() { return wrapperContained.getInitedBlock(); }
// public static java.util.BitSet getInitedBlock() { return net.minecraft.network.packet.s2c.play.LightData.getInitedBlock(); }
public java.util.BitSet getUninitedBlock() { return wrapperContained.getUninitedBlock(); }
// public static java.util.BitSet getUninitedBlock() { return net.minecraft.network.packet.s2c.play.LightData.getUninitedBlock(); }
public java.util.List getBlockNibbles() { return wrapperContained.getBlockNibbles(); }
// public static java.util.List getBlockNibbles() { return net.minecraft.network.packet.s2c.play.LightData.getBlockNibbles(); }

}