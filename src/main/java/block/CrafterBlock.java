package yarnwrap.block;
public class CrafterBlock { public net.minecraft.block.CrafterBlock wrapperContained; public CrafterBlock(net.minecraft.block.CrafterBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.state.property.BooleanProperty CRAFTING() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.CRAFTING); }
public yarnwrap.state.property.BooleanProperty TRIGGERED() { return new yarnwrap.state.property.BooleanProperty(wrapperContained.TRIGGERED); }
// public yarnwrap.state.property.EnumProperty ORIENTATION() { return new yarnwrap.state.property.EnumProperty(wrapperContained.ORIENTATION); }
// public yarnwrap.recipe.RecipeCache recipeCache() { return new yarnwrap.recipe.RecipeCache(wrapperContained.recipeCache); }
// public int TRIGGER_DELAY() { return wrapperContained.TRIGGER_DELAY; }
public java.util.Optional getCraftingRecipe(yarnwrap.world.World world,yarnwrap.recipe.input.CraftingRecipeInput input) { return wrapperContained.getCraftingRecipe(world.wrapperContained,input.wrapperContained); }
// public void transferOrSpawnStack(yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.entity.CrafterBlockEntity blockEntity,yarnwrap.item.ItemStack stack,yarnwrap.block.BlockState state,yarnwrap.recipe.RecipeEntry recipe) { wrapperContained.transferOrSpawnStack(world.wrapperContained,pos.wrapperContained,blockEntity.wrapperContained,stack.wrapperContained,state.wrapperContained,recipe.wrapperContained); }
// public void setTriggered(yarnwrap.block.entity.BlockEntity blockEntity,boolean triggered) { wrapperContained.setTriggered(blockEntity.wrapperContained,triggered); }
// public void craft(yarnwrap.block.BlockState state,yarnwrap.server.world.ServerWorld world,yarnwrap.util.math.BlockPos pos) { wrapperContained.craft(state.wrapperContained,world.wrapperContained,pos.wrapperContained); }

}