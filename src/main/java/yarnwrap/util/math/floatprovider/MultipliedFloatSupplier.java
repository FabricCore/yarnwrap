package yarnwrap.util.math.floatprovider;
public class MultipliedFloatSupplier { public net.minecraft.util.math.floatprovider.MultipliedFloatSupplier wrapperContained; public MultipliedFloatSupplier(net.minecraft.util.math.floatprovider.MultipliedFloatSupplier wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.util.math.floatprovider.FloatSupplier[] multipliers() { return wrapperContained.multipliers; }
// public void multipliers(net.minecraft.util.math.floatprovider.FloatSupplier[] value) { wrapperContained.multipliers = value; }
// public static net.minecraft.util.math.floatprovider.FloatSupplier[] multipliers() { return net.minecraft.util.math.floatprovider.MultipliedFloatSupplier.multipliers; }
// public static void multipliers(net.minecraft.util.math.floatprovider.FloatSupplier[] value, ) { net.minecraft.util.math.floatprovider.MultipliedFloatSupplier.multipliers = value; }

public MultipliedFloatSupplier(net.minecraft.util.math.floatprovider.FloatSupplier[] multipliers) { this.wrapperContained = new net.minecraft.util.math.floatprovider.MultipliedFloatSupplier(multipliers); }

}