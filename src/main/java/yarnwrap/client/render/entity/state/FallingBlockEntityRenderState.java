package yarnwrap.client.render.entity.state;
public class FallingBlockEntityRenderState { public net.minecraft.client.render.entity.state.FallingBlockEntityRenderState wrapperContained; public FallingBlockEntityRenderState(net.minecraft.client.render.entity.state.FallingBlockEntityRenderState wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.math.BlockPos fallingBlockPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.fallingBlockPos); }
public void fallingBlockPos(yarnwrap.util.math.BlockPos value) { wrapperContained.fallingBlockPos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos fallingBlockPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.client.render.entity.state.FallingBlockEntityRenderState.fallingBlockPos); }
// public static void fallingBlockPos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.client.render.entity.state.FallingBlockEntityRenderState.fallingBlockPos = value.wrapperContained; }

public yarnwrap.util.math.BlockPos currentPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.currentPos); }
public void currentPos(yarnwrap.util.math.BlockPos value) { wrapperContained.currentPos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos currentPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.client.render.entity.state.FallingBlockEntityRenderState.currentPos); }
// public static void currentPos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.client.render.entity.state.FallingBlockEntityRenderState.currentPos = value.wrapperContained; }

public yarnwrap.block.BlockState blockState() { return new yarnwrap.block.BlockState(wrapperContained.blockState); }
public void blockState(yarnwrap.block.BlockState value) { wrapperContained.blockState = value.wrapperContained; }
// public static yarnwrap.block.BlockState blockState() { return new yarnwrap.block.BlockState(net.minecraft.client.render.entity.state.FallingBlockEntityRenderState.blockState); }
// public static void blockState(yarnwrap.block.BlockState value, ) { net.minecraft.client.render.entity.state.FallingBlockEntityRenderState.blockState = value.wrapperContained; }

public yarnwrap.registry.entry.RegistryEntry biome() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.biome); }
public void biome(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.biome = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry biome() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.client.render.entity.state.FallingBlockEntityRenderState.biome); }
// public static void biome(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.client.render.entity.state.FallingBlockEntityRenderState.biome = value.wrapperContained; }

public yarnwrap.world.BlockRenderView world() { return new yarnwrap.world.BlockRenderView(wrapperContained.world); }
public void world(yarnwrap.world.BlockRenderView value) { wrapperContained.world = value.wrapperContained; }
// public static yarnwrap.world.BlockRenderView world() { return new yarnwrap.world.BlockRenderView(net.minecraft.client.render.entity.state.FallingBlockEntityRenderState.world); }
// public static void world(yarnwrap.world.BlockRenderView value, ) { net.minecraft.client.render.entity.state.FallingBlockEntityRenderState.world = value.wrapperContained; }


}