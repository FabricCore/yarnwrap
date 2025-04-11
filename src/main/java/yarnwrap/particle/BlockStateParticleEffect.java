package yarnwrap.particle;
public class BlockStateParticleEffect { public net.minecraft.particle.BlockStateParticleEffect wrapperContained; public BlockStateParticleEffect(net.minecraft.particle.BlockStateParticleEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.BlockState blockState() { return new yarnwrap.block.BlockState(wrapperContained.blockState); }
// public void blockState(yarnwrap.block.BlockState value) { wrapperContained.blockState = value.wrapperContained; }
// public yarnwrap.particle.ParticleType type() { return new yarnwrap.particle.ParticleType(wrapperContained.type); }
// public void type(yarnwrap.particle.ParticleType value) { wrapperContained.type = value.wrapperContained; }
// public com.mojang.serialization.Codec BLOCK_STATE_CODEC() { return wrapperContained.BLOCK_STATE_CODEC; }
// public void BLOCK_STATE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.BLOCK_STATE_CODEC = value; }
public yarnwrap.block.BlockState getBlockState() { return new yarnwrap.block.BlockState(wrapperContained.getBlockState()); }
public com.mojang.serialization.MapCodec createCodec(yarnwrap.particle.ParticleType type) { return wrapperContained.createCodec(type.wrapperContained); }
public yarnwrap.network.codec.PacketCodec createPacketCodec(yarnwrap.particle.ParticleType type) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.createPacketCodec(type.wrapperContained)); }

}