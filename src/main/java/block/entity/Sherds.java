package yarnwrap.block.entity;
public class Sherds { public net.minecraft.block.entity.Sherds wrapperContained; public Sherds(net.minecraft.block.entity.Sherds wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.block.entity.Sherds DEFAULT() { return new yarnwrap.block.entity.Sherds(wrapperContained.DEFAULT); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public java.util.List stream() { return wrapperContained.stream(); }
public yarnwrap.nbt.NbtCompound toNbt(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.nbt.NbtCompound(wrapperContained.toNbt(nbt.wrapperContained)); }
// public java.util.Optional getSherd(java.util.List sherds,int index) { return wrapperContained.getSherd(sherds,index); }
public yarnwrap.block.entity.Sherds fromNbt(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.block.entity.Sherds(wrapperContained.fromNbt(nbt.wrapperContained)); }

}