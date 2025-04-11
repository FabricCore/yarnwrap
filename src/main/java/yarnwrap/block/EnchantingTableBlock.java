package yarnwrap.block;
public class EnchantingTableBlock { public net.minecraft.block.EnchantingTableBlock wrapperContained; public EnchantingTableBlock(net.minecraft.block.EnchantingTableBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.shape.VoxelShape SHAPE() { return new yarnwrap.util.shape.VoxelShape(wrapperContained.SHAPE); }
// public void SHAPE(yarnwrap.util.shape.VoxelShape value) { wrapperContained.SHAPE = value.wrapperContained; }
public java.util.List POWER_PROVIDER_OFFSETS() { return wrapperContained.POWER_PROVIDER_OFFSETS; }
// public void POWER_PROVIDER_OFFSETS(java.util.List value) { wrapperContained.POWER_PROVIDER_OFFSETS = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.screen.ScreenHandler method_17467(yarnwrap.world.World syncId,yarnwrap.util.math.BlockPos inventory,int player) { return new yarnwrap.screen.ScreenHandler(wrapperContained.method_17467(syncId.wrapperContained,inventory.wrapperContained,player)); }
public boolean canAccessPowerProvider(yarnwrap.world.World world,yarnwrap.util.math.BlockPos tablePos,yarnwrap.util.math.BlockPos providerOffset) { return wrapperContained.canAccessPowerProvider(world.wrapperContained,tablePos.wrapperContained,providerOffset.wrapperContained); }
// public boolean method_40446(yarnwrap.util.math.BlockPos pos) { return wrapperContained.method_40446(pos.wrapperContained); }

}