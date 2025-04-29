package yarnwrap.block;
public class AbstractFurnaceBlock { public net.minecraft.block.AbstractFurnaceBlock wrapperContained; public AbstractFurnaceBlock(net.minecraft.block.AbstractFurnaceBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.DirectionProperty value) { wrapperContained.FACING = value.wrapperContained; }
public static yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(net.minecraft.block.AbstractFurnaceBlock.FACING); }
// public static void FACING(yarnwrap.state.property.DirectionProperty value, ) { net.minecraft.block.AbstractFurnaceBlock.FACING = value.wrapperContained; }

// public yarnwrap.state.property.BooleanProperty LIT() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.LIT); }
// public void LIT(yarnwrap.state.property.BooleanProperty value) { wrapperContained.LIT = value.wrapperContained; }
public static yarnwrap.state.property.BooleanProperty LIT() { return new yarnwrap.state.property.BooleanProperty(net.minecraft.block.AbstractFurnaceBlock.LIT); }
// public static void LIT(yarnwrap.state.property.BooleanProperty value, ) { net.minecraft.block.AbstractFurnaceBlock.LIT = value.wrapperContained; }

// public void openScreen(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.openScreen(world.wrapperContained,pos.wrapperContained,player.wrapperContained); }
// public static void openScreen(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player, ) { net.minecraft.block.AbstractFurnaceBlock.openScreen(world.wrapperContained,pos.wrapperContained,player.wrapperContained); }
// public yarnwrap.block.entity.BlockEntityTicker validateTicker(yarnwrap.world.World world,yarnwrap.block.entity.BlockEntityType givenType,yarnwrap.block.entity.BlockEntityType expectedType) { return new yarnwrap.block.entity.BlockEntityTicker(wrapperContained.validateTicker(world.wrapperContained,givenType.wrapperContained,expectedType.wrapperContained)); }
// public static yarnwrap.block.entity.BlockEntityTicker validateTicker(yarnwrap.world.World world,yarnwrap.block.entity.BlockEntityType givenType,yarnwrap.block.entity.BlockEntityType expectedType, ) { return new yarnwrap.block.entity.BlockEntityTicker(net.minecraft.block.AbstractFurnaceBlock.validateTicker(world.wrapperContained,givenType.wrapperContained,expectedType.wrapperContained)); }

}