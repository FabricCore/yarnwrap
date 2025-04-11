package yarnwrap.client.tutorial;
public class TutorialStepHandler { public net.minecraft.client.tutorial.TutorialStepHandler wrapperContained; public TutorialStepHandler(net.minecraft.client.tutorial.TutorialStepHandler wrapperContained) { this.wrapperContained = wrapperContained; }

public void onSlotUpdate(yarnwrap.item.ItemStack stack) { wrapperContained.onSlotUpdate(stack.wrapperContained); }
public void onTarget(yarnwrap.client.world.ClientWorld world,yarnwrap.util.hit.HitResult hitResult) { wrapperContained.onTarget(world.wrapperContained,hitResult.wrapperContained); }
public void tick() { wrapperContained.tick(); }
public void onBlockBreaking(yarnwrap.client.world.ClientWorld client,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,float progress) { wrapperContained.onBlockBreaking(client.wrapperContained,pos.wrapperContained,state.wrapperContained,progress); }
public void onMouseUpdate(double deltaX,double deltaY) { wrapperContained.onMouseUpdate(deltaX,deltaY); }
public void destroy() { wrapperContained.destroy(); }
public void onMovement(yarnwrap.client.input.Input input) { wrapperContained.onMovement(input.wrapperContained); }
public void onInventoryOpened() { wrapperContained.onInventoryOpened(); }

}