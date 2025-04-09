package yarnwrap.entity;
public class InteractionObserver { public net.minecraft.entity.InteractionObserver wrapperContained; public InteractionObserver(net.minecraft.entity.InteractionObserver wrapperContained) { this.wrapperContained = wrapperContained; }

public void onInteractionWith(yarnwrap.entity.EntityInteraction interaction,yarnwrap.entity.Entity entity) { wrapperContained.onInteractionWith(interaction.wrapperContained,entity.wrapperContained); }

}