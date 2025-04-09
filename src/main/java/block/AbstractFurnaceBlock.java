package yarnwrap.block;
public class AbstractFurnaceBlock { public net.minecraft.block.AbstractFurnaceBlock wrapperContained; public AbstractFurnaceBlock(net.minecraft.block.AbstractFurnaceBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.state.property.DirectionProperty FACING() { return new yarnwrap.state.property.DirectionProperty(wrapperContained.FACING); }
public yarnwrap.state.property.BooleanProperty LIT() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.LIT); }
// public void openScreen(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.entity.player.PlayerEntity player) { wrapperContained.openScreen(world.wrapperContained,pos.wrapperContained,player.wrapperContained); }
// public yarnwrap.block.entity.BlockEntityTicker validateTicker(yarnwrap.world.World world,yarnwrap.block.entity.BlockEntityType givenType,yarnwrap.block.entity.BlockEntityType expectedType) { return new yarnwrap.block.entity.BlockEntityTicker(wrapperContained.validateTicker(world.wrapperContained,givenType.wrapperContained,expectedType.wrapperContained)); }

}