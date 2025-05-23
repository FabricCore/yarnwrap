package yarnwrap.entity.passive;
public class AnimalTemperature { public net.minecraft.entity.passive.AnimalTemperature wrapperContained; public AnimalTemperature(net.minecraft.entity.passive.AnimalTemperature wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEMPERATE() { return new yarnwrap.util.Identifier(wrapperContained.TEMPERATE); }
// public void TEMPERATE(yarnwrap.util.Identifier value) { wrapperContained.TEMPERATE = value.wrapperContained; }
public static yarnwrap.util.Identifier TEMPERATE() { return new yarnwrap.util.Identifier(net.minecraft.entity.passive.AnimalTemperature.TEMPERATE); }
// public static void TEMPERATE(yarnwrap.util.Identifier value, ) { net.minecraft.entity.passive.AnimalTemperature.TEMPERATE = value.wrapperContained; }

// public yarnwrap.util.Identifier WARM() { return new yarnwrap.util.Identifier(wrapperContained.WARM); }
// public void WARM(yarnwrap.util.Identifier value) { wrapperContained.WARM = value.wrapperContained; }
public static yarnwrap.util.Identifier WARM() { return new yarnwrap.util.Identifier(net.minecraft.entity.passive.AnimalTemperature.WARM); }
// public static void WARM(yarnwrap.util.Identifier value, ) { net.minecraft.entity.passive.AnimalTemperature.WARM = value.wrapperContained; }

// public yarnwrap.util.Identifier COLD() { return new yarnwrap.util.Identifier(wrapperContained.COLD); }
// public void COLD(yarnwrap.util.Identifier value) { wrapperContained.COLD = value.wrapperContained; }
public static yarnwrap.util.Identifier COLD() { return new yarnwrap.util.Identifier(net.minecraft.entity.passive.AnimalTemperature.COLD); }
// public static void COLD(yarnwrap.util.Identifier value, ) { net.minecraft.entity.passive.AnimalTemperature.COLD = value.wrapperContained; }


}