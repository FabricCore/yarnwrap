package yarnwrap.entity;
public class AngledModelEntity { public net.minecraft.entity.AngledModelEntity wrapperContained; public AngledModelEntity(net.minecraft.entity.AngledModelEntity wrapperContained) { this.wrapperContained = wrapperContained; }

public java.util.Map getModelAngles() { return wrapperContained.getModelAngles(); }
// public static java.util.Map getModelAngles() { return net.minecraft.entity.AngledModelEntity.getModelAngles(); }

}