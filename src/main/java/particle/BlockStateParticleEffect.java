package yarnwrap.particle;
public class BlockStateParticleEffect { public net.minecraft.particle.BlockStateParticleEffect wrapperContained; public BlockStateParticleEffect(net.minecraft.particle.BlockStateParticleEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.BlockState blockState() { return new yarnwrap.block.BlockState(wrapperContained.blockState); }
// public yarnwrap.particle.ParticleType type() { return new yarnwrap.particle.ParticleType(wrapperContained.type); }
// public com.mojang.serialization.Codec BLOCK_STATE_CODEC() { return wrapperContained.BLOCK_STATE_CODEC; }
public yarnwrap.block.BlockState getBlockState() { return new yarnwrap.block.BlockState(wrapperContained.getBlockState()); }
public com.mojang.serialization.MapCodec createCodec(yarnwrap.particle.ParticleType type) { return wrapperContained.createCodec(type.wrapperContained); }
public yarnwrap.network.codec.PacketCodec createPacketCodec(yarnwrap.particle.ParticleType type) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.createPacketCodec(type.wrapperContained)); }

}