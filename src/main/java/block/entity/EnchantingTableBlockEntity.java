package yarnwrap.block.entity;
public class EnchantingTableBlockEntity { public net.minecraft.block.entity.EnchantingTableBlockEntity wrapperContained; public EnchantingTableBlockEntity(net.minecraft.block.entity.EnchantingTableBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public float nextPageAngle() { return wrapperContained.nextPageAngle; }
// public yarnwrap.text.Text customName() { return new yarnwrap.text.Text(wrapperContained.customName); }
public float pageAngle() { return wrapperContained.pageAngle; }
public int ticks() { return wrapperContained.ticks; }
public float targetBookRotation() { return wrapperContained.targetBookRotation; }
public float lastBookRotation() { return wrapperContained.lastBookRotation; }
public float bookRotation() { return wrapperContained.bookRotation; }
public float pageTurningSpeed() { return wrapperContained.pageTurningSpeed; }
public float nextPageTurningSpeed() { return wrapperContained.nextPageTurningSpeed; }
public float flipTurn() { return wrapperContained.flipTurn; }
// public yarnwrap.util.math.random.Random RANDOM() { return new yarnwrap.util.math.random.Random(wrapperContained.RANDOM); }
public float flipRandom() { return wrapperContained.flipRandom; }
public void setCustomName(yarnwrap.text.Text customName) { wrapperContained.setCustomName(customName.wrapperContained); }
public void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.EnchantingTableBlockEntity blockEntity) { wrapperContained.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }

}