package yarnwrap.block;
public class EnchantingTableBlock { public net.minecraft.block.EnchantingTableBlock wrapperContained; public EnchantingTableBlock(net.minecraft.block.EnchantingTableBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
public java.util.List POWER_PROVIDER_OFFSETS() { return wrapperContained.POWER_PROVIDER_OFFSETS; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public boolean canAccessPowerProvider(yarnwrap.world.World world,yarnwrap.util.math.BlockPos tablePos,yarnwrap.util.math.BlockPos providerOffset) { return wrapperContained.canAccessPowerProvider(world.wrapperContained,tablePos.wrapperContained,providerOffset.wrapperContained); }

}