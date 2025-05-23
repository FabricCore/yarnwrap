package yarnwrap.entity.ai.control;
public class Control { public net.minecraft.entity.ai.control.Control wrapperContained; public Control(net.minecraft.entity.ai.control.Control wrapperContained) { this.wrapperContained = wrapperContained; }

public float changeAngle(float start,float end,float maxChange) { return wrapperContained.changeAngle(start,end,maxChange); }
// public static float changeAngle(float start,float end,float maxChange, ) { return net.minecraft.entity.ai.control.Control.changeAngle(start,end,maxChange); }

}