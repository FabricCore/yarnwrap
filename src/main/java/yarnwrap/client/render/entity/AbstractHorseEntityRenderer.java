package yarnwrap.client.render.entity;
public class AbstractHorseEntityRenderer { public net.minecraft.client.render.entity.AbstractHorseEntityRenderer wrapperContained; public AbstractHorseEntityRenderer(net.minecraft.client.render.entity.AbstractHorseEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public float scale() { return wrapperContained.scale; }
// public void scale(float value) { wrapperContained.scale = value; }
// public static float scale() { return net.minecraft.client.render.entity.AbstractHorseEntityRenderer.scale; }
// public static void scale(float value, ) { net.minecraft.client.render.entity.AbstractHorseEntityRenderer.scale = value; }

// public AbstractHorseEntityRenderer(Object ctx,yarnwrap.client.render.entity.model.HorseEntityModel model,float scale) { this.wrapperContained = new net.minecraft.client.render.entity.AbstractHorseEntityRenderer(ctx,model.wrapperContained,scale); }

}