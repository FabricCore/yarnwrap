package yarnwrap.block;
public class AnvilBlock { public net.minecraft.block.AnvilBlock wrapperContained; public AnvilBlock(net.minecraft.block.AnvilBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(wrapperContained.FACING); }
// public void FACING(yarnwrap.state.property.EnumProperty value) { wrapperContained.FACING = value.wrapperContained; }
public static yarnwrap.state.property.EnumProperty FACING() { return new yarnwrap.state.property.EnumProperty(net.minecraft.block.AnvilBlock.FACING); }
// public static void FACING(yarnwrap.state.property.EnumProperty value, ) { net.minecraft.block.AnvilBlock.FACING = value.wrapperContained; }

// public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public void TITLE(yarnwrap.text.Text value) { wrapperContained.TITLE = value.wrapperContained; }
// public static yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(net.minecraft.block.AnvilBlock.TITLE); }
// public static void TITLE(yarnwrap.text.Text value, ) { net.minecraft.block.AnvilBlock.TITLE = value.wrapperContained; }

// public float FALLING_BLOCK_ENTITY_DAMAGE_MULTIPLIER() { return wrapperContained.FALLING_BLOCK_ENTITY_DAMAGE_MULTIPLIER; }
// public void FALLING_BLOCK_ENTITY_DAMAGE_MULTIPLIER(float value) { wrapperContained.FALLING_BLOCK_ENTITY_DAMAGE_MULTIPLIER = value; }
// public static float FALLING_BLOCK_ENTITY_DAMAGE_MULTIPLIER() { return net.minecraft.block.AnvilBlock.FALLING_BLOCK_ENTITY_DAMAGE_MULTIPLIER; }
// public static void FALLING_BLOCK_ENTITY_DAMAGE_MULTIPLIER(float value, ) { net.minecraft.block.AnvilBlock.FALLING_BLOCK_ENTITY_DAMAGE_MULTIPLIER = value; }

// public int FALLING_BLOCK_ENTITY_MAX_DAMAGE() { return wrapperContained.FALLING_BLOCK_ENTITY_MAX_DAMAGE; }
// public void FALLING_BLOCK_ENTITY_MAX_DAMAGE(int value) { wrapperContained.FALLING_BLOCK_ENTITY_MAX_DAMAGE = value; }
// public static int FALLING_BLOCK_ENTITY_MAX_DAMAGE() { return net.minecraft.block.AnvilBlock.FALLING_BLOCK_ENTITY_MAX_DAMAGE; }
// public static void FALLING_BLOCK_ENTITY_MAX_DAMAGE(int value, ) { net.minecraft.block.AnvilBlock.FALLING_BLOCK_ENTITY_MAX_DAMAGE = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.AnvilBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.AnvilBlock.CODEC = value; }

// public java.util.Map SHAPES_BY_AXIS() { return wrapperContained.SHAPES_BY_AXIS; }
// public void SHAPES_BY_AXIS(java.util.Map value) { wrapperContained.SHAPES_BY_AXIS = value; }
// public static java.util.Map SHAPES_BY_AXIS() { return net.minecraft.block.AnvilBlock.SHAPES_BY_AXIS; }
// public static void SHAPES_BY_AXIS(java.util.Map value, ) { net.minecraft.block.AnvilBlock.SHAPES_BY_AXIS = value; }

// public yarnwrap.block.BlockState getLandingState(yarnwrap.block.BlockState fallingState) { return new yarnwrap.block.BlockState(wrapperContained.getLandingState(fallingState.wrapperContained)); }
// public static yarnwrap.block.BlockState getLandingState(yarnwrap.block.BlockState fallingState, ) { return new yarnwrap.block.BlockState(net.minecraft.block.AnvilBlock.getLandingState(fallingState.wrapperContained)); }
// public yarnwrap.screen.ScreenHandler method_17453(yarnwrap.world.World syncId,yarnwrap.util.math.BlockPos inventory,int player) { return new yarnwrap.screen.ScreenHandler(wrapperContained.method_17453(syncId.wrapperContained,inventory.wrapperContained,player)); }
// public static yarnwrap.screen.ScreenHandler method_17453(yarnwrap.world.World syncId,yarnwrap.util.math.BlockPos inventory,int player, ) { return new yarnwrap.screen.ScreenHandler(net.minecraft.block.AnvilBlock.method_17453(syncId.wrapperContained,inventory.wrapperContained,player)); }

}