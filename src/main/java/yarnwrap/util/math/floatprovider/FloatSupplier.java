package yarnwrap.util.math.floatprovider;
public class FloatSupplier { public net.minecraft.util.math.floatprovider.FloatSupplier wrapperContained; public FloatSupplier(net.minecraft.util.math.floatprovider.FloatSupplier wrapperContained) { this.wrapperContained = wrapperContained; }

public float get(yarnwrap.util.math.random.Random random) { return wrapperContained.get(random.wrapperContained); }
// public static float get(yarnwrap.util.math.random.Random random, ) { return net.minecraft.util.math.floatprovider.FloatSupplier.get(random.wrapperContained); }

}