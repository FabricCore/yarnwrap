package yarnwrap.block;
public class CrafterBlock { public net.minecraft.block.CrafterBlock wrapperContained; public CrafterBlock(net.minecraft.block.CrafterBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public yarnwrap.state.property.BooleanProperty CRAFTING() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.CRAFTING); }
// public void CRAFTING(yarnwrap.state.property.BooleanProperty value) { wrapperContained.CRAFTING = value.wrapperContained; }
public yarnwrap.state.property.BooleanProperty TRIGGERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.TRIGGERED); }
// public void TRIGGERED(yarnwrap.state.property.BooleanProperty value) { wrapperContained.TRIGGERED = value.wrapperContained; }
// public yarnwrap.state.property.EnumProperty ORIENTATION() { return new yarnwrap.state.property.EnumProperty(wrapperContained.ORIENTATION); }
// public void ORIENTATION(yarnwrap.state.property.EnumProperty value) { wrapperContained.ORIENTATION = value.wrapperContained; }
// public yarnwrap.recipe.RecipeCache recipeCache() { return new yarnwrap.recipe.RecipeCache(wrapperContained.recipeCache); }
// public void recipeCache(yarnwrap.recipe.RecipeCache value) { wrapperContained.recipeCache = value.wrapperContained; }
// public int TRIGGER_DELAY() { return wrapperContained.TRIGGER_DELAY; }
// public void TRIGGER_DELAY(int value) { wrapperContained.TRIGGER_DELAY = value; }
public java.util.Optional getCraftingRecipe(yarnwrap.world.World world,yarnwrap.recipe.input.CraftingRecipeInput input) { return wrapperContained.getCraftingRecipe(world.wrapperContained,input.wrapperContained); }
// public void transferOrSpawnStack(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.entity.CrafterBlockEntity blockEntity,yarnwrap.item.ItemStack stack,yarnwrap.block.BlockState state,yarnwrap.recipe.RecipeEntry recipe) { wrapperContained.transferOrSpawnStack(world.wrapperContained,pos.wrapperContained,blockEntity.wrapperContained,stack.wrapperContained,state.wrapperContained,recipe.wrapperContained); }
// public void setTriggered(yarnwrap.block.entity.BlockEntity blockEntity,boolean triggered) { wrapperContained.setTriggered(blockEntity.wrapperContained,triggered); }
// public void craft(yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { wrapperContained.craft(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }

}