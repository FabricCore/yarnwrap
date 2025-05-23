package yarnwrap.client.render.entity;
public class AbstractHorseEntityRenderer { public net.minecraft.client.render.entity.AbstractHorseEntityRenderer wrapperContained; public AbstractHorseEntityRenderer(net.minecraft.client.render.entity.AbstractHorseEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public AbstractHorseEntityRenderer(Object context,yarnwrap.client.render.entity.model.EntityModel model,yarnwrap.client.render.entity.model.EntityModel babyModel) { this.wrapperContained = new net.minecraft.client.render.entity.AbstractHorseEntityRenderer(context,model.wrapperContained,babyModel.wrapperContained); }

}