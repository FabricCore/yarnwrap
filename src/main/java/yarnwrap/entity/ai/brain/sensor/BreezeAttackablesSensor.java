package yarnwrap.entity.ai.brain.sensor;
public class BreezeAttackablesSensor { public net.minecraft.entity.ai.brain.sensor.BreezeAttackablesSensor wrapperContained; public BreezeAttackablesSensor(net.minecraft.entity.ai.brain.sensor.BreezeAttackablesSensor wrapperContained) { this.wrapperContained = wrapperContained; }

// public int RANGE() { return wrapperContained.RANGE; }
// public void RANGE(int value) { wrapperContained.RANGE = value; }
public static int RANGE() { return net.minecraft.entity.ai.brain.sensor.BreezeAttackablesSensor.RANGE; }
// public static void RANGE(int value, ) { net.minecraft.entity.ai.brain.sensor.BreezeAttackablesSensor.RANGE = value; }


}