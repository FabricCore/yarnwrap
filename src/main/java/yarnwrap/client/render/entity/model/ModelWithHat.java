package yarnwrap.client.render.entity.model;
public class ModelWithHat { public net.minecraft.client.render.entity.model.ModelWithHat wrapperContained; public ModelWithHat(net.minecraft.client.render.entity.model.ModelWithHat wrapperContained) { this.wrapperContained = wrapperContained; }

public void setHatVisible(boolean visible) { wrapperContained.setHatVisible(visible); }
// public static void setHatVisible(boolean visible, ) { net.minecraft.client.render.entity.model.ModelWithHat.setHatVisible(visible); }
public void rotateArms(yarnwrap.client.util.math.MatrixStack stack) { wrapperContained.rotateArms(stack.wrapperContained); }
// public static void rotateArms(yarnwrap.client.util.math.MatrixStack stack, ) { net.minecraft.client.render.entity.model.ModelWithHat.rotateArms(stack.wrapperContained); }

}