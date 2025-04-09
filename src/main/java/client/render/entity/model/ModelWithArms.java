package yarnwrap.client.render.entity.model;
public class ModelWithArms { public net.minecraft.client.render.entity.model.ModelWithArms wrapperContained; public ModelWithArms(net.minecraft.client.render.entity.model.ModelWithArms wrapperContained) { this.wrapperContained = wrapperContained; }

public void setArmAngle(yarnwrap.util.Arm arm,yarnwrap.client.util.math.MatrixStack matrices) { wrapperContained.setArmAngle(arm.wrapperContained,matrices.wrapperContained); }

}