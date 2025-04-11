package yarnwrap.util.math.random;
public class BaseRandom { public net.minecraft.util.math.random.BaseRandom wrapperContained; public BaseRandom(net.minecraft.util.math.random.BaseRandom wrapperContained) { this.wrapperContained = wrapperContained; }

public float FLOAT_MULTIPLIER() { return wrapperContained.FLOAT_MULTIPLIER; }
// public void FLOAT_MULTIPLIER(float value) { wrapperContained.FLOAT_MULTIPLIER = value; }
public double DOUBLE_MULTIPLIER() { return wrapperContained.DOUBLE_MULTIPLIER; }
// public void DOUBLE_MULTIPLIER(double value) { wrapperContained.DOUBLE_MULTIPLIER = value; }
public int next(int bits) { return wrapperContained.next(bits); }

}