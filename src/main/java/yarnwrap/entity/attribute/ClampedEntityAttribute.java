package yarnwrap.entity.attribute;
public class ClampedEntityAttribute { public net.minecraft.entity.attribute.ClampedEntityAttribute wrapperContained; public ClampedEntityAttribute(net.minecraft.entity.attribute.ClampedEntityAttribute wrapperContained) { this.wrapperContained = wrapperContained; }

// public double maxValue() { return wrapperContained.maxValue; }
// public void maxValue(double value) { wrapperContained.maxValue = value; }
// public double minValue() { return wrapperContained.minValue; }
// public void minValue(double value) { wrapperContained.minValue = value; }
public ClampedEntityAttribute(java.lang.String translationKey,double fallback,double min,double max) { this.wrapperContained = new net.minecraft.entity.attribute.ClampedEntityAttribute(translationKey,fallback,min,max); }
public double getMinValue() { return wrapperContained.getMinValue(); }
public double getMaxValue() { return wrapperContained.getMaxValue(); }

}