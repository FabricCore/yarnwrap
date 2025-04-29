package yarnwrap.entity.attribute;
public class ClampedEntityAttribute { public net.minecraft.entity.attribute.ClampedEntityAttribute wrapperContained; public ClampedEntityAttribute(net.minecraft.entity.attribute.ClampedEntityAttribute wrapperContained) { this.wrapperContained = wrapperContained; }

// public double maxValue() { return wrapperContained.maxValue; }
// public void maxValue(double value) { wrapperContained.maxValue = value; }
// public static double maxValue() { return net.minecraft.entity.attribute.ClampedEntityAttribute.maxValue; }
// public static void maxValue(double value, ) { net.minecraft.entity.attribute.ClampedEntityAttribute.maxValue = value; }

// public double minValue() { return wrapperContained.minValue; }
// public void minValue(double value) { wrapperContained.minValue = value; }
// public static double minValue() { return net.minecraft.entity.attribute.ClampedEntityAttribute.minValue; }
// public static void minValue(double value, ) { net.minecraft.entity.attribute.ClampedEntityAttribute.minValue = value; }

public ClampedEntityAttribute(java.lang.String translationKey,double fallback,double min,double max) { this.wrapperContained = new net.minecraft.entity.attribute.ClampedEntityAttribute(translationKey,fallback,min,max); }
public double getMinValue() { return wrapperContained.getMinValue(); }
// public static double getMinValue() { return net.minecraft.entity.attribute.ClampedEntityAttribute.getMinValue(); }
public double getMaxValue() { return wrapperContained.getMaxValue(); }
// public static double getMaxValue() { return net.minecraft.entity.attribute.ClampedEntityAttribute.getMaxValue(); }

}