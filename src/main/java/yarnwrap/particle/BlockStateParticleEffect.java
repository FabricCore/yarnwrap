package yarnwrap.particle;
public class BlockStateParticleEffect { public net.minecraft.particle.BlockStateParticleEffect wrapperContained; public BlockStateParticleEffect(net.minecraft.particle.BlockStateParticleEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.block.BlockState blockState() { return new yarnwrap.block.BlockState(wrapperContained.blockState); }
// public void blockState(yarnwrap.block.BlockState value) { wrapperContained.blockState = value.wrapperContained; }
// public static yarnwrap.block.BlockState blockState() { return new yarnwrap.block.BlockState(net.minecraft.particle.BlockStateParticleEffect.blockState); }
// public static void blockState(yarnwrap.block.BlockState value, ) { net.minecraft.particle.BlockStateParticleEffect.blockState = value.wrapperContained; }

// public yarnwrap.particle.ParticleType type() { return new yarnwrap.particle.ParticleType(wrapperContained.type); }
// public void type(yarnwrap.particle.ParticleType value) { wrapperContained.type = value.wrapperContained; }
// public static yarnwrap.particle.ParticleType type() { return new yarnwrap.particle.ParticleType(net.minecraft.particle.BlockStateParticleEffect.type); }
// public static void type(yarnwrap.particle.ParticleType value, ) { net.minecraft.particle.BlockStateParticleEffect.type = value.wrapperContained; }

// public com.mojang.serialization.Codec BLOCK_STATE_CODEC() { return wrapperContained.BLOCK_STATE_CODEC; }
// public void BLOCK_STATE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.BLOCK_STATE_CODEC = value; }
// public static com.mojang.serialization.Codec BLOCK_STATE_CODEC() { return net.minecraft.particle.BlockStateParticleEffect.BLOCK_STATE_CODEC; }
// public static void BLOCK_STATE_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.particle.BlockStateParticleEffect.BLOCK_STATE_CODEC = value; }

public BlockStateParticleEffect(yarnwrap.particle.ParticleType type,yarnwrap.block.BlockState blockState) { this.wrapperContained = new net.minecraft.particle.BlockStateParticleEffect(type.wrapperContained,blockState.wrapperContained); }
public yarnwrap.block.BlockState getBlockState() { return new yarnwrap.block.BlockState(wrapperContained.getBlockState()); }
// public static yarnwrap.block.BlockState getBlockState() { return new yarnwrap.block.BlockState(net.minecraft.particle.BlockStateParticleEffect.getBlockState()); }
// public yarnwrap.block.BlockState method_29127(yarnwrap.particle.BlockStateParticleEffect effect) { return new yarnwrap.block.BlockState(wrapperContained.method_29127(effect.wrapperContained)); }
// public static yarnwrap.block.BlockState method_29127(yarnwrap.particle.BlockStateParticleEffect effect, ) { return new yarnwrap.block.BlockState(net.minecraft.particle.BlockStateParticleEffect.method_29127(effect.wrapperContained)); }
// public com.mojang.serialization.MapCodec createCodec(yarnwrap.particle.ParticleType type) { return wrapperContained.createCodec(type.wrapperContained); }
// public static com.mojang.serialization.MapCodec createCodec(yarnwrap.particle.ParticleType type, ) { return net.minecraft.particle.BlockStateParticleEffect.createCodec(type.wrapperContained); }
// public yarnwrap.particle.BlockStateParticleEffect method_29129(yarnwrap.particle.ParticleType state) { return new yarnwrap.particle.BlockStateParticleEffect(wrapperContained.method_29129(state.wrapperContained)); }
// public static yarnwrap.particle.BlockStateParticleEffect method_29129(yarnwrap.particle.ParticleType state, ) { return new yarnwrap.particle.BlockStateParticleEffect(net.minecraft.particle.BlockStateParticleEffect.method_29129(state.wrapperContained)); }
// public yarnwrap.block.BlockState method_56168(yarnwrap.particle.BlockStateParticleEffect effect) { return new yarnwrap.block.BlockState(wrapperContained.method_56168(effect.wrapperContained)); }
// public static yarnwrap.block.BlockState method_56168(yarnwrap.particle.BlockStateParticleEffect effect, ) { return new yarnwrap.block.BlockState(net.minecraft.particle.BlockStateParticleEffect.method_56168(effect.wrapperContained)); }
// public yarnwrap.particle.BlockStateParticleEffect method_56169(yarnwrap.particle.ParticleType state) { return new yarnwrap.particle.BlockStateParticleEffect(wrapperContained.method_56169(state.wrapperContained)); }
// public static yarnwrap.particle.BlockStateParticleEffect method_56169(yarnwrap.particle.ParticleType state, ) { return new yarnwrap.particle.BlockStateParticleEffect(net.minecraft.particle.BlockStateParticleEffect.method_56169(state.wrapperContained)); }
// public yarnwrap.network.codec.PacketCodec createPacketCodec(yarnwrap.particle.ParticleType type) { return new yarnwrap.network.codec.PacketCodec(wrapperContained.createPacketCodec(type.wrapperContained)); }
// public static yarnwrap.network.codec.PacketCodec createPacketCodec(yarnwrap.particle.ParticleType type, ) { return new yarnwrap.network.codec.PacketCodec(net.minecraft.particle.BlockStateParticleEffect.createPacketCodec(type.wrapperContained)); }

}