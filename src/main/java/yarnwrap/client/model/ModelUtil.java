package yarnwrap.client.model;
public class ModelUtil { public net.minecraft.client.model.ModelUtil wrapperContained; public ModelUtil(net.minecraft.client.model.ModelUtil wrapperContained) { this.wrapperContained = wrapperContained; }

public float interpolateAngle(float angle1,float angle2,float progress) { return wrapperContained.interpolateAngle(angle1,angle2,progress); }

}