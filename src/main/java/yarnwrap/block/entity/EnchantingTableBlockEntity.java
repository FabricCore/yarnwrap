package yarnwrap.block.entity;
public class EnchantingTableBlockEntity { public net.minecraft.block.entity.EnchantingTableBlockEntity wrapperContained; public EnchantingTableBlockEntity(net.minecraft.block.entity.EnchantingTableBlockEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public float nextPageAngle() { return wrapperContained.nextPageAngle; }
public void nextPageAngle(float value) { wrapperContained.nextPageAngle = value; }
// public static float nextPageAngle() { return net.minecraft.block.entity.EnchantingTableBlockEntity.nextPageAngle; }
// public static void nextPageAngle(float value, ) { net.minecraft.block.entity.EnchantingTableBlockEntity.nextPageAngle = value; }

// public yarnwrap.text.Text customName() { return new yarnwrap.text.Text(wrapperContained.customName); }
// public void customName(yarnwrap.text.Text value) { wrapperContained.customName = value.wrapperContained; }
// public static yarnwrap.text.Text customName() { return new yarnwrap.text.Text(net.minecraft.block.entity.EnchantingTableBlockEntity.customName); }
// public static void customName(yarnwrap.text.Text value, ) { net.minecraft.block.entity.EnchantingTableBlockEntity.customName = value.wrapperContained; }

public float pageAngle() { return wrapperContained.pageAngle; }
public void pageAngle(float value) { wrapperContained.pageAngle = value; }
// public static float pageAngle() { return net.minecraft.block.entity.EnchantingTableBlockEntity.pageAngle; }
// public static void pageAngle(float value, ) { net.minecraft.block.entity.EnchantingTableBlockEntity.pageAngle = value; }

public int ticks() { return wrapperContained.ticks; }
public void ticks(int value) { wrapperContained.ticks = value; }
// public static int ticks() { return net.minecraft.block.entity.EnchantingTableBlockEntity.ticks; }
// public static void ticks(int value, ) { net.minecraft.block.entity.EnchantingTableBlockEntity.ticks = value; }

public float targetBookRotation() { return wrapperContained.targetBookRotation; }
public void targetBookRotation(float value) { wrapperContained.targetBookRotation = value; }
// public static float targetBookRotation() { return net.minecraft.block.entity.EnchantingTableBlockEntity.targetBookRotation; }
// public static void targetBookRotation(float value, ) { net.minecraft.block.entity.EnchantingTableBlockEntity.targetBookRotation = value; }

public float lastBookRotation() { return wrapperContained.lastBookRotation; }
public void lastBookRotation(float value) { wrapperContained.lastBookRotation = value; }
// public static float lastBookRotation() { return net.minecraft.block.entity.EnchantingTableBlockEntity.lastBookRotation; }
// public static void lastBookRotation(float value, ) { net.minecraft.block.entity.EnchantingTableBlockEntity.lastBookRotation = value; }

public float bookRotation() { return wrapperContained.bookRotation; }
public void bookRotation(float value) { wrapperContained.bookRotation = value; }
// public static float bookRotation() { return net.minecraft.block.entity.EnchantingTableBlockEntity.bookRotation; }
// public static void bookRotation(float value, ) { net.minecraft.block.entity.EnchantingTableBlockEntity.bookRotation = value; }

public float pageTurningSpeed() { return wrapperContained.pageTurningSpeed; }
public void pageTurningSpeed(float value) { wrapperContained.pageTurningSpeed = value; }
// public static float pageTurningSpeed() { return net.minecraft.block.entity.EnchantingTableBlockEntity.pageTurningSpeed; }
// public static void pageTurningSpeed(float value, ) { net.minecraft.block.entity.EnchantingTableBlockEntity.pageTurningSpeed = value; }

public float nextPageTurningSpeed() { return wrapperContained.nextPageTurningSpeed; }
public void nextPageTurningSpeed(float value) { wrapperContained.nextPageTurningSpeed = value; }
// public static float nextPageTurningSpeed() { return net.minecraft.block.entity.EnchantingTableBlockEntity.nextPageTurningSpeed; }
// public static void nextPageTurningSpeed(float value, ) { net.minecraft.block.entity.EnchantingTableBlockEntity.nextPageTurningSpeed = value; }

public float flipTurn() { return wrapperContained.flipTurn; }
public void flipTurn(float value) { wrapperContained.flipTurn = value; }
// public static float flipTurn() { return net.minecraft.block.entity.EnchantingTableBlockEntity.flipTurn; }
// public static void flipTurn(float value, ) { net.minecraft.block.entity.EnchantingTableBlockEntity.flipTurn = value; }

// public yarnwrap.util.math.random.Random RANDOM() { return new yarnwrap.util.math.random.Random(wrapperContained.RANDOM); }
// public void RANDOM(yarnwrap.util.math.random.Random value) { wrapperContained.RANDOM = value.wrapperContained; }
// public static yarnwrap.util.math.random.Random RANDOM() { return new yarnwrap.util.math.random.Random(net.minecraft.block.entity.EnchantingTableBlockEntity.RANDOM); }
// public static void RANDOM(yarnwrap.util.math.random.Random value, ) { net.minecraft.block.entity.EnchantingTableBlockEntity.RANDOM = value.wrapperContained; }

public float flipRandom() { return wrapperContained.flipRandom; }
public void flipRandom(float value) { wrapperContained.flipRandom = value; }
// public static float flipRandom() { return net.minecraft.block.entity.EnchantingTableBlockEntity.flipRandom; }
// public static void flipRandom(float value, ) { net.minecraft.block.entity.EnchantingTableBlockEntity.flipRandom = value; }

public EnchantingTableBlockEntity(yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { this.wrapperContained = new net.minecraft.block.entity.EnchantingTableBlockEntity(pos.wrapperContained,state.wrapperContained); }
public void setCustomName(yarnwrap.text.Text customName) { wrapperContained.setCustomName(customName.wrapperContained); }
// public static void setCustomName(yarnwrap.text.Text customName, ) { net.minecraft.block.entity.EnchantingTableBlockEntity.setCustomName(customName.wrapperContained); }
// public void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.EnchantingTableBlockEntity blockEntity) { wrapperContained.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }
// public static void tick(yarnwrap.world.World world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.block.entity.EnchantingTableBlockEntity blockEntity, ) { net.minecraft.block.entity.EnchantingTableBlockEntity.tick(world.wrapperContained,pos.wrapperContained,state.wrapperContained,blockEntity.wrapperContained); }

}