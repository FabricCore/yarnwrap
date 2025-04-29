package yarnwrap.network.packet.s2c.play;
public class BlockEventS2CPacket { public net.minecraft.network.packet.s2c.play.BlockEventS2CPacket wrapperContained; public BlockEventS2CPacket(net.minecraft.network.packet.s2c.play.BlockEventS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public int data() { return wrapperContained.data; }
// public void data(int value) { wrapperContained.data = value; }
// public static int data() { return net.minecraft.network.packet.s2c.play.BlockEventS2CPacket.data; }
// public static void data(int value, ) { net.minecraft.network.packet.s2c.play.BlockEventS2CPacket.data = value; }

// public int type() { return wrapperContained.type; }
// public void type(int value) { wrapperContained.type = value; }
// public static int type() { return net.minecraft.network.packet.s2c.play.BlockEventS2CPacket.type; }
// public static void type(int value, ) { net.minecraft.network.packet.s2c.play.BlockEventS2CPacket.type = value; }

// public yarnwrap.block.Block block() { return new yarnwrap.block.Block(wrapperContained.block); }
// public void block(yarnwrap.block.Block value) { wrapperContained.block = value.wrapperContained; }
// public static yarnwrap.block.Block block() { return new yarnwrap.block.Block(net.minecraft.network.packet.s2c.play.BlockEventS2CPacket.block); }
// public static void block(yarnwrap.block.Block value, ) { net.minecraft.network.packet.s2c.play.BlockEventS2CPacket.block = value.wrapperContained; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(net.minecraft.network.packet.s2c.play.BlockEventS2CPacket.pos); }
// public static void pos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.network.packet.s2c.play.BlockEventS2CPacket.pos = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.BlockEventS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.BlockEventS2CPacket.CODEC = value.wrapperContained; }

public BlockEventS2CPacket(yarnwrap.util.math.BlockPos pos,yarnwrap.block.Block block,int type,int data) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.BlockEventS2CPacket(pos.wrapperContained,block.wrapperContained,type,data); }
// public BlockEventS2CPacket(yarnwrap.network.RegistryByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.BlockEventS2CPacket(buf.wrapperContained); }
public int getType() { return wrapperContained.getType(); }
// public static int getType() { return net.minecraft.network.packet.s2c.play.BlockEventS2CPacket.getType(); }
public yarnwrap.block.Block getBlock() { return new yarnwrap.block.Block(wrapperContained.getBlock()); }
// public static yarnwrap.block.Block getBlock() { return new yarnwrap.block.Block(net.minecraft.network.packet.s2c.play.BlockEventS2CPacket.getBlock()); }
public int getData() { return wrapperContained.getData(); }
// public static int getData() { return net.minecraft.network.packet.s2c.play.BlockEventS2CPacket.getData(); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
// public static yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.network.packet.s2c.play.BlockEventS2CPacket.getPos()); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.RegistryByteBuf buf, ) { net.minecraft.network.packet.s2c.play.BlockEventS2CPacket.write(buf.wrapperContained); }

}