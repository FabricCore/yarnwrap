package yarnwrap.block;
public class CreakingHeartBlock { public net.minecraft.block.CreakingHeartBlock wrapperContained; public CreakingHeartBlock(net.minecraft.block.CreakingHeartBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.CreakingHeartBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.CreakingHeartBlock.CODEC = value; }

// public yarnwrap.state.property.EnumProperty AXIS() { return new yarnwrap.state.property.EnumProperty(wrapperContained.AXIS); }
// public void AXIS(yarnwrap.state.property.EnumProperty value) { wrapperContained.AXIS = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty AXIS() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.CreakingHeartBlock.AXIS); }
// public static void AXIS(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.CreakingHeartBlock.AXIS = value.wrapperContained; }

// public yarnwrap.state.property.EnumProperty ACTIVE() { return new yarnwrap.state.property.EnumProperty(wrapperContained.ACTIVE); }
// public void ACTIVE(yarnwrap.state.property.EnumProperty value) { wrapperContained.ACTIVE = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty ACTIVE() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.CreakingHeartBlock.ACTIVE); }
// public static void ACTIVE(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.CreakingHeartBlock.ACTIVE = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty NATURAL() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.NATURAL); }
// public void NATURAL(yarnwrap.state.property.BooleanProperty value) { wrapperContained.NATURAL = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty NATURAL() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.CreakingHeartBlock.NATURAL); }
// public static void NATURAL(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.CreakingHeartBlock.NATURAL = value.wrapperContained; }

// public boolean isSurroundedByPaleOakLogs(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isSurroundedByPaleOakLogs(world.wrapperContained,pos.wrapperContained); }
// public static boolean isSurroundedByPaleOakLogs(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.CreakingHeartBlock.isSurroundedByPaleOakLogs(world.wrapperContained,pos.wrapperContained); }
// public boolean shouldBeEnabled(yarnwrap.block.BlockState state,yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.shouldBeEnabled(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static boolean shouldBeEnabled(yarnwrap.block.BlockState state,yarnwrap.world.WorldView world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.CreakingHeartBlock.shouldBeEnabled(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public yarnwrap.block.BlockState enableIfValid(yarnwrap.block.BlockState state,yarnwrap.world.World pos) { return new yarnwrap.block.BlockState(wrapperContained.enableIfValid(state.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.block.BlockState enableIfValid(yarnwrap.block.BlockState state,yarnwrap.world.World pos, ) { return new yarnwrap.block.BlockState(net.minecraft.block.CreakingHeartBlock.enableIfValid(state.wrapperContained,pos.wrapperContained)); }
// public boolean isNightAndNatural(yarnwrap.world.World world) { return wrapperContained.isNightAndNatural(world.wrapperContained); }
// public static boolean isNightAndNatural(yarnwrap.world.World world, ) { return net.minecraft.block.CreakingHeartBlock.isNightAndNatural(world.wrapperContained); }
// public void dropExperienceOnBreak(yarnwrap.entity.player.PlayerEntity player,yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos) { wrapperContained.dropExperienceOnBreak(player.wrapperContained,state.wrapperContained,world.wrapperContained,pos.wrapperContained); }
// public static void dropExperienceOnBreak(yarnwrap.entity.player.PlayerEntity player,yarnwrap.block.BlockState state,yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.block.CreakingHeartBlock.dropExperienceOnBreak(player.wrapperContained,state.wrapperContained,world.wrapperContained,pos.wrapperContained); }

}