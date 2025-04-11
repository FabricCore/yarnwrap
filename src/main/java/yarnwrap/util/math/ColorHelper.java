package yarnwrap.util.math;
public class ColorHelper { public net.minecraft.util.math.ColorHelper wrapperContained; public ColorHelper(net.minecraft.util.math.ColorHelper wrapperContained) { this.wrapperContained = wrapperContained; }

public int channelFromFloat(float value) { return wrapperContained.channelFromFloat(value); }

}