package yarnwrap.block;
public class SculkVeinBlock { public net.minecraft.block.SculkVeinBlock wrapperContained; public SculkVeinBlock(net.minecraft.block.SculkVeinBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.WATERLOGGED); }
// public void WATERLOGGED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.WATERLOGGED = value.wrapperContained; }
// public static yarnwrap.state.property.BooleanProperty WATERLOGGED() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.SculkVeinBlock.WATERLOGGED); }
// public static void WATERLOGGED(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.SculkVeinBlock.WATERLOGGED = value.wrapperContained; }

// public yarnwrap.block.LichenGrower allGrowTypeGrower() { return new yarnwrap.block.LichenGrower(wrapperContained.allGrowTypeGrower); }
// public void allGrowTypeGrower(yarnwrap.block.LichenGrower value) { wrapperContained.allGrowTypeGrower = value.wrapperContained; }
// public static yarnwrap.block.LichenGrower allGrowTypeGrower() { return new yarnwrap.block.LichenGrower(net.minecraft.block.SculkVeinBlock.allGrowTypeGrower); }
// public static void allGrowTypeGrower(yarnwrap.block.LichenGrower value, ) { net.minecraft.block.SculkVeinBlock.allGrowTypeGrower = value.wrapperContained; }

// public yarnwrap.block.LichenGrower samePositionOnlyGrower() { return new yarnwrap.block.LichenGrower(wrapperContained.samePositionOnlyGrower); }
// public void samePositionOnlyGrower(yarnwrap.block.LichenGrower value) { wrapperContained.samePositionOnlyGrower = value.wrapperContained; }
// public static yarnwrap.block.LichenGrower samePositionOnlyGrower() { return new yarnwrap.block.LichenGrower(net.minecraft.block.SculkVeinBlock.samePositionOnlyGrower); }
// public static void samePositionOnlyGrower(yarnwrap.block.LichenGrower value, ) { net.minecraft.block.SculkVeinBlock.samePositionOnlyGrower = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.SculkVeinBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.SculkVeinBlock.CODEC = value; }

// public boolean veinCoversSculkReplaceable(yarnwrap.world.WorldAccess world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos) { return wrapperContained.veinCoversSculkReplaceable(world.wrapperContained,state.wrapperContained,pos.wrapperContained); }
// public static boolean veinCoversSculkReplaceable(yarnwrap.world.WorldAccess world,yarnwrap.block.BlockState state,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.SculkVeinBlock.veinCoversSculkReplaceable(world.wrapperContained,state.wrapperContained,pos.wrapperContained); }
// public boolean place(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,java.util.Collection directions) { return wrapperContained.place(world.wrapperContained,pos.wrapperContained,state.wrapperContained,directions); }
// public static boolean place(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,java.util.Collection directions, ) { return net.minecraft.block.SculkVeinBlock.place(world.wrapperContained,pos.wrapperContained,state.wrapperContained,directions); }
// public boolean convertToBlock(yarnwrap.block.entity.SculkSpreadManager spreadManager,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random) { return wrapperContained.convertToBlock(spreadManager.wrapperContained,world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
// public static boolean convertToBlock(yarnwrap.block.entity.SculkSpreadManager spreadManager,yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.random.Random random, ) { return net.minecraft.block.SculkVeinBlock.convertToBlock(spreadManager.wrapperContained,world.wrapperContained,pos.wrapperContained,random.wrapperContained); }
public yarnwrap.block.LichenGrower getSamePositionOnlyGrower() { return new yarnwrap.block.LichenGrower(wrapperContained.getSamePositionOnlyGrower()); }
// public static yarnwrap.block.LichenGrower getSamePositionOnlyGrower() { return new yarnwrap.block.LichenGrower(net.minecraft.block.SculkVeinBlock.getSamePositionOnlyGrower()); }

}