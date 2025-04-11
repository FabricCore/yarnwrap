package yarnwrap.block.entity;
public class EnchantingTableBlockEntity { public net.minecraft.block.entity.EnchantingTableBlockEntity wrapperContained; public EnchantingTableBlockEntity(net.minecraft.block.entity.EnchantingTableBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public float nextPageAngle() { return wrapperContained.nextPageAngle; }
public void nextPageAngle(float value) { wrapperContained.nextPageAngle = value; }
// public yarnwrap.text.Text customName() { return new yarnwrap.text.Text(wrapperContained.customName); }
// public void customName(yarnwrap.text.Text value) { wrapperContained.customName = value.wrapperContained; }
public float pageAngle() { return wrapperContained.pageAngle; }
public void pageAngle(float value) { wrapperContained.pageAngle = value; }
public int ticks() { return wrapperContained.ticks; }
public void ticks(int value) { wrapperContained.ticks = value; }
public float targetBookRotation() { return wrapperContained.targetBookRotation; }
public void targetBookRotation(float value) { wrapperContained.targetBookRotation = value; }
public float lastBookRotation() { return wrapperContained.lastBookRotation; }
public void lastBookRotation(float value) { wrapperContained.lastBookRotation = value; }
public float bookRotation() { return wrapperContained.bookRotation; }
public void bookRotation(float value) { wrapperContained.bookRotation = value; }
public float pageTurningSpeed() { return wrapperContained.pageTurningSpeed; }
public void pageTurningSpeed(float value) { wrapperContained.pageTurningSpeed = value; }
public float nextPageTurningSpeed() { return wrapperContained.nextPageTurningSpeed; }
public void nextPageTurningSpeed(float value) { wrapperContained.nextPageTurningSpeed = value; }
public float flipTurn() { return wrapperContained.flipTurn; }
public void flipTurn(float value) { wrapperContained.flipTurn = value; }
// public yarnwrap.util.math.random.Random RANDOM() { return new yarnwrap.util.math.random.Random(wrapperContained.RANDOM); }
// public void RANDOM(yarnwrap.util.math.random.Random value) { wrapperContained.RANDOM = value.wrapperContained; }
public float flipRandom() { return wrapperContained.flipRandom; }
public void flipRandom(float value) { wrapperContained.flipRandom = value; }
public EnchantingTableBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.EnchantingTableBlockEntity(pos.wrapperContained,state.wrapperContained); }
public void setCustomName(yarnwrap.text.Text customName) { wrapperContained.setCustomName(customName.wrapperContained); }
public void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.EnchantingTableBlockEntity blockEntity) { wrapperContained.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }

}